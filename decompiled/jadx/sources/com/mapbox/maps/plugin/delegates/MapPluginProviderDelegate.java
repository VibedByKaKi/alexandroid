package com.mapbox.maps.plugin.delegates;

import androidx.exifinterface.media.ExifInterface;
import com.mapbox.maps.plugin.MapPlugin;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "", "getPlugin", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mapbox/maps/plugin/MapPlugin;", "id", "", "(Ljava/lang/String;)Lcom/mapbox/maps/plugin/MapPlugin;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface MapPluginProviderDelegate {
    @Nullable
    <T extends MapPlugin> T getPlugin(@NotNull String id);
}
