package SampleTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {
	
	public static void getBooksDetails() {
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.request(Method.GET, "");
		System.out.println("Status detail and code : "+res.getStatusLine()+res.getStatusCode());
		System.out.println("Response details : "+res.prettyPrint());
	}

}
