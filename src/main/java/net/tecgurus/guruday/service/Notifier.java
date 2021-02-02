package net.tecgurus.guruday.service;

import net.tecgurus.guruday.exception.BaseException;

public interface Notifier {
    boolean sendNotification(String to, String message) throws BaseException;
    boolean sendNotification2(String to, String message);
}
