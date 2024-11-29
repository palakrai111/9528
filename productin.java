
public class productin 
{
	int pid;
	String pname;
	String category;
	@Override
	public String toString() {
		return "productin [pid=" + pid + ", pname=" + pname + ", category=" + category + "]";
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	/*public productin(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}*/
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	

}
