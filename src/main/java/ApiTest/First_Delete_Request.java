package ApiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class First_Delete_Request {

	@Test
	public void delete_Rquest()
	{
		Response resp = RestAssured.delete("http://localhost:3000/posts/23");
		
		System.out.println("status code: " + resp.statusCode());
		System.out.println("body: " + resp.asString());
	}
}
