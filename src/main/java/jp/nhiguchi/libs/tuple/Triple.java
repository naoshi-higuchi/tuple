package jp.nhiguchi.libs.tuple;

import java.util.Objects;

/**
 *
 * @author Naoshi Higuchi
 */
public final class Triple<E1, E2, E3> {
	private final E1 fElem1;
	private final E2 fElem2;
	private final E3 fElem3;

	private Triple(E1 elem1, E2 elem2, E3 elem3) {
		fElem1 = elem1;
		fElem2 = elem2;
		fElem3 = elem3;
	}

	public static <E1, E2, E3> Triple<E1, E2, E3> newTriple(E1 elem1, E2 elem2, E3 elem3) {
		return new Triple<>(elem1, elem2, elem3);
	}

	public E1 get1st() {
		return fElem1;
	}

	public E2 get2nd() {
		return fElem2;
	}

	public E3 get3rd() {
		return fElem3;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (!(obj instanceof Triple<?, ?, ?> rhs)) return false;

		return Objects.equals(fElem1, rhs.fElem1)
				&& Objects.equals(fElem2, rhs.fElem2)
				&& Objects.equals(fElem3, rhs.fElem3);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fElem1, fElem2, fElem3);
	}

	@Override
	public String toString() {
		return String.format("<%s, %s, %s>", fElem1, fElem2, fElem3);
	}
}
