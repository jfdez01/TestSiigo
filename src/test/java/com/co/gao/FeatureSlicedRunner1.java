package com.co.gao;

import org.junit.runner.RunWith;

import com.co.gao.runners.CucumberSerneityRunner1;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner1.class)
@CucumberOptions(features = "classpath:features", glue = "com.co.gao.stepdefinitions")
public class FeatureSlicedRunner1 {
}
