/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
*/
        
 import java.util.*;

class Student extends Solution {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                int a = (o1.getCgpa() < o2.getCgpa() ? 1 :
                        (o1.getCgpa() == o2.getCgpa() ? o1.getFname().compareTo(o2.getFname()) == 0 ? o1.getId() - o2.getId() : o1.getFname().compareTo(o2.getFname()) : -1));
                return a;
            }
        });

//        Collections.sort(studentList, new Comparator<Student>() {
//            public int compare(Student o1, Student o2) {
//                return (o1.getCgpa() < o2.getCgpa() ? 1 :
//                        (o1.getCgpa() == o2.getCgpa() ? 0 : -1));
//            }
//        });
//
//        Collections.sort(studentList, new Comparator<Student>() {
//            public int compare(Student o1, Student o2) {
//                return o1.getFname().compareTo(o2.getFname());
//            }
//        });
//
//        Collections.sort(studentList, new Comparator<Student>() {
//            public int compare(Student o1, Student o2) {
//                return (o1.getId() - o2.getId());
//            }
//        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}       
