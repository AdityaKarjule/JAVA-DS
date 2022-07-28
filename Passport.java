public class Person {
 private String name;
 public String getName() {  
     return name;  
 }  
 public void setName(String name) {  
     this.name = name;  
 }  
}
public class Passport {
 private int passportNo;
 public int getPassportNo(){
  return passportNo;	 
 }
 public void setPassportNo(int passportNo){
  this.passportNo = passportNo;	 
 }
}
public class Identity {
public static void main(String[] args) {

 Person p1 = new Person();
  p1.setName("Aditya");
 
Person p2 = new Person();
 p2.setName("Rahul");
 
Passport pp1 = new Passport();
 pp1.setPassportNo(12345678);
 
Passport pp2 = new Passport();
 pp2.setPassportNo(12398576);
  
 System.out.println(p1.getName()+ " has a US passport whose passport no is: " +pp1.getPassportNo());
 System.out.println(p2.getName()+ " has an Indian passport whose passport no is: " +pp2.getPassportNo());
  }
}