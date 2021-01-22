package com.autoavaliar.support.tbi;

import com.autoavaliar.support.CoreWeb;
import com.fazecast.jSerialComm.SerialPort;

import java.io.PrintWriter;

public class Arduino extends CoreWeb {
    private SerialPort port = null;
    private PrintWriter output = null;

    private void getPort() {
        if(port==null){
            port = SerialPort.getCommPort("COM3");
            port.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER,0,0);
            port.openPort();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void getPrinter() {
        if(output==null){
            output = new PrintWriter(port.getOutputStream());
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void killPort(){
        port.closePort();
    }

    public void send(char c) {
        try {
            Thread.sleep(800);
            getPort();
            getPrinter();
            Thread.sleep(800);
            output.write(c);
            output.flush();
        } catch (NullPointerException | InterruptedException e) {
            error().Warning("Arduino was null");
            System.out.println(e.getMessage());
        }

    }
}