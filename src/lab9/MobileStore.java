package lab9;

import java.sql.*;
import java.util.ArrayList;

public class MobileStore {
    public static void main(String[] args) {

        //step 1
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load driver successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //step 2
        ArrayList<Mobile> myMB = new ArrayList<Mobile>();
        String SQCONN = "jdbc:sqlite:Mobile.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null) {
                System.out.println("Could not connect to database.");
            } else {
                System.out.println("Connected to database.                                       ");
            }
            //step 3
            Statement stmt = conn.createStatement();
            String sql = "select * from Mobilestore";
            ResultSet rs = stmt.executeQuery(sql);

            //step 4
            System.out.println("Mobilestore Information");
            while (rs.next()) {
                Mobile mb = new Mobile(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5));
                myMB.add(mb);
            }


            //step 5
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Display data  as object
        for (Mobile e:myMB) {
            System.out.println(e.toString());

        }

    }
}