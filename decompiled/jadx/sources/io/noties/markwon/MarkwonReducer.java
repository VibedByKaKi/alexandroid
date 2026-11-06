package io.noties.markwon;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class MarkwonReducer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DirectChildren extends MarkwonReducer {
        @Override // io.noties.markwon.MarkwonReducer
        @NonNull
        public List<Node> reduce(@NonNull Node node) {
            Node firstChild = node.getFirstChild();
            if (firstChild == null) {
                return Collections.singletonList(node);
            }
            ArrayList arrayList = new ArrayList();
            while (firstChild != null) {
                if (!(firstChild instanceof LinkReferenceDefinition)) {
                    arrayList.add(firstChild);
                }
                Node next = firstChild.getNext();
                firstChild.unlink();
                firstChild = next;
            }
            return arrayList;
        }
    }

    @NonNull
    public static MarkwonReducer directChildren() {
        return new DirectChildren();
    }

    @NonNull
    public abstract List<Node> reduce(@NonNull Node node);
}
