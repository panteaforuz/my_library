package view;

import controler.LibraryControler;

public class Run {
    public static void main(String[] args) {
        boolean return_flag = false;
        LibraryControler controler = new LibraryControler();

        do {
           return_flag= controler.start();
        }while (!return_flag);

    }

}
