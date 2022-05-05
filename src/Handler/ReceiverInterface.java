package Handler;
/**
 * Created by Vedant Chimote #CS19B44 on 05-05-2022 at 14:17
 */
import Issues.Message;

public interface ReceiverInterface {
    boolean processMessage(Message msg);
    void setNextChain(ReceiverInterface nextChain);
}
