package com.amazon.alexa.ra.apl.fragments.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/FragmentControl;", "", "respondToPress", "", "<init>", "(Ljava/lang/Boolean;)V", "getRespondToPress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/amazon/alexa/ra/apl/fragments/data/FragmentControl;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentControl {
    public static final int $stable = 0;

    @SerializedName("respondToPress")
    @Nullable
    private final Boolean respondToPress;

    public FragmentControl(@Nullable Boolean bool) {
        this.respondToPress = bool;
    }

    public static /* synthetic */ FragmentControl copy$default(FragmentControl fragmentControl, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fragmentControl.respondToPress;
        }
        return fragmentControl.copy(bool);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getRespondToPress() {
        return this.respondToPress;
    }

    @NotNull
    public final FragmentControl copy(@Nullable Boolean respondToPress) {
        return new FragmentControl(respondToPress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FragmentControl) && Intrinsics.areEqual(this.respondToPress, ((FragmentControl) other).respondToPress);
    }

    @Nullable
    public final Boolean getRespondToPress() {
        return this.respondToPress;
    }

    public int hashCode() {
        Boolean bool = this.respondToPress;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "FragmentControl(respondToPress=" + this.respondToPress + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
