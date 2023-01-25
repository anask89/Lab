package Model;

/**
 *
 * @author PARAN
 */
import java.util.*;
import java.sql.*;
import com.*;
import java.io.*;

public class Block extends Connect {

    /////Function for connect to the MySQL Server Database////////////
    public Block() {
        Connect.connect_mysql();
    }

    //////////Save User Details /////

    public String saveBlock(HashMap<?, ?> blockData) {
        
  
        int record = 0;
        
        String error = "";

        try {
            Statement st = connection.createStatement();
            String SQL = "INSERT INTO block values (1,1,Block A,Block A Room # 1);";
            st.executeUpdate(SQL);
     
        } catch (Exception e) {
        
            System.out.println(" Error : " + e.toString());
        }
        return error;
    }
}
	//////////////////Function for getting Users Details//////////	

   