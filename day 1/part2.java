import java.io.FileReader;
import java.io.IOException;

/**
 * Created by douwe on 03/12/2015.
 */
public class part2 {
    private int floor;
    private FileReader reader;

    public part2(){
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
        part2 p = new part2();
        p.run();
    }

    public void run()
    {
        int next;
        try
        {
            int pos = 1;
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

                if (floor == -1)
                {
                    System.out.println("position: " + pos);
                    break;
                }
                pos++;
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("floor: " + floor);
    }
}
