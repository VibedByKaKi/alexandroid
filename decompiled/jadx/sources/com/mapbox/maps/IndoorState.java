package com.mapbox.maps;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@com.mapbox.annotation.MapboxExperimental
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0006H\u0016R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/IndoorState;", "Ljava/io/Serializable;", "floors", "", "Lcom/mapbox/maps/IndoorFloor;", "selectedFloorId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getFloors$annotations", "()V", "getFloors", "()Ljava/util/List;", "getSelectedFloorId", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toBuilder", "Lcom/mapbox/maps/IndoorState$Builder;", "toString", "Builder", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class IndoorState implements Serializable {

    @NotNull
    private final List<IndoorFloor> floors;

    @NotNull
    private final String selectedFloorId;

    private IndoorState(List<IndoorFloor> list, String str) {
        this.floors = list;
        this.selectedFloorId = str;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof IndoorState)) {
            return false;
        }
        IndoorState indoorState = (IndoorState) other;
        return Intrinsics.areEqual(this.floors, indoorState.floors) && Intrinsics.areEqual(this.selectedFloorId, indoorState.selectedFloorId);
    }

    @NotNull
    public final List<IndoorFloor> getFloors() {
        return this.floors;
    }

    @NotNull
    public final String getSelectedFloorId() {
        return this.selectedFloorId;
    }

    public int hashCode() {
        return Objects.hash(this.floors, this.selectedFloorId);
    }

    @com.mapbox.annotation.MapboxExperimental
    @NotNull
    public final Builder toBuilder() {
        return new Builder(this.floors, this.selectedFloorId).setFloors(this.floors).setSelectedFloorId(this.selectedFloorId);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorState(floors=");
        sb.append(this.floors);
        sb.append(", selectedFloorId=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.selectedFloorId, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @com.mapbox.annotation.MapboxExperimental
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0016\u0010\r\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R8\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/IndoorState$Builder;", "", "floors", "", "Lcom/mapbox/maps/IndoorFloor;", "selectedFloorId", "", "(Ljava/util/List;Ljava/lang/String;)V", "<set-?>", "getFloors$annotations", "()V", "getFloors", "()Ljava/util/List;", "setFloors", "(Ljava/util/List;)V", "getSelectedFloorId", "()Ljava/lang/String;", "setSelectedFloorId", "(Ljava/lang/String;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/IndoorState;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private List<IndoorFloor> floors;

        @NotNull
        private String selectedFloorId;

        public Builder(@NotNull List<IndoorFloor> list, @NotNull String str) {
            list.getClass();
            str.getClass();
            this.floors = list;
            this.selectedFloorId = str;
        }

        @com.mapbox.annotation.MapboxExperimental
        @NotNull
        public final IndoorState build() {
            List<IndoorFloor> list = this.floors;
            if (list == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Could not build an instance of IndoorState through IndoorState.Builder because floors was null.");
                return null;
            }
            if (this.selectedFloorId == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Could not build an instance of IndoorState through IndoorState.Builder because selectedFloorId was null.");
                return null;
            }
            list.getClass();
            String str = this.selectedFloorId;
            str.getClass();
            return new IndoorState(list, str, null);
        }

        @NotNull
        public final List<IndoorFloor> getFloors() {
            return this.floors;
        }

        @NotNull
        public final String getSelectedFloorId() {
            return this.selectedFloorId;
        }

        /* renamed from: setFloors, reason: collision with other method in class */
        public final /* synthetic */ void m24717setFloors(List list) {
            list.getClass();
            this.floors = list;
        }

        /* renamed from: setSelectedFloorId, reason: collision with other method in class */
        public final /* synthetic */ void m24718setSelectedFloorId(String str) {
            str.getClass();
            this.selectedFloorId = str;
        }

        @com.mapbox.annotation.MapboxExperimental
        @NotNull
        public final Builder setFloors(@NotNull List<IndoorFloor> floors) {
            floors.getClass();
            this.floors = floors;
            return this;
        }

        @NotNull
        public final Builder setSelectedFloorId(@NotNull String selectedFloorId) {
            selectedFloorId.getClass();
            this.selectedFloorId = selectedFloorId;
            return this;
        }

        @com.mapbox.annotation.MapboxExperimental
        public static /* synthetic */ void getFloors$annotations() {
        }
    }

    public /* synthetic */ IndoorState(List list, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str);
    }

    @com.mapbox.annotation.MapboxExperimental
    public static /* synthetic */ void getFloors$annotations() {
    }
}
