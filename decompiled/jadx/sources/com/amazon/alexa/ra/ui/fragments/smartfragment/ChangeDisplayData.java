package com.amazon.alexa.ra.ui.fragments.smartfragment;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/ui/fragments/smartfragment/ChangeDisplayData;", "", "display", "", SmartFragmentEventProcessor.NEW_INSTANCE, "", "context", "<init>", "(Ljava/lang/String;ZLjava/lang/Object;)V", "getDisplay", "()Ljava/lang/String;", "getNewInstance", "()Z", "getContext", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ChangeDisplayData {
    public static final int $stable = 8;

    @Nullable
    private final Object context;

    @NotNull
    private final String display;
    private final boolean newInstance;

    public /* synthetic */ ChangeDisplayData(String str, boolean z, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : obj);
    }

    public static /* synthetic */ ChangeDisplayData copy$default(ChangeDisplayData changeDisplayData, String str, boolean z, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = changeDisplayData.display;
        }
        if ((i & 2) != 0) {
            z = changeDisplayData.newInstance;
        }
        if ((i & 4) != 0) {
            obj = changeDisplayData.context;
        }
        return changeDisplayData.copy(str, z, obj);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNewInstance() {
        return this.newInstance;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Object getContext() {
        return this.context;
    }

    @NotNull
    public final ChangeDisplayData copy(@NotNull String display, boolean newInstance, @Nullable Object context) {
        display.getClass();
        return new ChangeDisplayData(display, newInstance, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeDisplayData)) {
            return false;
        }
        ChangeDisplayData changeDisplayData = (ChangeDisplayData) other;
        return Intrinsics.areEqual(this.display, changeDisplayData.display) && this.newInstance == changeDisplayData.newInstance && Intrinsics.areEqual(this.context, changeDisplayData.context);
    }

    @Nullable
    public final Object getContext() {
        return this.context;
    }

    @NotNull
    public final String getDisplay() {
        return this.display;
    }

    public final boolean getNewInstance() {
        return this.newInstance;
    }

    public int hashCode() {
        int m = DoubleList$$ExternalSyntheticOutline0.m(this.newInstance, this.display.hashCode() * 31, 31);
        Object obj = this.context;
        return m + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.display;
        boolean z = this.newInstance;
        return ErrorUtils$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("ChangeDisplayData(display=", str, ", newInstance=", z, ", context="), MarkdownConstants.RIGHT_PARENTHESIS, this.context);
    }

    public ChangeDisplayData(@NotNull String str, boolean z, @Nullable Object obj) {
        str.getClass();
        this.display = str;
        this.newInstance = z;
        this.context = obj;
    }
}
