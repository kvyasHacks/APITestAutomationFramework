/**
 * 
 */
package gov.nasa.api;

import gov.nasa.api.util.APIUtil;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.jayway.restassured.RestAssured;

/**
 * @author kvyas
 *
 */
public class BaseApiTest {
	
	@BeforeClass 
	public void setup() {
		RestAssured.baseURI = APIUtil.API_SECURE_DOMAIN ;
		RestAssured.basePath = APIUtil.REST_PATH_PLANET ;
	}
	

	@AfterClass 
	public void teardown() {
		RestAssured.reset();
		//clear any state
		//close any connections...
	}

}
	