import java.util.HashMap;
import java.util.Map;

public class MatterStorage {
    private static Map<String, Matter> matterStates= new HashMap<String, Matter>();

    static
    {
        matterStates.put("Solid", new Solid());
        matterStates.put("Liquid", new Liquid());
        matterStates.put("Gas", new Gas());
    }

    public static Matter getMatter(String matter)
    {
        return (Matter) matterStates.get(matter).clone();
    }
}
