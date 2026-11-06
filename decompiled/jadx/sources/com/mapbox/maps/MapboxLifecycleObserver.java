package com.mapbox.maps;

import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/mapbox/maps/MapboxLifecycleObserver;", "", "onDestroy", "", "onLowMemory", "onResume", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_START, ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface MapboxLifecycleObserver {
    void onDestroy();

    void onLowMemory();

    void onResume();

    void onStart();

    void onStop();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onResume(@NotNull MapboxLifecycleObserver mapboxLifecycleObserver) {
        }
    }
}
