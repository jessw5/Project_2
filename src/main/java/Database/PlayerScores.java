/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author flynn
 */
public class PlayerScores {
    
    DBManager dbManager;
    Connection conn;
    Statement statement;
    
    public PlayerScores() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        PlayerScores scores = new PlayerScores();
        
        try {
            scores.statement.addBatch("CREATE TABLE SCORES (PLAYER VARCHAR(20), SCORE INT)");
            scores.statement.addBatch("INSERT INTO SCORES VALUES (Ethan, 77)");
            scores.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        scores.closeConnection();
    }
    
    public void closeConnection() {
        this.dbManager.closeConnection();
    }
    
}
