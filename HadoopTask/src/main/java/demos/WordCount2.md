
Sample Runs

Sample text-files as input:

$ bin/hdfs dfs -ls /user/joe/wordcount/input/
/user/joe/wordcount/input/file01
/user/joe/wordcount/input/file02

$ bin/hdfs dfs -cat /user/joe/wordcount/input/file01
Hello World, Bye World!

$ bin/hdfs dfs -cat /user/joe/wordcount/input/file02
Hello Hadoop, Goodbye to hadoop.

Run the application:

$ bin/hadoop jar wc.jar WordCount2 /user/joe/wordcount/input /user/joe/wordcount/output

Output:

$ bin/hdfs dfs -cat /user/joe/wordcount/output/part-r-00000
Bye 1
Goodbye 1
Hadoop, 1
Hello 2
World! 1
World, 1
hadoop. 1
to 1

Notice that the inputs differ from the first version we looked at, and how they affect the outputs.

Now, lets plug-in a pattern-file which lists the word-patterns to be ignored, via the DistributedCache.

$ bin/hdfs dfs -cat /user/joe/wordcount/patterns.txt
\.
\,
\!
to

Run it again, this time with more options:

$ bin/hadoop jar wc.jar WordCount2 -Dwordcount.case.sensitive=true /user/joe/wordcount/input /user/joe/wordcount/output -skip /user/joe/wordcount/patterns.txt

As expected, the output:

$ bin/hdfs dfs -cat /user/joe/wordcount/output/part-r-00000
Bye 1
Goodbye 1
Hadoop 1
Hello 2
World 2
hadoop 1

Run it once more, this time switch-off case-sensitivity:

$ bin/hadoop jar wc.jar WordCount2 -Dwordcount.case.sensitive=false /user/joe/wordcount/input /user/joe/wordcount/output -skip /user/joe/wordcount/patterns.txt

Sure enough, the output:

$ bin/hdfs dfs -cat /user/joe/wordcount/output/part-r-00000
bye 1
goodbye 1
hadoop 2
hello 2
horld 2