/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realstatepanel;

/**
 *
 * @author My Computer
 */
public class admindata {
    private Integer idAgent;
    private String Agent_Fname;
    private String Agent_Lname;
    private String Agent_Phone;
    private int Agent_Rev;
    private int Agent_Sold;
    private int Agent_Rent;
    private byte[] Agent_Pic;
    private int is_archive;
    private String username;
    private String password;
    
    public admindata(){}

    public admindata(Integer idAgent, String Agent_Fname, String Agent_Lname, String Agent_Phone, int Agent_Rev, int Agent_Sold, int Agent_Rent, byte[] Agent_Pic, int is_archive, String username, String password) {
        this.idAgent = idAgent;
        this.Agent_Fname = Agent_Fname;
        this.Agent_Lname = Agent_Lname;
        this.Agent_Phone = Agent_Phone;
        this.Agent_Rev = Agent_Rev;
        this.Agent_Sold = Agent_Sold;
        this.Agent_Rent = Agent_Rent;
        this.Agent_Pic = Agent_Pic;
        this.is_archive = is_archive;
        this.username = username;
        this.password = S;
    }

    public Integer getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(Integer idAgent) {
        this.idAgent = idAgent;
    }

    public String getAgent_Fname() {
        return Agent_Fname;
    }

    public void setAgent_Fname(String Agent_Fname) {
        this.Agent_Fname = Agent_Fname;
    }

    public String getAgent_Lname() {
        return Agent_Lname;
    }

    public void setAgent_Lname(String Agent_Lname) {
        this.Agent_Lname = Agent_Lname;
    }

    public String getAgent_Phone() {
        return Agent_Phone;
    }

    public void setAgent_Phone(String Agent_Phone) {
        this.Agent_Phone = Agent_Phone;
    }

    public int getAgent_Rev() {
        return Agent_Rev;
    }

    public void setAgent_Rev(int Agent_Rev) {
        this.Agent_Rev = Agent_Rev;
    }

    public int getAgent_Sold() {
        return Agent_Sold;
    }

    public void setAgent_Sold(int Agent_Sold) {
        this.Agent_Sold = Agent_Sold;
    }

    public int getAgent_Rent() {
        return Agent_Rent;
    }

    public void setAgent_Rent(int Agent_Rent) {
        this.Agent_Rent = Agent_Rent;
    }

    public byte[] getAgent_Pic() {
        return Agent_Pic;
    }

    public void setAgent_Pic(byte[] Agent_Pic) {
        this.Agent_Pic = Agent_Pic;
    }

    public int getIs_archive() {
        return is_archive;
    }

    public void setIs_archive(int is_archive) {
        this.is_archive = is_archive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

   
}