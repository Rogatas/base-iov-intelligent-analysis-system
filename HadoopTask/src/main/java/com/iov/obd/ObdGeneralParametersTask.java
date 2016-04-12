package com.iov.obd;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
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
 * OBD综合参数
 *
 *
 * 内部ID	平均油耗	最小油耗	最大油耗	剩余油量
 * -----
 * 当前点火正时	平均点火正时	最小点火正时	最大点火正时
 * 当前节气门开合角度	平均节气门开合角度	最小节气门开合角度	最大节气门开合角度
 * -----
 * 当前进气温度	平均进气温度	最小进气温度	最大进气温度
 * 当前空气流量	平均空气流量	最小空气流量	最大空气流量
 * 当前电瓶电压	平均电瓶电压	最小电瓶电压	最大电瓶电压
 * 当前冷却液水温	平均冷却液水温	最小冷却液水温	最大冷却液水温
 * 当前蒸汽压力	平均蒸汽压力	最小蒸汽压力	最大蒸汽压力
 * 入库时间
 *
 * 352016802932327 1       1       1       2       33      32      30
 * 33      7.2     7.4     7.18    18.56   20.4    20.5    19.2
 * 20.8    67      64      25      67      0       0       0       0       20140703
 *
 * Created by liguodong on 2016/4/9.
 */
public class ObdGeneralParametersTask {

    private final static String INPUTPATH = "hdfs://192.168.101.71:8020/input/obd_general_parameters";
    private final static String OUTPUTPATH = "hdfs://192.168.101.71:8020/output/ObdGeneralParameters";
    public static Log logger = LogFactory.getLog(ObdImmediateParametersTask.class);


    static {
        //相对路径
        PropertyConfigurator.configure("HadoopTask\\src\\main\\resource\\properties\\log4j.properties");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Configuration conf = new Configuration();

        HdfsUtils.deleteDir(conf, OUTPUTPATH);

        Job job = Job.getInstance(conf, "ObdGeneralParametersTask");

        job.setJarByClass(ObdImmediateParametersTask.class);

        job.setMapperClass(ObdGeneralParametersMapper.class);

        job.setReducerClass(ObdGeneralParametersReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);

        FileInputFormat.addInputPath(job, new Path(INPUTPATH));
        FileOutputFormat.setOutputPath(job,
                new Path(OUTPUTPATH));

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }


    public static class ObdGeneralParametersMapper
            extends Mapper<Object, Text, Text, NullWritable> {

        @Override
        protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
            String[] strArr = value.toString().split(" ");
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 5; i++) {
                stringBuilder.append(strArr[i]).append("\t");
            }

            for (int i = 13; i < strArr.length-1; i++) {
                stringBuilder.append(strArr[i]).append("\t");
            }
            DateTimeFormatter format = DateTimeFormat.forPattern("yyyy/MM/dd");
            DateTime dateTime = DateTime.parse(strArr[strArr.length-1], format);
            String dateString = dateTime.toString("yyyyMMdd");

            stringBuilder.append(dateString);

            context.write(new Text(stringBuilder.toString()), NullWritable.get());
        }
    }


    public static class ObdGeneralParametersReducer
            extends Reducer<Text,NullWritable,Text,NullWritable> {

        @Override
        protected void reduce(Text key, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {
            context.write(key, NullWritable.get());
        }
    }


}
