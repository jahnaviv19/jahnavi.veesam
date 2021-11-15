1.
package genrics_aasig;
import java.util.HashSet;

public class assig_1 {

	public static void main(String[] args) {
	        HashSet<employee> act= new HashSet();
	        employee a=new employee(678654,"sahana",50000,"Development");
	        employee b=new employee(675489,"Amrutha",30000,"Testing");
	        employee c=new employee(675432,"geetha",60000,"Manager");
	        act.add(a);
	        act.add(b);
	        act.add(c);
	        for(employee e :act){
	            e.displayDetails();
	        }
	    }
	}
	class employee{
	    int id,salary;
	    String name,dept;
	    public employee(int id, String name, int salary, String dept){
	        this.id=id;
	        this.name=name;
	        this.salary=salary;
	        this.dept=dept;
	    }
	    public void displayDetails(){
	        System.out.println("{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}");
	    }
	}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------


3.package genrics_aasig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class assig_3 {
		public static final <N> void swap (N[] a, int i, int j) {
		N n = a[i];
		a[i] = a[j];
		a[j] = n;
		}

		public static final <N> void swap (List<N> l, int i, int j) {
		Collections.<N>swap(l, i, j);
		}

		private static void test() {
		String [] a = {"sahana", "gowdru"};
		swap(a, 0, 1);
		System.out.println("a:"+Arrays.toString(a));
		List<String> l = new ArrayList<String>(Arrays.asList(a));
		swap(l, 0, 1);
		System.out.println("l:"+l);
		}
		public static void main(String...args)
		{
		test();
		}

		}

----------------------------------------------------------------------------------------------------------------------------
2.
package genrics_aasig;
import java.util.HashMap;
import java.util.Random;

public class assig_2 {

    public static void main(String[] args) {
        HashMap<Integer,Double> store=new HashMap<Integer,Double>();
        Random r=new Random();
        int max=45;
        double range=8.76;
        double min=7;
        for (int i = 0; i < 10; i++) {
            int x=(int)(r.nextInt(max));
            double y=range+r.nextDouble()-min;
            store.put(x,y);
            System.out.println(x+" "+y);
        }
        System.out.println(" ");
        System.out.println(store);
    }
}
