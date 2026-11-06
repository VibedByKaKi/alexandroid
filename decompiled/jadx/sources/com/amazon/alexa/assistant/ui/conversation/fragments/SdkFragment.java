package com.amazon.alexa.assistant.ui.conversation.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/SdkFragment;", "", "uri", "", "type", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", "descriptor", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentDescriptor;", "text", "additionalData", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentDescriptor;Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getType", "()Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", "getDescriptor", "()Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentDescriptor;", "getText", "getAdditionalData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SdkFragment {
    public static final int $stable = 0;

    @Nullable
    private final String additionalData;

    @NotNull
    private final FragmentDescriptor descriptor;

    @Nullable
    private final String text;

    @Nullable
    private final FragmentType type;

    @NotNull
    private final String uri;

    public SdkFragment(@NotNull String str, @Nullable FragmentType fragmentType, @NotNull FragmentDescriptor fragmentDescriptor, @Nullable String str2, @Nullable String str3) {
        str.getClass();
        fragmentDescriptor.getClass();
        this.uri = str;
        this.type = fragmentType;
        this.descriptor = fragmentDescriptor;
        this.text = str2;
        this.additionalData = str3;
    }

    public static /* synthetic */ SdkFragment copy$default(SdkFragment sdkFragment, String str, FragmentType fragmentType, FragmentDescriptor fragmentDescriptor, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkFragment.uri;
        }
        if ((i & 2) != 0) {
            fragmentType = sdkFragment.type;
        }
        if ((i & 4) != 0) {
            fragmentDescriptor = sdkFragment.descriptor;
        }
        if ((i & 8) != 0) {
            str2 = sdkFragment.text;
        }
        if ((i & 16) != 0) {
            str3 = sdkFragment.additionalData;
        }
        String str4 = str3;
        FragmentDescriptor fragmentDescriptor2 = fragmentDescriptor;
        return sdkFragment.copy(str, fragmentType, fragmentDescriptor2, str2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final FragmentType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FragmentDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAdditionalData() {
        return this.additionalData;
    }

    @NotNull
    public final SdkFragment copy(@NotNull String uri, @Nullable FragmentType type, @NotNull FragmentDescriptor descriptor, @Nullable String text, @Nullable String additionalData) {
        uri.getClass();
        descriptor.getClass();
        return new SdkFragment(uri, type, descriptor, text, additionalData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkFragment)) {
            return false;
        }
        SdkFragment sdkFragment = (SdkFragment) other;
        return Intrinsics.areEqual(this.uri, sdkFragment.uri) && Intrinsics.areEqual(this.type, sdkFragment.type) && Intrinsics.areEqual(this.descriptor, sdkFragment.descriptor) && Intrinsics.areEqual(this.text, sdkFragment.text) && Intrinsics.areEqual(this.additionalData, sdkFragment.additionalData);
    }

    @Nullable
    public final String getAdditionalData() {
        return this.additionalData;
    }

    @NotNull
    public final FragmentDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final FragmentType getType() {
        return this.type;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = this.uri.hashCode() * 31;
        FragmentType fragmentType = this.type;
        int hashCode2 = (this.descriptor.hashCode() + ((hashCode + (fragmentType == null ? 0 : fragmentType.hashCode())) * 31)) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.additionalData;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uri;
        FragmentType fragmentType = this.type;
        FragmentDescriptor fragmentDescriptor = this.descriptor;
        String str2 = this.text;
        String str3 = this.additionalData;
        StringBuilder sb = new StringBuilder("SdkFragment(uri=");
        sb.append(str);
        sb.append(", type=");
        sb.append(fragmentType);
        sb.append(", descriptor=");
        sb.append(fragmentDescriptor);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", additionalData=");
        return a$$ExternalSyntheticOutline0.m(sb, str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ SdkFragment(String str, FragmentType fragmentType, FragmentDescriptor fragmentDescriptor, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fragmentType, fragmentDescriptor, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
