package org.commonmark.node;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Nodes {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NodeIterable implements Iterable<Node> {
        private final Node end;
        private final Node first;

        private NodeIterable(Node node, Node node2) {
            this.first = node;
            this.end = node2;
        }

        @Override // java.lang.Iterable
        public Iterator<Node> iterator() {
            return new NodeIterator(this.first, this.end);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NodeIterator implements Iterator<Node> {
        private final Node end;
        private Node node;

        private NodeIterator(Node node, Node node2) {
            this.node = node;
            this.end = node2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Node node = this.node;
            return (node == null || node == this.end) ? false : true;
        }

        @Override // java.util.Iterator
        public Node next() {
            Node node = this.node;
            this.node = node.getNext();
            return node;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(BulkOperationType.remove);
        }
    }

    private Nodes() {
    }

    public static Iterable<Node> between(Node node, Node node2) {
        return new NodeIterable(node.getNext(), node2);
    }
}
