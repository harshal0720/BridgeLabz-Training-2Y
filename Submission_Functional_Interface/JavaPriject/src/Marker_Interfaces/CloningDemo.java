package Marker_Interfaces;

// File: CloningDemo.java
class Prototype implements Cloneable {
    int id = 10;
    String name = "Model";

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningDemo {
    public static void main(String[] args) {
        try {
            Prototype p1 = new Prototype();
            Prototype p2 = (Prototype) p1.clone();
            System.out.println("Clone created: " + p2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
