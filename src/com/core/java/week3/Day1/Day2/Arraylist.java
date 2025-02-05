package com.core.java.week3.Day1.Day2;
import java.util.*;
class Song{
    public String name;
    public String singerName;
    public int duration;
    public Song(String name,String singerName,int duration){
        this.name=name;
        this.singerName=singerName;
        this.duration=duration;
    }
    public void getSongInfo(){
        System.out.println(String.format("Song = %s\nSinger Name=%s\nDuration=%d min\n",this.name,this.singerName,this.duration));
    }
    public String toString(){
        return String.format("Song : %s\nSingerName= %s\nDuration= %d min\n",this.name,this.singerName,this.duration);
    }
}
class MusicLibrary{
    static ArrayList<Song> library=new ArrayList<>();
    static int idx=0;
    public void addSong(Song s){
        library.add(s);
    }
    public void playSong(){
        System.out.println(library.get(idx).name+" is Playing");
    }
    public void next(){
        idx++;
        if(idx==library.size()){
            idx=0;
        }
        playSong();
    }
    public void prev(){
        idx--;
        if(idx==-1){
            idx=library.size()-1;
        }
        playSong();
    }
    public void pause(){
        System.out.println(library.get(idx).name+" is paused");
    }
    public void displaylibrary(){
        for(Song s:library){
            System.out.println(s);
        }
    }

}
public class Arraylist {
    public static void main(String[] args){
        MusicLibrary l=new MusicLibrary();
        l.addSong(new Song("Feelings","Sumit Goswami",2));
        l.addSong(new Song("Parindey","Sumit Goswami",3));
        l.addSong(new Song("Tora","Sumit Goswami",3));
        l.addSong(new Song("Private Jet","Sumit Goswami",3));
//        l.displaylibrary();
        l.playSong();
        l.next();
        l.prev();
        l.prev();
    }
}
