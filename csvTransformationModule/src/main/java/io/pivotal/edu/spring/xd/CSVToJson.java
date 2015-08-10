package io.pivotal.edu.spring.xd;

import java.util.Map;
import java.util.HashMap;

import org.codehaus.jackson.map.ObjectMapper;

public class CSVToJson {
	private ObjectMapper mapper = new ObjectMapper();

	public Map translate(String payload) {

		HashMap<String, String> obj = new HashMap<String, String>();
		String[] info = payload.split("\\|");

		try {
			String[] coordinates = info[10].split(",");

			obj.put("transactionId", info[0]);
			obj.put("creditCardType", info[1]);
			obj.put("creditCardNumber", info[2]);
			obj.put("retailerName", info[3]);
			obj.put("amount", info[4]);
			obj.put("street", info[5]);
			obj.put("city", info[6]);
			obj.put("zip", info[7]);
			obj.put("state", info[8]);
			obj.put("country", info[9]);
			obj.put("latitude", coordinates[0]);
			obj.put("longitude", coordinates[1]);
			obj.put("timestamp", info[11]);
			
			
			
		} catch (Exception e) {
			System.out.println("Missing data field");
		}
		return obj;

	}
}
