package com.iov.obd;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.log4j.PropertyConfigurator;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import utils.hdfs.HdfsUtils;

import java.io.IOException;

/**
 *
 * OBD即时参数
 * Created by liguodong on 2016/4/9.
 */

public class ObdImmediateParametersTask {

    private final static String INPUTPATH = "hdfs://192.168.101.71:8020/input/obd_immediate_parameters";
    private final static String OUTPUTPATH = "hdfs://192.168.101.71:8020/output/ObdImmediateParameters";
    public static Log logger = LogFactory.getLog(ObdImmediateParametersTask.class);


    static {
        //相对路径
        PropertyConfigurator.configure("HadoopTask\\src\\main\\resource\\properties\\log4j.properties");
    }



    public static void main(String[] args) throws IOException,
            ClassNotFoundException,
            InterruptedException {

        Configuration conf = new Configuration();

        HdfsUtils.deleteDir(conf, OUTPUTPATH);

        Job job = Job.getInstance(conf, "ObdImmediateParametersTask");

        job.setJarByClass(ObdImmediateParametersTask.class);

        job.setMapperClass(ObdImmediateParametersMapper.class);

        job.setReducerClass(ObdImmediateParametersReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);

        FileInputFormat.addInputPath(job, new Path(INPUTPATH));
        FileOutputFormat.setOutputPath(job,
                new Path(OUTPUTPATH));

        //FileOutputFormat.setCompressOutput(job, true);//job使用压缩
        //FileOutputFormat.setOutputCompressorClass(job,GzipCodec.class);/设置压缩格式

        System.exit(job.waitForCompletion(true) ? 0 : 1);

    }

    public static class ObdImmediateParametersMapper
            extends Mapper<Object, Text, Text, NullWritable> {

        @Override
        protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
            String[] strArr = value.toString().split(",");
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < strArr.length-1; i++) {
                stringBuilder.append(strArr[i]).append("\t");
            }

            DateTimeFormatter format = DateTimeFormat.forPattern("yyyy/MM/dd");
            DateTime dateTime = DateTime.parse(strArr[strArr.length-1], format);
            String dateString = dateTime.toString("yyyyMMdd");

            stringBuilder.append(dateString);

            context.write(new Text(stringBuilder.toString()), NullWritable.get());
        }
    }

    public static class ObdImmediateParametersReducer
            extends Reducer<Text,NullWritable,Text,NullWritable> {
        @Override
        protected void reduce(Text key, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {
            context.write(key, NullWritable.get());
        }
    }

}
