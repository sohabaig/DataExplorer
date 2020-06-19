import java.util.ArrayList;

public class Realtor implements Comparable<Realtor>{
	
	private String location;
	
	private ArrayList<QuarterlyPrice> quarters;
	
	public Realtor(String name) {
		
		String[] temp = name.split("\"");
		
		if(temp.length>1)
			location = temp[1];
		else
			location = "State";
		
	}
	
	public void addQuarterlyPrice(QuarterlyPrice q) {
		
		quarters.add(q);
		
	}
	
	public String toString() {
		
		return "House is " + location;
		
		
	}
	
	public void addQP() {
	
		
		
	}
	

	
	@Override
	public int compareTo(Realtor o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


}
