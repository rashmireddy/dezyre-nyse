package com.rashmi.mapreduce.NYSE;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class NYSEReducer extends Reducer<Text, Text, Text, DoubleWritable> {
	
	public void reduce(Text reducerKey, Iterable<Text> reducerValues, Context context) 
			throws IOException, InterruptedException {

		double Total = 0.0;
		
		for( Text value : reducerValues) {
			String parts[] = value.toString().split("\t");
			if (parts[0].equals("stock_volume")) {
				Total += Float.parseFloat(parts[1]);
			}
		}
		
		context.write(new Text(reducerKey), new DoubleWritable(Total));
	}
}
