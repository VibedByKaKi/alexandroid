package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.googlejavaformat.Doc;
import com.google.googlejavaformat.Indent;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class DocBuilder {
    private Doc.Level appendLevel;
    private final Doc.Level base;
    private final ArrayDeque<Doc.Level> stack;

    public DocBuilder() {
        Doc.Level make = Doc.Level.make(Indent.Const.ZERO);
        this.base = make;
        ArrayDeque<Doc.Level> arrayDeque = new ArrayDeque<>();
        this.stack = arrayDeque;
        this.appendLevel = make;
        arrayDeque.addLast(make);
    }

    public void add(Doc doc) {
        this.appendLevel.add(doc);
    }

    public void breakDoc(Doc.Break r2) {
        Doc.Level peekLast = this.stack.peekLast();
        this.appendLevel = peekLast;
        peekLast.add(r2);
    }

    public Doc build() {
        return this.base;
    }

    public void close() {
        this.stack.peekLast().add(this.stack.removeLast());
    }

    public void open(Indent indent) {
        this.stack.addLast(Doc.Level.make(indent));
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("base", this.base).add("stack", this.stack).add("appendLevel", this.appendLevel).toString();
    }

    public DocBuilder withOps(List<Op> list) {
        Iterator<Op> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().add(this);
        }
        return this;
    }
}
