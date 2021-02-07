package com.autoavaliar.support.tbi;


import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class JRobot {
    private static Robot robot = null;

    public static void setRobot()
    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    String log = "";

    public static void enviar(String texto){
        getRobot();
        enviarChar(texto);
    }

    public void enviarDevagar(String texto){
        getRobot();
        enviarCharDevagar(texto);
    }


    public void enviar(int modifier, String texto){
        getRobot();
        pressKey(modifier);
        enviarChar(texto);
        releaseKey(modifier);
    }

    public static void enviar(int key, int value){
        getRobot();
        pressKey(key);
        pressKey(value);
        releaseKey(value);
        releaseKey(key);
    }

    public static void enviar(int key){
        getRobot();
        pressKey(key);
        releaseKey(key);
    }

    private static void pressKey(int texto){
        robot.keyPress(texto);
    }

    private static void releaseKey(int texto){
        robot.keyRelease(texto);
    }

    private static void enviarChar(String texto){
        char[] arrayC = texto.toCharArray();
        enviarChar(arrayC);
    }

    private void enviarCharDevagar(String texto){
        char[] arrayC = texto.toCharArray();
        for (char c:arrayC) {
            esperar(200);
            enviarChar(new char[]{c});
        }
    }

    private static void enviarChar(char[] arrayC){
        for (char c:arrayC) {
            switch (c){
                case 'a': enviar(KeyEvent.VK_A); break;
                case 'b': enviar(KeyEvent.VK_B); break;
                case 'c': enviar(KeyEvent.VK_C); break;
                case 'd': enviar(KeyEvent.VK_D); break;
                case 'e': enviar(KeyEvent.VK_E); break;
                case 'f': enviar(KeyEvent.VK_F); break;
                case 'g': enviar(KeyEvent.VK_G); break;
                case 'h': enviar(KeyEvent.VK_H); break;
                case 'i': enviar(KeyEvent.VK_I); break;
                case 'j': enviar(KeyEvent.VK_J); break;
                case 'k': enviar(KeyEvent.VK_K); break;
                case 'l': enviar(KeyEvent.VK_L); break;
                case 'm': enviar(KeyEvent.VK_M); break;
                case 'n': enviar(KeyEvent.VK_N); break;
                case 'o': enviar(KeyEvent.VK_O); break;
                case 'p': enviar(KeyEvent.VK_P); break;
                case 'q': enviar(KeyEvent.VK_Q); break;
                case 'r': enviar(KeyEvent.VK_R); break;
                case 's': enviar(KeyEvent.VK_S); break;
                case 't': enviar(KeyEvent.VK_T); break;
                case 'u': enviar(KeyEvent.VK_U); break;
                case 'v': enviar(KeyEvent.VK_V); break;
                case 'w': enviar(KeyEvent.VK_W); break;
                case 'x': enviar(KeyEvent.VK_X); break;
                case 'y': enviar(KeyEvent.VK_Y); break;
                case 'z': enviar(KeyEvent.VK_Z); break;
                case 'A': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_A); break;
                case 'B': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_B); break;
                case 'C': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_C); break;
                case 'D': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_D); break;
                case 'E': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_E); break;
                case 'F': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_F); break;
                case 'G': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_G); break;
                case 'H': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_H); break;
                case 'I': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_I); break;
                case 'J': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_J); break;
                case 'K': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_K); break;
                case 'L': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_L); break;
                case 'M': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_M); break;
                case 'N': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_N); break;
                case 'O': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_O); break;
                case 'P': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_P); break;
                case 'Q': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_Q); break;
                case 'R': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_R); break;
                case 'S': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_S); break;
                case 'T': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_T); break;
                case 'U': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_U); break;
                case 'V': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_V); break;
                case 'W': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_W); break;
                case 'X': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_X); break;
                case 'Y': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_Y); break;
                case 'Z': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_Z); break;
                case '`': enviar(KeyEvent.VK_BACK_QUOTE); break;
                case '0': enviar(KeyEvent.VK_0); break;
                case '1': enviar(KeyEvent.VK_1); break;
                case '2': enviar(KeyEvent.VK_2); break;
                case '3': enviar(KeyEvent.VK_3); break;
                case '4': enviar(KeyEvent.VK_4); break;
                case '5': enviar(KeyEvent.VK_5); break;
                case '6': enviar(KeyEvent.VK_6); break;
                case '7': enviar(KeyEvent.VK_7); break;
                case '8': enviar(KeyEvent.VK_8); break;
                case '9': enviar(KeyEvent.VK_9); break;
                case '-': enviar(KeyEvent.VK_MINUS); break;
                case '=': enviar(KeyEvent.VK_EQUALS); break;
                case '~': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE); break;
                case '!': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_1); break;
                case '@': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_2); break;
                case '#': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_3); break;
                case '$': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_4); break;
                case '%': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_5); break;
                case '^': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_6); break;
                case '&': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_7); break;
                case '*': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_8); break;
                case '(': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_9); break;
                case ')': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_0); break;
                case '_': enviar(KeyEvent.VK_SHIFT,KeyEvent.VK_MINUS); break;
                case '+': enviar(KeyEvent.VK_PLUS); break;
                case '\t': enviar(KeyEvent.VK_TAB); break;
                case '\n': enviar(KeyEvent.VK_ENTER); break;
                case '[': enviar(KeyEvent.VK_OPEN_BRACKET); break;
                case ']': enviar(KeyEvent.VK_CLOSE_BRACKET); break;
                case '\\': enviar(KeyEvent.VK_BACK_SLASH); break;
                case '{': enviar(KeyEvent.VK_SHIFT, KeyEvent. VK_OPEN_BRACKET); break;
                case '}': enviar(KeyEvent.VK_SHIFT, KeyEvent. VK_CLOSE_BRACKET); break;
                case '|': enviar(KeyEvent.VK_SHIFT, KeyEvent. VK_BACK_SLASH); break;
                case ';': enviar(KeyEvent.VK_SEMICOLON); break;
                case ':': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_SEMICOLON); break;
                case '\'': enviar(KeyEvent.VK_QUOTE); break;
                case '"': enviar(KeyEvent.VK_QUOTEDBL); break;
                case ',': enviar(KeyEvent.VK_COMMA); break;
                case '<': enviar(KeyEvent.VK_LESS); break;
                case '.': enviar(KeyEvent.VK_PERIOD); break;
                case '>': enviar(KeyEvent.VK_GREATER); break;
                case '/': enviar(KeyEvent.VK_SLASH); break;
                case '?': enviar(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH); break;
                case ' ': enviar(KeyEvent.VK_SPACE); break;
                case 'ç':
                    robot.keyPress(KeyEvent.VK_ALT);
                    esperar(10);
                    robot.keyPress(KeyEvent.VK_NUMPAD0);
                    esperar(10);
                    robot.keyRelease(KeyEvent.VK_NUMPAD0);
                    esperar(10);
                    robot.keyPress(KeyEvent.VK_NUMPAD2);
                    esperar(10);
                    robot.keyRelease(KeyEvent.VK_NUMPAD2);
                    esperar(10);
                    robot.keyPress(KeyEvent.VK_NUMPAD3);
                    esperar(10);
                    robot.keyRelease(KeyEvent.VK_NUMPAD3);
                    esperar(10);
                    robot.keyPress(KeyEvent.VK_NUMPAD1);
                    esperar(10);
                    robot.keyRelease(KeyEvent.VK_NUMPAD1);
                    esperar(10);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                default:
                    throw new IllegalArgumentException("Cannot type character " + c);
            }
        }

    }

    public static void space(){
        setRobot();
        robot.keyPress(KeyEvent.VK_SPACE);
        esperar(10);
        robot.keyRelease(KeyEvent.VK_SPACE);
    }

    public static void arrowDown(){
        setRobot();
        robot.keyPress(KeyEvent.VK_DOWN);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_DOWN);
    }

    public static void shiftTab(){
        setRobot();
        robot.keyPress(KeyEvent.VK_SHIFT);
        esperar(50);
        robot.keyPress(KeyEvent.VK_TAB);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_TAB);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_SHIFT);
    }

    public static void tab(){
        setRobot();
        robot.keyPress(KeyEvent.VK_TAB);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public static void commandShiftG(){
        setRobot();
        esperar(50);
        robot.keyPress(KeyEvent.VK_META);
        esperar(50);
        robot.keyPress(KeyEvent.VK_SHIFT);
        esperar(50);
        robot.keyPress(KeyEvent.VK_G);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_G);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_META);
    }

    public static void enter(){
        setRobot();
        robot.keyPress(KeyEvent.VK_ENTER);
        esperar(50);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    private static void esperar(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void robotClick(){
        getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
        esperar(50);
        getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        esperar(50);
    }

    public static void mouseMoveMiddle(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        esperar(50);
        getRobot().mouseMove (d.width/2, d.height/2);
        esperar(50);
        getRobot().mouseMove (d.width/2, d.height/2);
    }

    public static void mousePress(){
        getRobot().mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void mouseRelease(){
        getRobot().mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void robotDoubleClick(){
        robotClick();
        robotClick();
    }


    public static Robot getRobot()
    {
        esperar(10);
        if(robot==null){
            esperar(500);
            setRobot();
        }
        return robot;
    }


}
