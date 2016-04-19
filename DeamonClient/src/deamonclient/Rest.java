/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deamonclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Damon
 */
public class Rest {
    String target;
            
    public Rest (String url){
        target = url;
    }
	
	/* Executes a REST get mehtod
	* based on: http://howtodoinjava.com/2013/05/10/restful-webservices-client-using-java-net-package/
	*/ 
    public String GET(String thing){
        String tempurl = target + "/" + thing;
        try{
            URL url = new URL(tempurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
 
            if (conn.getResponseCode() != 200) 
            {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
 
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String apiOutput = br.readLine();
            conn.disconnect();
            return apiOutput;
        } catch (MalformedURLException e) {
            return e.toString();
        } catch (IOException e) {
            return e.toString();
        }
    }
    
    public String extractResponse(String xml){
        String tag1 = "<response>";
        String tag2 = "</response>";
        if (xml.contains(tag1)){
            return xml.substring(xml.indexOf(tag1)+tag1.length(), xml.indexOf(tag2));
        }
        return "";
    }
}
