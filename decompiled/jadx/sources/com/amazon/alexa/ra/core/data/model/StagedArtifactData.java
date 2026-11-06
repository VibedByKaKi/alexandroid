package com.amazon.alexa.ra.core.data.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/StagedArtifactData;", "", "contentUri", "", "text", "autoSend", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getContentUri", "()Ljava/lang/String;", "getText", "getAutoSend", "()Z", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class StagedArtifactData {
    public static final int $stable = 0;
    private final boolean autoSend;

    @Nullable
    private final String contentUri;

    @Nullable
    private final String text;

    public /* synthetic */ StagedArtifactData(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    public static /* synthetic */ StagedArtifactData copy$default(StagedArtifactData stagedArtifactData, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stagedArtifactData.contentUri;
        }
        if ((i & 2) != 0) {
            str2 = stagedArtifactData.text;
        }
        if ((i & 4) != 0) {
            z = stagedArtifactData.autoSend;
        }
        return stagedArtifactData.copy(str, str2, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getContentUri() {
        return this.contentUri;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAutoSend() {
        return this.autoSend;
    }

    @NotNull
    public final StagedArtifactData copy(@Nullable String contentUri, @Nullable String text, boolean autoSend) {
        return new StagedArtifactData(contentUri, text, autoSend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StagedArtifactData)) {
            return false;
        }
        StagedArtifactData stagedArtifactData = (StagedArtifactData) other;
        return Intrinsics.areEqual(this.contentUri, stagedArtifactData.contentUri) && Intrinsics.areEqual(this.text, stagedArtifactData.text) && this.autoSend == stagedArtifactData.autoSend;
    }

    public final boolean getAutoSend() {
        return this.autoSend;
    }

    @Nullable
    public final String getContentUri() {
        return this.contentUri;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.contentUri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return Boolean.hashCode(this.autoSend) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.contentUri;
        String str2 = this.text;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("StagedArtifactData(contentUri=", str, ", text=", str2, ", autoSend="), this.autoSend, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public StagedArtifactData(@Nullable String str, @Nullable String str2, boolean z) {
        this.contentUri = str;
        this.text = str2;
        this.autoSend = z;
    }

    public StagedArtifactData() {
        this(null, null, false, 7, null);
    }
}
