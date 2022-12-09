public class Client {
    public static AbstractGardenCreator getGarden(String type){
        if(type.equals("Iranian")){
            return new IranianGardenCreator();
        }
        else{
            return new JapaneseGardenCreator();
        }
    }
}
