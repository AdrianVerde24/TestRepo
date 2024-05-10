import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.assertEquals;


public class APITest {

    @Test
    public void testGetUser() throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/users/1");
        HttpResponse response = httpClient.execute(request);

        assertEquals(response.getStatusLine().getStatusCode(), 200);
        // Add more assertions as needed
    }

    // Add more test methods for other API endpoints
}

