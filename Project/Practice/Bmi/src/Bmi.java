import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Bmi {
    private String name;
    private boolean gender;
    private int height;
    private int weight;
    private double bmi;

    public Bmi() {
    }

    public Bmi(String name, boolean gender, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        calc(this.isGender());
    }


    public void calc(boolean gender) {
        // BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) );
        //  String.format("%.2f", bmi);
//        DecimalFormat df = new DecimalFormat("#.00");
//        double bmi = 24.56789;
//        System.out.println(df.format(bmi));
//        DecimalFormat df = new DecimalFormat("#.00");
//        double bmi = weight / (Math.pow((double)height/100, 2));
//        this.bmi = df.format(bmi);
        double factor = 0.0;
        if (this.gender == true) factor = 0.9;
        else factor = 0.85;

        double bmi = weight / (Math.pow((double)height/100, 2));
        BigDecimal bd = new BigDecimal(bmi).setScale(2, RoundingMode.HALF_UP);
        this.bmi = bd.doubleValue();
//        int weight = this.getWeight();
//        int height = this.getHeight();
//        this.setBmi(weight / (Math.pow(height/100, 2)));
    }

    @Override
    public String toString() {
        String gender = " ";
        if (this.gender == true) gender = "남성";
        else gender = "여성";

        return  "name='" + name + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
