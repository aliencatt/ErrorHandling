package Issues;
/**
 * Created by Vedant Chimote #CS19B44 on 05-05-2022 at 14:17
 */
import Handler.ReceiverInterface;

public class IssueRaiser {
    public ReceiverInterface setFirstReceiver;

    public IssueRaiser(ReceiverInterface firstReceiver) {
        this.setFirstReceiver = firstReceiver;
    }

    public void raiseMessage(Message msg) {
        if (setFirstReceiver != null) { setFirstReceiver.processMessage(msg); }
    }
}

