class BookNotAvailableException extends Exception
{
    BookNotAvailableException(String msg)
    {
        super(msg);
    }
}

class Library
{
    int availableBooks;

    Library(int b)
    {
        availableBooks=b;
    }

    void issueBook(int count) throws BookNotAvailableException
    {
        if(count<=availableBooks)
        {
            availableBooks=availableBooks-count;
            System.out.println("Book issued successfully");
        }
        else
        {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        Library l=new Library(3);

        try
        {
            l.issueBook(2);
            l.issueBook(2);
        }
        catch(BookNotAvailableException e)
        {
            System.out.println(e.getMessage());
        }
    }
          }
