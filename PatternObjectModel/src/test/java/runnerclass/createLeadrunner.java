package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/leadFeatures"},glue= {"pages","runnerclass"},plugin="html:target/report")
public class createLeadrunner {
//dryRun=true checks if all features are defined
//tags=@sanity and @smoke to group testcases
//strict=true
//even if one testcase is failed entire program is failed
//plugin="preety","html:target/report"
}
