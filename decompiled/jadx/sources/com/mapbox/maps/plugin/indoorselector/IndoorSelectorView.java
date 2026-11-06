package com.mapbox.maps.plugin.indoorselector;

import com.mapbox.maps.IndoorFloor;
import com.mapbox.maps.MapboxExperimental;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&J \u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/plugin/indoorselector/IndoorSelectorView;", "", "isIndoorSelectorVisible", "", "()Z", "setIndoorSelectorVisible", "(Z)V", "setIndoorGravity", "", "gravity", "", "setIndoorSelectorMargins", "left", "top", "right", "bottom", "updateFloors", "floors", "", "Lcom/mapbox/maps/IndoorFloor;", "selectedFloorId", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public interface IndoorSelectorView {
    boolean isIndoorSelectorVisible();

    void setIndoorGravity(int gravity);

    void setIndoorSelectorMargins(int left, int top, int right, int bottom);

    void setIndoorSelectorVisible(boolean z);

    void updateFloors(@NotNull List<IndoorFloor> floors, @Nullable String selectedFloorId);
}
