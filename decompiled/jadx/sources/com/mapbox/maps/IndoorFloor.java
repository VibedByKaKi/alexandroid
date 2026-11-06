package com.mapbox.maps;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@com.mapbox.annotation.MapboxExperimental
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/IndoorFloor;", "Ljava/io/Serializable;", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toBuilder", "Lcom/mapbox/maps/IndoorFloor$Builder;", "toString", "Builder", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class IndoorFloor implements Serializable {

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    private IndoorFloor(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof IndoorFloor)) {
            return false;
        }
        IndoorFloor indoorFloor = (IndoorFloor) other;
        return Intrinsics.areEqual(this.id, indoorFloor.id) && Intrinsics.areEqual(this.name, indoorFloor.name);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @com.mapbox.annotation.MapboxExperimental
    @NotNull
    public final Builder toBuilder() {
        return new Builder(this.id, this.name).setId(this.id).setName(this.name);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorFloor(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.name, sb);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @com.mapbox.annotation.MapboxExperimental
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/IndoorFloor$Builder;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/IndoorFloor;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private String id;

        @NotNull
        private String name;

        public Builder(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.name = str2;
        }

        @com.mapbox.annotation.MapboxExperimental
        @NotNull
        public final IndoorFloor build() {
            String str = this.id;
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Could not build an instance of IndoorFloor through IndoorFloor.Builder because id was null.");
                return null;
            }
            if (this.name == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Could not build an instance of IndoorFloor through IndoorFloor.Builder because name was null.");
                return null;
            }
            str.getClass();
            String str2 = this.name;
            str2.getClass();
            return new IndoorFloor(str, str2, null);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        /* renamed from: setId, reason: collision with other method in class */
        public final /* synthetic */ void m24714setId(String str) {
            str.getClass();
            this.id = str;
        }

        /* renamed from: setName, reason: collision with other method in class */
        public final /* synthetic */ void m24715setName(String str) {
            str.getClass();
            this.name = str;
        }

        @NotNull
        public final Builder setId(@NotNull String id) {
            id.getClass();
            this.id = id;
            return this;
        }

        @NotNull
        public final Builder setName(@NotNull String name) {
            name.getClass();
            this.name = name;
            return this;
        }
    }

    public /* synthetic */ IndoorFloor(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
