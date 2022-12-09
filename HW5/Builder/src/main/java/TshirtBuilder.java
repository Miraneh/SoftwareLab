public class TshirtBuilder implements Builder {
    private ClothingType type;
    private String color;
    private Size size;

    @Override
    public void setClothingType(ClothingType type) {
        this.type = type;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    public Tshirt getResult(){
        return new Tshirt(type, color, size);
    }
}
