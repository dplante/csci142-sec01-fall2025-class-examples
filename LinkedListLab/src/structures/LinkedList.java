package structures;

/**
 *  A class to provide the basic methods of a singly linked list.
 *  Note that it is simplified in that it does not implement or extend
 *  List, Collection, etc.  It is for learning the basics of Linked
 *  Lists.
 *
 *  @author Daniel Plante
 *  @version 1.0   2 March 2002
 *  @version 1.1   19 November 2013
 */
public class LinkedList
{
    /////////////////////////////
    //         Properties      //
    /////////////////////////////
    private Node myHead;
    private int mySize;
    
    /////////////////////////////
    //         Methods         //
    /////////////////////////////
    
    /**
     *  Default constructor that creates an empty linked list
     *
     *  <pre>
     *  pre:  the linked list is empty
     *  post: the linked list is empty
     *  </pre>
     */
    public LinkedList()
    {
        myHead = null;
    }
    
    /**
     *  Constructor that creates a new linked list with a single 
     *  node storing the object passed in
     *
     *  <pre>
     *  pre:  myHead points to null (the linked list is empty)
     *  post: myHead points to the only node in the linked list,
     *        that node holding the object passed in
     *  </pre>
     *
     *  @param datum an object to be inserted at the head of the
     *         linked list
     */
    public LinkedList(Object datum)
    {
        myHead = new Node(datum);
        myHead.setNext(null);
    }
    
    /**
     *  Adds a node to the head of the linked list; the special
     *  condition of an empty linked list is handled without
     *  special treatment since if myHead points to null, that
     *  simply becomes the next node in the list, immediately
     *  following the new entered node at the head of the list
     *
     *  <pre>
     *  pre:  the linked list may be empty or contain one or
     *        more nodes
     *  post: the linked list contains one more node that has
     *        been added to the beginning of the list
     *  </pre>
     *
     *  @param node the node to be entered
     */
    private void addFirst(Node node)
    {
        node.setNext(myHead);
        myHead = node;
    }
    
    /**
     *  Adds a node to the head of the linked list; the special
     *  condition of an empty linked list is handled without
     *  special treatment since if myHead points to null, that
     *  simply becomes the next node in the list, immediately
     *  following the new entered node at the head of the list
     *
     *  <pre>
     *  pre:  the linked list may be empty or contain one or
     *        more nodes
     *  post: the linked list contains one more node that has
     *        been added to the beginning of the list
     *  </pre>
     *
     *  @param datum the object used to creat a new node to be 
     *         entered at the head of the list
     */
    public void addFirst(Object datum)
    {
        Node node;
        
        node = new Node(datum);
        this.addFirst(node);
    }
    
    /**
     *  Adds a node to the tail of the linked list; the special
     *  condition of an empty linked list is handled separately
     *
     *  <pre>
     *  pre:  the linked list may be empty or contain one or
     *        more nodes
     *  post: the linked list contains one more node that has
     *        been added to the end of the list
     *  </pre>
     *
     *  @param node the node to be entered
     */
    private void addLast(Node node)
    {
        Node lastNode;
        
        if(myHead==null)
        {
            this.addFirst(node);
        }
        else
        {
            lastNode = this.getPrevious(null);
            lastNode.setNext(node);
            node.setNext(null);
        }
    }
    
    /**
     *  Adds a node to the tail of the linked list; the special
     *  condition of an empty linked list is handled separately
     *
     *  <pre>
     *  pre:  the linked list may be empty or contain one or
     *        more nodes
     *  post: the linked list contains one more node that has
     *        been added to the end of the list
     *  </pre>
     *
     *  @param datum the object used to creat a new node to be 
     *         entered at the tail of the list
     */
    public void addLast(Object datum)
    {
        Node node;
        
        node = new Node(datum);
        this.addLast(node);
    }
    
    /**
     *  Deletes a node from the list if it is there
     *
     *  <pre>
     *  pre:  the list has 0 or more nodes
     *  post: if the node to be deleted is in the list,
     *        the node no longer exists in the list; the
     *        node previous to the node to be deleted now
     *        points to the node following the deleted node
     *  </pre>
     *
     *  @param node the node to be deleted from the list
     *
     *  @return boolean indicating whether or not the node
     *          was deleted
     */
    private boolean remove(Node node)
    {
        return false;
    }
    
    /**
     *  Deletes a node from the list if it is there
     *
     *  <pre>
     *  pre:  the list has 0 or more nodes
     *  post: if the node to be deleted is in the list,
     *        the node no longer exists in the list; the
     *        node previous to the node to be deleted now
     *        points to the node following the deleted node
     *  </pre>
     *
     *  @param datum the object to be deleted from the list
     *
     *  @return boolean indicating whether or not the node
     *          was deleted
     */
    public boolean remove(Object datum)
    {
        return false;
    }
    
    /**
     *  Find a node in the list with the same data as that passed in 
     *
     *  <pre>
     *  pre:  the list has 0 or more nodes
     *  post: list is unchanged
     *  </pre>
     *
     *  @param datum the object for which a node is to be found 
     *         in the list
     *
     *  @return null if a node with the given object datum is not in
     *          the list, or the node if it does
     */
    private Node findNode(Object datum)
    {
        Node currentNode;
        Object currentDatum;
        
        currentNode = myHead;
        currentDatum = null;
        
        while(currentNode != null)
        {
            currentDatum = currentNode.getData();
            if(currentDatum.equals(datum))
            {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
    
    /**
     *  Determine if a node exists in the list with the same 
     *  data as that passed in 
     *
     *  <pre>
     *  pre:  the list has 0 or more nodes
     *  post: list is unchanged
     *  </pre>
     *
     *  @param datum the object for which a node is to be found 
     *         in the list
     *
     *  @return false if a node with the given object datum is not in
     *          the list, or true if it does
     */
    public boolean contains(Object datum)
    {
        return false;
    }
    
    /**
     *  Determines the node that resides one closer to the
     *  head of the list than the node passed in
     *
     *  <pre>
     *  pre:  the list has 0 or more nodes
     *  post: the list is unchanged
     *  </pre>
     *
     *  @param node the node whose predecessor is being looked for
     *
     *  @return the node that resides one closer to the head of the
     *          list than the node passed in
     */
    private Node getPrevious(Node node)
    {
        Node currentNode;
        
        currentNode = myHead;
        
        if(currentNode == null)
        {
        	return null;
        }
        
        if(currentNode.equals(node))
        {
            return null;
        }
        
        while(currentNode!=null && currentNode.getNext() != node)
        {
            currentNode = currentNode.getNext();
        }
        
        return currentNode;
    }
    
    /**
     *  A new node is entered into the list immediately before
     *  the designated node
     *
     *  <pre>
     *  pre:  the list may have 0 or more nodes in it
     *  post: if the beforeNode is not in the list, no change
     *        takes place to the list; otherwise, the new
     *        node is entered in the appropriate place
     *  </pre>
     *
     *  @param node the node to be entered into the list
     *  @param beforeNode the node before which the new node
     *         is to be entered
     *
     *  @return boolean designating if the node was or was not
     *          entered into list
     */
    private boolean insertBefore(Node node, Node beforeNode)
    {
        return false;
    }
    
    /**
     *  A new node with datum is entered into the list immediately
     *  before the node with beforeDatum, the designated node
     *
     *  <pre>
     *  pre:  the list may have 0 or more nodes in it
     *  post: if the node with beforeDatum is not in the list, 
     *        no change takes place to the list; otherwise, a new
     *        node is entered in the appropriate place with the 
     *        object datum
     *  </pre>
     *
     *  @param datum the object used to create the new node 
     *         to be entered into the list
     *  @param beforeDatum the datum of the node before which the 
     *         new node is to be entered
     *
     *  @return boolean designating if the node was or was not
     *          entered
     */
    public boolean insertBefore(Object datum, Object beforeDatum)
    {
        return false;
    }
    
    /**
     *  print the list by converting the objects in the list
     *  to their string representations
     *
     *  <pre>
     *  pre:  the list has 0 or more elements
     *  post: no change to the list
     *  </pre>
     */
    public String toString()
    {
        String string;
        Node currentNode;
        
        currentNode = myHead;
        
        string = "head ->";
        
        while(currentNode!=null)
        {
            string += currentNode.getData().toString()+ " -> ";
            currentNode = currentNode.getNext();
        }
        string += "|||";
        return string;
    }

    // ALSO!  Comment and implement the following methods.
    // !!!

    public int indexOf(Object o)
    {
        return 0;
    }

    public Object removeFirst()
    {
        return null;
    }
    
    public Object removeLast()
    {
        return null;
    }

    public int size()
    {
        return 0;
    }

    public Object getFirst()
    {
        return null;
    }
    
    public Object getLast()
    {
        return null;
    }

    public void setFirst(Object o)
    {
    }
    
    private void setHead(Node node)
    {
        myHead = node;
    }
    
    private Node getHead()
    {
        return myHead;
    }
}
