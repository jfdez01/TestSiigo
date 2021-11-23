package com.co.gao;

import org.junit.runner.RunWith;

import com.co.gao.runners.CucumberSerneityRunner3;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner3.class)
@CucumberOptions(features = "classpath:features", glue = "com.co.gao.stepdefinitions")
public class FeatureSlicedRunner3 {
}
