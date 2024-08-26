package extend_lesson.bvn8.entities;

public class StudentIT extends StudentTechmaster {
    private double html;
    private double css;
    private double java;

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }


    public StudentIT(String fullName, String major, double html, double css, double java) {
        super(fullName, major);
        this.html = html;
        this.css = css;
        this.java = java;
    }

    @Override
    public double getPoint() {
        return (java * 2 + html + css) / 4;
    }

    @Override
    public String toString() {
        return  "Name=" + getFullName()+
                ", Html=" + html +
                ", Css=" + css +
                ", Java=" + java +
                ", Point=" + getPoint() +
                ", Classify=" + classify() +
                '}';
    }
}