package student;

public class Student {
    private String name;
    private int age;
    private String gender ;
    private int studentIdNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentIdNo(int StudentIdNo) {
        this.studentIdNo = StudentIdNo;
    }
}
