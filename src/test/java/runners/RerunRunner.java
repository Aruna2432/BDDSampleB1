package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target//failedScenarios.txt",
				glue= {"stepDefs"},
				monochrome=true,
				dryRun=false,
				plugin= {"pretty"})

public class RerunRunner {

}
