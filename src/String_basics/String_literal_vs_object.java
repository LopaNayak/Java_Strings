package String_basics;

public class String_literal_vs_object {
	  static void StringPool()
	  {
	    String st1= "Java";
	    String st2= "Java";
	    String st3= st1;
	    String st_obj1= new String("Java");
	    String st_obj2= new String("Java");
	    System.out.println("st1 and st2 :: String literal holding value of Java");
	    System.out.println("st_Obj1 and st_Obj2::  Java objects holding string value of Java \n ");
	    
	    System.out.println("Is st1== st2 ?:  "+(st1==st2));
	    System.out.println("Is st1== st3 ?:  "+(st1==st3));
	    System.out.println("Is st_Obj1== st_Obj2 ?:  "+(st_obj2==st_obj1));
	    
	    System.out.println("Does String literal and String object return true to the equality \n operator {==} check or do they return true to the equals object comparison?");
	    System.out.println("Is st1== st_Obj1 ?:  "+(st1==st_obj1));
	    System.out.println("Is st1.equals( st_Obj1 ) ?:  "+(st1.equals(st_obj1)));
	    System.out.println("\n verdict: \n since the two string references point to the same string \n in the pool, their equals check return true. \n However, the object references are different, since one is a \n object and other a literal. So, == check returns false.\n On similar lines, the string literals st1 and st2 return true \n to == check because they refer to the same \n literal in the pool and hold the same reference. \n Objects st5 and st4 are not equal as per the == check since they \n have different references(in heap) referring to the same shared location.");
	  }
	  
	  public static void main(String args[])
	  {
		  String_literal_vs_object.StringPool();
	  }
}

