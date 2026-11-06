package org.commonmark.node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LinkReferenceDefinition extends Node {
    private String destination;
    private String label;
    private String title;

    public LinkReferenceDefinition(String str, String str2, String str3) {
        this.label = str;
        this.destination = str2;
        this.title = str3;
    }

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getDestination() {
        return this.destination;
    }

    public String getLabel() {
        return this.label;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public LinkReferenceDefinition() {
    }
}
