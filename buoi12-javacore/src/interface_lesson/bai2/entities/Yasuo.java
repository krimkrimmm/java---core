package interface_lesson.bai2.entities;

public class Yasuo {
    private String feature;
    private String weapon;


    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Yasuo(String feature, String weapon) {
        this.feature = feature;
        this.weapon = weapon;


    }

    @Override
    public String toString() {
        return "Yasuo{" +
                "feature='" + feature + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}

