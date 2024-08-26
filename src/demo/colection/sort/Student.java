package demo.colection.sort;


public class Student implements Comparable<Student> {
    private String studentCode;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(String studentCode, String studentName, int age) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}