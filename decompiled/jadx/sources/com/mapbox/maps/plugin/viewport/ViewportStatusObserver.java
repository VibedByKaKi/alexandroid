package com.mapbox.maps.plugin.viewport;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mapbox.maps.plugin.viewport.data.ViewportStatusChangeReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/ViewportStatusObserver;", "", "onViewportStatusChanged", "", "from", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", TypedValues.TransitionType.S_TO, "reason", "Lcom/mapbox/maps/plugin/viewport/data/ViewportStatusChangeReason;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface ViewportStatusObserver {
    void onViewportStatusChanged(@NotNull ViewportStatus from, @NotNull ViewportStatus to, @NotNull ViewportStatusChangeReason reason);
}
