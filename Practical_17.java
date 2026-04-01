interface Exam
{
    boolean isPassed(int mark);
}

interface Classify
{
    String getDivision(double average);
}

class Result implements Exam,Classify
{
    public boolean isPassed(int mark)
    {
        if(mark>=35)
            return true;
        else
            return false;
    }

    public String getDivision(double average)
    {
        if(average>=60)
            return "First Division";
        else if(average>=50)
            return "Second Division";
        else if(average>=35)
            return "Third Division";
        else
            return "Fail";
    }
}

class Main
{
    public static void main(String args[])
    {
        Result r=new Result();

        System.out.println("Passed="+r.isPassed(40));
        System.out.println("Division="+r.getDivision(62.5));
    }
    }
