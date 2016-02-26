import java.util.ArrayList;

/**
 * Created by v on 2/26/16.
 */
public class Labyrinth
{

    /*
    The constructor creates a random maze in the following size:
    width 24, height 16

    There is no specific requirements for how you create the maze but try to develop as
    good an algorithm as possible and remember the four rules for good algorithms:

    It solves the problem correctly
    It runs (sufficiently) fast
    It requires (sufficiently) little storage
    It is simple

     */

    // generate arraylist 2 hold the 2d array

    ArrayList<ArrayList<String>> rowsMakingAMaze = new ArrayList<ArrayList<String>>();

    // generate a random row
    ArrayList<String> rowOfRandomStrings = new ArrayList<String>();



    Labyrinth()
    {
        int intilizeRandInt = (int)(Math.random() *2 );
        System.out.println("intilizeRandInt : "+ intilizeRandInt);
        
        generateARandomRow();

        // adds each random row to the 2d array
        for (int i = 0; i <16 ; i++)
        {
        rowsMakingAMaze.add(rowOfRandomStrings);
        }


        System.out.println("generate Labyrinth");


    }

    // fills the arrayList "rowOfRandomStrings" with 24 String elements "@" or " " (blank)
    private void generateARandomRow()
    {
        makeRandomElement();
        System.out.println("makeRandomElement() = " + makeRandomElement());

        for (int i = 0; i < 24; i++)
        {

        rowOfRandomStrings.add(makeRandomElement()); // fix it each
        }
    }

    private String makeRandomElement()

    {
        // make 2 possibilities 1 or 0
        int randomInt = (int)(Math.random() *2 ); // "Math.random()"  is normaly doubles, so it makes is casting it to int "(int)"

        if (randomInt == 0)
        {

            //System.out.println("0 = blank");
            return " ";
        }
        else if (randomInt == 1)
        {
            //System.out.println("1 = @");
            return "@";
        }

        else
        {
            System.out.println("error");
            return "error";
        }

       // System.out.println("randomInt:  " + randomInt);

    }

    // prints the maze
    public void printMaze()
    {

        System.out.println("print rowOfRandomStrings: ");
/*
        for (int i = 0; i < 24 ; i++)
        {

        }*/
        //System.out.println(mazeList.get(1).get(1));

        for (int j = 0; j < 16 ; j++)
        {

            System.out.print(rowOfRandomStrings.get(j));
        }

        //printing the maze:

        // outer loop is the rows
        System.out.println("#################################");
        for (int i = 0; i < 16; i++)
        {
            System.out.println();

            // take each element i is the row j is the indexin the 2. array or coloumn nb
            for (int j = 0; j < 24 ; j++)
            {

                System.out.print(rowsMakingAMaze.get(i).get(j));
            }

        }
        System.out.println();
        System.out.println("#################################");
    }
}
