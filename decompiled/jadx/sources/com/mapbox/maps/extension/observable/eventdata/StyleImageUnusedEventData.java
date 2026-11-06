package com.mapbox.maps.extension.observable.eventdata;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "StyleImageRemoveUnused", imports = {}))
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/StyleImageUnusedEventData;", "", "begin", "", "end", "id", "", "(JLjava/lang/Long;Ljava/lang/String;)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(JLjava/lang/Long;Ljava/lang/String;)Lcom/mapbox/maps/extension/observable/eventdata/StyleImageUnusedEventData;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class StyleImageUnusedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    @Nullable
    private final Long end;

    @SerializedName("id")
    @NotNull
    private final String id;

    public StyleImageUnusedEventData(long j, @Nullable Long l, @NotNull String str) {
        str.getClass();
        this.begin = j;
        this.end = l;
        this.id = str;
    }

    public static /* synthetic */ StyleImageUnusedEventData copy$default(StyleImageUnusedEventData styleImageUnusedEventData, long j, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = styleImageUnusedEventData.begin;
        }
        if ((i & 2) != 0) {
            l = styleImageUnusedEventData.end;
        }
        if ((i & 4) != 0) {
            str = styleImageUnusedEventData.id;
        }
        return styleImageUnusedEventData.copy(j, l, str);
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
    public final StyleImageUnusedEventData copy(long begin, @Nullable Long end, @NotNull String id) {
        id.getClass();
        return new StyleImageUnusedEventData(begin, end, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleImageUnusedEventData)) {
            return false;
        }
        StyleImageUnusedEventData styleImageUnusedEventData = (StyleImageUnusedEventData) other;
        return this.begin == styleImageUnusedEventData.begin && Intrinsics.areEqual(this.end, styleImageUnusedEventData.end) && Intrinsics.areEqual(this.id, styleImageUnusedEventData.id);
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

    public int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l = this.end;
        return this.id.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StyleImageUnusedEventData(begin=");
        sb.append(this.begin);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", id=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.id, sb);
    }
}
