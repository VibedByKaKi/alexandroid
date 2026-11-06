package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.commonmark.node.Node;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface MarkwonSpansFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Builder {
        @NonNull
        @Deprecated
        <N extends Node> Builder addFactory(@NonNull Class<N> cls, @NonNull SpanFactory spanFactory);

        @NonNull
        <N extends Node> Builder appendFactory(@NonNull Class<N> cls, @NonNull SpanFactory spanFactory);

        @NonNull
        MarkwonSpansFactory build();

        @Nullable
        <N extends Node> SpanFactory getFactory(@NonNull Class<N> cls);

        @NonNull
        <N extends Node> Builder prependFactory(@NonNull Class<N> cls, @NonNull SpanFactory spanFactory);

        @NonNull
        <N extends Node> SpanFactory requireFactory(@NonNull Class<N> cls);

        @NonNull
        <N extends Node> Builder setFactory(@NonNull Class<N> cls, @Nullable SpanFactory spanFactory);
    }

    @Nullable
    <N extends Node> SpanFactory get(@NonNull Class<N> cls);

    @NonNull
    <N extends Node> SpanFactory require(@NonNull Class<N> cls);
}
