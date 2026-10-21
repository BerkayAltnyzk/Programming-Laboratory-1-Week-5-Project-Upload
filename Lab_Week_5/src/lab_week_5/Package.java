package lab_week_5;

public class Package {
    
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZip;

    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZip;

    protected double weight;
    protected double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                   String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                   double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;

        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;

        if (weight > 0.0) {
            this.weight = weight;
        } else {
            this.weight = 0.0;
        }

        if (costPerOunce > 0.0) {
            this.costPerOunce = costPerOunce;
        } else {
            this.costPerOunce = 0.0;
        }
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }
}
    

