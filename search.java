package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
	
public class search {

	public static void Search()throws Exception {

		//private final String USER_AGENT = "431869f5fb5beddd878c74754218e9fc";

		search http = new search();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
		
		BufferedReader br = new BufferedReader(new FileReader("/home/avinash/search.txt"));
		Gson obj = new Gson();
		
		restaurants c= obj.fromJson(br, restaurants.class);
		Integration i=new Integration();
		i.restaurants(c);
		
		//System.out.println(c.getRestaurants().get(0).getRestaurant().getR().getRes_id());
	}

	// HTTP GET request
	private void sendGet() throws Exception {

		String url = "https://developers.zomato.com/api/v2.1/search?entity_id=4&cuisines="+Integration.cuisine_id+"&sort=rating&order=desc";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
        //con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("user-key", "431869f5fb5beddd878c74754218e9fc");

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();   
	    
	    System.out.println(response.toString());
		
	}

}
