package bai3.quanlitrandauxephang.entities;
import java.util.ArrayList;
import java.util.List;
public class SummonRift {
    private String SKT;
    private String G2;

    private List<Figure>figures;
    public SummonRift(String SKT, String g2) {
        this.SKT = SKT;
        this.G2 = g2;
    }

    public SummonRift(String time) {
    }

    public String getSKT() {
        return SKT;
    }

    public void setSKT(String SKT) {
        this.SKT = SKT;
    }

    public String getG2() {
        return G2;
    }

    public void setG2(String g2) {
        G2 = g2;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "SKT='" + SKT + '\'' +
                ", G2='" + G2 + '\'' +
                '}';
    }
}

