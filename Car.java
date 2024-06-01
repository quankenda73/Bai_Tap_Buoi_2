
    public class Car {
        private int speed;
    
        // Constructor
        public Car() {
            this.speed = 0;
        }
    
        // Method to increase speed by 20
        public void upTo20() {
            this.speed += 20;
        }
    
        // Method to increase speed by 40
        public void upTo40() {
            this.speed += 40;
        }
    
        // Method to increase speed by 60
        public void upTo60() {
            this.speed += 60;
        }
    
        // Method to get the current speed
        public int Speed() {
            return this.speed;
        }
    
        // Main method to test the Car class
        public static void main(String[] args) {
            Car car = new Car();
            System.out.println("Tốc Độ xe lần thứ nhất là: " + car.Speed() + " km/h"); 
    
            car.upTo20();
            System.out.println("Tốc độ xe lần thứ hai là: " + car.Speed() + " km/h"); 
    
            car.upTo40();
            System.out.println("Tốc Độ xe lần thứ 3 là: " + car.Speed() + " km/h"); 
    
            car.upTo60();
            System.out.println("Tốc độ xe lần thứ 4 là: " + car.Speed() + " km/h"); 
        }
    }
    
    

