import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class Student {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");

                Statement stml = conn.createStatement();
        ){

            System.out.println("-MENU-");
            System.out.println("1. Add student records\n" +
                    "2. Display student records\n" +
                    "3. Save\n" +
                    "4. Exit");
            //Insert

            String SQLInsert = "Insert into Student values(01,'Mai Duy Quan','Viet Nam',012345678)";
            int Rowcount = stml.executeUpdate(SQLInsert);
            System.out.println("them vao thanh cong " + Rowcount + " ban ghi\n");


//            String SQLDelete = "Delete from student where StudentID=1";
//             Rowcount = stml.executeUpdate(SQLDelete);
//            System.out.println("xoa thanh cong " + Rowcount + " ban ghi\n");


            String srtSelect = " select * from student";
            System.out.println("the list Student are:\n");
            ResultSet rset = stml.executeQuery(srtSelect);
            while (rset.next()) {
                int StudentId = rset.getInt("StudentID");
                String StudentName = rset.getString("StudentName");
                String Address = rset.getString("Address");
                int phone = rset.getInt("phone");

                System.out.println(StudentId + "   " + StudentName + "   " + Address + "   " + phone +"\n");
            }


        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
}
