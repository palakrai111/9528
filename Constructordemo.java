
public class Constructordemo {
	
	int id ;
	String name;
	String clg;
	 Constructordemo(int id,String name)
	 {
		 this.id =id;
		this.name = name;
		 //System.out.println("constructor is invoked");
	 }
	 Constructordemo(int id,String name,String clg)
	 {
		 //this.id =id;
		 //this.name = name;
		 this(id,name);
		 this.clg = clg;
		// System.out.println("constructor is invoked");
	 }
	 
     void display()
     {
    	 System.out.println(id + " "+name + " "+clg);
     }
     
     public String toString()
     {
    	 return id + "!!"+name+"!!"+clg;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructordemo ob1 = new Constructordemo(101,"palak");
		System.out.println(ob1);
		ob1.display();
		Constructordemo ob2 = new Constructordemo(102,"nayan","xyz");
		ob2.display();
		System.out.println(ob2
				);

	}

}
