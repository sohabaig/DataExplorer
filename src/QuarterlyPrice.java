import java.util.ArrayList;

public class QuarterlyPrice implements Comparable<QuarterlyPrice>{
	
	private int year;
	
	private int quarter;
	
	private double index;
	
	public QuarterlyPrice(String s) {
		
		ArrayList<String> a = new ArrayList<>();
		
		String[] temp = s.split(",");
		
		for(int x = 1; x<temp.length; x++) {
			a.add(temp[x]);
		}
		
		year = Integer.parseInt(a.get(0));
		
		quarter = Integer.parseInt(a.get(1));
		
		index = Double.parseDouble(a.get(2));
		
	}
	
	public int getYear() {
		return year;
	}
	
	public int getQuarter() {
		return quarter;
	}
	
	public double getIndex() {
		return index;
	}
	

	@Override
	public int compareTo(QuarterlyPrice o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


}
