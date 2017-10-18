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
        le.setPrevious(this.tail);
        le.setNext(null);
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
        for(int i = 0; i < index; i++)
        {
            pointer = pointer.getNext();
        }
        ListElement last = pointer.getPrevious();
        ListElement next = pointer.getNext();
        last.setNext(next);
        next.setPrevious(last);
        ListElement temp = pointer;    
        pointer = null;
        return temp;
    }

    public void printLinkedListFromHead()
    {
       ListElement pointer = this.head;
       String list = new String();
        while(pointer != this.tail)
        {
            list +=  pointer.getData() + ", " ;   
            pointer = pointer.getNext();
        }
        //accomodates the tail
        list +=  pointer.getData() + ", " ;    
        System.out.print(list);
    }
    public void printLinkedListFromTail()
    {
       ListElement pointer = this.tail;
       String list = new String();
        while(pointer != this.head)
        {
            list +=  pointer.getData() + ", " ;   
            pointer = pointer.getPrevious();
        }
        //accomodates the head
        list +=  pointer.getData() + ", " ;    
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
        newelement.setData(5);
        testlist.addElement(newelement);
        testlist.deleteElement(0);
        testlist.printLinkedListFromHead();
    } 

}


