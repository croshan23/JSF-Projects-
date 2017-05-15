import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {

	List<Students> students;
	
	public StudentDataUtil(){
		loadStudentData();
	}
	
	void loadStudentData(){
		students = new ArrayList<>();
		students.add(new Students("Roshan","Chaudhary","roshan@gamil.com"));
		students.add(new Students("Sarbesh","Chaudhary","sarbes@gamil.com"));
	}

	public List<Students> getStudents() {
		return students;
	}
}
