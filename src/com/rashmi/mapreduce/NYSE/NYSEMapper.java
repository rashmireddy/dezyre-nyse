package com.rashmi.mapreduce.NYSE;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class NYSEMapper extends Mapper<LongWritable, Text, Text, Text>{
	
	@Override
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException{
	
		String record = value.toString();
		String[] parts = record.split(",");

		context.write(new Text(parts[1]), new Text("stock_volume\t" + parts[7]));
		//context.write(new Text(parts[0]), new Text("stock_symbol\t" + parts[1]+ "\tstock_volume\t" + parts[7]));

	}
}