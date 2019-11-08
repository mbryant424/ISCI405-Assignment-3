package Assignment3;

import java.util.Iterator;

/**
 * The {@code List} class provides methods supported by lists.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu).
 * @param <E>
 *            the type of elements held in the list.
 */
public abstract class List<E> implements Iterable<E> {

	/**
	 * The size of this {@code List}.
	 */
	protected int size = 0;

	/**
	 * Returns the size of this {@code List}.
	 * 
	 * @return size of this {@code List}.
	 */
	public int size() {
		return size;
	}

	/**
	 * Inserts the specified element at the beginning of this {@code List}.
	 * 
	 * @param e
	 *            the element to insert.
	 */
	abstract void addFirst(E e);

	@Override
	abstract public Iterator<E> iterator();

	/**
	 * Determines whether or not the given element is contained in this {@code List}.
	 * 
	 * @param e
	 *            the element to compare with the elements in this {@code List}.
	 * @return {@code true} if the given element is contained in this {@code List}; {@code false} otherwise.
	 */
	public boolean contains(E e) {
		for (E element : this) {
			if (element.equals(e))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Problem 2
		String answer = "(";
		int count = 1;
		for (E element : this) {
			if (count != size) {
				answer = answer + element + ", ";
			}
			else {
				answer = answer + element;
			}
			count++;
		}
		return answer + ")";
	}

}

