1.

package Generics;

		import java.util.HashMap;
		import java.util.Map;
		import java.util.Set;

		public class Program1 {

			public static void main(String[] args) {
				Map<Long,Contact> m=new HashMap<>();
				m.put(10012002l,new Contact(99887766,"Unkown","anonymous@abc.com",Contact.Gender.Male));
				
				Set<Long> keys=m.keySet();
				System.out.println("Keys:-");
				for(long i:keys)
				{
					System.out.println(i);
				}
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("Values:-");
				for(long i:keys)
				{
					System.out.println(m.get(i));
				}
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("Key and Value-");
				System.out.println(m);
			}

		}

		class Contact{
			
			long phoneNo;
			String name;
			String email;
			private Contact.Gender gen;
			enum Gender{
				Male,Female,Others
			}
			public Contact(long phoneNo, String name, String email ,Gender gen) {
				super();
				this.phoneNo = phoneNo;
				this.name = name;
				this.email = email;
				this.gen=gen;
			}
			@Override
			public String toString() {
				return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", gen=" + gen + "]";
			}
			
		}

---------------------------------------------------------------------------------------------------------------------	
2.

package Generics;
import java.util.Iterator;
import java.util.HashSet;

public class Program2 {

	public static void main(String[] args) {
		

		
				HashSet<Object> rj=new HashSet<>();
				rj.add(-5);
				rj.add(100);
				rj.add(null);
				rj.add("Hi");
				rj.add(0);
				rj.add(75);
				rj.add(-80);
				rj.add(-5); //will be negleted for being duplicate
				rj.add("Bye");
				rj.add("3.14");
				
				System.out.println(rj);
			}
		}
----------------------------------------------------------------------------------------------------------------------
3.

package generics;

public class Employee {
	private String name;
	private int id;
	private double sal;
	private String departments;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public Employee(String name, int id, double sal, String departments) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", departments=" + departments + "]";
	}	

}


package collections;

import java.util.*;


import generics.Employee;

public class TreeSetexam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the following options in which manner you need to sort");
		System.out.println("1.name  2.id  3.salary   4.department");
		int choose = scanner.nextInt();
		//char choose = scanner.next().charAt(0);
		Set<Employee> s = null;
		if(choose == 1) {
			s = new TreeSet<>(new nameComp());	
		}
		else if(choose == 2) {
			s = new TreeSet<>(new idComp());
		}
		else if(choose == 3) {
			s = new TreeSet<>(new salComp());
		}
		else if(choose == 4) {
			s = new TreeSet<>(new depComp());
		}
		s.add(new Employee ("Nireekshan",123,50000,"Development"));
		s.add(new Employee ("Luffy",456,60000,"One Piece"));
		s.add(new Employee ("Naruto",789,30000,"Leaf Village"));
		s.add(new Employee("Jojo",111,90000,"London"));
		s.add(new Employee("Tanjiro",222,10000,"Deamon Slayer"));
		for(Employee temp:s) {
			System.out.println(temp);
			
		}

	}

}


package collections;

import java.util.Comparator;

import generics.Employee;

public class idComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class nameComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class depComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDepartments().compareTo(o2.getDepartments());
	}

}

class salComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSal() > o2.getSal()) {
			return 1;
		} else {
			return -1;
		}

	}

}







-------------------------------------------------------------------------------------------------------------------------


4.

package Generics;


		import java.time.LocalDate;
		import java.time.Month;
		import java.util.LinkedList;
		import java.util.List;

		public class Program4{

			public static void main(String[] args) {
				List<LocalDate> ll=new LinkedList<>();
				ll.add(LocalDate.of(2000,Month.APRIL,23));
				ll.add(LocalDate.of(2004,Month.FEBRUARY,29));
				ll.add(LocalDate.of(2001,Month.JANUARY,10));
				ll.add(LocalDate.of(2000,Month.JULY,28));
				ll.add(LocalDate.of(2003,Month.JUNE,12));
				ll.add(LocalDate.of(2005,Month.DECEMBER,21));
				ll.add(LocalDate.of(2006,Month.OCTOBER,30));
				ll.add(LocalDate.of(2008,Month.MARCH,31));
				ll.add(LocalDate.of(2009,Month.SEPTEMBER,20));
				ll.add(LocalDate.of(2004,Month.NOVEMBER,8));
				
				for(LocalDate ld: ll)
				{
					if(ld.isLeapYear())
					{
						System.out.println("Your date of birth is "+ld+" and it was leap year");
					}
					else
					{
						System.out.println("Your date of birth is "+ld+" and it was not leap year");
					}
				}
			}

		}


	
