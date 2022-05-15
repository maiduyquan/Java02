import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class music {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "");

                Statement stml = conn.createStatement();
        ) {
            //select
            String srtSelect = " select * from music where author like '%Sia%'";
            System.out.println("the song of Sia are:\n");
            ResultSet rset = stml.executeQuery(srtSelect);
            while (rset.next()) {
                String name = rset.getString("name");
                int year = rset.getInt("year");
                System.out.println(name + "," + year +"\n");
            }
            //Insert
            String SQLInsert = "Insert into music values(5,'Faded','Alan Walker',2015)";
            int Rowcount = stml.executeUpdate(SQLInsert);
            System.out.println("them vao thanh cong " + Rowcount + " ban ghi\n");

            //Delete
            String SQLDelete = "Delete from music where name='Faded'";
            Rowcount = stml.executeUpdate(SQLDelete);
            System.out.println("xoa thanh cong " + Rowcount + " ban ghi\n");

            //update
            String SQLUpdate = "Update music set id='12' where name='Who Am I'";
            Rowcount = stml.executeUpdate(SQLUpdate);
            System.out.println("cap nhap thanh cong " + Rowcount + " ban ghi\n");

            //Search
            System.out.println("cac bai hat co chua ki tu 'w':");
            srtSelect = "Select * from music where name like '%W%'";
            rset = stml.executeQuery(srtSelect);
            while (rset.next()) {
                String name = rset.getString("name");
                String author = rset.getString("author");
                int year = rset.getInt("year");
                System.out.println(name + "," + author + "," + year +"\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
