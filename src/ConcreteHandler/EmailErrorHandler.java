package ConcreteHandler;
/**
 * Created by Vedant Chimote #CS19B44 on 05-05-2022 at 14:17
 */
import Handler.ReceiverInterface;
import Issues.Message;

public class EmailErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextReceiver;

    public void setNextChain(ReceiverInterface nextReceiver) { this.nextReceiver = nextReceiver; }

    public boolean processMessage(Message msg)  {
        if (msg.text.contains("Email"))  {
            System.out.println("EmailErrorHandler processed "+ msg.priority + "priority issue: "+ msg.text);
            return true;
        }
        else { if (nextReceiver != null) { nextReceiver.processMessage(msg); } }
        return false;
    }
}

