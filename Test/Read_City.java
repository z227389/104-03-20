package Test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Read_City {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	 	  String[] s2;
	 	  String s3;  
	    	City[] cities = new City[52];
	         FileReader fr2=new FileReader("berlin52.txt");
	       	BufferedReader sr2=new BufferedReader(fr2);
	          for ( int i = 0; i < cities.length; i++){
	            s3 = sr2.readLine();
	            s2 = s3.split("\\s+");
	            cities[i] = new City();
	            cities[i].setX((int) (Double.parseDouble(s2[1])));
	            cities[i].setY((int) (Double.parseDouble(s2[2])));
	            System.out.println(cities[i].getX());

	          			}
	          
	          }
}
	   
 
