
public class Cereal implements Comparable<Cereal>{

	// Look at the output in the Console.  We need a field for each attribute of a Cereal
	
	// our constructor(s) should reflect the private instance variables that we use
	
	
	// add getters (do we need setters?)
	
	private String name;
	private Boolean type;
	private int cal;
	private int protein;
	private int fat;
	private int sodium;
	private double fiber;
	private double carb;
	private int sugar;
	private int pot;
	private int vit;
	private int shelf;
	private double weight;
	private double cup;
	private double rate;
	
	public Cereal(String n, boolean t, int ca, int p, int fa, int sod, double fi, double car, int sug, int po, int v, int sh, double w, double c, double r) {
		
		name = n;
		type = t;
		cal = ca;
		protein = p;
		fat = fa;
		sodium = sod;
		fiber = fi;
		carb = car;
		sugar = sug;
		pot = po;
		vit = v;
		shelf = sh;
		weight = w;
		cup = c;
		rate = r;
		
	}
	
	public Cereal(String s) {
		
		String[] cer = s.split(",");
		name = cer[0];
		if(cer[1].equals("true"))
			type = true;
		else
			type = false;
		cal = Integer.parseInt(cer[2]);
		protein = Integer.parseInt(cer[3]);
		fat = Integer.parseInt(cer[4]);
		sodium = Integer.parseInt(cer[5]);
		fiber = Double.parseDouble(cer[6]);
		carb = Double.parseDouble(cer[7]);
		sugar = Integer.parseInt(cer[8]);
		pot = Integer.parseInt(cer[9]);
		vit = Integer.parseInt(cer[10]);
		shelf = Integer.parseInt(cer[11]);
		weight = Double.parseDouble(cer[12]);
		cup = Double.parseDouble(cer[13]);
		rate = Double.parseDouble(cer[14]);
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getCal() {
		return cal;
	}
	
	public int getProtein() {
		return protein;
	}
	
	public int getFat() {
		return fat;
	}
	
	public int getSodium() {
		return sodium;
	}
	
	public double getCarb(){
		return carb;
	}
	
	public int getSugar() {
		return sugar;
	}
	
	public int getPotassium() {
		return pot;
	}
	
	public int getVitamins() {
		return vit;
	}
	
	public int getShelf() {
		return shelf;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getCup(){
		return cup;
	}
	
	public double getRate(){
		return rate;
	}
	
	//public static Cereal parseString(String s) {
		
		
		
		//return null;
	//}
	
	@Override
	public String toString() {
		String s = "This cereal's name is " + name + ". It's calorie count is " + cal + ", it's protein amout is " + protein + ", it's fat is " + fat + ", it's sodium amount is " + sodium + ", it's carb amount is " + carb + ", it's its sugar amount is " + sugar + ", it's potassium amount is " + pot + "it's vitamin amount is " + vit + "it's shelf life is " + shelf + " years, it's weight is" + weight + ", and it has " + cup + " cups. Overall, it's rating is" + rate;// add lots of stuff to the String!
		
		
		return s;
	}
	
	
	/*
	 * We want to use a strategy similar to the StringFreq class we created
	 * In that class, we had an int that we used to determine the attribute that
	 * we would use to compare a Cereal with another Cereal.
	 * 
	 */
	public int compareTo(Cereal arg0) {

		return 0;
	}

}
