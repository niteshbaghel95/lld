package modules;

public class Center {
    int centerId;
    String centerName;
    
    public Center(int centerId, String centerName) {
        this.centerId = centerId;
        this.centerName = centerName;
    }

    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    
}
