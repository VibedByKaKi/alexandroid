package com.mapbox.maps.extension.style.projection.generated;

import androidx.annotation.UiThread;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.ProjectionName;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J\u0014\u0010\u0016\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR2\u0010\r\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000ej\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/extension/style/projection/generated/Projection;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleProjectionExtension;", "name", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ProjectionName;", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ProjectionName;)V", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "getName", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/ProjectionName;", "properties", "Ljava/util/HashMap;", "", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "Lkotlin/collections/HashMap;", "bindTo", "", "setProperty", "property", "updateProperty", "propertyValue", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class Projection implements StyleContract.StyleProjectionExtension {

    @Nullable
    private MapboxStyleManager delegate;

    @NotNull
    private final ProjectionName name;

    @NotNull
    private final HashMap<String, PropertyValue<?>> properties;

    public Projection(@NotNull ProjectionName projectionName) {
        projectionName.getClass();
        this.name = projectionName;
        this.properties = new HashMap<>();
        setProperty(new PropertyValue<>("name", projectionName));
    }

    private final void setProperty(PropertyValue<?> property) {
        this.properties.put(property.getPropertyName(), property);
        updateProperty(property);
    }

    private final void updateProperty(PropertyValue<?> propertyValue) {
        String error;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        Expected<String, None> styleProjectionProperty = mapboxStyleManager != null ? mapboxStyleManager.setStyleProjectionProperty(propertyValue.getPropertyName(), propertyValue.getValue()) : null;
        if (styleProjectionProperty == null || (error = styleProjectionProperty.getError()) == null) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1("Set projection property failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleProjectionExtension
    public void bindTo(@NotNull MapboxStyleManager delegate) {
        delegate.getClass();
        this.delegate = delegate;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, PropertyValue<?>> entry : this.properties.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().getValue());
        }
        String error = delegate.setStyleProjection(new Value((HashMap<String, Value>) hashMap)).getError();
        if (error == null) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1("Set projection failed: ".concat(error));
    }

    @Nullable
    /* renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final ProjectionName getName() {
        return this.name;
    }

    public final void setDelegate$extension_style_release(@Nullable MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }
}
