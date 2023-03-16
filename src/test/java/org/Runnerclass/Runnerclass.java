package org.Runnerclass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.stepdefinition",tags=" @test",dryRun=false ,monochrome=true)


public class Runnerclass {
	
	


}