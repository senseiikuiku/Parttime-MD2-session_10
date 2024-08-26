package demo.colection.sort;

import java.util.*;

public class DemoComparator {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        Student s1 = new Student("John", "Smith", 23);
        Student s2 = new Student("Duc", "da", 18);
        Student s3 = new Student("John", "Smith", 22);
        student.add(s1);
        student.add(s2);
        student.add(s3);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. sắp xếp danh sách tăng dần");
            System.out.println("3. Sắp xếp danh sách giảm dần");
            System.out.println("\nNhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    for (Student s : student) {
                        System.out.println("=============");
                        System.out.println("MSV: " + s.getStudentCode());
                        System.out.println("Ten: " + s.getStudentName());
                        System.out.println("Tuoi: " + s.getAge());
                    }
                    break;
                case 2:
                    student.sort(new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getAge() - o2.getAge();
                        }
                    });
                    System.out.println("Sắp xếp sv sau khi duoc sắp xếp");
                    for (Student s : student) {
                        System.out.println("=============");
                        System.out.println("MSV: " + s.getStudentCode());
                        System.out.println("Ten: " + s.getStudentName());
                        System.out.println("Tuoi: " + s.getAge());
                    }
                    break;

                case 3:
                    student.sort(new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getStudentName().compareTo(o2.getStudentName());
                        }
                    });
            }
        } while (true);
    }
}
