package Default_Methods_in_Interfaces;

// File: DataExportDemo.java
interface Exporter {
    void export();
    default void exportToJSON() { System.out.println("Exporting data to JSON..."); }
}

class CSVExporter implements Exporter {
    public void export() { System.out.println("Exporting CSV data..."); }
}

class PDFExporter implements Exporter {
    public void export() { System.out.println("Exporting PDF data..."); }
}

public class DataExportDemo {
    public static void main(String[] args) {
        Exporter csv = new CSVExporter();
        csv.export();
        csv.exportToJSON();
    }
}
