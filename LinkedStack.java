

//currently identical to arraystack as a placeholder


public class LinkedStack<T> implements StackInterface<T>{
    private T[] stack = (T[])new Object[1];

    // returns the logical size of the stack
    public int size() { return stack.length; }
    
    // tests if this stack is empty
    public boolean empty() 
    { 
        for(Object i : stack)
        {
            if(i!=null)
            {
                return false;
                
            }
        }
        return true;
    }
    
    // looks at the object at the top of this stack
    // without removing it from the stack
    public T peek() throws StackUnderflowException
    {
        return stack[stack.length-1];
    }
    
    // removes the object at the top of this stack 
    // and returns that object as the value of this function
    public T pop() throws StackUnderflowException
    {
        T temp = stack[stack.length-1];
        stack[stack.length-1]=null;
        return temp;
    }
    
    // pushes an item onto the top of this stack
    public T push(T item)
    {
        if(stack[stack.length-1]==null)
        {
            stack[stack.length-1] = item;
        }
        else
        {
            T[] temp = (T[])new Object[stack.length+1];
            for(int i = 0; i < stack.length; i++)
            {
                temp[i] = stack[i];
            }
            temp[stack.length]=item;
            stack = temp;
        }
        return item;
    }
        
    // removes all of the elements from this stack
    public void clear()
    {
        stack = (T[])new Object[1];
    }
    
    // returns the 1 based position where an object is on this stack
    // note: when the method ends, the stack is the same as it was at the start
    public int search(Object o)
    {
        for(int i = 0; i < stack.length; i++)
        {
            if(stack[i].equals(o))
            {
                return i;
            }
        }
        return -1;
    }
}
