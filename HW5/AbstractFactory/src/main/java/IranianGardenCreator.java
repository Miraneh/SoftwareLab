public class IranianGardenCreator implements AbstractGardenCreator{
    @Override
    public AbstractTree setTree() {
        return new Chenar();
    }

    @Override
    public AbstractFlower setFlower() {
        return new Khatmi();
    }
}
