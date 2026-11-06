package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H&R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "(Lcom/mapbox/maps/module/telemetry/PhoneState;)V", "created", "", "getCreated", "()Ljava/lang/String;", "event", "getEvent", "getEventName", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ParcelCreator"})
/* loaded from: classes9.dex */
public abstract class MapBaseEvent {

    @SerializedName("created")
    @NotNull
    private final String created;

    @SerializedName("event")
    @NotNull
    private final String event;

    public MapBaseEvent(@NotNull PhoneState phoneState) {
        phoneState.getClass();
        this.event = getEventName();
        this.created = phoneState.getCreated();
    }

    @NotNull
    public final String getCreated() {
        return this.created;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public abstract String getEventName();
}
