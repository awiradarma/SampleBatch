package andre.batch.sample;

import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;

public class RestartJob {

	public static void main(String[] args) {
		JobOperator jobOperator = BatchRuntime.getJobOperator();

		Properties jobParameters = new Properties();

		long executionId = -1;

		try {
			executionId = Long.parseLong(args[0]);
		} catch (NumberFormatException notRestart) {
		}

		for(int i = 1; i < args.length; i++) {
			jobParameters.put(args[i].substring(0, args[i].indexOf('=')), args[i].substring(args[i].indexOf('=') + 1));
		}


		if(executionId >= 0) {
			executionId = jobOperator.restart(executionId, jobParameters);
		};

	}

}
