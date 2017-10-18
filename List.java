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
        ListElement temp = pointer;
        for(int i = 0; i < index; i++)
        {
            temp = pointer;
            pointer = pointer.getNext();
        }
        // if one element in list, or empty
        if (pointer == this.head && pointer == this.tail)
        {
            temp = pointer; 
                this.tail = null;
                this.head = null;
                pointer = null;
        }
        //if element is head, we need to update head
        else if(pointer == head)
        {
            temp = pointer; 
            this.head = this.head.getNext();
            pointer = null;
        }
        // if in body of list
        else if(pointer != tail)
        {
            pointer.getNext().setPrevious(temp);
            pointer.getPrevious().setNext(pointer.getNext());
            temp = pointer;    
            pointer = null;
           
        }
        // if tail of list
        else
        {
            temp = pointer; 
            pointer.getPrevious().setNext(null);
            this.tail = tail.getPrevious();
            
        }
        return temp;
    }


    public void printLinkedListFromHead()
    {
        if(this.head == null)
        return ;
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
        if(this.tail == null)
        return;
        
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
        newelement.setData(12);
        testlist.addElement(newelement);
        testlist.printLinkedListFromHead();
        testlist.printLinkedListFromTail();
    } 

}


