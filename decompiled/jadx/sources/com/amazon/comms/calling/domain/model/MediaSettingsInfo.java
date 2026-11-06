package com.amazon.comms.calling.domain.model;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/domain/model/MediaSettingsInfo;", "", "enhancedProcessing", "", "isEnhancedProcessingOptInRequired", "", "<init>", "(Ljava/lang/String;Z)V", "getEnhancedProcessing", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MediaSettingsInfo {

    @SerializedName("enhancedProcessing")
    @Nullable
    private final String enhancedProcessing;

    @SerializedName("isEnhancedProcessingOptInRequired")
    private final boolean isEnhancedProcessingOptInRequired;

    public /* synthetic */ MediaSettingsInfo(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ MediaSettingsInfo copy$default(MediaSettingsInfo mediaSettingsInfo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaSettingsInfo.enhancedProcessing;
        }
        if ((i & 2) != 0) {
            z = mediaSettingsInfo.isEnhancedProcessingOptInRequired;
        }
        return mediaSettingsInfo.copy(str, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getEnhancedProcessing() {
        return this.enhancedProcessing;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnhancedProcessingOptInRequired() {
        return this.isEnhancedProcessingOptInRequired;
    }

    @NotNull
    public final MediaSettingsInfo copy(@Nullable String enhancedProcessing, boolean isEnhancedProcessingOptInRequired) {
        return new MediaSettingsInfo(enhancedProcessing, isEnhancedProcessingOptInRequired);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaSettingsInfo)) {
            return false;
        }
        MediaSettingsInfo mediaSettingsInfo = (MediaSettingsInfo) other;
        return Intrinsics.areEqual(this.enhancedProcessing, mediaSettingsInfo.enhancedProcessing) && this.isEnhancedProcessingOptInRequired == mediaSettingsInfo.isEnhancedProcessingOptInRequired;
    }

    @Nullable
    public final String getEnhancedProcessing() {
        return this.enhancedProcessing;
    }

    public int hashCode() {
        String str = this.enhancedProcessing;
        return Boolean.hashCode(this.isEnhancedProcessingOptInRequired) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final boolean isEnhancedProcessingOptInRequired() {
        return this.isEnhancedProcessingOptInRequired;
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("MediaSettingsInfo(enhancedProcessing=", this.enhancedProcessing, ", isEnhancedProcessingOptInRequired=", this.isEnhancedProcessingOptInRequired, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public MediaSettingsInfo(@Nullable String str, boolean z) {
        this.enhancedProcessing = str;
        this.isEnhancedProcessingOptInRequired = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaSettingsInfo() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
