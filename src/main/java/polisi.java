

public class polisi extends division {
    String policeStation;
    
    polisi(String policeStation, String phoneNumber, String alamat, double latitude, double longitude) {
        super(phoneNumber, alamat, latitude, longitude);
        this.policeStation = policeStation;
    }
}
