import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {
	
	
	@Test
	public void testCase1() {
		int CountryCount=0;
		
		 for(int i=0; i<arr.length(); i++) {
			 String country= arr.getJSONObject(i).getString("country");
			 if(!country.equals("India")) {
				 CountryCount++; 
			
			 }
		 }
		if(CountryCount==4) {
			System.out.println("Team has 4 foreign players");
			
		}
		else if(CountryCount<=4) {
			System.out.println("Team has less tha 4 foreign players");
		}
		else {
			System.out.println("Team has more than 4 foreign players");
		 
	}
	}
	
	
			
	}


