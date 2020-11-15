# CityBikesApiAutomation
This is an API automation project for the 
Endpoint: http://api.citybik.es/v2/networks
using Rest Assured which is a java library for testing Restful Web services.

Pre-requisites : Java, IDE(Eclipse, IntelliJ, etc), Maven & TestNG

Steps: 
- Create a Maven project
- add dependencies in pom.xml
- testNg dependency
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.1.0</version>
        <scope>test</scope>
    </dependency>
- rest assured dependency
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>4.3.2</version>
        <scope>test</scope>
    </dependency>
- Build it and run the tests
    