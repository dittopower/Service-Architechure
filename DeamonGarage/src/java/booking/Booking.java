/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booking;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.sql.*;

/**
 * REST Web Service
 *
 * @author Damon
 */
@Path("booking")
public class Booking {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Booking
     */
    public Booking() {
    }

    /**
     * Retrieves representation of an instance of booking.Booking
     * @param day a date yyyy-mm-dd, 2014-10-19
     * @return an instance of java.lang.String
     */
    @GET
    @Path("check/{day}")
    @Produces("application/xml")
    public String check(@PathParam("day") String day) {
        String ret = "0";
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://fastws.qut.edu.au:3306/n8857954", "n8857954", "apple");
            Statement stmt = con.createStatement();
            String sql = "SELECT true as taken  FROM Garage where appointment = Date('"+day+"')";
            ResultSet rset = stmt.executeQuery(sql); 
            if (rset.next()){
                if(!rset.getBoolean(0)){
                    ret = "1";
                }
            }else{
                ret ="1";
            }
            rset.close();
            
        }catch(ClassNotFoundException e){
            e.toString();
        }catch(SQLException e){
            e.toString();
        }
        return "<?xml version=\"1.0\"?><response>" +ret +"</response>";
    }

    /**
     * GET method for updating or creating an instance of Booking
     * @param day a date yyyy-mm-dd, 2014-10-19
     * @param id The customers id for the booking e.g. 3
     * @return A String Reply from the garage.
     */
    @GET
    @Path("make/{day}/{id}")
    @Consumes("application/xml")
    public String make(@PathParam("day")
            String day, @PathParam("id") String id) {
        String ret;
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://fastws.qut.edu.au:3306/n8857954", "n8857954", "apple");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO Garage (appointment, Customer) VALUES ('"+day+"', '"+id+"')";
            stmt.executeUpdate(sql);
            ret = "Hi, Sales has just confirmed Your booking with us, you have been booked in the Servicing Our Autos' Garage on the "+day+". We Look forward to seeing you then!";
        }catch(ClassNotFoundException e){
            ret = e.toString();
        }catch(SQLException e){
            ret = e.toString();
        }
        return "<?xml version=\"1.0\"?><response>" +ret +"</response>";
    }
}
