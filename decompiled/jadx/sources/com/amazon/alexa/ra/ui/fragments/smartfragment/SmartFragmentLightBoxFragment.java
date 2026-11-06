package com.amazon.alexa.ra.ui.fragments.smartfragment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.ui.lightbox.LightBoxResult;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentLightBoxFragment;", "Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxResult;", "fragment", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "changeDisplayData", "Lcom/amazon/alexa/ra/ui/fragments/smartfragment/ChangeDisplayData;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;Lcom/amazon/alexa/ra/ui/fragments/smartfragment/ChangeDisplayData;)V", "getFragment", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "getChangeDisplayData", "()Lcom/amazon/alexa/ra/ui/fragments/smartfragment/ChangeDisplayData;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class SmartFragmentLightBoxFragment implements LightBoxResult {
    public static final int $stable = 8;

    @Nullable
    private final ChangeDisplayData changeDisplayData;

    @NotNull
    private final FragmentData fragment;

    public SmartFragmentLightBoxFragment(@NotNull FragmentData fragmentData, @Nullable ChangeDisplayData changeDisplayData) {
        fragmentData.getClass();
        this.fragment = fragmentData;
        this.changeDisplayData = changeDisplayData;
    }

    public static /* synthetic */ SmartFragmentLightBoxFragment copy$default(SmartFragmentLightBoxFragment smartFragmentLightBoxFragment, FragmentData fragmentData, ChangeDisplayData changeDisplayData, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentData = smartFragmentLightBoxFragment.fragment;
        }
        if ((i & 2) != 0) {
            changeDisplayData = smartFragmentLightBoxFragment.changeDisplayData;
        }
        return smartFragmentLightBoxFragment.copy(fragmentData, changeDisplayData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FragmentData getFragment() {
        return this.fragment;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ChangeDisplayData getChangeDisplayData() {
        return this.changeDisplayData;
    }

    @NotNull
    public final SmartFragmentLightBoxFragment copy(@NotNull FragmentData fragment, @Nullable ChangeDisplayData changeDisplayData) {
        fragment.getClass();
        return new SmartFragmentLightBoxFragment(fragment, changeDisplayData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartFragmentLightBoxFragment)) {
            return false;
        }
        SmartFragmentLightBoxFragment smartFragmentLightBoxFragment = (SmartFragmentLightBoxFragment) other;
        return Intrinsics.areEqual(this.fragment, smartFragmentLightBoxFragment.fragment) && Intrinsics.areEqual(this.changeDisplayData, smartFragmentLightBoxFragment.changeDisplayData);
    }

    @Nullable
    public final ChangeDisplayData getChangeDisplayData() {
        return this.changeDisplayData;
    }

    @NotNull
    public final FragmentData getFragment() {
        return this.fragment;
    }

    public int hashCode() {
        int hashCode = this.fragment.hashCode() * 31;
        ChangeDisplayData changeDisplayData = this.changeDisplayData;
        return hashCode + (changeDisplayData == null ? 0 : changeDisplayData.hashCode());
    }

    @NotNull
    public String toString() {
        return "SmartFragmentLightBoxFragment(fragment=" + this.fragment + ", changeDisplayData=" + this.changeDisplayData + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ SmartFragmentLightBoxFragment(FragmentData fragmentData, ChangeDisplayData changeDisplayData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentData, (i & 2) != 0 ? null : changeDisplayData);
    }
}
