public class Director {
    public void constructTshirt(Builder builder){
        builder.setClothingType(ClothingType.TSHIRT);
        builder.setColor("Blue");
        builder.setSize(new Size(75,40));
    }

    public void constructCoat(Builder builder){
        builder.setClothingType(ClothingType.COAT);
        builder.setColor("Blue");
        builder.setSize(new Size(90, 0));
    }
}
