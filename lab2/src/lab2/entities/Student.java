package lab2.entities;

public class Student{
    private int id;
    private String name;
    private double scoreMath;

    private double scorePhysic;
    private double scoreChemistry;

    public Student(int id, String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id = id;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScoreMath() {
        return scoreMath;
    }
    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }
    public double getScorePhysic() {
        return scorePhysic;
    }
    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }
    public double getScoreChemistry() {
        return scoreChemistry;
    }
    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }
    public double getAvgScore() {
        return (scoreMath + scorePhysic + scoreChemistry) / 3;
    }

    public String getGrade() {
        double avgScore = getAvgScore();
        if (avgScore >= 8) {
            return "A";
        } else if (avgScore >= 6.5) {
            return "B";
        } else {
            return "C";
        }
    }

    @Override
    public String toString() {
        return name + " - Avg Score: " + getAvgScore() + " - Grade: " + getGrade();

    }

}