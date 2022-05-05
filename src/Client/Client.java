package Client;
/**
 * Created by Vedant Chimote #CS19B44 on 05-05-2022 at 14:17
 */
import ConcreteHandler.EmailErrorHandler;
import ConcreteHandler.FaxErrorHandler;
import Handler.ReceiverInterface;
import Issues.IssueRaiser;
import Issues.Message;
import Issues.MessagePriority;

//Chain Of Responsibility Design Pattern Error Handling.
public class Client {
    public static void main(String[] args) {
    	System.out.println("Chain Of Responsibility Design Pattern Error Handling.\n");
    	
        //Making the Chain Of Responsibility:  Fax -> email
        ReceiverInterface faxHandler, emailHandler;

        //End of Chain Of Responsibility:
        emailHandler = new EmailErrorHandler();

        //Fax handler is before email
        faxHandler = new FaxErrorHandler();
        faxHandler.setNextChain(emailHandler);

        //Starting point: Raiser will raise issues and set the first handler:
        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occasionally", MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination", MessagePriority.High);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
