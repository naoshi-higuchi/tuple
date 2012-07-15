package jp.nhiguchi.libs.tuple;

import java.util.Objects;

/**
 *
 * @author Naoshi Higuchi
 */
public final class Pair<E1, E2>
{
	private final E1 fElem1;
	private final E2 fElem2;

	private Pair(E1 elem1, E2 elem2)
	{
		fElem1 = elem1;
		fElem2 = elem2;
	}

	public static <E1, E2> Pair newPair(E1 elem1, E2 elem2)
	{
		return new Pair(elem1, elem2);
	}

	public E1 get1st()
	{
		return fElem1;
	}

	public E2 get2nd()
	{
		return fElem2;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		if (obj == this) return true;
		if (!(obj instanceof Pair)) return false;

		Pair rhs = (Pair)obj;
		
		return Objects.equals(fElem1, rhs.fElem1) &&
				Objects.equals(fElem2, rhs.fElem2);
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(fElem1) + Objects.hashCode(fElem2);
	}

	@Override
	public String toString()
	{
		return String.format("<%s, %s>", fElem1, fElem2);
	}
}
