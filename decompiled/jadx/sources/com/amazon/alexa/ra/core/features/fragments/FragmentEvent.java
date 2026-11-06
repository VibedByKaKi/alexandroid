package com.amazon.alexa.ra.core.features.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006#"}, d2 = {"Lcom/amazon/alexa/ra/core/features/fragments/FragmentEvent;", "", "fragments", "", "", "metadata", "Lcom/amazon/alexa/ra/core/features/fragments/FragmentEventMetadata;", "token", "previousToken", "displayHint", "isLastChunk", "", "<init>", "(Ljava/util/List;Lcom/amazon/alexa/ra/core/features/fragments/FragmentEventMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getFragments", "()Ljava/util/List;", "getMetadata", "()Lcom/amazon/alexa/ra/core/features/fragments/FragmentEventMetadata;", "getToken", "()Ljava/lang/String;", "getPreviousToken", "getDisplayHint", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentEvent {
    public static final int $stable = 8;

    @Nullable
    private final String displayHint;

    @NotNull
    private final List<String> fragments;
    private final boolean isLastChunk;

    @NotNull
    private final FragmentEventMetadata metadata;

    @Nullable
    private final String previousToken;

    @Nullable
    private final String token;

    public /* synthetic */ FragmentEvent(List list, FragmentEventMetadata fragmentEventMetadata, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, fragmentEventMetadata, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
    }

    public static /* synthetic */ FragmentEvent copy$default(FragmentEvent fragmentEvent, List list, FragmentEventMetadata fragmentEventMetadata, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fragmentEvent.fragments;
        }
        if ((i & 2) != 0) {
            fragmentEventMetadata = fragmentEvent.metadata;
        }
        if ((i & 4) != 0) {
            str = fragmentEvent.token;
        }
        if ((i & 8) != 0) {
            str2 = fragmentEvent.previousToken;
        }
        if ((i & 16) != 0) {
            str3 = fragmentEvent.displayHint;
        }
        if ((i & 32) != 0) {
            z = fragmentEvent.isLastChunk;
        }
        String str4 = str3;
        boolean z2 = z;
        return fragmentEvent.copy(list, fragmentEventMetadata, str, str2, str4, z2);
    }

    @NotNull
    public final List<String> component1() {
        return this.fragments;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FragmentEventMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPreviousToken() {
        return this.previousToken;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDisplayHint() {
        return this.displayHint;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLastChunk() {
        return this.isLastChunk;
    }

    @NotNull
    public final FragmentEvent copy(@NotNull List<String> fragments, @NotNull FragmentEventMetadata metadata, @Nullable String token, @Nullable String previousToken, @Nullable String displayHint, boolean isLastChunk) {
        fragments.getClass();
        metadata.getClass();
        return new FragmentEvent(fragments, metadata, token, previousToken, displayHint, isLastChunk);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentEvent)) {
            return false;
        }
        FragmentEvent fragmentEvent = (FragmentEvent) other;
        return Intrinsics.areEqual(this.fragments, fragmentEvent.fragments) && Intrinsics.areEqual(this.metadata, fragmentEvent.metadata) && Intrinsics.areEqual(this.token, fragmentEvent.token) && Intrinsics.areEqual(this.previousToken, fragmentEvent.previousToken) && Intrinsics.areEqual(this.displayHint, fragmentEvent.displayHint) && this.isLastChunk == fragmentEvent.isLastChunk;
    }

    @Nullable
    public final String getDisplayHint() {
        return this.displayHint;
    }

    @NotNull
    public final List<String> getFragments() {
        return this.fragments;
    }

    @NotNull
    public final FragmentEventMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getPreviousToken() {
        return this.previousToken;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = (this.metadata.hashCode() + (this.fragments.hashCode() * 31)) * 31;
        String str = this.token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previousToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayHint;
        return Boolean.hashCode(this.isLastChunk) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isLastChunk() {
        return this.isLastChunk;
    }

    @NotNull
    public String toString() {
        List<String> list = this.fragments;
        FragmentEventMetadata fragmentEventMetadata = this.metadata;
        String str = this.token;
        String str2 = this.previousToken;
        String str3 = this.displayHint;
        boolean z = this.isLastChunk;
        StringBuilder sb = new StringBuilder("FragmentEvent(fragments=");
        sb.append(list);
        sb.append(", metadata=");
        sb.append(fragmentEventMetadata);
        sb.append(", token=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str, ", previousToken=", str2, ", displayHint=");
        sb.append(str3);
        sb.append(", isLastChunk=");
        sb.append(z);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public FragmentEvent(@NotNull List<String> list, @NotNull FragmentEventMetadata fragmentEventMetadata, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        list.getClass();
        fragmentEventMetadata.getClass();
        this.fragments = list;
        this.metadata = fragmentEventMetadata;
        this.token = str;
        this.previousToken = str2;
        this.displayHint = str3;
        this.isLastChunk = z;
    }
}
