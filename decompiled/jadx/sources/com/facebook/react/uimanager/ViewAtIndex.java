package com.facebook.react.uimanager;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import java.util.Comparator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/ViewAtIndex;", "", "mTag", "", "mIndex", "<init>", "(II)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewAtIndex {

    @JvmField
    public final int mIndex;

    @JvmField
    public final int mTag;

    @JvmField
    @NotNull
    public static Comparator<ViewAtIndex> COMPARATOR = new ViewAtIndex$$ExternalSyntheticLambda0(0);

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ViewAtIndex", LegacyArchitectureLogLevel.ERROR);
    }

    public ViewAtIndex(int i, int i2) {
        this.mTag = i;
        this.mIndex = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int COMPARATOR$lambda$0(ViewAtIndex viewAtIndex, ViewAtIndex viewAtIndex2) {
        return viewAtIndex.mIndex - viewAtIndex2.mIndex;
    }

    public boolean equals(@Nullable Object other) {
        if (other != null && Intrinsics.areEqual(other.getClass(), ViewAtIndex.class)) {
            ViewAtIndex viewAtIndex = (ViewAtIndex) other;
            if (this.mIndex == viewAtIndex.mIndex && this.mTag == viewAtIndex.mTag) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mTag), Integer.valueOf(this.mIndex));
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(this.mTag, this.mIndex, MarkdownConstants.LEFT_BRACKET, ", ", MarkdownConstants.RIGHT_BRACKET);
    }
}
