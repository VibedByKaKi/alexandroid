package org.commonmark.internal.inline;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import org.commonmark.internal.util.CharMatcher;
import org.commonmark.node.SourceSpan;
import org.commonmark.parser.SourceLine;
import org.commonmark.parser.SourceLines;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Scanner {
    public static final char END = 0;
    private int index;
    private int lineIndex;
    private final List<SourceLine> lines;
    private SourceLine line = SourceLine.of("", null);
    private int lineLength = 0;

    public Scanner(List<SourceLine> list, int i, int i2) {
        this.lines = list;
        this.lineIndex = i;
        this.index = i2;
        if (list.isEmpty()) {
            return;
        }
        checkPosition(i, i2);
        setLine(list.get(i));
    }

    private void checkPosition(int i, int i2) {
        if (i < 0 || i >= this.lines.size()) {
            Single$$ExternalSyntheticBUOutline0.m(this.lines.size(), a$$ExternalSyntheticOutline0.m0m(i, "Line index ", " out of range, number of lines: "));
            return;
        }
        SourceLine sourceLine = this.lines.get(i);
        if (i2 < 0 || i2 > sourceLine.getContent().length()) {
            Single$$ExternalSyntheticBUOutline0.m(sourceLine.getContent().length(), a$$ExternalSyntheticOutline0.m0m(i2, "Index ", " out of range, line length: "));
        }
    }

    public static Scanner of(SourceLines sourceLines) {
        return new Scanner(sourceLines.getLines(), 0, 0);
    }

    private void setLine(SourceLine sourceLine) {
        this.line = sourceLine;
        this.lineLength = sourceLine.getContent().length();
    }

    public int find(CharMatcher charMatcher) {
        int i = 0;
        while (true) {
            char peek = peek();
            if (peek == 0) {
                return -1;
            }
            if (charMatcher.matches(peek)) {
                return i;
            }
            i++;
            next();
        }
    }

    public SourceLines getSource(Position position, Position position2) {
        int i = position.lineIndex;
        if (i == position2.lineIndex) {
            SourceLine sourceLine = this.lines.get(i);
            CharSequence subSequence = sourceLine.getContent().subSequence(position.index, position2.index);
            SourceSpan sourceSpan = sourceLine.getSourceSpan();
            return SourceLines.of(SourceLine.of(subSequence, sourceSpan != null ? SourceSpan.of(sourceSpan.getLineIndex(), sourceSpan.getColumnIndex() + position.index, subSequence.length()) : null));
        }
        SourceLines empty = SourceLines.empty();
        SourceLine sourceLine2 = this.lines.get(position.lineIndex);
        empty.addLine(sourceLine2.substring(position.index, sourceLine2.getContent().length()));
        int i2 = position.lineIndex;
        while (true) {
            i2++;
            int i3 = position2.lineIndex;
            List<SourceLine> list = this.lines;
            if (i2 >= i3) {
                empty.addLine(list.get(i3).substring(0, position2.index));
                return empty;
            }
            empty.addLine(list.get(i2));
        }
    }

    public boolean hasNext() {
        return this.index < this.lineLength || this.lineIndex < this.lines.size() - 1;
    }

    public int match(CharMatcher charMatcher) {
        int i = 0;
        while (charMatcher.matches(peek())) {
            i++;
            next();
        }
        return i;
    }

    public int matchMultiple(char c) {
        int i = 0;
        while (peek() == c) {
            i++;
            next();
        }
        return i;
    }

    public boolean next(String str) {
        int i = this.index;
        if (i >= this.lineLength || str.length() + i > this.lineLength) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (this.line.getContent().charAt(this.index + i2) != str.charAt(i2)) {
                return false;
            }
        }
        this.index = str.length() + this.index;
        return true;
    }

    public char peek() {
        return this.index < this.lineLength ? this.line.getContent().charAt(this.index) : this.lineIndex < this.lines.size() + (-1) ? '\n' : (char) 0;
    }

    public int peekCodePoint() {
        if (this.index >= this.lineLength) {
            return this.lineIndex < this.lines.size() + (-1) ? 10 : 0;
        }
        char charAt = this.line.getContent().charAt(this.index);
        if (Character.isHighSurrogate(charAt) && this.index + 1 < this.lineLength) {
            char charAt2 = this.line.getContent().charAt(this.index + 1);
            if (Character.isLowSurrogate(charAt2)) {
                return Character.toCodePoint(charAt, charAt2);
            }
        }
        return charAt;
    }

    public int peekPreviousCodePoint() {
        int i = this.index;
        if (i <= 0) {
            return this.lineIndex > 0 ? 10 : 0;
        }
        int i2 = i - 1;
        char charAt = this.line.getContent().charAt(i2);
        if (Character.isLowSurrogate(charAt) && i2 > 0) {
            char charAt2 = this.line.getContent().charAt(i - 2);
            if (Character.isHighSurrogate(charAt2)) {
                return Character.toCodePoint(charAt2, charAt);
            }
        }
        return charAt;
    }

    public Position position() {
        return new Position(this.lineIndex, this.index);
    }

    public void setPosition(Position position) {
        checkPosition(position.lineIndex, position.index);
        int i = position.lineIndex;
        this.lineIndex = i;
        this.index = position.index;
        setLine(this.lines.get(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int whitespace() {
        /*
            r3 = this;
            r0 = 0
        L1:
            char r1 = r3.peek()
            r2 = 32
            if (r1 == r2) goto Ld
            switch(r1) {
                case 9: goto Ld;
                case 10: goto Ld;
                case 11: goto Ld;
                case 12: goto Ld;
                case 13: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r0
        Ld:
            int r0 = r0 + 1
            r3.next()
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.inline.Scanner.whitespace():int");
    }

    public int find(char c) {
        int i = 0;
        while (true) {
            char peek = peek();
            if (peek == 0) {
                return -1;
            }
            if (peek == c) {
                return i;
            }
            i++;
            next();
        }
    }

    public boolean next(char c) {
        if (peek() != c) {
            return false;
        }
        next();
        return true;
    }

    public void next() {
        int i = this.index + 1;
        this.index = i;
        if (i > this.lineLength) {
            int i2 = this.lineIndex + 1;
            this.lineIndex = i2;
            if (i2 < this.lines.size()) {
                setLine(this.lines.get(this.lineIndex));
            } else {
                setLine(SourceLine.of("", null));
            }
            this.index = 0;
        }
    }
}
