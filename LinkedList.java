package Assignment3;

import java.util.Iterator;

/**
 * A {@code LinkedList} represents a list using a linked list.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * @param <E>
 *            the type of elements held in the list.
 */
public class LinkedList<E> extends List<E> {

	/**
	 * The {@code Node} class implements nodes used in linked lists.
	 * 
	 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
	 */
	protected class Node {

		/**
		 * The element held in this {@code Node}.
		 */
		public E element;

		/**
		 * A reference to the next {@code Node}.
		 */
		public Node next;

		/**
		 * Constructs a {@code Node}.
		 * 
		 * @param element
		 *            the element held in the {@code Node}.
		 * @param next
		 *            the next {@code Node} in the {@code LinkedList}.
		 */
		Node(E element, Node next) {
			this.element = element;
			this.next = next;
		}
	}

	/**
	 * A reference to the first element in this {@code Node}.
	 */
	protected Node start = null;

	@Override
	public void addFirst(E e) {
		// TODO Problem 1
		start = new Node(e, start);
		size++;
	}

	@Override
	public Iterator<E> iterator() {
		return new java.util.Iterator<E>() {

			/**
			 * The next {@code Node} to visit.
			 */
			protected Node current = start;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public E next() {
				E element = current.element;
				current = current.next;
				return element;
			}

		};
	}

	/**
	 * Reverses this {@code LinkedList}.
	 */
	public void reverse() {
		Node current = start; 
		Node tail = null; 
        Node head = null; 
        while (current != null) { 
            head = current.next; 
            current.next = tail; 
            tail = current; 
            current = head; 
        } 
        start = tail; 
	}
		
		// TODO Problem 3
		

}

