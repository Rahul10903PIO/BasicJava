package com.core.java.week3.Assignment2;

class Node<T> {
    T data;
    Node prev;
    Node next;

    public Node(T data) {
        this.data=data;
    }
}

class EmptyPlaylist extends  Exception{
    public EmptyPlaylist(){
        super("Playlist is Empty");
    }
}
//Song Class
class Song {
    private String name;
    private String singerName;
    private int duration;
    public Song(String name,String singerName, int duration) {
        this.name=name;
        this.singerName=singerName;
        this.duration=duration;
    }
    public static void getSongInfo(Song s){
        System.out.println(String.format("Song Name : %s\nSinger Name : %s\nDuration : %d\n",s.name,s.singerName,s.duration));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
class MusicPlaylist {
    Node<Song> head;
    Node<Song> tail;
    Node<Song> currSong;

    public void addSong(Song s){
        Node<Song> newSong=new Node<>(s);
        if(head==null){
            head=newSong;
            tail=newSong;
            currSong=head;
        }else{
            tail.next=newSong;
            newSong.prev=tail;
            tail=newSong;
            tail.next=head;
            head.prev=tail;
        }
    }
    public void nextSong() throws EmptyPlaylist{
        if(head==null){
            throw new EmptyPlaylist();
        }else{
            currSong=currSong.next;
        }
    }
    public void previousSong() throws EmptyPlaylist{
        if(head==null){
            throw new EmptyPlaylist();
        }else{
            currSong=currSong.prev;
        }
    }
    public void songDetails() throws EmptyPlaylist{
        if(head==null){
            throw new EmptyPlaylist();
        }else{
            Song s=currSong.data;
            Song.getSongInfo(s);
        }
    }

    public void playSong()throws EmptyPlaylist {
        if (head == null) {
            throw new EmptyPlaylist();
        } else {
            System.out.println(currSong.data.getName() + " is playing..");
        }
    }

}
public class Question4 {
    public static void main(String[] args) {
        MusicPlaylist playlist=new MusicPlaylist();
        playlist.addSong(new Song("Feelings","Sumit Goswami",2));
        playlist.addSong(new Song("Parindey","Sumit Goswami",2));
        playlist.addSong(new Song("Tora","Sumit Goswami",2));
        playlist.addSong(new Song("The Villagers","Sumit Goswami",2));
        try{

            for(int i=0;i<4;i++){
                playlist.songDetails();
                playlist.nextSong();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
