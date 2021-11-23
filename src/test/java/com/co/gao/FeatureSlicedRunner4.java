package com.co.gao;

import org.junit.runner.RunWith;

import com.co.gao.runners.CucumberSerneityRunner4;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner4.class)
@CucumberOptions(features = "classpath:features", glue = "com.co.gao.stepdefinitions")
public class FeatureSlicedRunner4 {
}
