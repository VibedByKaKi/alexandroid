package com.amazon.alexa.pmi;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/pmi/EventMetadata;", "", "status", "Lcom/amazon/alexa/pmi/TimelineExitCode;", "contentVersion", "", "customMetadata", "", "<init>", "(Lcom/amazon/alexa/pmi/TimelineExitCode;Ljava/lang/String;Ljava/util/Map;)V", "getStatus", "()Lcom/amazon/alexa/pmi/TimelineExitCode;", "getContentVersion", "()Ljava/lang/String;", "getCustomMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class EventMetadata {

    @Nullable
    private final String contentVersion;

    @Nullable
    private final Map<String, Object> customMetadata;

    @NotNull
    private final TimelineExitCode status;

    public /* synthetic */ EventMetadata(TimelineExitCode timelineExitCode, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timelineExitCode, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, TimelineExitCode timelineExitCode, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            timelineExitCode = eventMetadata.status;
        }
        if ((i & 2) != 0) {
            str = eventMetadata.contentVersion;
        }
        if ((i & 4) != 0) {
            map = eventMetadata.customMetadata;
        }
        return eventMetadata.copy(timelineExitCode, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TimelineExitCode getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getContentVersion() {
        return this.contentVersion;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.customMetadata;
    }

    @NotNull
    public final EventMetadata copy(@NotNull TimelineExitCode status, @Nullable String contentVersion, @Nullable Map<String, ? extends Object> customMetadata) {
        status.getClass();
        return new EventMetadata(status, contentVersion, customMetadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return this.status == eventMetadata.status && Intrinsics.areEqual(this.contentVersion, eventMetadata.contentVersion) && Intrinsics.areEqual(this.customMetadata, eventMetadata.customMetadata);
    }

    @Nullable
    public final String getContentVersion() {
        return this.contentVersion;
    }

    @Nullable
    public final Map<String, Object> getCustomMetadata() {
        return this.customMetadata;
    }

    @NotNull
    public final TimelineExitCode getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.contentVersion;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.customMetadata;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TimelineExitCode timelineExitCode = this.status;
        String str = this.contentVersion;
        Map<String, Object> map = this.customMetadata;
        StringBuilder sb = new StringBuilder("EventMetadata(status=");
        sb.append(timelineExitCode);
        sb.append(", contentVersion=");
        sb.append(str);
        sb.append(", customMetadata=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, map, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public EventMetadata(@NotNull TimelineExitCode timelineExitCode, @Nullable String str, @Nullable Map<String, ? extends Object> map) {
        timelineExitCode.getClass();
        this.status = timelineExitCode;
        this.contentVersion = str;
        this.customMetadata = map;
    }
}
