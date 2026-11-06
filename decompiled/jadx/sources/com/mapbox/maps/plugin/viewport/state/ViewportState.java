package com.mapbox.maps.plugin.viewport.state;

import com.mapbox.common.Cancelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "", "observeDataSource", "Lcom/mapbox/common/Cancelable;", "viewportStateDataObserver", "Lcom/mapbox/maps/plugin/viewport/state/ViewportStateDataObserver;", "startUpdatingCamera", "", "stopUpdatingCamera", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface ViewportState {
    @NotNull
    Cancelable observeDataSource(@NotNull ViewportStateDataObserver viewportStateDataObserver);

    void startUpdatingCamera();

    void stopUpdatingCamera();
}
