package org.commonmark.node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StrongEmphasis extends Node implements Delimited {
    private String delimiter;

    public StrongEmphasis(String str) {
        this.delimiter = str;
    }

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override // org.commonmark.node.Delimited
    public String getClosingDelimiter() {
        return this.delimiter;
    }

    @Override // org.commonmark.node.Delimited
    public String getOpeningDelimiter() {
        return this.delimiter;
    }

    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    public StrongEmphasis() {
    }
}
