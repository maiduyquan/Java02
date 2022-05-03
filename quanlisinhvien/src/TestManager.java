import javax.swing.*;
import java.util.Scanner;
import java.util.SortedMap;

public class TestManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student1= new Student("01","Nguyễn Văn A","Nam Định","nguyenvana34@gmail.com","10/12/2003",1);
        Student student2= new Student("02","Mai Văn B","Hưng Yên","maivanb13@gmail.com","23/04/2003",1);
        Student student3= new Student("03","Trần Thị C","Sơn La","tranthic26@gmail.com","30/2/2004",1);
        Student student4= new Student("04","Nguyễn Thị D","Hà Nội","nguyenthid24@gmail.com","11/01/2003",1);

        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);

        int selection;
        do{
            System.out.println("moi nhap lua chon:");
            System.out.println("1.them hoc sinh");
            System.out.println("2.Xoa hoc sinh");
            System.out.println("3.Sua hoc sinh");
            System.out.println("4.Sap xep hoc sinh theo ten A->Z");
            System.out.println("5.Tim Kiem hoc sinh");
            System.out.println("6.In danh sach sinh vien");
            System.out.println("7.Thoat");
            selection = in.nextInt();
            switch (selection){
                case 1: studentManager.addStudent();
                break;
                case 2: studentManager.removeStudent();
                    break;
                case 3: studentManager.setStudent();
                    break;
                case 4: studentManager.sortStudent();
                    break;
                case 5: studentManager.searchStudent();
                    break;
                case 6: studentManager.getStudentList();
                    break;
            }
        }while (selection<7);



    }
}
