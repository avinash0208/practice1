package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

//import java.util.HashMap;
import practice.level1;
import practice.Input;

import com.google.gson.Gson;

public class HttpConnection {

	public static int Cuisine_id;

	public static void HttpConnect() throws Exception {

	//	Input user_input = new Input();
		// user_input.input();

		HttpConnection http = new HttpConnection();
		// http.http_Connection();
		

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();

		BufferedReader br = new BufferedReader(new FileReader("/home/avinash/cuisine.txt"));
		Gson obj = new Gson();

		level1 c = obj.fromJson(br, level1.class);
		//System.out.println(c);
		Integration integrate=new Integration();
		integrate.match(c);

	//	http.match(c);

	}

	/*void match(level1 l1) throws Exception{

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
	//	System.out.println(l1.getCuisines().size());
		for (int i = 0; i < l1.getCuisines().size(); i++) {
			//System.out.println("-----------------------------------------");
			//System.out.println(l1.getCuisines().get(0).getCuisines());
			//System.out.println(l1.getCuisines().get(0).getCuisines().getCuisine_name());
			hm.put(l1.getCuisines().get(i).getCuisines().getCuisine_name(),
					l1.getCuisines().get(i).getCuisines().getCuisine_id());
		}
		  Cuisine_id = hm.get(Input.name);
		System.out.println(Cuisine_id);

	}
void restaurants(level1 l1) {
	HashMap<String,Integer> Hash =new HashMap<String,Integer>();
	//or()
}*/
	// HTTP GET request
	private void sendGet() throws Exception {

		String url = "https://developers.zomato.com/api/v2.1/cuisines?city_id=4";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// add request header
		// con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("user-key", "431869f5fb5beddd878c74754218e9fc");

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		System.out.println(response.toString());

	}

}
