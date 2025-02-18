package com.core.java.week4.Day1;

import java.io.File;

class ReadFromTop implements Runnable {
    FileHandlingThread fth;

    public ReadFromTop(FileHandlingThread fth) {
        this.fth = fth;
    }

    @Override
    public void run() {
        fth.readFromTop();
        System.out.println("File Readed top" + Thread.currentThread().getName());
    }
}

class ReadFromBottom implements Runnable {
    FileHandlingThread fth;

    public ReadFromBottom(FileHandlingThread fth) {
        this.fth = fth;
    }

    @Override
    public void run() {
        fth.readFromBottom();
        System.out.println("File Read from Bottom"+Thread.currentThread().getName());

    }
}

class Writer implements Runnable {
    FileHandlingThread fth;
    String path;

    public Writer(FileHandlingThread fth, String path) {
        this.fth = fth;
        this.path = path;
    }

    @Override
    public void run() {

        fth.write(path);
        System.out.println("File Writer " + Thread.currentThread().getName());
    }
}

public class MethodsDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("Multithreading.txt");
        file.createNewFile();
        FileHandlingThread fth = new FileHandlingThread(file);

        Thread write1 = new Thread(new Writer(fth, "C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Append.txt"), "Writer 1");
        Thread writer2 = new Thread(new Writer(fth, "C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Players.csv"), "Writer 2");

        Thread readtop = new Thread(new ReadFromTop(fth));
        Thread readbottom =new Thread (new ReadFromBottom(fth));
//        writer2.start();
//        write1.start();
        readtop.start();
        readbottom.start();
//        Thread.currentThread().sleep(1000);

    }

}