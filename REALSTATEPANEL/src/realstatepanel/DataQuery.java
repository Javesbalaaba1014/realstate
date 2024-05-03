/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realstatepanel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author My Computer
 */
public class DataQuery {

    /**
     *
     * @param cont
     */
    public void insertAdminAcc(admindata cont){
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `adminacc`( `username`, `pass`, `fname`, `lname`, `mInitial`, `phone`, `AdminID` , `is_archived` ) VALUES (?, ?, ? ,? ,? ,? ,? , 0 )");
            ps.setString(1, cont.getUsername());
            ps.setString(2, cont.getPass());
            ps.setString(3, cont.getFname());
            ps.setString(4, cont.getLname());
            ps.setString(5, cont.getMinitial());
            ps.setString(6, cont.getPhone());
            ps.setString(7, String.valueOf(cont.getAid()));
        
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "New Admin Account Added!");
                }
                else{
                JOptionPane.showMessageDialog(null, "Something Wrong");
                }
        } catch (SQLException ex) {
            Logger.getLogger(DataQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateAdminAccount(admindata cont){
    
            Connection con = MyConnection.getConnection();
                PreparedStatement ps;
                String updateQuery = "";
                
            updateQuery = "UPDATE `adminacc` SET `username`=?, `pass`=?, `fname`=?, `lname`=?, `mInitial`=?, `phone`=? WHERE `id`=?";

            
            try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, cont.getUsername());
            ps.setString(2, cont.getPass());
            ps.setString(3, cont.getFname());
            ps.setString(4, cont.getLname());
            ps.setString(5, cont.getMinitial());
            ps.setString(6, cont.getPhone());
            ps.setInt(7, cont.getId());
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, " Admin Data Edited!");
                }
                else{
                JOptionPane.showMessageDialog(null, "Something Wrong");
                }
        } catch (SQLException ex) {
            Logger.getLogger(DataQuery.class.getName()).log(Level.SEVERE, null, ex);}   
    
    }
    
    
    public void deleteAdminAccount(Integer cid){
        
          Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    
    try {
        ps = con.prepareStatement("UPDATE `adminacc` SET `is_archived` = 1 WHERE `id` = ?");
        ps.setInt(1,cid);
        System.out.println(ps);
        if(ps.executeUpdate() != 0){
            JOptionPane.showMessageDialog(null, "Contact Archived");
            }
            else{
            JOptionPane.showMessageDialog(null, "Something Wrong");
            }
    } catch (SQLException ex) {
        Logger.getLogger(DataQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public ArrayList<admindata> AdminAccountList (int adminID){
        ArrayList<admindata> adlist = new ArrayList<admindata>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `username`, `pass`, `fname`, `lname`, `mInitial`, `phone` FROM `adminacc` WHERE `is_archived` = 0 AND `AdminID` = " + adminID);

            admindata ad;
            while(rs.next()){
                ad = new admindata(rs.getInt("id"),
                                rs.getString("username"), 
                                rs.getString("pass") ,
                                rs.getString("fname"), 
                                rs.getString("lname"), 
                                rs.getString("mInitial"), 
                                rs.getString("phone"),
                                adminID
                                );
                System.out.print(ad);
                adlist.add(ad);
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(DataQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return adlist;
    }
    
    
    public ArrayList<housingdata> HousingList (){
        ArrayList<housingdata> hdlist = new ArrayList<housingdata>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `propertyID`, `propertyType`, `Address`, `City`, `Province`, `nobedroom`, `nobathroom`, `propertysqft`, `propertyPrice`, `Description`, `LastUpdateAdmin`, `ownerID` FROM `housing`" );

            housingdata hd;
            while(rs.next()){
                hd = new housingdata(rs.getInt("propertyID"),
                                rs.getString("propertyType"), 
                                rs.getString("Address") ,
                                rs.getString("City"), 
                                rs.getString("Province"), 
                                rs.getInt("nobedroom"),
                                rs.getInt("nobathroom"),
                                rs.getInt("propertysqft"),
                                rs.getInt("propertyPrice"),
                                rs.getString("Description"), 
                                rs.getString("LastUpdateAdmin"),
                                rs.getString("ownerID")
                                );
                System.out.print(hd);
                hdlist.add(hd);
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(DataQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return hdlist;
    }
    public ArrayList<housingdata> SearchHousingList (String ID){
        ArrayList<housingdata> hdlist = new ArrayList<housingdata>();
        
        Statement st;
        
        try {
            ResultSet rs;
            PreparedStatement ps;
            Connection con = MyConnection.getConnection();
            String query = "SELECT * FROM housing WHERE propertyID = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, ID);
            rs = ps.executeQuery();

            housingdata hd;
            if (rs.next()){
                hd = new housingdata(rs.getInt("propertyID"),
                                rs.getString("propertyType"), 
                                rs.getString("Address") ,
                                rs.getString("City"), 
                                rs.getString("Province"), 
                                rs.getInt("nobedroom"),
                                rs.getInt("nobathroom"),
                                rs.getInt("propertysqft"),
                                rs.getInt("propertyPrice"),
                                rs.getString("Description"), 
                                rs.getString("LastUpdateAdmin"),
                                rs.getString("ownerID")
                                );
                System.out.print(hd);
                hdlist.add(hd);
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(DataQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return hdlist;
    }
  public void inserthousing(housingdata cont){
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `housing`(`propertyID`, `propertyType`, `Address`, `City`, `Province`, `nobedroom`, `nobathroom`, `propertysqft`, `propertyPrice`, `Description`, `LastUpdateAdmin`, `ownerID`, `is_archived`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,0)");
            ps.setString(1, String.valueOf(cont.getPropertyID()));
            ps.setString(2, cont.getPropertyType());
            ps.setString(3, cont.getAddress());
            ps.setString(4, cont.getCity());
            ps.setString(5, cont.getProvince());
            ps.setString(6, String.valueOf(cont.getNobedroom()));
            ps.setString(7, String.valueOf(cont.getNobathroom()));
            ps.setString(8, String.valueOf(cont.getPropertysqft()));
            ps.setString(9, String.valueOf(cont.getPropertyPrice()));
            ps.setString(10, cont.getDescription());
            ps.setString(11, cont.getLastUpdateAdmin());
            ps.setString(12, cont.getOwnerID());

        
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "New Admin Account Added!");
                }
                else{
                JOptionPane.showMessageDialog(null, "Something Wrong");
                }
        } catch (SQLException ex) {
            Logger.getLogger(DataQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
