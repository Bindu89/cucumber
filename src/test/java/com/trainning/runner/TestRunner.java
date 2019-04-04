package com.trainning.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\dsp40\\eclipse-workspace\\maven\\src\\test\\java\\features\\trainning.feature"
 ,glue={"com.trainning.step"},plugin={"pretty","html:test-out","json:test-out.json"}
		 //"com.cucumber.listener.ExtentCucumberFormatter:test-out/report.html"}
 )
 
public class TestRunner {
 
}