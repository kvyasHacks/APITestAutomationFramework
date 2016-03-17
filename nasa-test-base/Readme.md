# Certification for API Testing

### Test Strategy 
Design and implement test automation framework 
* Reliable
* Extensible
* Repeatable
* Reportable

Complete executions of agreed automated as well as manual tests.  Testcases should have been designed and reviewed prior to writing any automation for them.  Ensure P0, P1 and P2 scenarios are automated and included in regression test suite consisting of below modules.

### Automation Test Framework Modules [Inverted Pyramid]
* Unit Test
    * Use Mocks and Stubs to abstract out any external component dependency.
    * Fast
* Functional Test
    * Individual functional components tested as whole 
* UI Test
    * Use in memory store 
    * API to create data prior to testing UI interaction
* System Test 
    * Benchmark performance limits
    * Benchmark load limits

**********************************************************************************

* Pre-checkin Test
    * Run combination of Unit and subset of Functional tests 
* Release Sanity Tests
    * Run set of functional, UI and System Tests 

Once above automation modules are developed, summarized metrics are generated and the process can be repeated any number of times, reliably - we should be in good shape for certification.

### Pre Release Activities and Sign Offs
* Security sign-off from the Application Security team has been received.
* Depending on development practices followed within organization, a round of exploratory testing across the teams should be useful, especially for large new features.

### API Under Test
    GET https://api.nasa.gov/planetary/sounds

Once above practices and frameworks are put in place - lets focus on authoring test cases for the API under test.

##### Functional Tests
* Test for empty values within params
* Test for missing params
* Test for invalid values within params (bug when limit is specified as char) 
* Test for valid param values and validate correct data is received.
* Test for rate limiting for an api key (vulnerable to DOS attack)

#### System Tests 
* Test for basic response time
* Test for accepatable response time under acceptable load
* Test for unacceptable response time after threshold load

#### Security Tests
* Test for Authentication and Authorization
* Test for CSRF, SQL injection
* Test for XSS (cross site scripting)

### Setting up the Automation Framework Project
* Setting up Maven on your system
	* Install Maven [https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html]
	* The project nasa-test-base includes the sample settings.xml and toolchains.xml
	* Update the path to your jdk in toolchains.xml
* Import projects as existing maven projects in your eclipse


