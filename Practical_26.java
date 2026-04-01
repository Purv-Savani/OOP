import java.io.*;

class Main
{
    public static void main(String args[])
    {
        int charCount=0,wordCount=0,lineCount=0;

        try
        {
            FileReader fr=new FileReader(args[0]);
            BufferedReader br=new BufferedReader(fr);

            String line;

            while((line=br.readLine())!=null)
            {
                lineCount++;
                charCount+=line.length();

                String words[]=line.trim().split("\\s+");
                if(line.trim().length()>0)
                    wordCount+=words.length;
            }

            br.close();

            System.out.println("Characters="+charCount);
            System.out.println("Words="+wordCount);
            System.out.println("Lines="+lineCount);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
              }
