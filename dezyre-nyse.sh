#!/bin/bash
export PATH=$PATH:/Users/rashmi/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/bin/

sqoop import --connect jdbc:mysql://localhost/nyse --table nasdaq_daily_prices --target-dir /user/rashmi/nasdaq_daily_prices --username root --split-by exchange && \
hadoop jar NYSE.jar com.rashmi.mapreduce.NYSE.NYSEJob /user/rashmi/nasdaq_daily_prices /user/rashmi/nasdaq_daily_prices/output && 
sqoop export --connect jdbc:mysql://localhost/nyse --table stock_volume --export-dir /user/rashmi/nasdaq_daily_prices/output --username root --input-fields-terminated-by '\t' --input-lines-terminated-by '\n' && echo "SUCCESS:sqoop import-Hadoop MapReduce-sqoop export"
