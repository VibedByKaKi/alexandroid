package com.mapbox.maps.plugin.lifecycle;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.dee.app.contacts.common.constants.Constants;
import com.mapbox.maps.MapboxLifecycleObserver;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePluginImpl;", "Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePlugin;", "()V", "registerLifecycleObserver", "", "mapView", "Landroid/view/View;", "observer", "Lcom/mapbox/maps/MapboxLifecycleObserver;", "Companion", "plugin-lifecycle_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes9.dex */
public final class MapboxLifecyclePluginImpl implements MapboxLifecyclePlugin {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final String TAG = "MapboxLifecyclePlugin";

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        MapboxLifecyclePlugin.DefaultImpls.cleanup(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        MapboxLifecyclePlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(@NotNull MapDelegateProvider mapDelegateProvider) {
        MapboxLifecyclePlugin.DefaultImpls.onDelegateProvider(this, mapDelegateProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.ComponentCallbacks, com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl$registerLifecycleObserver$componentCallback$1] */
    @Override // com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePlugin
    public void registerLifecycleObserver(@NotNull final View mapView, @NotNull final MapboxLifecycleObserver observer) {
        mapView.getClass();
        observer.getClass();
        final ViewLifecycleOwner viewLifecycleOwner = new ViewLifecycleOwner(mapView);
        MapboxLogger.logD(TAG, "registerLifecycleObserver is called");
        final ?? r0 = new ComponentCallbacks2() { // from class: com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl$registerLifecycleObserver$componentCallback$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(@NotNull Configuration newConfig) {
                newConfig.getClass();
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                MapboxLifecycleObserver.this.onLowMemory();
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int level) {
                if (level == 10 || level == 15) {
                    MapboxLogger.logW("MapboxLifecyclePlugin", "onTrimMemory with level " + level + " is received, reduceMemoryUse will be called.");
                    MapboxLifecycleObserver.this.onLowMemory();
                }
            }
        };
        mapView.getContext().registerComponentCallbacks(r0);
        viewLifecycleOwner.getViewLifecycleRegistry().addObserver(new LifecycleObserver() { // from class: com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl$registerLifecycleObserver$1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                MapboxLogger.logI("MapboxLifecyclePlugin", "onDestroy is called, MapboxLifecycleObserver will be notified.");
                MapboxLifecycleObserver.this.onDestroy();
                viewLifecycleOwner.getViewLifecycleRegistry().removeObserver(this);
                viewLifecycleOwner.cleanUp();
                mapView.getContext().unregisterComponentCallbacks(r0);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                MapboxLogger.logI("MapboxLifecyclePlugin", "onResume is called, MapboxLifecycleObserver will be notified.");
                MapboxLifecycleObserver.this.onResume();
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                MapboxLogger.logI("MapboxLifecyclePlugin", "onStart is called, MapboxLifecycleObserver will be notified.");
                MapboxLifecycleObserver.this.onStart();
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                MapboxLogger.logI("MapboxLifecyclePlugin", "onStop is called, MapboxLifecycleObserver will be notified.");
                MapboxLifecycleObserver.this.onStop();
            }
        });
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/lifecycle/MapboxLifecyclePluginImpl$Companion;", "", "()V", Constants.LOG_TAG, "", "plugin-lifecycle_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
