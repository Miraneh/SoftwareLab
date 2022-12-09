public class JapaneseGardenCreator implements AbstractGardenCreator{
    @Override
    public AbstractTree setTree() {
        return new Azalea();
    }

    @Override
    public AbstractFlower setFlower() {
        return new Sakura();
    }
}
