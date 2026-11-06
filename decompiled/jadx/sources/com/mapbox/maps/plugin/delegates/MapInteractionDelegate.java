package com.mapbox.maps.plugin.delegates;

import androidx.annotation.RestrictTo;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.PlatformEventInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapInteractionDelegate;", "", "addInteraction", "Lcom/mapbox/common/Cancelable;", "interaction", "Lcom/mapbox/maps/MapInteraction;", "dispatch", "", "platformEventInfo", "Lcom/mapbox/maps/PlatformEventInfo;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public interface MapInteractionDelegate {
    @NotNull
    Cancelable addInteraction(@NotNull MapInteraction interaction);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void dispatch(@NotNull PlatformEventInfo platformEventInfo);
}
