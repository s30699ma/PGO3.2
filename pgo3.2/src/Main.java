import java.util.Scanner;


public class Student {
        public String fname;
        public String lname;
        public int inumber;
        public String email;
        public String address;
        public int grades;
        public Student(String fname, String lname, int inumber, String email, String address, int grades) {
            this.fname = fname;
            this.lname = lname;
            this.inumber = inumber;
            this.email = email;
            this.address = address;
            this.grades = grades;
        }
    }
    public class StudentGroup {
        public int groupId;

        public StudentGroup(int groupId) {
            this.groupId = groupId;

        }
    }


