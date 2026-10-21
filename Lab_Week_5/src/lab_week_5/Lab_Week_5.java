package lab_week_5;

public class Lab_Week_5 {

    public static void main(String[] args) {
        
       
        Package standardPackage = new Package(
                "Ahmet Yilmaz", "Bagdat Cad. No:1", "Istanbul", "Marmara", "34000",
                "Mehmet Demir", "Ataturk Bulv. No:5", "Ankara", "Ic Anadolu", "06000",
                10.0, 2.5
        );

        TwoDayPackage twoDayPackage = new TwoDayPackage(
                "Ayse Kaya", "Kordon Boyu No:12", "Izmir", "Ege", "35000",
                "Fatma Celik", "Lara Cad. No:8", "Antalya", "Akdeniz", "07000",
                10.0, 2.5, 15.0
        );

        OvernightPackage overnightPackage = new OvernightPackage(
                "Can Ozkan", "Gazi Cad. No:20", "Bursa", "Marmara", "16000",
                "Ali Yurt", "Istasyon Cad. No:4", "Eskisehir", "Ic Anadolu", "26000",
                10.0, 2.5, 1.25
        );

        System.out.println("Standard Package Cost: $" + standardPackage.calculateCost());
        System.out.println("Two-Day Package Cost: $" + twoDayPackage.calculateCost());
        System.out.println("Overnight Package Cost: $" + overnightPackage.calculateCost());
    }
}