# RestAssured

Created new automation framework to test REST API from the scratch

Texttract used in this project are as below:
  1. Java; JDK version - 19
  2. Maven; version - 3
  3. Junit; version - 4
  4. RestAssured-for easy testing of REST services; version - 5.3.0
  5. RestAssured-JSONPath; version - 5.3.0
  6. RestAssured-JSON Schema Validator; version - 5.3.0
  7. RestAssured-Path; version - 5.3.0

## Summary:
#### REST Assured is a Java library for testing RESTful APIs. It is widely used to test JSON and XML-based web applications. In addition, it fully supports all REST methods like the GET, PUT, POST, PATCH, and DELETE. 

RestAssured class to set up a base URI. The base URI indicates the root address of the resource we are going to request from the server (hence the name base URI). Then we will add parameters, if any, when we actually make the request in subsequent code.

The class io.restassured.RestAssured , is the basis of any kind of HTTP request we make for tests. Some of the key features of this class are:

It generates HTTP Requests with a base URI.
Provides support to create Requests for different HTTP method types (GET, POST, PUT, PATCH, DELETE, UPDATE, HEAD, and OPTIONS).
It communicates with the server using HTTP and sends the Request created in the tests to the server.
Receives the response from the server.
Provides support for validating the Response received from the server.
Internally io.restassured.RestAssured class uses an HTTP builder library, which is a Groovy language-based HTTP client.

RequestSpecification of the request to be sent to the server. Rest Assured library provides an interface called RequestSpecification for this purpose. The variable httpRequest stores the request so that we can modify it if required like adding authentication details, adding headers, etc. 

Now call the server to get the resource using the RequestSpecification object. The above code line uses the request method to send the request for the resource to the server. The request method takes two arguments, the first is the HTTP method and the second is a string. The string parameter is used to specify the parameters that are to be sent with the base URI.

The return type of the request method is the Response object which means the request method gets the response back from the server.

The Response interface (io.restassured.response.Response) represents a response returned from a server. It contains all the data sent by the server.
