package lab_week_5;


public class TwoDayPackage extends Package{
    
  
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                          String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                          double weight, double costPerOunce, double flatFee) {
        super(senderName, senderAddress, senderCity, senderState, senderZip,
              recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
              weight, costPerOunce);

        if (flatFee > 0.0) {
            this.flatFee = flatFee;
        } else {
            this.flatFee = 0.0;
        }
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}
    

