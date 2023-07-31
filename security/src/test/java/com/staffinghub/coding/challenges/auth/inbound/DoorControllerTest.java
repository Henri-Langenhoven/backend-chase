package com.staffinghub.coding.challenges.auth.inbound;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorControllerTest {

    private static final String DOOR_TO_CHANGE = "{\"id\":1,\"state\":\"UNLOCKED\"}";

    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    @Test
    public void test_get_all_doors() throws Exception {
        // #Arrange
        HttpGet request = new HttpGet("http://127.0.0.1:8080/v1/door");

        // #Act
        CloseableHttpResponse response = httpClient.execute(request);

        // #Assert
        assertEquals(403, response.getStatusLine().getStatusCode());
    }

    @Test
    public void test_change_door_state() throws Exception {
        // #Arrange
        HttpPost request = new HttpPost("http://127.0.0.1:8080/v1/door");
        request.addHeader("content-type", "application/json");
        StringEntity jsonEntity = new StringEntity(DOOR_TO_CHANGE);
        request.setEntity(jsonEntity);

        // #Act
        CloseableHttpResponse response = httpClient.execute(request);

        // #Assert
        assertEquals(403, response.getStatusLine().getStatusCode());
    }

}
