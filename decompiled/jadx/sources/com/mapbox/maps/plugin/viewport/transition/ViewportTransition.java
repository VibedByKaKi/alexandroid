package com.mapbox.maps.plugin.viewport.transition;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.viewport.CompletionListener;
import com.mapbox.maps.plugin.viewport.state.ViewportState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/transition/ViewportTransition;", "", "run", "Lcom/mapbox/common/Cancelable;", TypedValues.TransitionType.S_TO, "Lcom/mapbox/maps/plugin/viewport/state/ViewportState;", "completionListener", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface ViewportTransition {
    @NotNull
    Cancelable run(@NotNull ViewportState to, @NotNull CompletionListener completionListener);
}
