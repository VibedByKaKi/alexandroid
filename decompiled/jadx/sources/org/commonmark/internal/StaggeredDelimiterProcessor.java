package org.commonmark.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class StaggeredDelimiterProcessor implements DelimiterProcessor {
    private final char delim;
    private int minLength = 0;
    private LinkedList<DelimiterProcessor> processors = new LinkedList<>();

    public StaggeredDelimiterProcessor(char c) {
        this.delim = c;
    }

    private DelimiterProcessor findProcessor(int i) {
        Iterator<DelimiterProcessor> it2 = this.processors.iterator();
        while (it2.hasNext()) {
            DelimiterProcessor next = it2.next();
            if (next.getMinLength() <= i) {
                return next;
            }
        }
        return this.processors.getFirst();
    }

    public void add(DelimiterProcessor delimiterProcessor) {
        int minLength = delimiterProcessor.getMinLength();
        ListIterator<DelimiterProcessor> listIterator = this.processors.listIterator();
        while (listIterator.hasNext()) {
            DelimiterProcessor next = listIterator.next();
            int minLength2 = next.getMinLength();
            if (minLength > minLength2) {
                listIterator.previous();
                listIterator.add(delimiterProcessor);
                return;
            } else if (minLength == minLength2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.delim + "' and minimum length " + minLength + "; conflicting processors: " + next + ", " + delimiterProcessor);
            }
        }
        this.processors.add(delimiterProcessor);
        this.minLength = minLength;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public char getClosingCharacter() {
        return this.delim;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public int getMinLength() {
        return this.minLength;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public char getOpeningCharacter() {
        return this.delim;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public int process(DelimiterRun delimiterRun, DelimiterRun delimiterRun2) {
        return findProcessor(delimiterRun.length()).process(delimiterRun, delimiterRun2);
    }
}
