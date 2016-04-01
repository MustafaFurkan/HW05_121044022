/**
 * The recursive list to remove all occurrences which is same with input
 * Created by Mustafa on 30.03.2016.
 */
public class LinkedListRec<E> {
    // Private variables
    private Node<E> head = new Node<E>(null);
    private int size = 0;

    /**
     * A node is the building block for linked list
     *
     * @param <T> Inner method variable
     */
    private static class Node<T> {
        private T data;
        private Node<T> next;

        /**
         * Constructer
         * @param dataItem Set head
         */
        Node(T dataItem) {
            data = dataItem;
            next = null;
        }

        /**
         * Creates a new node that references another node.
         *
         * @param dataItem The data stored
         * @param nodeRef  The node referenced by new code
         */
        private Node(T dataItem, Node<T> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    /**
     * Adds a new node to the end of a list
     *
     * @param head The head of the current list
     * @param data The data for the new node
     */
    private void add(Node<E> head, E data) {
        // If the list has just one element, add to it.
        if (head.data == null) {
            head.data = data;
        } else if (head.next == null) {
            head.next = new Node<E>(data);
        } else {
            add(head.next, data); // Add to rest of list.
        }
    }

    /**
     * Wrapper method for adding a new node to the end of a list.
     *
     * @param data The data for the new node
     */

    public void add(E data) {
        add(head, data);
    }

    public void removeAll(E outData) {
        remove(this.head, null, outData);
    }

    /**
     * Removes nodes from list
     * All occurrences of outData are removed
     *
     * @param thead   The head of the current list
     * @param pred    The predecessor of the list head
     * @param outData The data to be removed
     * @return true if the items are removed, otherwise false
     */
    public boolean remove(Node<E> thead, Node<E> pred, E outData) {
        // Base case
        // empty list
        if (thead == null) {
            return false;
        }
        // 2nd Base case
        // Remove head
        else if (thead.data.equals(outData)) {
            if (pred == null)
                head = thead.next;
            else
                pred.next = thead.next;
            thead = thead.next;
            --size;
            return true | remove(thead, pred, outData);
        } else {
            return (remove(thead.next, thead, outData));
        }
    }

    /**
     * Returns the string representation of a list
     *
     * @param head The head of the current list
     * @return The state of the current list
     */
    private String toString(Node<E> head) {
        if (head == null)
            return ("");
        else
            return (head.data + "\n" + toString(head.next));
    }

    /**
     * Wrapper method for returning the string representation of a list
     *
     * @return The string representation of the list
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<E> h = head;
        for (int i = 0; h != null; ++i) {
            str.append(i + 1);
            str.append(". Element: ");
            str.append(h.data);
            str.append("\n");
            h = h.next;
        }
        // Control empty list
        if(str.toString().isEmpty())
            return "List is empty!!!!";
        return (str.toString());
    }
}
