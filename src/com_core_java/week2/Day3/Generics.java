package com.core.java.week2.Day3;


import java.util.ArrayList;
import java.util.List;

interface  vehicle<T>{
    void type();
}
class Car implements vehicle{
   public  void type(){
        System.out.println("hi");
    }
}
class PopSongs{
    public String name;
    public String singer;
    public PopSongs(String name,String singer){
        this.name=name;
        this.singer=singer;
    }

    @Override
    public String toString() {
        return String.format("Song Name = %s\nSinger = %s ",this.name,this.singer);
    }
}

class RockSongs{
    public String name;
    public String singer;
    public RockSongs(String name,String singer){
        this.name=name;
        this.singer=singer;
    }
    public String toString(){
        return String.format("Song Name = %s \nSinger = %s",this.name,this.singer);
    }
}
class Library<T>{
    List<T> songs=new ArrayList<>();
    public void addSong(T song){
        songs.add(song);
    }
    public void showLibrary(){
        for(T t:songs){
            System.out.println(t.toString());
        }
    }
}

public class Generics {
    public static void main(String[] args) {
        Library<RockSongs> rs=new Library<>();
        rs.addSong(new RockSongs("ada","asd"));
        rs.addSong(new RockSongs("asdasd","asdasd"));
        rs.showLibrary();
    }
}
