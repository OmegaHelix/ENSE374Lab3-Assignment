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

    public ListElement getElement(int index)
    {
        ListElement pointer = this.head;
        for(int i = 0; i < index; i++)
        {
            pointer = pointer.getNext();
        }
        return pointer;
    }

    public ListElement deleteElement(int index)
    {
        ListElement pointer = this.head;
        for(int i = 0; i < index; i++)
        {
            pointer = pointer.getNext();
        }
        ListElement last = pointer.getLast();
        ListElement next = pointer.getNext();
        last.setNext(next);
        next.setLast(last);
        ListElement temp = pointer;    
        pointer = null;
        return temp;
    }


}