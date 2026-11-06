package com.mapbox.maps.extension.observable.eventdata;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.SourceDataType;
import com.mapbox.maps.extension.observable.model.TileID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "SourceDataLoaded", imports = {}))
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/SourceDataLoadedEventData;", "", "begin", "", "end", "id", "", "type", "Lcom/mapbox/maps/extension/observable/model/SourceDataType;", "loaded", "", "tileID", "Lcom/mapbox/maps/extension/observable/model/TileID;", "(JLjava/lang/Long;Ljava/lang/String;Lcom/mapbox/maps/extension/observable/model/SourceDataType;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/observable/model/TileID;)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "getLoaded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTileID", "()Lcom/mapbox/maps/extension/observable/model/TileID;", "getType", "()Lcom/mapbox/maps/extension/observable/model/SourceDataType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Long;Ljava/lang/String;Lcom/mapbox/maps/extension/observable/model/SourceDataType;Ljava/lang/Boolean;Lcom/mapbox/maps/extension/observable/model/TileID;)Lcom/mapbox/maps/extension/observable/eventdata/SourceDataLoadedEventData;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SourceDataLoadedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    @Nullable
    private final Long end;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("loaded")
    @Nullable
    private final Boolean loaded;

    @SerializedName("tile-id")
    @Nullable
    private final TileID tileID;

    @SerializedName("type")
    @NotNull
    private final SourceDataType type;

    public SourceDataLoadedEventData(long j, @Nullable Long l, @NotNull String str, @NotNull SourceDataType sourceDataType, @Nullable Boolean bool, @Nullable TileID tileID) {
        str.getClass();
        sourceDataType.getClass();
        this.begin = j;
        this.end = l;
        this.id = str;
        this.type = sourceDataType;
        this.loaded = bool;
        this.tileID = tileID;
    }

    public static /* synthetic */ SourceDataLoadedEventData copy$default(SourceDataLoadedEventData sourceDataLoadedEventData, long j, Long l, String str, SourceDataType sourceDataType, Boolean bool, TileID tileID, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sourceDataLoadedEventData.begin;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = sourceDataLoadedEventData.end;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str = sourceDataLoadedEventData.id;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            sourceDataType = sourceDataLoadedEventData.type;
        }
        SourceDataType sourceDataType2 = sourceDataType;
        if ((i & 16) != 0) {
            bool = sourceDataLoadedEventData.loaded;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            tileID = sourceDataLoadedEventData.tileID;
        }
        return sourceDataLoadedEventData.copy(j2, l2, str2, sourceDataType2, bool2, tileID);
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
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SourceDataType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getLoaded() {
        return this.loaded;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final TileID getTileID() {
        return this.tileID;
    }

    @NotNull
    public final SourceDataLoadedEventData copy(long begin, @Nullable Long end, @NotNull String id, @NotNull SourceDataType type, @Nullable Boolean loaded, @Nullable TileID tileID) {
        id.getClass();
        type.getClass();
        return new SourceDataLoadedEventData(begin, end, id, type, loaded, tileID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceDataLoadedEventData)) {
            return false;
        }
        SourceDataLoadedEventData sourceDataLoadedEventData = (SourceDataLoadedEventData) other;
        return this.begin == sourceDataLoadedEventData.begin && Intrinsics.areEqual(this.end, sourceDataLoadedEventData.end) && Intrinsics.areEqual(this.id, sourceDataLoadedEventData.id) && this.type == sourceDataLoadedEventData.type && Intrinsics.areEqual(this.loaded, sourceDataLoadedEventData.loaded) && Intrinsics.areEqual(this.tileID, sourceDataLoadedEventData.tileID);
    }

    public final long getBegin() {
        return this.begin;
    }

    @Nullable
    public final Long getEnd() {
        return this.end;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getLoaded() {
        return this.loaded;
    }

    @Nullable
    public final TileID getTileID() {
        return this.tileID;
    }

    @NotNull
    public final SourceDataType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l = this.end;
        int hashCode2 = (this.type.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.id)) * 31;
        Boolean bool = this.loaded;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        TileID tileID = this.tileID;
        return hashCode3 + (tileID != null ? tileID.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SourceDataLoadedEventData(begin=" + this.begin + ", end=" + this.end + ", id=" + this.id + ", type=" + this.type + ", loaded=" + this.loaded + ", tileID=" + this.tileID + ')';
    }
}
