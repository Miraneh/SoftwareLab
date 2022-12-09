public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        TshirtBuilder builder = new TshirtBuilder();
        director.constructTshirt(builder);
        Tshirt tshirt = builder.getResult();
        System.out.println(tshirt.getType());


        CoatBuilder builder2 = new CoatBuilder();
        director.constructCoat(builder2);
        Coat coat = builder2.getResult();
        System.out.println(coat.getType());
    }
}
