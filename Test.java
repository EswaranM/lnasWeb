package com.lexis.nexis;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Coupon {
	
	Integer in = 12;
	public Integer getIn() {
		return in;
	}

	public void setIn(Integer in) {
		this.in = in;
	}
	String str = "asdf";
	Coupon(Integer tt, String str){
		in = tt;
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}

public class Test {
	public List numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		public static  int [] tt = {1,2,3,4,5,6};
		
	public static void main(String args[]) {
		List<Map<String,Coupon>> input = new ArrayList<Map<String,Coupon>>();
				
		Map<String,Coupon> map = new HashMap<String,Coupon>();
		map.put("eswar", new Coupon(11,"eswar"));
		map.put("eswar1", new Coupon(12,"Raja"));
		input.add(map);
		List<String> tr = new ArrayList<String>();
		tr.add("eswar");
		personalizeCoupons(input, tr);
	}
	
	
    static List<Map<String, Coupon>> personalizeCoupons(List<Map<String, Coupon>> coupons, 
            List<String> preferredCategories) {

 	
    	String str = "sadfsadfsadffsda";
    	System.out.println(str.startsWith("sad"));
    	String[] c ={"d","d","sadf"};
    	 Character.getNumericValue('1');
    	 
    	Boolean bool =  Arrays.stream(c).filter(x -> str.startsWith(x)).count() > 0;
    	System.out.println("asdfsadfsadfsafd->"+ bool);
    	
     Stream<Map.Entry<String,Coupon>> tre = null;
	  coupons.forEach(coupon -> 
	  coupon.entrySet().stream().filter(map -> preferredCategories.contains(map.getKey()))
	  
    	 );
    	 
	 return null;
			   }
}
