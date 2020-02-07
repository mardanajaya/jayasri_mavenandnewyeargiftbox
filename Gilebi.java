package com.hometask;
		import java.util.Map;
		public class Gilebi implements NewYearGiftBox {
		public int calculate_weight(int weight,int quantity) {
		return weight*quantity;
		}

		    public void print(Map<String, Integer> map) 
		    { 
		        if (map.isEmpty()) { 
		            System.out.println("map is empty"); 
		        } 
		  
		        else { 
		        
		            System.out.println(map); 
		            
		        } 
		    }
		}// TODO Auto-generated method stub
