

//currently identical to arraystack as a placeholder


public class LinkedStack<T> implements StackInterface<T>{
    private LLNode<T> head;

    public LinkedStack()
    {
        head = new LLNode<T>(null);
    }

    // returns the logical size of the stack
    public int size() 
    {
        if(head.getInfo()==null)
        {
            return 0;
        }
        LLNode<T> curNode = head;
        int size = 1;
        while(curNode.getLink()!=null)
        {
            size++;
            curNode=curNode.getLink();
        }
        return size;
    }
    
    // tests if this stack is empty
    public boolean empty() 
    { 
        return head.getInfo()==null;
    }
    
    // looks at the object at the top of this stack
    // without removing it from the stack
    public T peek() throws StackUnderflowException
    {
        if(head.getInfo()==null)
        {
            throw new StackUnderflowException("Stack has no values.");
        }
        return head.getInfo();
    }
    
    // removes the object at the top of this stack 
    // and returns that object as the value of this function
    public T pop() throws StackUnderflowException
    {
        if(head.getInfo()==null)
        {
            throw new StackUnderflowException("Stack has no values.");
        }
        T temp = head.getInfo();
        if(head.getLink()==null)
        {
            head.setInfo(null);
        }
        else
        {
            head = head.getLink();
        }
        return temp;
    }
    
    // pushes an item onto the top of this stack
    public T push(T item)
    {
        if(head.getInfo()==null)
        {
            head.setInfo(item);
        }
        else
        {
            LLNode<T> newHead = new LLNode<T>(item);
            newHead.setLink(head);
            head = newHead;

        }
        return item;
    }
        
    // removes all of the elements from this stack
    public void clear()
    {
        head.setInfo(null);
        head.setLink(null);
    }
    
    // returns the 1 based position where an object is on this stack
    // note: when the method ends, the stack is the same as it was at the start
    public int search(Object o)
    {
        LLNode<T> curNode = head;
        int position = 1;
        while(curNode.getLink()!=null)
        {
            if(curNode.getInfo().equals(o))
            {
                return position;
            }
            position++;
            curNode = curNode.getLink();
        }
        if(curNode.getInfo().equals(o))
        {
            return position;
        }
        return -1;
    }
}
