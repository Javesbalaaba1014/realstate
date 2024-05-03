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
public class housingdata {

    static void add(housingdata hd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Integer propertyID;
    private String propertyType;
    private String Address;
    private String City;
    private String Province;
    private int nobedroom;
    private int nobathroom;
    private int propertysqft;
    private int propertyPrice;
    private String Description;
    private String LastUpdateAdmin;
    private String ownerID;

    
    public housingdata(){}
    
    public housingdata(Integer propertyID, String propertyType, String Address, String City, String Province, int nobedroom, int nobathroom, int propertysqft, int propertyPrice, String Description, String LastUpdateAdmin, String ownerID) {
        this.propertyID = propertyID;
        this.propertyType = propertyType;
        this.Address = Address;
        this.City = City;
        this.Province = Province;
        this.nobedroom = nobedroom;
        this.nobathroom = nobathroom;
        this.propertysqft = propertysqft;
        this.propertyPrice = propertyPrice;
        this.Description = Description;
        this.LastUpdateAdmin = LastUpdateAdmin;
        this.ownerID = ownerID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public int getNobedroom() {
        return nobedroom;
    }

    public void setNobedroom(int nobedroom) {
        this.nobedroom = nobedroom;
    }

    public int getNobathroom() {
        return nobathroom;
    }

    public void setNobathroom(int nobathroom) {
        this.nobathroom = nobathroom;
    }

    public int getPropertysqft() {
        return propertysqft;
    }

    public void setPropertysqft(int propertysqft) {
        this.propertysqft = propertysqft;
    }

    public int getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(int propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getLastUpdateAdmin() {
        return LastUpdateAdmin;
    }

    public void setLastUpdateAdmin(String LastUpdateAdmin) {
        this.LastUpdateAdmin = LastUpdateAdmin;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }
    
    
    
    
}
