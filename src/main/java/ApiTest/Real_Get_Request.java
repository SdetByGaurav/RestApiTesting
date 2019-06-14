package ApiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Real_Get_Request {
	
	@Test
	public void get_all_india_states()
	{

		Response resp = RestAssured.get("http://services.groupkt.com/state/get/IND/all");
		
		int statusCode = resp.statusCode();
		System.out.println("status code is: " + statusCode);
		Assert.assertEquals(200, statusCode);
		
		
		String completeBody = resp.asString();
		System.out.println("response body is: " + completeBody);
		if(completeBody.contains("Pradesh"))
		{
			System.out.println("Validation Pass");
		}else
		{
			System.out.println("Validation Fail");
		}
		
		String contentType = resp.getContentType();
		System.out.println("Content Type" + contentType);
		Assert.assertEquals("application/json;charset=UTF-8", contentType);

	}
}
