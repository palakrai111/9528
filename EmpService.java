import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EmpService {
	HashSet<EmloyeeEntity> hs = new HashSet<EmloyeeEntity>();
	Scanner sc = new Scanner(System.in);
	EmpService()
	{
		
	}
	void addEmp() 
	{
		EmloyeeEntity ob = new EmloyeeEntity(1,"palak");
		hs.add(ob);
		EmloyeeEntity ob1 = new EmloyeeEntity(2,"nayan");
		hs.add(ob1);
	}
	void show()
	{
		for(EmloyeeEntity e : hs)
		{
			System.out.println(e);
		}
		
	}
	void searchEmp()
	{
		System.out.println("enter id to be searched");
		int id = sc.nextInt();
		boolean found = false;
		for(EmloyeeEntity e : hs)
		{
			if(e.getEmpid() == id)
			{
				found = true;
				System.out.println(e);
				break;
			}
		}
		if(found)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
			
		}
	}
	
	void removeEmp()
	{
		System.out.println("enter id to be removed");
		int id = sc.nextInt();
		boolean found = false;
		EmloyeeEntity ob = null;
		for(EmloyeeEntity e : hs)
		{
			if(e.getEmpid() == id)
			{
				found = true;
				ob = e;
				//System.out.println(e);
				break;
			}
		}
		if(found)
		{
			System.out.println("updated list after removal");
			hs.remove(ob);
			for(EmloyeeEntity e : hs)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("not found");
			
		}
		
	}
	
	void updateEmp()
	{
		
		System.out.println("enter id to be updated");
		int id = sc.nextInt();
		boolean found = false;
		EmloyeeEntity ob = null;
		for(EmloyeeEntity e : hs)
		{
			if(e.getEmpid() == id)
			{
				found = true;
				e.setName("xyz");
				break;
			}
		}
		if(found)
		{
			System.out.println("updated list ");
			
			for(EmloyeeEntity e : hs)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("not found");
			
		}
		
		
	}
	
    void showArraylist(ArrayList<Integer>  x)
    { 
    	System.out.println("arraylist data");
    	for(int i : x)
    	{
    		System.out.println(i);
    	}
    	
    }
}
