import org.testng.annotations.Test;

public class TestCase2  extends BaseClass  {

	
	@Test
	public void Test2() {
		int WicketKeeperCount=0;
		
		for(int i=0; i<arr.length(); i++) {
			 String role=arr.getJSONObject(i).getString("role");
			 if(role.equals("Wicket-keeper")){
				 WicketKeeperCount++;
			 }
		 }
		 if(WicketKeeperCount>=1) {
			System.out.println("Team has atleast one wicket-keeper");
		}
		else {
			System.out.println("Team has No wicket-Keeper");
		}
		
	}
}
