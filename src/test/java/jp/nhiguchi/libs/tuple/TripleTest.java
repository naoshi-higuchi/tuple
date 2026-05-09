package jp.nhiguchi.libs.tuple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleTest {

    @Test
    void get1st() {
        var t = Triple.newTriple("a", 1, true);
        assertEquals("a", t.get1st());
    }

    @Test
    void get2nd() {
        var t = Triple.newTriple("a", 1, true);
        assertEquals(1, t.get2nd());
    }

    @Test
    void get3rd() {
        var t = Triple.newTriple("a", 1, true);
        assertEquals(true, t.get3rd());
    }

    @Test
    void equalsSymmetric() {
        var t1 = Triple.newTriple("x", 42, 3.14);
        var t2 = Triple.newTriple("x", 42, 3.14);
        assertEquals(t1, t2);
        assertEquals(t2, t1);
    }

    @Test
    void equalsSelf() {
        var t = Triple.newTriple("x", 42, 3.14);
        assertEquals(t, t);
    }

    @Test
    void notEqualsDifferentFirst() {
        assertNotEquals(Triple.newTriple("a", 1, 2), Triple.newTriple("b", 1, 2));
    }

    @Test
    void notEqualsDifferentSecond() {
        assertNotEquals(Triple.newTriple("a", 1, 2), Triple.newTriple("a", 9, 2));
    }

    @Test
    void notEqualsDifferentThird() {
        assertNotEquals(Triple.newTriple("a", 1, 2), Triple.newTriple("a", 1, 9));
    }

    @Test
    void notEqualsNull() {
        assertNotEquals(Triple.newTriple("a", 1, 2), null);
    }

    @Test
    void notEqualsDifferentType() {
        assertNotEquals(Triple.newTriple("a", 1, 2), "not a triple");
    }

    @Test
    void hashCodeConsistent() {
        var t1 = Triple.newTriple("x", 42, 3.14);
        var t2 = Triple.newTriple("x", 42, 3.14);
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    void hashCodeDiffersForUnequalTriples() {
        assertNotEquals(Triple.newTriple("a", 1, 2).hashCode(), Triple.newTriple("b", 1, 2).hashCode());
    }

    @Test
    void toStringFormat() {
        assertEquals("<a, 1, true>", Triple.newTriple("a", 1, true).toString());
    }

    @Test
    void toStringWithNulls() {
        assertEquals("<null, null, null>", Triple.newTriple(null, null, null).toString());
    }

    @Test
    void nullElements() {
        var t = Triple.newTriple(null, null, null);
        assertNull(t.get1st());
        assertNull(t.get2nd());
        assertNull(t.get3rd());
        assertEquals(t, Triple.newTriple(null, null, null));
    }
}
