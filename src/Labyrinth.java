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

    // generate 1 main arraylist to hold the all the 16 rows in the 2d array

    ArrayList<ArrayList<String>> rowsMakingAMaze = new ArrayList<ArrayList<String>>();




    // Now generate the randoms row
    ArrayList<String> rowOfRandomStrings = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings1 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings2 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings3 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings4 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings5 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings6 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings7 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings8 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings9 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings10 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings11 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings12 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings13 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings14 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings15 = new ArrayList<String>();
    ArrayList<String> rowOfRandomStrings16 = new ArrayList<String>();


    Labyrinth()
    {
        int intilizeRandInt = (int)(Math.random() *2 );
        System.out.println("intilizeRandInt : "+ intilizeRandInt);
        



        // beware of the <= remember the 24 th element is number 23.
        // Create all the random rows

        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings1.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings2.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings3.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings4.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings5.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings6.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings7.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings8.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings9.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings10.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings11.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings12.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings13.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings14.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings15.add(makeRandomElement());}
        for (int i = 0; i <= 24 ; i++) {rowOfRandomStrings16.add(makeRandomElement());}


        // add each random row to the 2d array

        // add the random rows to the main arraylist. holding 16 places
        rowsMakingAMaze.add(rowOfRandomStrings);
        rowsMakingAMaze.add(rowOfRandomStrings1);
        rowsMakingAMaze.add(rowOfRandomStrings2);
        rowsMakingAMaze.add(rowOfRandomStrings3);
        rowsMakingAMaze.add(rowOfRandomStrings4);
        rowsMakingAMaze.add(rowOfRandomStrings5);
        rowsMakingAMaze.add(rowOfRandomStrings6);
        rowsMakingAMaze.add(rowOfRandomStrings7);
        rowsMakingAMaze.add(rowOfRandomStrings8);
        rowsMakingAMaze.add(rowOfRandomStrings9);
        rowsMakingAMaze.add(rowOfRandomStrings10);
        rowsMakingAMaze.add(rowOfRandomStrings11);
        rowsMakingAMaze.add(rowOfRandomStrings12);
        rowsMakingAMaze.add(rowOfRandomStrings13);
        rowsMakingAMaze.add(rowOfRandomStrings14);
        rowsMakingAMaze.add(rowOfRandomStrings15);
        rowsMakingAMaze.add(rowOfRandomStrings16);





        System.out.println("generate Labyrinth");
        System.out.println("prints 2 lines");





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
        // prints 24 width, and 2 rows
        for (int j = 0; j <16 ; j++)
        {

            for (int i = 0; i <24 ; i++)
            {

                System.out.print(rowsMakingAMaze.get(j).get(i));

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("#################################");
    }

    /*@Override
    public String toString()
    {

            return

    }*/
}
