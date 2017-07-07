package com.cz.app;

import javax.swing.*;

/**
 * Created by tianyaoluke on 7/6/17.
 */
public class AppDemo {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    createAndShowGUI();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    private static void createAndShowGUI(){
        new GUI();
    }
}
