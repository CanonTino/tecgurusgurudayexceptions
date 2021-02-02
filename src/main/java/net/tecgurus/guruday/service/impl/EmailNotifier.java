package net.tecgurus.guruday.service.impl;

import net.tecgurus.guruday.exception.BaseException;
import net.tecgurus.guruday.exception.BaseRuntimeException;
import net.tecgurus.guruday.service.Notifier;

public class EmailNotifier implements Notifier {
    public boolean sendNotification(String to, String message) throws BaseException {
        /*if(message == null) {
            System.out.println("el mensaje no debe ser null");
            throw new BaseException();
        }*/
        //TODO: Separar las excepciones en clases diferentes, una para caso del mensaje y otra para caso de receptor: MessageException, RecipientException
        if(message == null) {
            System.out.println("el mensaje no debe ser null");
            throw new BaseException("el mensaje no puede ser null");
        }
        if(to == null) {
            System.out.println("el receptor no debe ser null");
            throw new BaseException("el receptor no debe ser null");
        }
        return true;
    }

    public boolean sendNotification2(String to, String message) {
        if(message == null) {
            System.out.println("el mensaje no debe ser null");
            throw new BaseRuntimeException("el mensaje no debe ser null");
        }
        if(to == null) {
            System.out.println("el receptor no puede ser null");
            throw new BaseRuntimeException("el receptor no puede ser null");
        }
        return true;
    }
}
