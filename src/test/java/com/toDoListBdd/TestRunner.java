package com.toDoListBdd;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features",
glue = "com/toDoListBdd",
dryRun = false,
tags = "@deleteitem")
public class TestRunner extends AbstractTestNGCucumberTests {
}
