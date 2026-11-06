package io.noties.markwon;

import androidx.annotation.NonNull;
import io.noties.markwon.MarkwonVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class MarkwonVisitorFactory {
    @NonNull
    public static MarkwonVisitorFactory create(@NonNull final MarkwonVisitor.Builder builder, @NonNull final MarkwonConfiguration markwonConfiguration) {
        return new MarkwonVisitorFactory() { // from class: io.noties.markwon.MarkwonVisitorFactory.1
            @Override // io.noties.markwon.MarkwonVisitorFactory
            @NonNull
            public MarkwonVisitor create() {
                return MarkwonVisitor.Builder.this.build(markwonConfiguration, new RenderPropsImpl());
            }
        };
    }

    @NonNull
    public abstract MarkwonVisitor create();
}
