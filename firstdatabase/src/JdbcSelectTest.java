import java.sql.*;
import java.sql.DriverManager;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");

                Statement stml = conn.createStatement();
                ){
            String strSelect = "select title,price,qty from books";
            System.out.println("the SQL statement is: " + strSelect + "\n");

            ResultSet rset = stml.executeQuery(strSelect);

            System.out.println("The records select are:");
            int rowCount = 0;
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int      qty = rset.getInt("qty");
                System.out.println(title + "," + price + "," + qty);
                ++rowCount;
            }
            System.out.println("total number of records= " + rowCount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
