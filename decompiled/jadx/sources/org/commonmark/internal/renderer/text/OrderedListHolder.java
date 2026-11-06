package org.commonmark.internal.renderer.text;

import org.commonmark.node.OrderedList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class OrderedListHolder extends ListHolder {
    private int counter;
    private final char delimiter;

    public OrderedListHolder(ListHolder listHolder, OrderedList orderedList) {
        super(listHolder);
        this.delimiter = orderedList.getDelimiter();
        this.counter = orderedList.getStartNumber();
    }

    public int getCounter() {
        return this.counter;
    }

    public char getDelimiter() {
        return this.delimiter;
    }

    public void increaseCounter() {
        this.counter++;
    }
}
