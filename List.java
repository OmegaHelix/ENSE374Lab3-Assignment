import java.util.*;

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
        if(this.head == null)
        {
            this.head = le;
            this.tail = this.head;
        }
        else 
        {
            this.tail.setNext(le);
            this.tail = le;
        }

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
        ListElement temp = pointer;
        for(int i = 0; i < index; i++)
        {
            temp = pointer;
            pointer = pointer.getNext();
        }
        if (pointer == this.head && pointer == this.tail)
        {
                this.tail = null;
                this.head = null;
                pointer = null;
        }
        else if(pointer == head)
        {
            this.head = this.head.getNext();
            pointer = null;
        }
        else
        {
            temp.setNext(pointer.getNext());
            temp = pointer;    
            pointer = null;
           
        }
        return temp;
    }

    public void printLinkedListFromHead()
    {
        if(this.head == null)
        return;
       ListElement pointer = this.head;
       String list = new String();
        while(pointer != tail)
        {
            list +=  pointer.getData() + ", " ;   
            pointer = pointer.getNext();
        }
        //accomodates the tail
        list += pointer.getData() + ", ";   
        System.out.print(list);
    }

    public ListElement getHead()
    {
        return this.head;
    }

    public ListElement getTail()
    {
        return this.tail;
    }

    public static void main(String [ ] args)
    {
        List testlist = new List();
        ListElement newelement = new ListElement();
        ListElement element2 = new ListElement();
        newelement.setData(5);
        testlist.addElement(newelement);
        testlist.deleteElement(0);
        newelement.setData(8);
        testlist.addElement(newelement);
        element2.setData(12);
        testlist.addElement(element2);
        testlist.printLinkedListFromHead();
    } 

}


