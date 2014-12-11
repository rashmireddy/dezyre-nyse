package com.rashmi.mapreduce.NYSE;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class NYSEJob extends Configured implements Tool {
	//new MR API . 
	
	public static void main(String[] args) throws Exception {
		int result = ToolRunner.run(new NYSEJob(), args);
		System.exit(result);
	}

	public int run(String[] args) throws Exception {
		
		// Configuration processed by ToolRunner
		Configuration conf = new Configuration();
		
		// Create a new JobConf using the processed conf
		Job job = new Job(conf,"NYSEJob");
		job.setJarByClass(NYSEJob.class);
		
		//job.setNumReduceTasks(3);
		
		//Specify Mapper & Reducer class
		job.setMapperClass(NYSEMapper.class);
		job.setReducerClass(NYSEReducer.class);
		
		//Specify Mapper output key & value class
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);
	    
	    // job specific, which defaults to Mapper's output key/value
	    job.setOutputKeyClass(Text.class);
	    job.setOutputValueClass(Text.class);
	
	    //Specify MapReduce Input & Output class
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		// Process custom command-line options
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		//Wait for MapReduce job to be completed
		return (job.waitForCompletion(true) ? 0 : 1);
	}

}
