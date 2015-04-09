package Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class Read_City {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	 	  String[] s2;
	 	  String s3;
	 	  
	    	//City[] cities = new City[52];
	 	 ArrayList<Integer> cities = new ArrayList<Integer>();
	         FileReader fr2=new FileReader("berlin52.txt");
	       	BufferedReader sr2=new BufferedReader(fr2);
	       	  
	          for ( int i = 0; i < 52; i++){
	        	  
	            s3 = sr2.readLine();
	            s2 = s3.split("\\s+");
	            
	            cities.add((int)(Double.parseDouble(s2[1])));
	         
	            System.out.println(cities.get(i));
	          			}
	          
	          }
}
	   
 

