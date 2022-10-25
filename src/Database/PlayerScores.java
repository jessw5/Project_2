/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;

/**
 *
 * @author flynn
 */
public class PlayerScores {
    
    DBManager dbManager;
    Connection conn;
    Statement statement;
    public static int highestScore;
    
    public PlayerScores() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }
    
    public void createScoreTable(String name, int score){
        try{
            this.statement = conn.createStatement();
            if(this.checkExistedTable("SCORES") == false){
                this.statement.addBatch("CREATE TABLE SCORES (PLAYER VARCHAR(20), SCORE INT)");
        
            }
            this.statement.addBatch("INSERT INTO SCORES VALUES (" + "'" + name + "'," + score + ")");
            this.statement.executeBatch();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void closeConnection() {
        this.dbManager.closeConnection();
    }
   
    public boolean checkExistedTable(String name){
        try{
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);
            
            while(rs.next()){
                String table_name = rs.getString("TABLE_NAME");
                if(table_name.equalsIgnoreCase(name)){
                    System.out.println("Table exists");
                    return true;
                }
            }
            rs.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("new Table created");
        return false;
    }
    
    public ResultSet getPlayersAndScores() {
        ResultSet rs = null;
        try{
            rs = this.statement.executeQuery("SELECT * "
                    + "FROM SCORES ");
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    
    public String[] printResults(ResultSet rs) {
        int i = 0;
        highestScore = 0; 
        String[] playersResultText = new String[10];
        try {   
            try (rs) {
                while(rs.next()){
                    playersResultText[i] = rs.getString("PLAYER") + " " + rs.getInt("SCORE");
                    if(i == 9){
                        i = 0;
                    }
                    if(highestScore < rs.getInt("SCORE")){
                        highestScore = rs.getInt("SCORE");
                    }
                    i++;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
        return playersResultText;
    }
}



