public class Demo {
    public static void main(String[] args) {
        AbstractGardenCreator gardenCreator = Client.getGarden("Iranian");
        AbstractFlower flower1 = gardenCreator.setFlower();
        flower1.printFlower();

        AbstractGardenCreator gardenCreator2 = Client.getGarden("Japanese");
        AbstractFlower flower2 = gardenCreator2.setFlower();
        flower2.printFlower();

    }
}
