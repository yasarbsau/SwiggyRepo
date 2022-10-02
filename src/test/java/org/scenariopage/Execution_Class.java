package org.scenariopage;

import java.util.Iterator;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


@RunWith (Suite.class)

@SuiteClasses ({RegistrationScenario.class})

// n = if more classes needs to be run, mention the class name.class
//  ({RegistrationScenario.class, n})

public class Execution_Class {
	
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(RegistrationScenario.class);
		
		int RunCount = runClasses.getRunCount();
		int FailureCount = runClasses.getFailureCount();
		int IgnoreCount = runClasses.getIgnoreCount();
		
		List <Failure> failures = runClasses.getFailures();
		
		Iterator <Failure> it = failures.iterator();
		
		while (it.hasNext()) {
			
			Failure next = it.next();
			System.out.println(next);	
		}
		
		System.out.println(RunCount);
		System.out.println(FailureCount);
		System.out.println(IgnoreCount);
		System.out.println(RunCount- FailureCount);

										
		
	}
	

}
