import ListElement.java;

public class List
{
    private ListElement head;
    private ListElement tail;


    public List()
    {
        this.head = null;
        this.tail = null;
    
    }

    public void addElement(ListElement le)
    {
        this.tail.setNext(le);
        this.tail = this.tail.getNext();
    }

    

}