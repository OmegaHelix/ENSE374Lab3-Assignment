
public class ListElement
{
    private ListElement next;
    private ListElement previous;
    private int data;


    public ListElement()
    {
        this.data = 0;
        this.next = null;
        this.previous = null;
    }

    public ListElement(ListElement le)
    {
        this.data = le.getData();
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public int getData()
    {
        return this.data;
    }

    public ListElement getNext()
    {
        return this.next;
    }

     public ListElement getPrevious()
     {
         return this.previous;
     }
     public void setNext(ListElement next)
     {
         this.next = next;
     }
     public void setPrevious(ListElement previous)
     {
         this.previous = previous;
     }
}