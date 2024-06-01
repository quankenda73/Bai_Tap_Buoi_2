import java.util.Calendar;

public class Baitap1 {
    public int Namsinh;

    // Method to calculate the age
    public int PredictAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.Namsinh;
    }

    public static void main(String[] args) {
        Baitap1 bt1 = new Baitap1();
        bt1.Namsinh = 2004;
        int tuoi = bt1.PredictAge();
        System.out.println("SO TUOI HIEN TAI CỦA BAN LÀ: " + tuoi);
    }
}

