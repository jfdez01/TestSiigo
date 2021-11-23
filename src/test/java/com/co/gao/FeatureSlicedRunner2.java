package com.co.gao;

import org.junit.runner.RunWith;

import com.co.gao.runners.CucumberSerneityRunner2;

import cucumber.api.CucumberOptions;

@RunWith(CucumberSerneityRunner2.class)
@CucumberOptions(features = "src/test/resources/features", glue = "com.co.gao.stepdefinitions")
public class FeatureSlicedRunner2 {
}
