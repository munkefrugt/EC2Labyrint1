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
    ArrayList<String> rowOfRandomStrings1 = new ArrayList<String>();


    Labyrinth()
    {
        int intilizeRandInt = (int)(Math.random() *2 );
        System.out.println("intilizeRandInt : "+ intilizeRandInt);
        


        // adds each random row to the 2d array

        // beware of the <= remember the 24 th element is number 23.
        for (int i = 0; i <= 24 ; i++) {

        rowOfRandomStrings.add(makeRandomElement());
        }
       


        for (int i = 0; i <= 24 ; i++) {

            rowOfRandomStrings1.add(makeRandomElement());
        }
        //makeRandomElement()

        rowsMakingAMaze.add(rowOfRandomStrings);
        rowsMakingAMaze.add(rowOfRandomStrings1);




        System.out.println("generate Labyrinth");
        System.out.println("prints 2 lines");

        // prints 24 width, and 2 rows
        for (int j = 0; j <2 ; j++)
        {

            for (int i = 0; i <24 ; i++)
            {

            System.out.print(rowsMakingAMaze.get(j).get(i));

            }
            System.out.println();
        }
        // dette virker, nu er der kun en plads i arrayet RandomRowOfString
        System.out.println(rowsMakingAMaze.get(0).get(24));
        System.out.println(rowsMakingAMaze.get(1).get(0));


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



        //printing the maze:

        // outer loop is the rows
        System.out.println("#################################");
        /*for (int i = 0; i < 16; i++)
        {
            System.out.println();

            // take each element i is the row j is the indexin the 2. array or coloumn nb
            for (int j = 0; j < 24 ; j++)
            {

                System.out.print(rowsMakingAMaze.get(i).get(j));
            }

        }*/
        System.out.println();
        System.out.println("#################################");
    }
}
