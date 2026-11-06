package com.amazon.photos.uploader;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(tableName = "events")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/amazon/photos/uploader/Event;", "", "id", "", "description", "", "eventTimeMillis", "(JLjava/lang/String;J)V", "getDescription", "()Ljava/lang/String;", "getEventTimeMillis", "()J", "getId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "getEventDate", "Ljava/util/Date;", "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Event {

    @ColumnInfo(name = "description")
    @NotNull
    private final String description;

    @ColumnInfo(name = "event_time_millis")
    private final long eventTimeMillis;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private final long id;

    public /* synthetic */ Event(long j, String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2);
    }

    public static /* synthetic */ Event copy$default(Event event, long j, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = event.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = event.description;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = event.eventTimeMillis;
        }
        return event.copy(j3, str2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEventTimeMillis() {
        return this.eventTimeMillis;
    }

    @NotNull
    public final Event copy(long id, @NotNull String description, long eventTimeMillis) {
        description.getClass();
        return new Event(id, description, eventTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return this.id == event.id && Intrinsics.areEqual(this.description, event.description) && this.eventTimeMillis == event.eventTimeMillis;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Date getEventDate() {
        return new Date(this.eventTimeMillis);
    }

    public final long getEventTimeMillis() {
        return this.eventTimeMillis;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.eventTimeMillis) + ArcMode$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.description);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Event(id=");
        sb.append(this.id);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", eventTimeMillis=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.eventTimeMillis, ')');
    }

    public Event(long j, @NotNull String str, long j2) {
        str.getClass();
        this.id = j;
        this.description = str;
        this.eventTimeMillis = j2;
    }
}
