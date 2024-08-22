package extend_lesson.bvn6;

public class HV {
    private String hv;
    private String dthv;
    private String cvhv;

    public String getHv() {
        return hv;
    }

    public void setHv(String hv) {
        this.hv = hv;
    }

    public String getDthv() {
        return dthv;
    }

    public void setDthv(String dthv) {
        this.dthv = dthv;
    }

    public String getCvhv() {
        return cvhv;
    }

    public void setCvhv(String cvhv) {
        this.cvhv = cvhv;
    }

    public HV(String hv, String dthv, String cvhv) {
        this.hv = hv;
        this.dthv = dthv;
        this.cvhv = cvhv;
    }

    @Override
    public String toString() {
        return "HV{" +
                "hv='" + hv + '\'' +
                ", dthv='" + dthv + '\'' +
                ", cvhv='" + cvhv + '\'' +
                '}';
    }
}
