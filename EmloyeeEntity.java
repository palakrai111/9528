
public class EmloyeeEntity {

	int empid;
	String name;
	@Override
	public String toString() {
		return "EmloyeeEntity [empid=" + empid + ", name=" + name + "]";
	}
	public EmloyeeEntity(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
