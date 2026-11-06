package com.mapbox.maps.loader;

import android.content.Context;
import androidx.startup.Initializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.mapbox.maps.MapboxConstants;
import com.mapbox.maps.assets.AssetManagerProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class MapboxMapsInitializerImpl implements Initializer<MapboxMaps> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public MapboxMaps create(Context context) {
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(MapboxConstants.MAP_SHARED_LIBRARY_NAME);
        new AssetManagerProvider().initialize(context.getAssets());
        return MapboxMaps.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MapboxSDKCommonInitializerImpl.class);
        return arrayList;
    }
}
