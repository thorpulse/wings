package edu.isi.wings.execution.logger.api;

import java.util.ArrayList;

import edu.isi.wings.execution.engine.classes.RuntimePlan;

public interface ExecutionMonitorAPI {
	// The RuntimePlan here is expected to not contain detail about all steps here
	ArrayList<RuntimePlan> getRunList();
	
	RuntimePlan getRunDetails(String runid);
	
	boolean runExists(String runid);
	
	boolean deleteRun(String runid);
	
	void delete();
}
