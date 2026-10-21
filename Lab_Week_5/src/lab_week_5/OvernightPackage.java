package lab_week_5;

public class OvernightPackage extends Package {
    private double additionalFeePerOunce;

    public OvernightPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                            String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                            double weight, double costPerOunce, double additionalFeePerOunce) {
        super(senderName, senderAddress, senderCity, senderState, senderZip,
              recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
              weight, costPerOunce);

        if (additionalFeePerOunce > 0.0) {
            this.additionalFeePerOunce = additionalFeePerOunce;
        } else {
            this.additionalFeePerOunce = 0.0;
        }
    }

    @Override
    public double calculateCost() {
        return (costPerOunce + additionalFeePerOunce) * weight;
    }
}