package com.amazon.alexa.ra.core.ui.markdown.parser.extensions;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.react.animated.InterpolationAnimatedNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.commonmark.parser.Parser;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/parser/extensions/SoftLineBreakExtension;", "Lorg/commonmark/parser/Parser$ParserExtension;", "<init>", "()V", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_EXTEND, "", "parserBuilder", "Lorg/commonmark/parser/Parser$Builder;", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SoftLineBreakExtension implements Parser.ParserExtension {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ SoftLineBreakExtension(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // org.commonmark.parser.Parser.ParserExtension
    public void extend(@NotNull Parser.Builder parserBuilder) {
        parserBuilder.getClass();
        parserBuilder.postProcessor(new SoftLineBreakPostProcessor());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/parser/extensions/SoftLineBreakExtension$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/ra/core/ui/markdown/parser/extensions/SoftLineBreakExtension;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SoftLineBreakExtension create() {
            return new SoftLineBreakExtension(null);
        }

        private Companion() {
        }
    }

    private SoftLineBreakExtension() {
    }
}
