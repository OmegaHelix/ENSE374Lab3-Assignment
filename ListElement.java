
public class ListElement
{
    private ListElement next;
    private int data;


    public ListElement()
    {
        this.data = 0;
        this.next = null;
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


     public void setNext(ListElement next)
     {
         this.next = next;
     }
}