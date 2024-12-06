import java.util.ArrayList;

public class Empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpService s =new EmpService();
		s.addEmp();
		s.show();
		s.searchEmp();
        s.removeEmp();
        s.updateEmp();
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(11);
        a1.add(12);
        a1.add(13);
        s.showArraylist(a1);
        
	}
	

}
