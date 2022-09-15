package StepDefinations;

import Utitiles.GWD;
import io.cucumber.java.*;

public class Hooks {

    @Before
    public void before(){

        System.out.println("Test has been initialized...");

    }

    @After
    public void after(){

        System.out.println("Test has been finished.");

        GWD.quitDriver();

    }

}
