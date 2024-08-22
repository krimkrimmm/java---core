package extend_lesson.bvn6;

public class HH {
    private String hcn;
    private String dthcn;
    private String cvhcn;

    public HH(String hcn, String dthcn, String cvhcn) {
        this.hcn = hcn;
        this.dthcn = dthcn;
        this.cvhcn = cvhcn;
    }

    public String getHcn() {
        return hcn;
    }

    public void setHcn(String hcn) {
        this.hcn = hcn;
    }

    public String getDthcn() {
        return dthcn;
    }

    public void setDthcn(String dthcn) {
        this.dthcn = dthcn;
    }

    public String getCvhcn() {
        return cvhcn;
    }

    public void setCvhcn(String cvhcn) {
        this.cvhcn = cvhcn;
    }

    @Override
    public String toString() {
        return "HH{" +
                "hcn='" + hcn + '\'' +
                ", dthcn='" + dthcn + '\'' +
                ", cvhcn='" + cvhcn + '\'' +
                '}';
    }
}


