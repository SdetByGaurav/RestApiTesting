package ApiTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class First_Post_request {
	
	@Test
	public void patchRequest()
	{
		RequestSpecification request = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		jobj.put("id", 4);
		jobj.put("author", "Mangesh");
		jobj.put("title", "Automation");
		jobj.put("name", "Ganesh");
		jobj.put("Aadhar", "45679");
		request.body(jobj.toJSONString());
		request.contentType(ContentType.JSON);
		
		Response resp = request.patch("http://localhost:3000/posts/4");
		
		String bodyData = resp.asString();
		int statusCode = resp.statusCode();
		
		System.out.println("body: " + bodyData);
		System.out.println("statusCode: " + statusCode);
		
		
		
		
		
		
		
		
		
		
		
	}
}
