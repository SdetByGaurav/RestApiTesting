package ApiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class First_get_Request {

	@Test
	public void getRequest()
	{
		
		Response resp = RestAssured.get("http://localhost:3000/posts");
		
		int statusCode = resp.statusCode();
		System.out.println("status code is: " + statusCode);
		Assert.assertEquals(200, statusCode);
		
		
		String completeBody = resp.asString();
		System.out.println("response body is: " + completeBody);
		if(completeBody.contains("rupesh"))
		{
			System.out.println("Validation Pass");
		}else
		{
			System.out.println("Validation Fail");
		}
		
		String contentType = resp.getContentType();
		System.out.println("Content Type" + contentType);
		Assert.assertEquals("application/json; charset=utf-8", contentType);
	}
}
