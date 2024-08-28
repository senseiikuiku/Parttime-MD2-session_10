package exception;

public class ExceptionThrowsDemo2 {
    private String name;
    private int age;

    public ExceptionThrowsDemo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() throws Exception {
        System.out.println("Name: " + name);
        System.out.println("Age: " + checkAge(this.age));
    }

    public int checkAge(int age) throws Exception{
        if(age<17 || age>90){
            throw new Exception("Loi roi");
        }
        return age;
    }
}
