package com.amazon.alexa.assistant.capability.display;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/capability/display/DisplaySizeInInches;", "", "widthInInches", "", "heightInInches", "<init>", "(FF)V", "getWidthInInches", "()F", "getHeightInInches", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DisplaySizeInInches {
    private final float heightInInches;
    private final float widthInInches;

    public DisplaySizeInInches(float f, float f2) {
        this.widthInInches = f;
        this.heightInInches = f2;
    }

    public static /* synthetic */ DisplaySizeInInches copy$default(DisplaySizeInInches displaySizeInInches, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = displaySizeInInches.widthInInches;
        }
        if ((i & 2) != 0) {
            f2 = displaySizeInInches.heightInInches;
        }
        return displaySizeInInches.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getWidthInInches() {
        return this.widthInInches;
    }

    /* renamed from: component2, reason: from getter */
    public final float getHeightInInches() {
        return this.heightInInches;
    }

    @NotNull
    public final DisplaySizeInInches copy(float widthInInches, float heightInInches) {
        return new DisplaySizeInInches(widthInInches, heightInInches);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplaySizeInInches)) {
            return false;
        }
        DisplaySizeInInches displaySizeInInches = (DisplaySizeInInches) other;
        return Float.compare(this.widthInInches, displaySizeInInches.widthInInches) == 0 && Float.compare(this.heightInInches, displaySizeInInches.heightInInches) == 0;
    }

    public final float getHeightInInches() {
        return this.heightInInches;
    }

    public final float getWidthInInches() {
        return this.widthInInches;
    }

    public int hashCode() {
        return Float.hashCode(this.heightInInches) + (Float.hashCode(this.widthInInches) * 31);
    }

    @NotNull
    public String toString() {
        return "DisplaySizeInInches(widthInInches=" + this.widthInInches + ", heightInInches=" + this.heightInInches + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
