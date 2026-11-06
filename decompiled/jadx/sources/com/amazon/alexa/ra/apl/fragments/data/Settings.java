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
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/Settings;", "", "fragmentControl", "Lcom/amazon/alexa/ra/apl/fragments/data/FragmentControl;", "assetAuth", "Lcom/amazon/alexa/ra/apl/fragments/data/AssetAuth;", "<init>", "(Lcom/amazon/alexa/ra/apl/fragments/data/FragmentControl;Lcom/amazon/alexa/ra/apl/fragments/data/AssetAuth;)V", "getFragmentControl", "()Lcom/amazon/alexa/ra/apl/fragments/data/FragmentControl;", "getAssetAuth", "()Lcom/amazon/alexa/ra/apl/fragments/data/AssetAuth;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Settings {
    public static final int $stable = 8;

    @SerializedName("AssetAuth")
    @Nullable
    private final AssetAuth assetAuth;

    @SerializedName("FragmentControl")
    @Nullable
    private final FragmentControl fragmentControl;

    public Settings(@Nullable FragmentControl fragmentControl, @Nullable AssetAuth assetAuth) {
        this.fragmentControl = fragmentControl;
        this.assetAuth = assetAuth;
    }

    public static /* synthetic */ Settings copy$default(Settings settings, FragmentControl fragmentControl, AssetAuth assetAuth, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentControl = settings.fragmentControl;
        }
        if ((i & 2) != 0) {
            assetAuth = settings.assetAuth;
        }
        return settings.copy(fragmentControl, assetAuth);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final FragmentControl getFragmentControl() {
        return this.fragmentControl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AssetAuth getAssetAuth() {
        return this.assetAuth;
    }

    @NotNull
    public final Settings copy(@Nullable FragmentControl fragmentControl, @Nullable AssetAuth assetAuth) {
        return new Settings(fragmentControl, assetAuth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) other;
        return Intrinsics.areEqual(this.fragmentControl, settings.fragmentControl) && Intrinsics.areEqual(this.assetAuth, settings.assetAuth);
    }

    @Nullable
    public final AssetAuth getAssetAuth() {
        return this.assetAuth;
    }

    @Nullable
    public final FragmentControl getFragmentControl() {
        return this.fragmentControl;
    }

    public int hashCode() {
        FragmentControl fragmentControl = this.fragmentControl;
        int hashCode = (fragmentControl == null ? 0 : fragmentControl.hashCode()) * 31;
        AssetAuth assetAuth = this.assetAuth;
        return hashCode + (assetAuth != null ? assetAuth.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Settings(fragmentControl=" + this.fragmentControl + ", assetAuth=" + this.assetAuth + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
