package andre.batch.sample;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;

public class StopJob {

	public static void main(String[] args) {
		JobOperator jobOperator = BatchRuntime.getJobOperator();

		
		long executionId = -1;

		try {
			executionId = Long.parseLong(args[0]);
		} catch (NumberFormatException notRestart) {
		}

		if(executionId >= 0) {
			jobOperator.stop(executionId);
		} 

	}

}
