package io.noties.markwon.core.factory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderProps;
import io.noties.markwon.SpanFactory;
import io.noties.markwon.core.spans.ThematicBreakSpan;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ThematicBreakSpanFactory implements SpanFactory {
    @Override // io.noties.markwon.SpanFactory
    @Nullable
    public Object getSpans(@NonNull MarkwonConfiguration markwonConfiguration, @NonNull RenderProps renderProps) {
        return new ThematicBreakSpan(markwonConfiguration.theme());
    }
}
