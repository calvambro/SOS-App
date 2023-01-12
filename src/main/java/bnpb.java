

public class bnpb extends division {
    String unit;
    
    bnpb(String unit, String phoneNumber, String alamat, double latitude, double longitude) {
        super(phoneNumber, alamat, latitude, longitude);
        this.unit = unit;
    }
}
