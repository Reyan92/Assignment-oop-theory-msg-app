import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        messageapp app = new messageapp();

        // Sms(String sender, String receiver, String content, String msgId, boolean
        // status)

        boolean check = true;

        while (check) {
            System.out.println("----------------------------------------------");
            System.out.println("W-E-L-C-O-M-E T-O M-Y M-E-S-S-A-G-I-N-G A-P-P");
            System.out.println("----------------------------------------------");
            System.out.println("enter 1 to add contact");
            System.out.println("enter 2 to display contacts");
            System.out.println("enter 3 to send message");
            System.out.println("enter 4 to display message");
            System.out.println("enter 5 to delete message");
            System.out.println("enter 6 to delete Contact");
            System.out.println("enter 7 to check status of msg");
            System.out.println("enter 8 to sort msgs with time");
            System.out.println("enter 0 to exit");
            int userchoice = sc.nextInt();

            switch (userchoice) {
                case 1:
                    app.addContact();
                    break;
                case 2:
                    app.displayContacts();
                    break;
                case 3:
                    app.sendMsg();
                    break;
                case 4:
                    app.displaymsg();
                    break;
                case 5:
                    app.dltMsg();
                    break;
                case 6:
                    app.dltContact();
                    break;
                case 7:
                    app.checkStatus();
                    break;
                case 8:
                    app.sortMsg();
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    break;
            }

        }
        System.out.println("Thanks for using our service! ");
        System.out.println("good bye!");

    }
}
