package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;// fixed with the shortcut cntrol+shift+O


@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/shubhambhardwaj/eclipse-workspace/cucumberdemo/src/main/java/Features/hookTag.feature",
		glue = {"StepDefinition"},
		plugin = { "pretty" , "html:target/cucumber-reports" },
		monochrome = true,
		dryRun = false,
		publish = true
//		tags =  "@SmokeTest or @RegressionTest"
		
		)

public class TestRunner {
 
}




//cucumber options
// dryrun
//extraGlue
//features
//monoChrome
//name
//objectFactory
//plugin
//publish
//snnipet
//stepsnotification
//strict
//usefilenameCompatibleName
//tags


//data driven testing with cucumber
//1 simple DD testing- without examples keywords
//2 with examples +senarios outline
//3 using table

//"smoketest and regtest" , "smoketest and not regtest" , "smoketest or regtest"