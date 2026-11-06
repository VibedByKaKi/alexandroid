package org.commonmark.node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class OrderedList extends ListBlock {
    private char delimiter;
    private int startNumber;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public char getDelimiter() {
        return this.delimiter;
    }

    public int getStartNumber() {
        return this.startNumber;
    }

    public void setDelimiter(char c) {
        this.delimiter = c;
    }

    public void setStartNumber(int i) {
        this.startNumber = i;
    }
}
