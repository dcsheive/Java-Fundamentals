import java.util.HashMap; 
import java.util.Set; 
public class Hashmatique {
    public void trackList(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Apples", "I love apples");
        trackList.put("Oranges", "I love oranges");
        trackList.put("Bananas", "I love bananas");
        trackList.put("Grapes", "I love grapes");
        System.out.println(trackList.get("Grapes"));
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println("Track: "+ key +" Lyrics: "+trackList.get(key));
        }
    }
}