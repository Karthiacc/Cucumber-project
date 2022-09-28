package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags = "@cancelbooking",
					features="src\\test\\resources",
					dryRun=false,
					stepNotifications=true,
					glue="com.stepdefinition",
					monochrome=true)


public class TestRunnerClass {

	@AfterClass
	public static void afterclass() {
		Reporting.generatereports("C:\\Users\\My\\eclipse-workspace\\OmrBranchAdactinHotelAutomation\\target\\new.json");
	}
}

