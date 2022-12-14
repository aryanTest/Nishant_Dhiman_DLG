
**Pre-requisites:**

1) Maven should be installed on the system. Verify the version with mvn --version
1) Java should be installed on the system as well with Java\_Home set up done. Verify version with java -version
1) Change to the directory of project before running the command.

To run the test from the command line, use the following command in Command prompt:

\>>  mvn clean verify

You will see the tests running once you follow the above steps

Steps to Run:

1) Import the project directly or clone the repository provided in the IDE
1) Run using the CLI (mvn clean verify) after navigating to project location or the below mentioned methods
1) If you face Driver Error (Null Issue for Driver because .exe files are not provided, instead WebDriverManager is used in the code), do the following:

\>>  WebDriverManager.*chromedriver*().version("Enter your driver version here as per browser compatibility").setup();

This line of code is present in “Stepdefinitions” package in “ToolCheckerSteps” class.

Also, if the issue still persists, Change the location pointer of default jre to jdk location in your system (Window - > Preferences - > JDK (Change your java location))

Your issue for driver would be resolved, in case, observed. 

Also, if you want to run the project by other ways, it can be done as follows:

1) Right click on Feature File and Run as Cucumber Feature File (If you do not see this option, convert the project to Cucumber Project by Right clicking on Project and convert To - > Cucumber Project)
1) Also, you can Run the project from Test Runner file in the Options package by Right Click -> Run as Junit Test

**Other Notes:**

1) There are 4 packages namely:
1) Dataprovider: It has the configuration for reading the config.properties file for manipulating URL and the browser.
1) Options: It has class TestRunner which can also be used for running tests via IDE.
1) Pageobjects: It has a class named LocatorUtils which has all the used locators in it and Toolcheck which has configuration methods for all the used locators.
1) Stepdefinitions: It has ToolCheckerSteps which has configuration of all the feature file Steps
1) There is a Features Folder which has the scenarios listed with steps.
1) Configs Folder contain the config.properties file for manipulation of URL and browser.
1) Coverage has been covered in HTML format once the command “mvn clean verify” is run via the command-line with folder “cucumber-maven-report” in target folder of the project. 

Improvements can be done in the following areas:

1) Incorporation of different test scenarios using Excel data provision 
1) Inclusion of some advanced reporting tool, apart from maven reports
1) More test scenarios for different assertive test cases
1) DOM Improvement (Noticed a limitation in the webpage provided) in terms of inclusion of “ID” for better practices

Thank You !!


