package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\SalesforceEcosystem\\EclipseWorspace\\mano\\cucumberProject\\src\\main\\java\\features\\deals.feature",
               glue="stepDefn",plugin={"html:target/cucumber-html-report","pretty","html:test-output"},dryRun=false,monochrome=true)
public class TestRunner {

}
