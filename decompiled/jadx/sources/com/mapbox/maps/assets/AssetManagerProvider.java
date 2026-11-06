package com.mapbox.maps.assets;

import android.content.res.AssetManager;
import androidx.annotation.Keep;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes8.dex */
public class AssetManagerProvider {
    private long peer = 0;

    static {
        try {
            BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        } catch (Throwable unused) {
        }
    }

    public native void finalize();

    public native void initialize(AssetManager assetManager);
}
