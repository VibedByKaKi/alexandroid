package com.mapbox.maps.extension.style.terrain.generated;

import android.util.Log;
import androidx.annotation.UiThread;
import androidx.exifinterface.media.ExifInterface;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0011H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J!\u0010\u0014\u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001d0 ¢\u0006\u0002\b\"H\u0016J \u0010#\u001a\u0004\u0018\u0001H$\"\u0006\b\u0000\u0010$\u0018\u00012\u0006\u0010%\u001a\u00020\u0004H\u0082\b¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0014\u0010)\u001a\u00020\u001d2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0002J\u0014\u0010+\u001a\u00020\u001d2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R2\u0010\u0018\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/extension/style/terrain/generated/TerrainDslReceiver;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleTerrainExtension;", "sourceId", "", "(Ljava/lang/String;)V", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "exaggeration", "", "getExaggeration", "()Ljava/lang/Double;", "exaggerationAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getExaggerationAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "exaggerationTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getExaggerationTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "properties", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "Lkotlin/collections/HashMap;", "bindTo", "", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "Lkotlin/ExtensionFunctionType;", "getPropertyValue", ExifInterface.GPS_DIRECTION_TRUE, "propertyName", "(Ljava/lang/String;)Ljava/lang/Object;", "getTransitionProperty", "transitionName", "setProperty", "property", "updateProperty", "propertyValue", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class Terrain implements TerrainDslReceiver, StyleContract.StyleTerrainExtension {

    @NotNull
    private static final String TAG = "Mbgl-Terrain";

    @Nullable
    private MapboxStyleManager delegate;

    @NotNull
    private final HashMap<String, PropertyValue<?>> properties;

    @NotNull
    private final String sourceId;

    public Terrain(@NotNull String str) {
        str.getClass();
        this.sourceId = str;
        this.properties = new HashMap<>();
    }

    private final /* synthetic */ <T> T getPropertyValue(String propertyName) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m("Get property ", propertyName, " failed: terrain is not added to style yet."));
            return null;
        }
        try {
            StylePropertyValue styleTerrainProperty = mapboxStyleManager.getStyleTerrainProperty(propertyName);
            Intrinsics.reifiedOperationMarker(4, "T?");
            return (T) TypeUtilsKt.unwrap(styleTerrainProperty, Object.class);
        } catch (RuntimeException e) {
            Log.e(TAG, "Get terrain property failed: " + e.getMessage());
            Log.e(TAG, mapboxStyleManager.getStyleTerrainProperty(propertyName).toString());
            return null;
        }
    }

    private final StyleTransition getTransitionProperty(String transitionName) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m("Get property ", transitionName, " failed: terrain is not added to style yet."));
            return null;
        }
        try {
            Object contents = mapboxStyleManager.getStyleTerrainProperty(transitionName).getValue().getContents();
            contents.getClass();
            HashMap hashMap = (HashMap) contents;
            Value value = (Value) hashMap.get("duration");
            Object contents2 = value != null ? value.getContents() : null;
            contents2.getClass();
            long longValue = ((Long) contents2).longValue();
            Value value2 = (Value) hashMap.get("delay");
            Object contents3 = value2 != null ? value2.getContents() : null;
            contents3.getClass();
            return new StyleTransition.Builder().delay(((Long) contents3).longValue()).duration(longValue).build();
        } catch (RuntimeException e) {
            Log.e(TAG, "Get terrain property failed: " + e.getMessage());
            Log.e(TAG, mapboxStyleManager.getStyleTerrainProperty(transitionName).toString());
            return null;
        }
    }

    private final void setProperty(PropertyValue<?> property) {
        this.properties.put(property.getPropertyName(), property);
        updateProperty(property);
    }

    private final void updateProperty(PropertyValue<?> propertyValue) {
        String error;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        Expected<String, None> styleTerrainProperty = mapboxStyleManager != null ? mapboxStyleManager.setStyleTerrainProperty(propertyValue.getPropertyName(), propertyValue.getValue()) : null;
        if (styleTerrainProperty == null || (error = styleTerrainProperty.getError()) == null) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1("Set terrain property failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleTerrainExtension
    public void bindTo(@NotNull MapboxStyleManager delegate) {
        delegate.getClass();
        this.delegate = delegate;
        HashMap hashMap = new HashMap();
        hashMap.put("source", new Value(this.sourceId));
        for (Map.Entry<String, PropertyValue<?>> entry : this.properties.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().getValue());
        }
        String error = delegate.setStyleTerrain(new Value((HashMap<String, Value>) hashMap)).getError();
        if (error == null) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1("Set terrain failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    @NotNull
    public Terrain exaggeration(double exaggeration) {
        setProperty(new PropertyValue<>("exaggeration", Double.valueOf(exaggeration)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    @NotNull
    public Terrain exaggerationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        exaggerationTransition(builder.build());
        return this;
    }

    @Nullable
    /* renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    @Nullable
    public final Double getExaggeration() {
        Object obj;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Get property exaggeration failed: terrain is not added to style yet.");
            return null;
        }
        try {
            obj = TypeUtilsKt.unwrap(mapboxStyleManager.getStyleTerrainProperty("exaggeration"), Double.class);
        } catch (RuntimeException e) {
            Log.e(TAG, "Get terrain property failed: " + e.getMessage());
            Log.e(TAG, mapboxStyleManager.getStyleTerrainProperty("exaggeration").toString());
            obj = null;
        }
        return (Double) obj;
    }

    @Nullable
    public final Expression getExaggerationAsExpression() {
        Object obj;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Get property exaggeration failed: terrain is not added to style yet.");
            return null;
        }
        try {
            obj = TypeUtilsKt.unwrap(mapboxStyleManager.getStyleTerrainProperty("exaggeration"), Expression.class);
        } catch (RuntimeException e) {
            Log.e(TAG, "Get terrain property failed: " + e.getMessage());
            Log.e(TAG, mapboxStyleManager.getStyleTerrainProperty("exaggeration").toString());
            obj = null;
        }
        Expression expression = (Expression) obj;
        if (expression != null) {
            return expression;
        }
        Double exaggeration = getExaggeration();
        if (exaggeration == null) {
            return null;
        }
        return Expression.INSTANCE.literal(exaggeration.doubleValue());
    }

    @Nullable
    public final StyleTransition getExaggerationTransition() {
        return getTransitionProperty("exaggeration-transition");
    }

    public final void setDelegate$extension_style_release(@Nullable MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    @NotNull
    public Terrain exaggeration(@NotNull Expression exaggeration) {
        setProperty(RegionDefaults$$ExternalSyntheticOutline0.m("exaggeration", exaggeration, exaggeration));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    @NotNull
    public Terrain exaggerationTransition(@NotNull StyleTransition options) {
        setProperty(RegionDefaults$$ExternalSyntheticOutline0.m(options, "exaggeration-transition", options));
        return this;
    }
}
