import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Martin on 2/26/16.
 */
public class Labyrinth
{
    public static Scanner input = new Scanner(System.in);


    //  array list to hold the all the 16 rows in the 2d array

    ArrayList<ArrayList<String>> rowsMakingAMaze = new ArrayList<ArrayList<String>>();


    //blockCount counts how many blocks have been made. here we add ++ to not get more minotaurs. "M"
    int blockCount=0;
    int randNumMinotaurLocation =0;

    // CONSTRUCTOR: generates the first layrinth.
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

    }



    private String makeRandomElement()
    {
        // 3 posible returns characters " " , "@". 50% chance and element will be "M".

            //the value randNumMinotaurLocation can be the value between 0 and 16*24 ( 384 cells in total)
            // the number is stored as randNumMinotaurLocation, when its time to return the minotaur in the list in the for
            //loops it will apear just once. smart :)

        if (randNumMinotaurLocation == blockCount)
        {
            //blockCount counts how many blocks have been made. here we add ++ to not get more minotaurs. "M"
            blockCount++;
            return "M";


        }

        else
        {
            // make 2 possibilities 1 or 0
            // "Math.random()"  is normaly doubles, so it makes is casting it to int "(int)"
            int randomInt = (int)(Math.random() *2 );

            blockCount++;

            if (randomInt == 0)
            {
                return " ";
            }

            else if (randomInt == 1)
            {
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
        return "hi jonas,string object bliver en anden gang";
    }

    public void addMinotaur()
    {
        // makes a random number that will be used by the makeRandomElement()
        randNumMinotaurLocation = (int)(Math.random() *16*24 );
        System.out.println("randNumMinotaurLocation  "+ randNumMinotaurLocation);
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

    // create a new unique "maze"
    private void newMaze()

    {
        // reset
        blockCount=0;
        // clear existing rows
        rowsMakingAMaze.clear();

        // make nw rows.
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