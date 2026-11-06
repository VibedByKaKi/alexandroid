package org.commonmark.node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Link extends Node {
    private String destination;
    private String title;

    public Link(String str, String str2) {
        this.destination = str;
        this.title = str2;
    }

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getDestination() {
        return this.destination;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // org.commonmark.node.Node
    public String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }

    public Link() {
    }
}
