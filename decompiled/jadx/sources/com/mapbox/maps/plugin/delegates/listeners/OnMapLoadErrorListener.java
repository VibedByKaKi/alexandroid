package com.mapbox.maps.plugin.delegates.listeners;

import com.mapbox.maps.extension.observable.eventdata.MapLoadingErrorEventData;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "This listener is deprecated, and will be removed in next major release. use MapLoadingErrorCallback instead.", replaceWith = @ReplaceWith(expression = "MapLoadingErrorCallback", imports = {}))
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/listeners/OnMapLoadErrorListener;", "", "onMapLoadError", "", "eventData", "Lcom/mapbox/maps/extension/observable/eventdata/MapLoadingErrorEventData;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface OnMapLoadErrorListener {
    void onMapLoadError(@NotNull MapLoadingErrorEventData eventData);
}
