import java.util.LinkedList;

public class Practical31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 3");
        playlist.add("Song 4");

        System.out.println("Initial Playlist: " + playlist);

        playlist.removeFirst();
        System.out.println("After playing first song: " + playlist);

        playlist.removeLast();
        System.out.println("After skipping last song: " + playlist);

        playlist.add("Song 5");
        System.out.println("After adding a song: " + playlist);
    }
          }
