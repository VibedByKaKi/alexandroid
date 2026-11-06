package com.mapbox.maps.extension.observable.eventdata;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.MapLoadErrorType;
import com.mapbox.maps.extension.observable.model.TileID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "MapLoadingError", imports = {}))
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/MapLoadingErrorEventData;", "", "begin", "", "end", "type", "Lcom/mapbox/maps/extension/observable/model/MapLoadErrorType;", "message", "", "sourceId", "tileId", "Lcom/mapbox/maps/extension/observable/model/TileID;", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/MapLoadErrorType;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/observable/model/TileID;)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessage", "()Ljava/lang/String;", "getSourceId", "getTileId", "()Lcom/mapbox/maps/extension/observable/model/TileID;", "getType", "()Lcom/mapbox/maps/extension/observable/model/MapLoadErrorType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/MapLoadErrorType;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/extension/observable/model/TileID;)Lcom/mapbox/maps/extension/observable/eventdata/MapLoadingErrorEventData;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MapLoadingErrorEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    @Nullable
    private final Long end;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("source-id")
    @Nullable
    private final String sourceId;

    @SerializedName("tile-id")
    @Nullable
    private final TileID tileId;

    @SerializedName("type")
    @NotNull
    private final MapLoadErrorType type;

    public MapLoadingErrorEventData(long j, @Nullable Long l, @NotNull MapLoadErrorType mapLoadErrorType, @NotNull String str, @Nullable String str2, @Nullable TileID tileID) {
        mapLoadErrorType.getClass();
        str.getClass();
        this.begin = j;
        this.end = l;
        this.type = mapLoadErrorType;
        this.message = str;
        this.sourceId = str2;
        this.tileId = tileID;
    }

    public static /* synthetic */ MapLoadingErrorEventData copy$default(MapLoadingErrorEventData mapLoadingErrorEventData, long j, Long l, MapLoadErrorType mapLoadErrorType, String str, String str2, TileID tileID, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mapLoadingErrorEventData.begin;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = mapLoadingErrorEventData.end;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            mapLoadErrorType = mapLoadingErrorEventData.type;
        }
        MapLoadErrorType mapLoadErrorType2 = mapLoadErrorType;
        if ((i & 8) != 0) {
            str = mapLoadingErrorEventData.message;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = mapLoadingErrorEventData.sourceId;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            tileID = mapLoadingErrorEventData.tileId;
        }
        return mapLoadingErrorEventData.copy(j2, l2, mapLoadErrorType2, str3, str4, tileID);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBegin() {
        return this.begin;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MapLoadErrorType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final TileID getTileId() {
        return this.tileId;
    }

    @NotNull
    public final MapLoadingErrorEventData copy(long begin, @Nullable Long end, @NotNull MapLoadErrorType type, @NotNull String message, @Nullable String sourceId, @Nullable TileID tileId) {
        type.getClass();
        message.getClass();
        return new MapLoadingErrorEventData(begin, end, type, message, sourceId, tileId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapLoadingErrorEventData)) {
            return false;
        }
        MapLoadingErrorEventData mapLoadingErrorEventData = (MapLoadingErrorEventData) other;
        return this.begin == mapLoadingErrorEventData.begin && Intrinsics.areEqual(this.end, mapLoadingErrorEventData.end) && this.type == mapLoadingErrorEventData.type && Intrinsics.areEqual(this.message, mapLoadingErrorEventData.message) && Intrinsics.areEqual(this.sourceId, mapLoadingErrorEventData.sourceId) && Intrinsics.areEqual(this.tileId, mapLoadingErrorEventData.tileId);
    }

    public final long getBegin() {
        return this.begin;
    }

    @Nullable
    public final Long getEnd() {
        return this.end;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final TileID getTileId() {
        return this.tileId;
    }

    @NotNull
    public final MapLoadErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l = this.end;
        int m = ArcMode$$ExternalSyntheticOutline0.m((this.type.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.message);
        String str = this.sourceId;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        TileID tileID = this.tileId;
        return hashCode2 + (tileID != null ? tileID.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MapLoadingErrorEventData(begin=" + this.begin + ", end=" + this.end + ", type=" + this.type + ", message=" + this.message + ", sourceId=" + this.sourceId + ", tileId=" + this.tileId + ')';
    }
}
