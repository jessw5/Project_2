/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author flynn
 */
public class DBManager {
    
    
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby:VirtualPetGame_Ebd; create=true";
    //private static final String URL = "jdbc:derby://localhost:1527/VirtualPetGame;create=true";    
    
    Connection conn;
    
    public DBManager(){
        establishConnection();
    }

    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        System.out.println(dbManager.getConnection());
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
    private void establishConnection() {
        if(this.conn == null) {
            try{
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + " is Connected!");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
//    public ResultSet queryDB(String sql) {
//        
//        Connection connection = this.conn;
//        Statement statement = null;
//        ResultSet resultSet = null;
//        
//        try {
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return resultSet;
//    }
//    
//    public void printTable(){
//        Connection con = this.conn;
//        PreparedStatement p = null;
//        ResultSet rs = null;
//        try{
//            String sql = "select * from SCORES";
//            p = (PreparedStatement) con.prepareStatement(sql);
//            rs = (ResultSet) p;
//            while (rs.next()) {
// 
//                String name = rs.getString("PLAYER");
//                int id = rs.getInt("SCORE");
//                //String email = rs.getString("email");
//                System.out.println(name + "\t\t" + id + "\t\t");
//            }
//        }catch (SQLException e) {
// 
//            // Print exception pop-up on screen
//            System.out.println(e);
//        }
//    }
//    
//    public void updateDB(String sql) {
//        
//        Connection connection = this.conn;
//        Statement statement = null;
//        ResultSet resultSet = null;
//        
//        try {
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//            //System.out.println("hi");
//            System.out.println(resultSet.getCharacterStream("PLAYER"));
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
}
