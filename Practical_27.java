import java.io.*;

class Main
{
    public static void main(String args[])
    {
        FileWriter fw=null;
        BufferedReader br=null;

        try
        {
            fw=new FileWriter("students.txt");
            fw.write("101 Rahul 80\n");
            fw.write("102 Amit 75\n");
            fw.write("103 Neha 90\n");
            fw.close();

            FileReader fr=new FileReader("students.txt");
            br=new BufferedReader(fr);

            String line;

            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        finally
        {
            try
            {
                if(br!=null)
                    br.close();
            }
            catch(IOException e){}
        }
    }
                     }
