/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author calva
 */
public class damkar extends division {
    String station;
    
    damkar(String station, String phoneNumber, String alamat, double latitude, double longitude) {
        super(phoneNumber, alamat, latitude, longitude);
        this.station = station;
    }
}
