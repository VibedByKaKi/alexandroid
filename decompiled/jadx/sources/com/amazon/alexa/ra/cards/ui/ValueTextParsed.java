package com.amazon.alexa.ra.cards.ui;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/cards/ui/ValueTextParsed;", "", "text", "", "isBold", "", "<init>", "(Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final /* data */ class ValueTextParsed {
    private final boolean isBold;

    @NotNull
    private final String text;

    public ValueTextParsed(@NotNull String str, boolean z) {
        str.getClass();
        this.text = str;
        this.isBold = z;
    }

    public static /* synthetic */ ValueTextParsed copy$default(ValueTextParsed valueTextParsed, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = valueTextParsed.text;
        }
        if ((i & 2) != 0) {
            z = valueTextParsed.isBold;
        }
        return valueTextParsed.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBold() {
        return this.isBold;
    }

    @NotNull
    public final ValueTextParsed copy(@NotNull String text, boolean isBold) {
        text.getClass();
        return new ValueTextParsed(text, isBold);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValueTextParsed)) {
            return false;
        }
        ValueTextParsed valueTextParsed = (ValueTextParsed) other;
        return Intrinsics.areEqual(this.text, valueTextParsed.text) && this.isBold == valueTextParsed.isBold;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBold) + (this.text.hashCode() * 31);
    }

    public final boolean isBold() {
        return this.isBold;
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("ValueTextParsed(text=", this.text, ", isBold=", this.isBold, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
