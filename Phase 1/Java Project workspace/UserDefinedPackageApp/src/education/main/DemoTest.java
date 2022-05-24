package education.main;
import education.school.*;
//import education.college.*;
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance att1 = new Attendance();		// school 
		att1.display();
		education.college.Attendance att2 = new education.college.Attendance();	// college 
		att2.display();
	}

}
