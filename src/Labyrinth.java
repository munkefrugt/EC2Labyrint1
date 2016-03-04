import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by v on 2/26/16.
 */
public class Labyrinth
{
    public static Scanner input = new Scanner(System.in);
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




   int MinotaurCount;

    int blockCount=0;
    int randomNumberM=0;

    // CONSTRUCTOR: generates the layrinth.
    Labyrinth()
    {
        // makes the randowm number that is needed for the minuataour to be more than zero
        addMinotaur();
        // laver 16 arraylister tilføjer til rows making a maze
        for (int i = 0; i < 16 ; i++)
        {


            ArrayList<String> list = new ArrayList<String>();
            for (int j = 0; j <24 ; j++)
            {
            list.add(makeRandomElement());

            }
            rowsMakingAMaze.add(list);
        }





            // FILLING OF Arraylist rows "rowOfRandomStrings" with randomly created elements
            // should have been made into a loop but i dont know how to generate different referenfenames in for loop.

        // (beware of the <= remember the 24 th element is number 23.)
        //generateRandRows();


    }



    private String makeRandomElement()
    {

    if (randomNumberM == blockCount)
    {
        blockCount++;
        return "M";


    }

    else
    {
        // make 2 possibilities 1 or 0
        int randomInt = (int)(Math.random() *2 ); // "Math.random()"  is normaly doubles, so it makes is casting it to int "(int)"

        blockCount++;

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
            return"E";// Error

    }


    }

    // prints the maze
    // never mind this jonas..
    public String toString()

    {
        System.out.println();
        // prints 24 width, and 16 rows
        System.out.println("#################################");
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
        return "hi jonas";
    }

    public void addMinotaur()
    {
        // makes a random number that will be used by the makeRandomElement()
        randomNumberM = (int)(Math.random() *16*24 );
        System.out.println("randomNumberM  "+randomNumberM);
    }


    public void Rebuild()
    {
        System.out.println("rebuild a new one? y? n? ");



        System.out.println("enter answer");
        String answer = input.nextLine();
        System.out.println("your  answer is: " + answer);

        try
        {
            if(answer.equals("y"))
            {

                addMinotaur();
                newMaze();
                toString();
                Rebuild();
            }
            else if(answer.equals("n"))
            {
                System.out.println(" now exit");
            }
            else
            {
                System.out.println("try again, only  small letters!");
                Rebuild();
                System.out.println("no rebuild generation happened");
            }

        }
        catch (IndexOutOfBoundsException e)
        {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
            Rebuild();
        }



    }

    private void newMaze()

    {
        blockCount=0;
        rowsMakingAMaze.clear();
        for (int i = 0; i < 16 ; i++)
        {


            ArrayList<String> list2 = new ArrayList<String>();
            for (int j = 0; j <24 ; j++)
            {
                list2.add(makeRandomElement());

            }
            rowsMakingAMaze.add(list2);
        }

    }


}