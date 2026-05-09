package jp.nhiguchi.libs.tuple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void get1st() {
        var p = Pair.newPair("a", 1);
        assertEquals("a", p.get1st());
    }

    @Test
    void get2nd() {
        var p = Pair.newPair("a", 1);
        assertEquals(1, p.get2nd());
    }

    @Test
    void equalsSymmetric() {
        var p1 = Pair.newPair("x", 42);
        var p2 = Pair.newPair("x", 42);
        assertEquals(p1, p2);
        assertEquals(p2, p1);
    }

    @Test
    void equalsSelf() {
        var p = Pair.newPair("x", 42);
        assertEquals(p, p);
    }

    @Test
    void notEqualsDifferentFirst() {
        assertNotEquals(Pair.newPair("a", 1), Pair.newPair("b", 1));
    }

    @Test
    void notEqualsDifferentSecond() {
        assertNotEquals(Pair.newPair("a", 1), Pair.newPair("a", 2));
    }

    @Test
    void notEqualsNull() {
        assertNotEquals(Pair.newPair("a", 1), null);
    }

    @Test
    void notEqualsDifferentType() {
        assertNotEquals(Pair.newPair("a", 1), "not a pair");
    }

    @Test
    void hashCodeConsistent() {
        var p1 = Pair.newPair("x", 42);
        var p2 = Pair.newPair("x", 42);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    void hashCodeDiffersForUnequalPairs() {
        assertNotEquals(Pair.newPair("a", 1).hashCode(), Pair.newPair("b", 1).hashCode());
    }

    @Test
    void toStringFormat() {
        assertEquals("<hello, 7>", Pair.newPair("hello", 7).toString());
    }

    @Test
    void toStringWithNulls() {
        assertEquals("<null, null>", Pair.newPair(null, null).toString());
    }

    @Test
    void nullElements() {
        var p = Pair.newPair(null, null);
        assertNull(p.get1st());
        assertNull(p.get2nd());
        assertEquals(p, Pair.newPair(null, null));
    }
}
