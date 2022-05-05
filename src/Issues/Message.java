package Issues;
/**
 * Created by Vedant Chimote #CS19B44 on 05-05-2022 at 14:17
 */

public class Message {
    public String text;
    public MessagePriority priority;

    public Message(String msg, MessagePriority p){
        text = msg;
        priority = p;
    }
}


