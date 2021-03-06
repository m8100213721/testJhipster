package com.gandu.jhipster.application.cucumber.stepdefs;

import com.gandu.jhipster.application.TestJhipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestJhipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
