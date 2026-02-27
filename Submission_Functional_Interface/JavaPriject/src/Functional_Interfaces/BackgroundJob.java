package Functional_Interfaces;

// File: BackgroundJob.java
public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Job started...");
            try { Thread.sleep(1000); } catch (Exception e) {}
            System.out.println("Job completed successfully!");
        };
        new Thread(job).start();
    }
}
