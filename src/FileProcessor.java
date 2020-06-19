import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {
	
	private static ArrayList<Cereal> list = new ArrayList<>();
	
	private static ArrayList<Realtor> houses = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scan = new FileProcessor().exploreFile("HousePriceIndexByMetroRegion.txt");
		
		//processCereal(scan);
		
		processHouses(scan);
		
		//exploreCereal();
	}


	private static void processHouses(Scanner scan) {
		scan.nextLine();
		int x = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			houses.add(new Realtor(line));
			System.out.println(houses.get(x).toString());
			x++;
			
			// rather than print it out, we want to make a new Cereal and then add it 
			// to the list.  Later we want to explore the List
		}
	}
	

	private static void processCereal(Scanner scan) {
		scan.nextLine();
		//int x = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			list.add(new Cereal(line));
			//System.out.println(list.get(x).toString());
			//x++;
			
			// rather than print it out, we want to make a new Cereal and then add it 
			// to the list.  Later we want to explore the List
		}
	}

	private static void exploreCereal() {
		// for starters, find the Cereal with the most calories, least sugar, highest rating, etc.
		int highCal = Integer.MIN_VALUE;
		int highCalInd = 0;
		for(int x = 0; x<list.size(); x++) {
			if(list.get(x).getCal()>highCal) {
				highCal = list.get(x).getCal();
				highCalInd = x;
			}
		}
		
		System.out.println (list.get(highCalInd).toString());
		
		int lowSugar = Integer.MAX_VALUE;
		int lowSugarInd = 0;
		for(int x = 0; x<list.size(); x++) {
			if(list.get(x).getSugar()<lowSugar) {
				lowSugar = list.get(x).getCal();
				lowSugarInd = x;
			}
		}
		
		System.out.println(list.get(lowSugarInd).toString());
		
		double bestRate = Integer.MIN_VALUE;
		int bestRateInd = 0;
		for(int x = 0; x < list.size(); x++) {
			if(list.get(x).getRate() > bestRate) {
				bestRate = list.get(x).getRate();
				bestRateInd = x;
			}
		}
		
		System.out.println(list.get(bestRateInd).toString());
		
		
	}
	
	private Scanner exploreFile(String fname) {
		Scanner scan = null;
		try {
			File f = new File(fname);
			scan = new Scanner(f);
			
		}
		catch(Exception e) {
			System.err.println("Problem!!!");
			e.printStackTrace();
		}
		return scan;
	}

}
