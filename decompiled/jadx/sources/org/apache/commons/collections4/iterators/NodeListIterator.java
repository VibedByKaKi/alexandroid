package org.apache.commons.collections4.iterators;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class NodeListIterator implements Iterator<Node> {
    private int index = 0;
    private final NodeList nodeList;

    public NodeListIterator(Node node) {
        if (node != null) {
            this.nodeList = node.getChildNodes();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Node must not be null.");
            throw null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        NodeList nodeList = this.nodeList;
        return nodeList != null && this.index < nodeList.getLength();
    }

    @Override // java.util.Iterator
    public Node next() {
        NodeList nodeList = this.nodeList;
        if (nodeList == null || this.index >= nodeList.getLength()) {
            PathKt$$ExternalSyntheticBUOutline0.m("underlying nodeList has no more elements");
            return null;
        }
        NodeList nodeList2 = this.nodeList;
        int i = this.index;
        this.index = i + 1;
        return nodeList2.item(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method not supported for a NodeListIterator.");
    }

    public NodeListIterator(NodeList nodeList) {
        if (nodeList != null) {
            this.nodeList = nodeList;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("NodeList must not be null.");
            throw null;
        }
    }
}
