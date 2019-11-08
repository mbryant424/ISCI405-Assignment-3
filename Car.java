package Assignment3;

import java.util.LinkedHashSet;

/**
 * Each {@code Car} instance maintains information about a {@code Car}.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * @param <E>
 */
public class Car<E> {

	/**
	 * The plate number of this {@code Car}.
	 */
	protected String plateNumber;

	/**
	 * Constructs a {@code Car} instance.
	 * 
	 * @param plateNumber
	 *            the plate number of the {@code Car}.
	 */
	public Car(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	/**
	 * Returns a string representation of this {@code Car}.
	 * 
	 * @return a string representation of this {@code Car}.
	 */
	public String toString() {
		return getClass().getSimpleName() + "(" + plateNumber + ")";
	}
	
	/**
	 * Returns a integer representation of a string value {@code Car}.
	 * 
	 * @return an integer {@code Car}.
	 */
	@Override
	public int hashCode() {
		return plateNumber.hashCode();
		}
	
	/**
	 * Returns a boolean expression whether if types are equal {@code Car}.
	 * 
	 * @return true if plate number and exterior color are equal, otherwise false {@code Car}.
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car e = (Car) obj;
			return (e.plateNumber.equals(this.plateNumber));
		}
		return false;
		}
	
	/**
	 * The main method.
	 * 
	 * @param args
	 *            the program arguments.
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// Problem 6
		LinkedHashSet<Car> s = new LinkedHashSet<Car>();
		s.add(new Car("1"));
		s.add(new Car("2"));
		s.add(new Car("1"));
        System.out.println(s);
		
	}

}
