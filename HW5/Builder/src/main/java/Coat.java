public class Coat {
    private final ClothingType type;
    private final String color;
    private final Size size;

    public Coat(ClothingType type, String color, Size size){
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public ClothingType getType() {
        return type;
    }

    public String getColor(){
        return color;
    }

    public Size getSize() {
        return size;
    }
}
