/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DeamonWarehouse;

import java.sql.*;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author Damon
 */
@WebService(serviceName = "DeamonWarehouseservice", portName = "DeamonWarehousePort", endpointInterface = "com.qut.deamonwarehouse.DeamonWarehouse", targetNamespace = "http://www.qut.com/DeamonWarehouse", wsdlLocation = "META-INF/wsdl/n8857954DeamonWarehouse/DeamonWarehouse.xml.wsdl")
@Stateless
public class n8857954DeamonWarehouse {

    public int stock(java.lang.String temp) {
        int mystock = 0;
        try{
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(  "jdbc:mysql://fastws.qut.edu.au:3306/n8857954",   "n8857954", "apple");
        Statement stmt = con.createStatement();
        java.lang.String sql = "SELECT stock FROM Warehouse where part = '" + temp +"';";
        ResultSet rset = stmt.executeQuery(sql); 
        
        if (rset.next()){
            mystock = rset.getInt("stock");
        }
        rset.close();
        
        }catch(ClassNotFoundException e){
            e.toString();
        }catch(SQLException e){
            e.toString();
        }
        return mystock;
    }
    
}
