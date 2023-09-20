package Judo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class HubReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentReports  report=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(".\\report\\reports.html");
		report.attachReporter(spark);
		String friend="The function";
		
		
		report.flush();
		Desktop.getDesktop().browse(new File("C:\\JAVA Program\\ReportProject\\report\\reports.html").toURI());

	}

}
