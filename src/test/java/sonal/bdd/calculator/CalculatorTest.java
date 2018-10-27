package sonal.bdd.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        plugin = {"pretty", "html:target/cucumber", "rerun:target/rerun.txt"},
        strict = true,
        features = "src\\test\\resources\\sonal.bdd.calculator")
public class CalculatorTest {
}

