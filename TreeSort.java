import java.util.Iterator;
import java.util.TreeSet;

public class TreeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Class details ..");
		Class s1 = new Class(01, "Aditya",89);
		Class s2 = new Class(02, "Sam",100);
		Class s3 = new Class(03, "Rahul",45);
		Class s9 = new Class(04, "Arav",75);
		Class s4 = new Class(05, "Mansi",43);
		
		
		TreeSet<Class> students = new TreeSet<Class>();
		
		System.out.println("Adding 1st student.");
		students.add(s1);
	
		System.out.println("Adding 2nd student.");
		students.add(s2);
		
		System.out.println("Adding 3rd student.");
		students.add(s3);
		
		System.out.println("Adding 4th student.");
		students.add(s4);

		
		System.out.println("Adding 9th student.");
		students.add(s9);
		
		System.out.println("Elements are added..");
		
		System.out.println("Sorting the Class in increasing order of the total marks of students");
		Iterator<Class> setIterator = students.iterator();
	
		while(setIterator.hasNext())
		{
			Class theClass = setIterator.next();
			System.out.println("The Element: "+theClass);
			System.out.println("-------------------");
		}
		System.out.println("============");
		
	/*	for (Class theClass : students) {
			System.out.println("The Element : "+theClass);
			System.out.println("-------------------");
		}*/
	}
}
class Class implements Comparable<Class>
{
	int rollNumber;
	String name;
	int totalMarks;
	public Class(int rollNumber, String name, int totalMarks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Class [rollNumber=" + rollNumber + ", name=" + name + ", totalMarks=" + totalMarks + "]";
	}
	public int compareTo(Class o){
		System.out.println("Comparing "+totalMarks + " with "+o.totalMarks);
		return Integer.compare(totalMarks, o.totalMarks);
	}
	
}