package com.mapbox.maps.plugin.locationcomponent;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.react.uimanager.ViewProps;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import java.util.HashMap;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\tJ\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\u0004J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R6\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t`\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerWrapper;", "", "layerId", "", "(Ljava/lang/String;)V", "getLayerId", "()Ljava/lang/String;", "layerProperties", "Ljava/util/HashMap;", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "getLayerProperties", "()Ljava/util/HashMap;", "setLayerProperties", "(Ljava/util/HashMap;)V", "style", "Lcom/mapbox/maps/MapboxStyleManager;", "bindTo", "", "position", "Lcom/mapbox/maps/LayerPosition;", "toValue", "updateProperty", "propertyName", "value", "updateStyle", "visibility", "", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class LocationLayerWrapper {

    @NotNull
    private static final String TAG = "MapboxLocationLayerWrapper";

    @NotNull
    private final String layerId;

    @NotNull
    private HashMap<String, Value> layerProperties;

    @Nullable
    private MapboxStyleManager style;

    public LocationLayerWrapper(@NotNull String str) {
        str.getClass();
        this.layerId = str;
        this.layerProperties = new HashMap<>();
    }

    public static /* synthetic */ void bindTo$default(LocationLayerWrapper locationLayerWrapper, MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: bindTo");
            return;
        }
        if ((i & 2) != 0) {
            layerPosition = null;
        }
        locationLayerWrapper.bindTo(mapboxStyleManager, layerPosition);
    }

    public final void bindTo(@NotNull MapboxStyleManager style, @Nullable LayerPosition position) {
        style.getClass();
        this.style = style;
        String error = style.addPersistentStyleLayer(toValue(), position).getError();
        if (error != null) {
            throw new MapboxLocationComponentException("Add layer failed: ".concat(error));
        }
    }

    @NotNull
    public final String getLayerId() {
        return this.layerId;
    }

    @NotNull
    public final HashMap<String, Value> getLayerProperties() {
        return this.layerProperties;
    }

    public final void setLayerProperties(@NotNull HashMap<String, Value> hashMap) {
        hashMap.getClass();
        this.layerProperties = hashMap;
    }

    @NotNull
    public final Value toValue() {
        return new Value(this.layerProperties);
    }

    public final void updateProperty(@NotNull String propertyName, @NotNull Value value) {
        String error;
        propertyName.getClass();
        value.getClass();
        this.layerProperties.put(propertyName, value);
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleLayerProperty(this.layerId, propertyName, value).getError()) == null) {
            return;
        }
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Set layer property \"", propertyName, "\" failed:\nError: ", error, "\nValue set: ");
        m.append(value);
        MapboxLogger.logE(TAG, m.toString());
    }

    public final void updateStyle(@NotNull MapboxStyleManager style) {
        style.getClass();
        this.style = style;
    }

    public final void visibility(boolean visibility) {
        updateProperty("visibility", new Value(visibility ? ViewProps.VISIBLE : "none"));
    }
}
