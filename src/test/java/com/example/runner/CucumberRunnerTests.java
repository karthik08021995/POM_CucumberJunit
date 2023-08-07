package com.example.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;

//import com.aventstack.extentreports.reporter.ExtentXReporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "src/test/resources/features/LoginPage.feature", glue = "com.example.definitions",
                 plugin = {
                		 //"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html "}, 
                 
                		 "pretty","html:target/cucumber.html",
                         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true)
//"pretty", "html:target/cucumber-reports", 
    
public class CucumberRunnerTests {


	}
 

