package com.mapbox.maps;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class StyleManager extends Observable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class StyleManagerPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManager.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public StyleManager(long j) {
        super(0L);
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @NonNull
    @MainThread
    public static native StylePropertyValue getStyleLayerPropertyDefaultValue(@NonNull String str, @NonNull String str2);

    @NonNull
    @MainThread
    public static native StylePropertyValue getStyleSourcePropertyDefaultValue(@NonNull String str, @NonNull String str2);

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new StyleManagerPeerCleaner(j));
    }

    @NonNull
    public native Expected<String, None> addGeoJSONSourceFeatures(@NonNull String str, @NonNull String str2, @NonNull List<Feature> list);

    @NonNull
    @MainThread
    public native Expected<String, None> addPersistentStyleCustomLayer(@NonNull String str, @NonNull CustomLayerHost customLayerHost, @Nullable LayerPosition layerPosition);

    @NonNull
    @MainThread
    public native Expected<String, None> addPersistentStyleLayer(@NonNull Value value, @Nullable LayerPosition layerPosition);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleCustomGeometrySource(@NonNull String str, @NonNull CustomGeometrySourceOptions customGeometrySourceOptions);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleCustomLayer(@NonNull String str, @NonNull CustomLayerHost customLayerHost, @Nullable LayerPosition layerPosition);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleCustomRasterSource(@NonNull String str, @NonNull CustomRasterSourceOptions customRasterSourceOptions);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleImage(@NonNull String str, float f, @NonNull Image image, boolean z, @NonNull List<ImageStretches> list, @NonNull List<ImageStretches> list2, @Nullable ImageContent imageContent);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleImportFromJSON(@NonNull String str, @NonNull String str2, @Nullable HashMap<String, Value> hashMap, @Nullable ImportPosition importPosition);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleImportFromURI(@NonNull String str, @NonNull String str2, @Nullable HashMap<String, Value> hashMap, @Nullable ImportPosition importPosition);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleLayer(@NonNull Value value, @Nullable LayerPosition layerPosition);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleModel(@NonNull String str, @NonNull String str2);

    @NonNull
    @MainThread
    public native Expected<String, None> addStyleSource(@NonNull String str, @NonNull Value value);

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void cancelStyleLoading();

    @NonNull
    @MainThread
    public native StylePropertyValue getStyleAtmosphereProperty(@NonNull String str);

    @NonNull
    @MainThread
    public native CameraOptions getStyleDefaultCamera();

    @NonNull
    @MainThread
    public native List<FeaturesetDescriptor> getStyleFeaturesets();

    @NonNull
    @MainThread
    public native String getStyleGlyphURL();

    @Nullable
    @MainThread
    public native Image getStyleImage(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, StylePropertyValue> getStyleImportConfigProperty(@NonNull String str, @NonNull String str2);

    @NonNull
    @MainThread
    public native Expected<String, Value> getStyleImportSchema(@NonNull String str);

    @NonNull
    @MainThread
    public native List<StyleObjectInfo> getStyleImports();

    @NonNull
    @MainThread
    public native String getStyleJSON();

    @NonNull
    @MainThread
    public native Expected<String, Value> getStyleLayerProperties(@NonNull String str);

    @NonNull
    @MainThread
    public native StylePropertyValue getStyleLayerProperty(@NonNull String str, @NonNull String str2);

    @NonNull
    @MainThread
    public native List<StyleObjectInfo> getStyleLayers();

    @NonNull
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native StylePropertyValue getStyleLightProperty(@NonNull String str, @NonNull String str2);

    @NonNull
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native List<StyleObjectInfo> getStyleLights();

    @NonNull
    @MainThread
    public native StylePropertyValue getStyleProjectionProperty(@NonNull String str);

    @NonNull
    @MainThread
    public native StylePropertyValue getStyleRainProperty(@NonNull String str);

    @NonNull
    @MainThread
    public native List<String> getStyleSlots();

    @NonNull
    @MainThread
    public native StylePropertyValue getStyleSnowProperty(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, Value> getStyleSourceProperties(@NonNull String str);

    @NonNull
    @MainThread
    public native StylePropertyValue getStyleSourceProperty(@NonNull String str, @NonNull String str2);

    @NonNull
    @MainThread
    public native List<StyleObjectInfo> getStyleSources();

    @NonNull
    @MainThread
    public native StylePropertyValue getStyleTerrainProperty(@NonNull String str);

    @NonNull
    @MainThread
    public native TransitionOptions getStyleTransition();

    @NonNull
    @MainThread
    public native String getStyleURI();

    @MainThread
    public native boolean hasStyleImage(@NonNull String str);

    @MainThread
    public native boolean hasStyleModel(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, None> invalidateStyleCustomGeometrySourceRegion(@NonNull String str, @NonNull CoordinateBounds coordinateBounds);

    @NonNull
    @MainThread
    public native Expected<String, None> invalidateStyleCustomGeometrySourceTile(@NonNull String str, @NonNull CanonicalTileID canonicalTileID);

    @NonNull
    @MainThread
    public native Expected<String, Boolean> isStyleLayerPersistent(@NonNull String str);

    @MainThread
    public native boolean isStyleLoaded();

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native boolean isStyleLoadingFinished();

    @NonNull
    @MainThread
    public native Expected<String, None> moveStyleImport(@NonNull String str, @Nullable ImportPosition importPosition);

    @NonNull
    @MainThread
    public native Expected<String, None> moveStyleLayer(@NonNull String str, @Nullable LayerPosition layerPosition);

    @NonNull
    public native Expected<String, None> removeGeoJSONSourceFeatures(@NonNull String str, @NonNull String str2, @NonNull List<String> list);

    @NonNull
    @MainThread
    public native Expected<String, None> removeStyleImage(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, None> removeStyleImport(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, None> removeStyleLayer(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, None> removeStyleModel(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, None> removeStyleSource(@NonNull String str);

    @NonNull
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native Expected<String, None> removeStyleSourceUnchecked(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, None> setImportColorTheme(@NonNull String str, @Nullable ColorTheme colorTheme);

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void setInitialStyleColorTheme();

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleAtmosphere(@NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleAtmosphereProperty(@NonNull String str, @NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleColorTheme(@Nullable ColorTheme colorTheme);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleCustomGeometrySourceTileData(@NonNull String str, @NonNull CanonicalTileID canonicalTileID, @NonNull List<Feature> list);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleCustomRasterSourceTileData(@NonNull String str, @NonNull List<CustomRasterSourceTileData> list);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native Expected<String, None> setStyleGeoJSONSourceData(@NonNull String str, @NonNull String str2, @NonNull GeoJSONSourceData geoJSONSourceData);

    @MainThread
    public native void setStyleGlyphURL(@NonNull String str);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleImportConfigProperties(@NonNull String str, @NonNull HashMap<String, Value> hashMap);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleImportConfigProperty(@NonNull String str, @NonNull String str2, @NonNull Value value);

    @MainThread
    public native void setStyleJSON(@NonNull String str);

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void setStyleJSON(@NonNull String str, @NonNull RuntimeStylingOptions runtimeStylingOptions);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleLayerProperties(@NonNull String str, @NonNull Value value);

    @NonNull
    public native Cancelable setStyleLayerPropertiesAsync(@NonNull String str, @NonNull Value value, @NonNull AsyncOperationResultCallback asyncOperationResultCallback);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleLayerProperty(@NonNull String str, @NonNull String str2, @NonNull Value value);

    @NonNull
    public native Cancelable setStyleLayerPropertyAsync(@NonNull String str, @NonNull String str2, @NonNull Value value, @NonNull AsyncOperationResultCallback asyncOperationResultCallback);

    @NonNull
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native Expected<String, None> setStyleLightProperty(@NonNull String str, @NonNull String str2, @NonNull Value value);

    @NonNull
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native Expected<String, None> setStyleLights(@NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleProjection(@NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleProjectionProperty(@NonNull String str, @NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleRain(@NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleRainProperty(@NonNull String str, @NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleSnow(@NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleSnowProperty(@NonNull String str, @NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleSourceProperties(@NonNull String str, @NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleSourceProperty(@NonNull String str, @NonNull String str2, @NonNull Value value);

    @NonNull
    @MainThread
    @Deprecated
    public native Expected<String, None> setStyleSourceProperty(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleTerrain(@NonNull Value value);

    @NonNull
    @MainThread
    public native Expected<String, None> setStyleTerrainProperty(@NonNull String str, @NonNull Value value);

    @MainThread
    public native void setStyleTransition(@NonNull TransitionOptions transitionOptions);

    @MainThread
    public native void setStyleURI(@NonNull String str);

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public native void setStyleURI(@NonNull String str, @NonNull RuntimeStylingOptions runtimeStylingOptions);

    @MainThread
    public native boolean styleLayerExists(@NonNull String str);

    @MainThread
    public native boolean styleSourceExists(@NonNull String str);

    @NonNull
    public native Expected<String, None> updateGeoJSONSourceFeatures(@NonNull String str, @NonNull String str2, @NonNull List<Feature> list);

    @NonNull
    @MainThread
    public native Expected<String, None> updateStyleImageSourceImage(@NonNull String str, @NonNull Image image);

    @NonNull
    @MainThread
    public native Expected<String, None> updateStyleImportWithJSON(@NonNull String str, @NonNull String str2, @Nullable HashMap<String, Value> hashMap);

    @NonNull
    @MainThread
    public native Expected<String, None> updateStyleImportWithURI(@NonNull String str, @NonNull String str2, @Nullable HashMap<String, Value> hashMap);
}
