package com.autoavaliar.support.tbi;

import com.fazecast.jSerialComm.SerialPort;

import java.io.PrintWriter;

public class Arduino {
    private static SerialPort port = null;
    private static PrintWriter output = null;

    private static void getPort() {
        if(port==null){
            port = SerialPort.getCommPort("COM4");
            port.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER,0,0);
            port.openPort();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void getPrinter() {
        if(output==null){
            output = new PrintWriter(port.getOutputStream());
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void killPort(){
        port.closePort();
    }

    public static void send(char c) {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getPort();
        getPrinter();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        output.write(c);
        output.flush();
    }
}
