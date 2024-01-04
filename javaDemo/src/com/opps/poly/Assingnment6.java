package com.opps.poly;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Assingnment6 {
	private String name;
    private String email;
    private String distric;
    private String state ;
    private String country;
    
    public Assingnment6(String name, String email, String distric, String state, String country) 
    {
        this.name = name;
        this.email = email;
        this.distric = distric;
        this.state = state;
        this.country = country;
        }
    public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.print("Enter the number of customers: ");
	    int m = value.nextInt();
	    
	    ArrayList<Assingnment6 > customer = new ArrayList<Assingnment6>();
		
		 for (int i = 0; i < m; i++) {
			  System.out.printf("Enter customer details %d:%n", i+1);
			  
			  System.out.println("name:");
		      String name = value.next();

			  System.out.println("email:");
		      String email = value.next();

			  System.out.println("distric:");
		      String distric = value.next();


			  System.out.println("state:");
		      String state = value.next();

			  System.out.println("country:");
		      String country = value.next();

		      Assingnment6 cusobj = new Assingnment6(name, email, distric, state, country);
		      customer .add(cusobj);
		 }
		 System.out.println("Customer Details");
		 for(Assingnment6 a:customer)
		 {
		 System.out.println("Name:"+a.name +"    "+"Email:"+ a.email +"   "+"distric:"+ a.distric +"    "+"State:"+ a.state +"    "+"Country:"+ a.country);
		 
		 }
		 Map <String,Map<String,Map<String,List<Assingnment6>>>> numberofcus=new HashMap <> ();

		 for (Assingnment6 a:customer)
		  {
			  String country =a.country;
		      String state = a.state;
		      String distric = a.distric;
		      numberofcus.computeIfAbsent(country, k-> new HashMap<>()).computeIfAbsent
		      (state, k-> new HashMap<>()).computeIfAbsent(distric,k-> new ArrayList<>()).add(a);
		  }
	 
		 System.out.println(" Total Customers in Country-wise:");
		  for (Map.Entry<String, Map<String, Map<String, List<Assingnment6>>>> countryname : numberofcus.entrySet()) 
		  {
		      String country = countryname.getKey();
		      int TotalCustomers = 0;
		      for (Map.Entry<String, Map<String, List<Assingnment6>>> statename : countryname.getValue().entrySet()) 
		      {
		    	  for (List<Assingnment6> districList : statename.getValue().values()) 
		    	  {
		    		  TotalCustomers += districList.size();
		    		  }
		    	  }
		      System.out.println(country + ": " + TotalCustomers + " customers");
		      }
		  System.out.println("Customers in Country and State-wise :");
			for (Map.Entry<String, Map<String, Map<String, List<Assingnment6>>>> countryname : numberofcus.entrySet())
			{
			  String country = countryname.getKey();
			  for (Map.Entry<String, Map<String, List<Assingnment6>>> statename : countryname.getValue().entrySet())
			  {
			      String state = statename.getKey();
			      int stateTotalCus = 0;
			      for (List<Assingnment6> districname : statename.getValue().values())
			      {
			    	  stateTotalCus += districname.size();
			    	  }
			      System.out.println(country + ", " + state + ":" +stateTotalCus + "customers");
			      }
			  System.out.println(" Customers in Country, State and distric-wise ");
			  Map<String, Map<String, Map<String, List<Assingnment6>>>> countryStatedistricMap = new HashMap<>();
			  
			  for (Assingnment6 a:customer)
			  {
				  String country1 =a.country;
			      String state = a.state;
			      String distric = a.distric;
			      
			      if (!countryStatedistricMap.containsKey(country1))
			      {
			    	  countryStatedistricMap.put(country1, new HashMap<>());
			      }
			      if (!countryStatedistricMap.get(country1).containsKey(state)) 
			      {
			    	  countryStatedistricMap.get(country1).put(state, new HashMap<>());
			      }
			      if (!countryStatedistricMap.get(country1).get(state).containsKey(distric))
			      {
			    	  countryStatedistricMap.get(country1).get(state).put(distric, new ArrayList<>());
			      }
			      countryStatedistricMap.get(country1).get(state).get(distric).add(a);
			  }
			  for (Map.Entry<String, Map<String, Map<String, List<Assingnment6>>>> countryname1 :  countryStatedistricMap.entrySet())
			  {
				  				  
				  String country1 = countryname.getKey();
			      int countryCustomerCount = 0;
			      System.out.println("Country: " + country1);
			      for (Map.Entry<String, Map<String, List<Assingnment6>>> statename : countryname.getValue().entrySet())
			      {
			    	  String c = statename.getKey();
			          int stateCustomerCount = 0;
			          System.out.println("State: " + c);
			      
			          for (Map.Entry<String, List<Assingnment6>> districtEntry : statename.getValue().entrySet())
			          {
			              String district = districtEntry.getKey();
			              List<Assingnment6> customersInDistrict = districtEntry.getValue();
			              int districtCustomerCount = customersInDistrict.size();
			              System.out.println("District: " + district + " (" + districtCustomerCount + " customers)");
			              stateCustomerCount += districtCustomerCount;
			              countryCustomerCount += districtCustomerCount;
			          }
			          System.out.println("Total customers in " + statename + ": " + stateCustomerCount);
			      
			      }
			      System.out.println("Total customers in " + country1 + ": " + countryCustomerCount);
			      System.out.println();
			value.close();

			  }
	}

    }
	
}

			
			
    

