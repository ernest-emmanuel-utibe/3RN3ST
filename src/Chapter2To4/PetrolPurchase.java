package Chapter2To4;

public class PetrolPurchase {
    private  String location;
    private String petrolType;
    private int quantityOfPurchase;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String location, String petrolType, int quantityOfPurchase,
                          double pricePerLiter, double percentageDiscount){

        this.location = location;
        this.petrolType = petrolType;
        this.quantityOfPurchase = quantityOfPurchase;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }


    public String getPetrolType(){
        return petrolType;
    }
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }


    public void setQuantityOfPurchase(int quantityOfPurchase){
        this.quantityOfPurchase = quantityOfPurchase;
    }
    public int getQuantityOfPurchase(){
        return quantityOfPurchase;
    }


    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }
    public double getPricePerLiter(){
        return pricePerLiter;
    }


    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }


    public double getPurchaseAccount () {
        return quantityOfPurchase * pricePerLiter - percentageDiscount;
    }
}
