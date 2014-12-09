dezyre-nyse
===========

NYSE BigData project

Setup single node Hadoop on Mac:
================================
<ol>
 1. install brew
</ol>
```
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```
<ol>
 2. install hadoop, hive, zookeeper, sqoop
</ol>
```
$ brew install hadoop
$ brew install hive
$ brew install zookeeper
$ brew link zookeeper
```
<ol>
 3. Download sqoop and setup mysql driver
</ol>
```
a. Go to http://www.carfab.com/apachesoftware/sqoop/1.4.5/
b. Download sqoop-1.4.5.bin__hadoop-2.0.4-alpha.tar.gz
c. untar it to home dir ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha
d. Download mysql-connector-java-5.*.*-bin.jar.zip from internet
e. place it in the lib dir of ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/lib
```

<ol>
 4. Run sqoop
</ol>
Import mysql table data into Hadoop
```
./bin/sqoop import --connect jdbc:mysql://localhost/nyse  --table nasdaq_daily_prices --target-dir /user/rashmi/nasdaq_daily_prices --username root --split-by exchange
```

<ol>
5. Run NYSE.jar MapReduce Program
</ol>
```
hadoop jar NYSE.jar com.rashmi.mapreduce.NYSE.NYSEJob <input path> <output path>
```

<ol>
 6. Run sqoop
</ol>
Export MapReduce output into MySQL
```
/Users/rashmi/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/bin/sqoop export --connect jdbc:mysql://localhost/nyse --table stock_volume --export-dir /user/rashmi/nasdaq_daily_prices/output --username root --input-fields-terminated-by '\t' --input-lines-terminated-by '\n'
```
