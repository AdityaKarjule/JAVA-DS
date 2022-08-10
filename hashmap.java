import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;  
class hashmap{  
 public static void main(String args[]){  
   LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();    
   map.put(103,"Rahul"); 
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
        
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
      System.out.println("------------");
      TreeMap<Integer,String> m2=new TreeMap<Integer,String>();    
      m2.put(103,"Rahul"); 
         m2.put(100,"Amit");    
         m2.put(102,"Ravi");    
         m2.put(101,"Vijay");    
           
           
         for(Map.Entry m:m2.entrySet()){    
          System.out.println(m.getKey()+" "+m.getValue());    
         }    
 }  
}
