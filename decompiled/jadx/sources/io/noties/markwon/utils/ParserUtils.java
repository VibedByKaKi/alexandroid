package io.noties.markwon.utils;

import androidx.annotation.NonNull;
import org.commonmark.node.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class ParserUtils {
    private ParserUtils() {
    }

    public static void moveChildren(@NonNull Node node, @NonNull Node node2) {
        Node next = node2.getNext();
        while (next != null) {
            Node next2 = next.getNext();
            node.appendChild(next);
            next = next2;
        }
    }
}
