package basiclibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge3 {

    public static void tallayMetodResulte(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        System.out.println(tally(votes));
    }
    //  telly function ()
    public static String tally(List<String> votes)
    {
        HashMap<String,Integer> map = new HashMap<>();
        for (String str : votes)
        {
            if (map.keySet().contains(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
        int max_votes = 0;
        String win = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > max_votes)
            {
                max_votes = val;
                win = key;
            }

            else if (val == max_votes &&
                    win.compareTo(key) > 0)
                win = key;
        }
        return win;
    }
}
