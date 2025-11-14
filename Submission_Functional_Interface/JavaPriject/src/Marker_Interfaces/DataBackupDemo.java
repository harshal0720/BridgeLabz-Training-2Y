package Marker_Interfaces;

// File: DataBackupDemo.java
import java.io.*;

class BackupData implements Serializable {
    String name = "Harshal";
    int id = 1;
}

public class DataBackupDemo {
    public static void main(String[] args) {
        try {
            BackupData data = new BackupData();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.ser"));
            oos.writeObject(data);
            oos.close();
            System.out.println("Data backed up successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
