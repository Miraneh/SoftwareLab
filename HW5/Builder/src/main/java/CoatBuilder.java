public class CoatBuilder implements Builder{
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

    public Coat getResult(){
        return new Coat(type, color, size);
    }
}
