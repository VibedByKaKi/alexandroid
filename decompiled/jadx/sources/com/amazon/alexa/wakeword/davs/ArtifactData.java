package com.amazon.alexa.wakeword.davs;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/wakeword/davs/ArtifactData;", "", "id", "", "locale", "ecid", "serializedWakeWords", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getEcid", "()Ljava/lang/String;", "getId", "getLocale", "getSerializedWakeWords", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ArtifactData {

    @NotNull
    private final String ecid;

    @NotNull
    private final String id;

    @NotNull
    private final String locale;

    @NotNull
    private final String serializedWakeWords;
    private final long timestamp;

    public ArtifactData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j) {
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14725m(str, str2, str3, str4);
        this.id = str;
        this.locale = str2;
        this.ecid = str3;
        this.serializedWakeWords = str4;
        this.timestamp = j;
    }

    public static /* synthetic */ ArtifactData copy$default(ArtifactData artifactData, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactData.id;
        }
        if ((i & 2) != 0) {
            str2 = artifactData.locale;
        }
        if ((i & 4) != 0) {
            str3 = artifactData.ecid;
        }
        if ((i & 8) != 0) {
            str4 = artifactData.serializedWakeWords;
        }
        if ((i & 16) != 0) {
            j = artifactData.timestamp;
        }
        long j2 = j;
        return artifactData.copy(str, str2, str3, str4, j2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEcid() {
        return this.ecid;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSerializedWakeWords() {
        return this.serializedWakeWords;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final ArtifactData copy(@NotNull String id, @NotNull String locale, @NotNull String ecid, @NotNull String serializedWakeWords, long timestamp) {
        id.getClass();
        locale.getClass();
        ecid.getClass();
        serializedWakeWords.getClass();
        return new ArtifactData(id, locale, ecid, serializedWakeWords, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactData)) {
            return false;
        }
        ArtifactData artifactData = (ArtifactData) other;
        return Intrinsics.areEqual(this.id, artifactData.id) && Intrinsics.areEqual(this.locale, artifactData.locale) && Intrinsics.areEqual(this.ecid, artifactData.ecid) && Intrinsics.areEqual(this.serializedWakeWords, artifactData.serializedWakeWords) && this.timestamp == artifactData.timestamp;
    }

    @NotNull
    public final String getEcid() {
        return this.ecid;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getSerializedWakeWords() {
        return this.serializedWakeWords;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.locale), 31, this.ecid), 31, this.serializedWakeWords);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.locale;
        String str3 = this.ecid;
        String str4 = this.serializedWakeWords;
        long j = this.timestamp;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ArtifactData(id=", str, ", locale=", str2, ", ecid=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", serializedWakeWords=", str4, ", timestamp=");
        return a$$ExternalSyntheticOutline0.m(j, MarkdownConstants.RIGHT_PARENTHESIS, m);
    }
}
