package com.amazon.alexa.assistant.toolkit.session.davs;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/DAVSArtifactResponse;", "", "artifactIdentifier", "", "artifact", "", "checksum", "<init>", "(Ljava/lang/String;[BLjava/lang/String;)V", "getArtifactIdentifier", "()Ljava/lang/String;", "getArtifact", "()[B", "getChecksum", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "component3", "copy", "toString", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DAVSArtifactResponse {

    @NotNull
    private final byte[] artifact;

    @NotNull
    private final String artifactIdentifier;

    @NotNull
    private final String checksum;

    public DAVSArtifactResponse(@NotNull String str, @NotNull byte[] bArr, @NotNull String str2) {
        str.getClass();
        bArr.getClass();
        str2.getClass();
        this.artifactIdentifier = str;
        this.artifact = bArr;
        this.checksum = str2;
    }

    public static /* synthetic */ DAVSArtifactResponse copy$default(DAVSArtifactResponse dAVSArtifactResponse, String str, byte[] bArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dAVSArtifactResponse.artifactIdentifier;
        }
        if ((i & 2) != 0) {
            bArr = dAVSArtifactResponse.artifact;
        }
        if ((i & 4) != 0) {
            str2 = dAVSArtifactResponse.checksum;
        }
        return dAVSArtifactResponse.copy(str, bArr, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final byte[] getArtifact() {
        return this.artifact;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    @NotNull
    public final DAVSArtifactResponse copy(@NotNull String artifactIdentifier, @NotNull byte[] artifact, @NotNull String checksum) {
        artifactIdentifier.getClass();
        artifact.getClass();
        checksum.getClass();
        return new DAVSArtifactResponse(artifactIdentifier, artifact, checksum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DAVSArtifactResponse.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DAVSArtifactResponse dAVSArtifactResponse = (DAVSArtifactResponse) other;
        return Intrinsics.areEqual(this.artifactIdentifier, dAVSArtifactResponse.artifactIdentifier) && Arrays.equals(this.artifact, dAVSArtifactResponse.artifact) && Intrinsics.areEqual(this.checksum, dAVSArtifactResponse.checksum);
    }

    @NotNull
    public final byte[] getArtifact() {
        return this.artifact;
    }

    @NotNull
    public final String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    @NotNull
    public final String getChecksum() {
        return this.checksum;
    }

    public int hashCode() {
        return this.checksum.hashCode() + ParcelCompat$$ExternalSyntheticOutline0.m(this.artifact, this.artifactIdentifier.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.artifactIdentifier;
        String arrays = Arrays.toString(this.artifact);
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("DAVSArtifactResponse(artifactIdentifier=", str, ", artifact=", arrays, ", checksum="), this.checksum, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
