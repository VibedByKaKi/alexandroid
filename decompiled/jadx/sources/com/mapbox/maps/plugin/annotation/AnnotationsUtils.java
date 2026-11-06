package com.mapbox.maps.plugin.annotation;

import androidx.annotation.RestrictTo;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"annotations", "Lcom/mapbox/maps/plugin/annotation/AnnotationPlugin;", "Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;", "getAnnotations", "(Lcom/mapbox/maps/plugin/delegates/MapPluginProviderDelegate;)Lcom/mapbox/maps/plugin/annotation/AnnotationPlugin;", "createAnnotationPlugin", "plugin-annotation_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "AnnotationsUtils")
/* loaded from: classes9.dex */
public final class AnnotationsUtils {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final /* synthetic */ AnnotationPlugin createAnnotationPlugin() {
        return new AnnotationPluginImpl();
    }

    @JvmName(name = "getAnnotations")
    @NotNull
    public static final AnnotationPlugin getAnnotations(@NotNull MapPluginProviderDelegate mapPluginProviderDelegate) {
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin(Plugin.MAPBOX_ANNOTATION_PLUGIN_ID);
        plugin.getClass();
        return (AnnotationPlugin) plugin;
    }
}
