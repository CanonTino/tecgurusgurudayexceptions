package net.tecgurus.guruday.exception.app;

import net.tecgurus.guruday.exception.BaseException;
import net.tecgurus.guruday.service.Notifier;
import net.tecgurus.guruday.service.impl.EmailNotifier;

public class App {

    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        try {
            notifier.sendNotification(null, "");

        } catch (BaseException e) {
            System.out.println("base exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("general exception occurred: " + e.getMessage());
        }
    }

    /*public static void main(String[] args) throws BaseException {
        Notifier notifier = new EmailNotifier();
        notifier.sendNotification("", "");
    }*/

    /*public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.sendNotification2(null, null);
    }*/
}
