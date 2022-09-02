import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Create your own music playlist using linkedlists
        LinkedList<String> AhebPlaylist = new LinkedList<>();

        System.out.println("========== Welcome to Idel's Top Daily Playlist! ==========");
        System.out.println("Today's Top Daily showcases Musical Theater Songs from Ang Huling El Bimbo (AHEB) Musical!\n");
        System.out.println("For our first five slots, we have:");

        // 2. Add 5 new songs to your Playlist using the add() method
        AhebPlaylist.add("Pare Ko/Yoko");
        AhebPlaylist.add("Friendship Medley");
        AhebPlaylist.add("Alapaap/Overdrive");
        AhebPlaylist.add("Tindahan ni Aleng Nena");
        AhebPlaylist.add("Minsan");

        System.out.println(AhebPlaylist);

        // 3. Add a new song at the front of the Playlist using the addFirst() method
        // 4. Add a new song at the end of the Playlist using the addLast() method
        System.out.println("\nWe have new songs coming in to our first and last slots brought to you by our listeners.\n");

        AhebPlaylist.addFirst("Tama Ka/Ligaya");
        AhebPlaylist.addLast("Ang Huling El Bimbo");

        // 5. Display the song at the front of the Playlist using the combination of get() method and the println() method
        System.out.print("For our first song, let's have ");
        System.out.println(AhebPlaylist.get(0));

        // 6. Replace the last song using the set() method
        System.out.println("\nOooh, just a quick update before the song: our last slot for our AHEB musical playlist just got replaced by \"Magasin!\"\n");
        AhebPlaylist.set(6, "Magasin");

        // 7. Remove the first song using the remove() method
        System.out.println("Thank you for listening here on the radio, that was Tama Ka/Ligaya, our first song on the playlist.\n");
        AhebPlaylist.remove(0);

        // 8. Display all songs in your Playlist using the println method
        System.out.println("Now for our updated playlist for today!");
        System.out.println(AhebPlaylist);

    }
}
