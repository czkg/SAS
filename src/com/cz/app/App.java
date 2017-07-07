package com.cz.app;

/**
 * Created by tianyaoluke on 7/6/17.
 */
public class App {
    private static App app = new App();

    private App(){}

    public static App getInstance(){
        return  app;
    }

}
