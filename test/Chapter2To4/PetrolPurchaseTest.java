package Chapter2To4;

class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase myPetrolPurchase =
                new PetrolPurchase("LAGOS", "NNPC", 15, 10.5, 20.10);

        System.out.println("The station's location: " + myPetrolPurchase.getLocation());
        System.out.println("The petrol type: " + myPetrolPurchase.getPetrolType());
        System.out.println("The Quantity of purchase: " + myPetrolPurchase.getQuantityOfPurchase());
        System.out.println("The price per liter: " + myPetrolPurchase.getPricePerLiter());
        System.out.println("The percentage discount: " + myPetrolPurchase.getPercentageDiscount());
        System.out.println();
    }
}