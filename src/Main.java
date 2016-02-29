/**
 * Created by v on 2/26/16.
 */
public class Main
{
    public static void main(String[] args)
    {

        Labyrinth labyrinth = new Labyrinth();

        labyrinth.toString();
        // returns the maze printed
        System.out.println(labyrinth.toString());
        labyrinth.Rebuild();
    }

}
