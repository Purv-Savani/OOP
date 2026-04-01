import java.io.*;

class Main
{
    public static void main(String args[])
    {
        int lines=0,words=0,chars=0;

        try
        {
            FileReader fr=new FileReader("data.txt");
            BufferedReader br=new BufferedReader(fr);

            String line;

            while((line=br.readLine())!=null)
            {
                lines++;

                String w[]=line.trim().split("\\s+");
                if(line.trim().length()>0)
                    words+=w.length;

                for(int i=0;i<line.length();i++)
                {
                    if(line.charAt(i)!=' ')
                        chars++;
                }
            }

            br.close();

            System.out.println("Lines="+lines);
            System.out.println("Words="+words);
            System.out.println("Characters="+chars);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("IO Error");
        }
    }
                  }
