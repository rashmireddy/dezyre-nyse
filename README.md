#H1dezyre-nyse
===========

NYSE BigData project

#H2 Setup single node Hadoop on Mac
================================

1. install brew
```
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

2. install hadoop, hive, zookeeper, sqoop
```
..*$ brew install hadoop
..*$ brew install zookeeper
..*$ brew link zookeeper
```

3. Download sqoop and setup mysql driver
```
a. Go to http://www.carfab.com/apachesoftware/sqoop/1.4.5/
b. Download sqoop-1.4.5.bin__hadoop-2.0.4-alpha.tar.gz
c. untar it to home dir ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha
d. Download mysql-connector-java-5.*.*-bin.jar.zip from internet
e. place it in the lib dir of ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/lib
```

4. Run sqoop

Import mysql table data into Hadoop
```
./bin/sqoop import --connect jdbc:mysql://localhost/nyse  --table nasdaq_daily_prices --target-dir /user/rashmi/nasdaq_daily_prices --username root --split-by exchange
```

