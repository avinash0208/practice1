package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
	
	public class zomato {

		public static void main(String[] args) throws Exception {

			zomato http = new zomato();

			System.out.println("Testing 1 - Send Http GET request");
			http.sendGet();
			
			BufferedReader br = new BufferedReader(new FileReader("/home/avinash/Downloads/intern-sample/zomato.txt"));
			Gson obj = new Gson();
			
			example c= obj.fromJson(br, example.class);
			//System.out.println(c.getCategories().get(2).getCategories().getName());
		}

		// HTTP GET request
		void sendGet() throws Exception {

			String url = "https://developers.zomato.com/api/v2.1/categories";

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

