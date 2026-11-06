package com.mapbox.maps.plugin.logo;

import android.view.View;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/mapbox/maps/plugin/logo/LogoPlugin;", "Lcom/mapbox/maps/plugin/ViewPlugin;", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettingsInterface;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface LogoPlugin extends ViewPlugin, LogoSettingsInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void cleanup(@NotNull LogoPlugin logoPlugin) {
            ViewPlugin.DefaultImpls.cleanup(logoPlugin);
        }

        public static void initialize(@NotNull LogoPlugin logoPlugin) {
            ViewPlugin.DefaultImpls.initialize(logoPlugin);
        }

        public static void onDelegateProvider(@NotNull LogoPlugin logoPlugin, @NotNull MapDelegateProvider mapDelegateProvider) {
            mapDelegateProvider.getClass();
            ViewPlugin.DefaultImpls.onDelegateProvider(logoPlugin, mapDelegateProvider);
        }

        public static void onPluginView(@NotNull LogoPlugin logoPlugin, @NotNull View view) {
            view.getClass();
            ViewPlugin.DefaultImpls.onPluginView(logoPlugin, view);
        }
    }
}
