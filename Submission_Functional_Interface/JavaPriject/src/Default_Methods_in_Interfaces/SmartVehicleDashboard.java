package Default_Methods_in_Interfaces;

// File: SmartVehicleDashboard.java
interface Dashboard {
    void displaySpeed();
    default void displayBattery() { System.out.println("Battery Level: 85%"); }
}

class ElectricVehicle implements Dashboard {
    public void displaySpeed() { System.out.println("Speed: 70 km/h"); }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        ev.displaySpeed();
        ev.displayBattery();
    }
}
