import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import static io.restassured.RestAssured.get;

public class PrintLocationInfoForFrankfurtTest_Get {
    @Test
    public void PrintLocationInfoForFrankfurtTest() {
        Response response = get("http://api.citybik.es/v2/networks?fields=id,name,location");
        ArrayList<LinkedHashMap<String, String>> locationData = response.getBody().jsonPath().get("networks.findAll {it.country = 'DE'}.location");

        for (LinkedHashMap<String, String> locationInfo : locationData) {
            if (locationInfo.get("city").equals("Frankfurt") && locationInfo.get("country").equals("DE")) {
                System.out.println(locationInfo);
            } else {
                System.out.println("No location information found for city Frankfurt in Germany");
            }
        }
    }
}
