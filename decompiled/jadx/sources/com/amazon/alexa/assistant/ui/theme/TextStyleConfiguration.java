package com.amazon.alexa.assistant.ui.theme;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/ui/theme/TextStyleConfiguration;", "", "fontSize", "", ViewProps.LINE_HEIGHT, "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getFontSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLineHeight", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/amazon/alexa/assistant/ui/theme/TextStyleConfiguration;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TextStyleConfiguration {
    public static final int $stable = 0;

    @Nullable
    private final Float fontSize;

    @Nullable
    private final Float lineHeight;

    public /* synthetic */ TextStyleConfiguration(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }

    public static /* synthetic */ TextStyleConfiguration copy$default(TextStyleConfiguration textStyleConfiguration, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = textStyleConfiguration.fontSize;
        }
        if ((i & 2) != 0) {
            f2 = textStyleConfiguration.lineHeight;
        }
        return textStyleConfiguration.copy(f, f2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getLineHeight() {
        return this.lineHeight;
    }

    @NotNull
    public final TextStyleConfiguration copy(@Nullable Float fontSize, @Nullable Float lineHeight) {
        return new TextStyleConfiguration(fontSize, lineHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyleConfiguration)) {
            return false;
        }
        TextStyleConfiguration textStyleConfiguration = (TextStyleConfiguration) other;
        return Intrinsics.areEqual((Object) this.fontSize, (Object) textStyleConfiguration.fontSize) && Intrinsics.areEqual((Object) this.lineHeight, (Object) textStyleConfiguration.lineHeight);
    }

    @Nullable
    public final Float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final Float getLineHeight() {
        return this.lineHeight;
    }

    public int hashCode() {
        Float f = this.fontSize;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.lineHeight;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextStyleConfiguration(fontSize=" + this.fontSize + ", lineHeight=" + this.lineHeight + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public TextStyleConfiguration(@Nullable Float f, @Nullable Float f2) {
        this.fontSize = f;
        this.lineHeight = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextStyleConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
