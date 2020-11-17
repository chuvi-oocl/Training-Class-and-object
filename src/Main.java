import student.Student;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        student.setName("Chan Tai Man");
        System.out.println(student.getName());
        student.setAge(11);
        System.out.println(student.getAge());
        student.setGender("Male");
        System.out.println(student.getGender());
        student.setStudentIdNo(1234);
        System.out.println(student.getStudentIdNo());
    }
}
