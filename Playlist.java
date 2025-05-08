import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
  public static void main(String[] args) {

    String[] favoriteSongs = {"Blinding Lights by The Weeknd", "The Twist by Chubby Checker", "Smooth by Santana feat Rob Thomas", "Mack the Knife by Bobby Darin", "Rock And Roll All Nite by KISS", "Ain't No Mountain High Enough by Marvin Gaye & Tammi Terrell", "Respect by Aretha Franklin", "Fight the Power by Public Enemy", "A Change Is Gonna Come by Sam Cooke", "Like a Rolling Stone by Bob Dylan" };

    System.out.println("First 3 songs: " + favoriteSongs[0] + " " + favoriteSongs[1] + " " + favoriteSongs[2]);

    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    desertIslandPlaylist.add("Yonaguni");
    desertIslandPlaylist.add("Perro Negro");
    desertIslandPlaylist.add("Lose Yourself");
    desertIslandPlaylist.add("Hotline Bling");
    desertIslandPlaylist.add("La Old Skul");

    System.out.println(desertIslandPlaylist.toString());
    
    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

    System.out.println("Current: " + desertIslandPlaylist.size());

    desertIslandPlaylist.remove(5);
    desertIslandPlaylist.remove(6);
    desertIslandPlaylist.remove(7);
    desertIslandPlaylist.remove(8);
    desertIslandPlaylist.remove(9);
    System.out.println("Current: " + desertIslandPlaylist.size() + " " + desertIslandPlaylist.toString());

    desertIslandPlaylist.set(5, "Ferxxo");

    String SongA = "Ferxxo";
    String SongB = "Yonaguni";

    int indexA = desertIslandPlaylist.indexOf("Ferxxo");
    int indexB = desertIslandPlaylist.indexOf("Yonaguni");

    String tempA = SongA;

    desertIslandPlaylist.set(5, "Yonaguni");

    System.out.println(desertIslandPlaylist.toString());

    desertIslandPlaylist.set(0, tempA);

    System.out.println(desertIslandPlaylist.toString());

  }
}
