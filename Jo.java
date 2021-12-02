package multidimensionalArray;
 
import java.util.Scanner;
 
public class Student {
    static Scanner s = new Scanner(System.in);
 
    public static void main(String[] args) {
        Student student = new Student();
        int[][] array = student.print_semester();
        int[][] marks = student.print_get_marks(array);
        student.print_marks_array(marks);
 
    }
 
    public int[][] print_semester() {
        System.out.println("Enter the Total Semesters :");
        int Semester_Count = s.nextInt();
 
        int[][] a = new int[Semester_Count][0];
 
        for (int j = 0; j < a.length; j++) {
            System.out.println("Enter the subject count for the " + (j + 1) + " Semester :");
 
            for (int i = j; i <= j; i++) {
                a[j] = new int[s.nextInt()];
 
            }
        }
 
        return a;
 
    }
 
    // getting marks for array
    public int[][] print_get_marks(int[][] a) {
 
        for (int j = 0; j < a.length; j++) {
            System.out.println("Enter the marks in " + (j + 1) + " Semester :");
 
            for (int i = 0; i < a[j].length; i++) {
                a[j][i] = s.nextInt();
            }
            System.out.println();
        }
        return a;
 
    }
 
    // Printing the marks
    public void print_marks_array(int[][] a) {
        System.out.println("Two Dimensional array:");
        for (int j = 0; j < a.length; j++) {
 
            for (int i = 0; i < a[j].length; i++) {
                System.out.print("a[" + j + "][" + i + "] : " + a[j][i] + " ");
 
            }
            System.out.println();
            System.out.println();
        }
 
    }
 
}