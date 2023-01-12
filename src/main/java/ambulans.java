/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author calva
 */
public class ambulans extends division {
    private String name;

    public ambulans() {
        super(null, null, 0, 0);
    }
    
    public ambulans(String name, String phoneNumber, String alamat, double latitude, double longitude) {
        super(phoneNumber, alamat, latitude, longitude);
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
