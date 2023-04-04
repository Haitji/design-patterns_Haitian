package com.kreitek.pets.Logs;

public class Logger {

    private static Logger instance = null;

    private int contador=0;

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
    return instance;
    }

    public void debug(String message){
        instance.contador++;
        System.out.println("[debug],["+contador+"]-"+message);
    }
}
