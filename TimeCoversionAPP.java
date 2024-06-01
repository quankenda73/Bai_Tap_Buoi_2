public class TimeCoversionAPP {
     public int convertHoursToMinutes(int hours) {
        return hours * 60;
    }


    public int convertDaysToMinutes(int days) {
        return days * 24 * 60;
    }

    public static void main(String[] args) {
        TimeCoversionAPP timeConversionApp = new TimeCoversionAPP();
        
        int convertHourToMinute = timeConversionApp.convertHoursToMinutes(2);
        System.out.println(convertHourToMinute); 
        
        int convertDayToMinute = timeConversionApp.convertDaysToMinutes(3);
        System.out.println(convertDayToMinute);  
    }
}
