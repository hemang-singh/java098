package Unit1;

public class CollegeStudent extends Student1 {
    public CollegeStudent(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class() {
        System.out.println(name+  " Attended");
    }

    public void give_exam() {
        System.out.println(roll_no+ " Give exam online");
    }
}