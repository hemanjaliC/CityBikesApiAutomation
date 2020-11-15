import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class IdNameLocationTest_Get {
    @Test
    public void GetIdNameLocationStatusTest()
    {
        given().get("http://api.citybik.es/v2/networks?fields=id,name,location").then().statusCode(200);
    }
    @Test
    public void GetIdNameLocationOnlyTest()
    {
        given().get("http://api.citybik.es/v2/networks?fields=id,name,location").then().statusCode(200)
        .body("networks[0]", hasKey("location"))
        .body("networks[0]", not(hasKey("href")));
    }
}
