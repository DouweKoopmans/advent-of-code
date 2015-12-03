import java.io.FileReader;
import java.io.IOException;

/**
 * Created by douwe on 03/12/2015.
 */
public class part1 {
    private int floor;
    private FileReader reader;

    public part1(){
        floor = 0;
        try
        {
            reader = new FileReader("day 1/input.txt");
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        part1 p = new part1();
        p.run();
    }

    public void run()
    {
        int next;
        try
        {

            while ((next = reader.read()) != -1)
            {
                String nextSt = Character.toString((char) next);

                if (nextSt.equals("("))
                {
                    floor++;
                } else if (nextSt.equals(")"))
                {
                    floor--;
                }
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

        System.out.println(floor);
    }
}
