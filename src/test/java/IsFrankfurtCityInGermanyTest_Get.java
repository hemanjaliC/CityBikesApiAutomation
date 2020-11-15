import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class IsFrankfurtCityInGermanyTest_Get {
    @Test
    public void IsFrankfurtCityInGermanyTest() {
        given().get("http://api.citybik.es/v2/networks").then().statusCode(200)
                .body("networks.location.findAll {it.city = 'Frankfurt'}.country", hasItems("DE"));
    }
}
