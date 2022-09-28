package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
public static void generatereports(String jsonfile) {

	File file=new File("C:\\Users\\My\\eclipse-workspace\\OmrBranchAdactinHotelAutomation\\target");
	
	Configuration configuration=new Configuration(file, "Adactin hotel");
	
	configuration.addClassifications("Browser", "chrome");
	configuration.addClassifications("Browser version", "7.32.3");
	configuration.addClassifications("OS", "windows 10");
	configuration.addClassifications("sprint", "24");

	List<String> jsonfiles=new ArrayList<String>();
	jsonfiles.add(jsonfile);

	ReportBuilder reportBuilder=new ReportBuilder(jsonfiles, configuration);
	reportBuilder.generateReports();

}
	
}

