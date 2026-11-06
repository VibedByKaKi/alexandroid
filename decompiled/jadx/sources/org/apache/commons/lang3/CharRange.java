package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class CharRange implements Iterable<Character>, Serializable {
    static final CharRange[] EMPTY_ARRAY = new CharRange[0];
    private static final long serialVersionUID = 8270183163158333422L;
    private final char end;
    private transient String iToString;
    private final boolean negated;
    private final char start;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CharacterIterator implements Iterator<Character> {
        private char current;
        private boolean hasNext;
        private final CharRange range;

        private CharacterIterator(CharRange charRange) {
            this.range = charRange;
            this.hasNext = true;
            if (!charRange.negated) {
                this.current = charRange.start;
                return;
            }
            if (charRange.start != 0) {
                this.current = (char) 0;
            } else if (charRange.end == 65535) {
                this.hasNext = false;
            } else {
                this.current = (char) (charRange.end + 1);
            }
        }

        private void prepareNext() {
            boolean z = this.range.negated;
            char c = this.current;
            if (!z) {
                if (c < this.range.end) {
                    this.current = (char) (this.current + 1);
                    return;
                } else {
                    this.hasNext = false;
                    return;
                }
            }
            if (c == 65535) {
                this.hasNext = false;
                return;
            }
            if (c + 1 != this.range.start) {
                this.current = (char) (this.current + 1);
            } else if (this.range.end == 65535) {
                this.hasNext = false;
            } else {
                this.current = (char) (this.range.end + 1);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Character next() {
            if (!this.hasNext) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            char c = this.current;
            prepareNext();
            return Character.valueOf(c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private CharRange(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.start = c;
        this.end = c2;
        this.negated = z;
    }

    public static CharRange is(char c) {
        return new CharRange(c, c, false);
    }

    public static CharRange isIn(char c, char c2) {
        return new CharRange(c, c2, false);
    }

    public static CharRange isNot(char c) {
        return new CharRange(c, c, true);
    }

    public static CharRange isNotIn(char c, char c2) {
        return new CharRange(c, c2, true);
    }

    public boolean contains(CharRange charRange) {
        Objects.requireNonNull(charRange, "range");
        boolean z = this.negated;
        boolean z2 = charRange.negated;
        if (z) {
            return z2 ? this.start >= charRange.start && this.end <= charRange.end : charRange.end < this.start || charRange.start > this.end;
        }
        char c = this.start;
        return z2 ? c == 0 && this.end == 65535 : c <= charRange.start && this.end >= charRange.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharRange)) {
            return false;
        }
        CharRange charRange = (CharRange) obj;
        return this.start == charRange.start && this.end == charRange.end && this.negated == charRange.negated;
    }

    public char getEnd() {
        return this.end;
    }

    public char getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.end * 7) + this.start + 'S' + (this.negated ? 1 : 0);
    }

    public boolean isNegated() {
        return this.negated;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new CharacterIterator();
    }

    public String toString() {
        if (this.iToString == null) {
            StringBuilder sb = new StringBuilder(4);
            if (isNegated()) {
                sb.append('^');
            }
            sb.append(this.start);
            if (this.start != this.end) {
                sb.append('-');
                sb.append(this.end);
            }
            this.iToString = sb.toString();
        }
        return this.iToString;
    }

    public boolean contains(char c) {
        return (c >= this.start && c <= this.end) != this.negated;
    }
}
