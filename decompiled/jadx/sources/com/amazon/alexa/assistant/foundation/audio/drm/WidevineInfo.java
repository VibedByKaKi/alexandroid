package com.amazon.alexa.assistant.foundation.audio.drm;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003JW\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/drm/WidevineInfo;", "", "licenseAcquisitionUrl", "", "keyHeaders", "", "manifestHeaders", "audioSegmentHeaders", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getLicenseAcquisitionUrl", "()Ljava/lang/String;", "getKeyHeaders", "()Ljava/util/Map;", "getManifestHeaders", "getAudioSegmentHeaders", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WidevineInfo {

    @NotNull
    private final Map<String, String> audioSegmentHeaders;

    @NotNull
    private final Map<String, String> keyHeaders;

    @Nullable
    private final String licenseAcquisitionUrl;

    @NotNull
    private final Map<String, String> manifestHeaders;

    public WidevineInfo(@Nullable String str, @NotNull Map<String, String> map, @NotNull Map<String, String> map2, @NotNull Map<String, String> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.licenseAcquisitionUrl = str;
        this.keyHeaders = map;
        this.manifestHeaders = map2;
        this.audioSegmentHeaders = map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WidevineInfo copy$default(WidevineInfo widevineInfo, String str, Map map, Map map2, Map map3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widevineInfo.licenseAcquisitionUrl;
        }
        if ((i & 2) != 0) {
            map = widevineInfo.keyHeaders;
        }
        if ((i & 4) != 0) {
            map2 = widevineInfo.manifestHeaders;
        }
        if ((i & 8) != 0) {
            map3 = widevineInfo.audioSegmentHeaders;
        }
        return widevineInfo.copy(str, map, map2, map3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLicenseAcquisitionUrl() {
        return this.licenseAcquisitionUrl;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.keyHeaders;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.manifestHeaders;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.audioSegmentHeaders;
    }

    @NotNull
    public final WidevineInfo copy(@Nullable String licenseAcquisitionUrl, @NotNull Map<String, String> keyHeaders, @NotNull Map<String, String> manifestHeaders, @NotNull Map<String, String> audioSegmentHeaders) {
        keyHeaders.getClass();
        manifestHeaders.getClass();
        audioSegmentHeaders.getClass();
        return new WidevineInfo(licenseAcquisitionUrl, keyHeaders, manifestHeaders, audioSegmentHeaders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidevineInfo)) {
            return false;
        }
        WidevineInfo widevineInfo = (WidevineInfo) other;
        return Intrinsics.areEqual(this.licenseAcquisitionUrl, widevineInfo.licenseAcquisitionUrl) && Intrinsics.areEqual(this.keyHeaders, widevineInfo.keyHeaders) && Intrinsics.areEqual(this.manifestHeaders, widevineInfo.manifestHeaders) && Intrinsics.areEqual(this.audioSegmentHeaders, widevineInfo.audioSegmentHeaders);
    }

    @NotNull
    public final Map<String, String> getAudioSegmentHeaders() {
        return this.audioSegmentHeaders;
    }

    @NotNull
    public final Map<String, String> getKeyHeaders() {
        return this.keyHeaders;
    }

    @Nullable
    public final String getLicenseAcquisitionUrl() {
        return this.licenseAcquisitionUrl;
    }

    @NotNull
    public final Map<String, String> getManifestHeaders() {
        return this.manifestHeaders;
    }

    public int hashCode() {
        String str = this.licenseAcquisitionUrl;
        return this.audioSegmentHeaders.hashCode() + TableInfo$$ExternalSyntheticOutline0.m(this.manifestHeaders, TableInfo$$ExternalSyntheticOutline0.m(this.keyHeaders, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "WidevineInfo(licenseAcquisitionUrl=" + this.licenseAcquisitionUrl + ", keyHeaders=" + this.keyHeaders + ", manifestHeaders=" + this.manifestHeaders + ", audioSegmentHeaders=" + this.audioSegmentHeaders + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ WidevineInfo(String str, Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? MapsKt.emptyMap() : map2, (i & 8) != 0 ? MapsKt.emptyMap() : map3);
    }
}
