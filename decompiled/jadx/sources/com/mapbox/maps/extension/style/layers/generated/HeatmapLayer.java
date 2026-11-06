package com.mapbox.maps.extension.style.layers.generated;

import androidx.annotation.UiThread;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\r\u0010?\u001a\u00020\u0004H\u0010¢\u0006\u0002\b@J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bH\u0017J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0017J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u001cH\u0016J!\u0010\u001b\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C¢\u0006\u0002\bFH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u001cH\u0016J!\u0010#\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C¢\u0006\u0002\bFH\u0016J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0016H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u001cH\u0016J!\u0010)\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C¢\u0006\u0002\bFH\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0016H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0016H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0016H\u0016J\u0010\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0004H\u0016J\u0010\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0004H\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\bH\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020:H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\nR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0013\u0010!\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\nR\u0013\u0010#\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0013\u0010%\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u0013\u0010'\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0013\u0010)\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0013\u0010+\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018R\u0013\u0010-\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0011R\u0016\u00100\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0016\u00102\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018R\u0016\u00104\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0011R\u0013\u00107\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b8\u0010\u0011R\u0016\u00109\u001a\u0004\u0018\u00010:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010=\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\n¨\u0006H"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "filter", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "heatmapColor", "getHeatmapColor", "heatmapColorUseTheme", "getHeatmapColorUseTheme$annotations", "()V", "getHeatmapColorUseTheme", "()Ljava/lang/String;", "heatmapColorUseThemeAsExpression", "getHeatmapColorUseThemeAsExpression$annotations", "getHeatmapColorUseThemeAsExpression", "heatmapIntensity", "", "getHeatmapIntensity", "()Ljava/lang/Double;", "heatmapIntensityAsExpression", "getHeatmapIntensityAsExpression", "heatmapIntensityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getHeatmapIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "heatmapOpacity", "getHeatmapOpacity", "heatmapOpacityAsExpression", "getHeatmapOpacityAsExpression", "heatmapOpacityTransition", "getHeatmapOpacityTransition", "heatmapRadius", "getHeatmapRadius", "heatmapRadiusAsExpression", "getHeatmapRadiusAsExpression", "heatmapRadiusTransition", "getHeatmapRadiusTransition", "heatmapWeight", "getHeatmapWeight", "heatmapWeightAsExpression", "getHeatmapWeightAsExpression", "getLayerId", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "getType", "getType$extension_style_release", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class HeatmapLayer extends Layer implements HeatmapLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public HeatmapLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer filter(@NotNull Expression filter) {
        filter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("filter", filter));
        return this;
    }

    @Nullable
    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
    }

    @Nullable
    public final Expression getHeatmapColor() {
        return (Expression) getPropertyValueWithType("heatmap-color", Expression.class);
    }

    @Nullable
    public final String getHeatmapColorUseTheme() {
        return (String) getPropertyValueWithType("heatmap-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getHeatmapColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-color-use-theme");
    }

    @Nullable
    public final Double getHeatmapIntensity() {
        return (Double) getPropertyValueWithType("heatmap-intensity", Double.class);
    }

    @Nullable
    public final Expression getHeatmapIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-intensity");
    }

    @Nullable
    public final StyleTransition getHeatmapIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("heatmap-intensity-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getHeatmapOpacity() {
        return (Double) getPropertyValueWithType("heatmap-opacity", Double.class);
    }

    @Nullable
    public final Expression getHeatmapOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-opacity");
    }

    @Nullable
    public final StyleTransition getHeatmapOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("heatmap-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getHeatmapRadius() {
        return (Double) getPropertyValueWithType("heatmap-radius", Double.class);
    }

    @Nullable
    public final Expression getHeatmapRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-radius");
    }

    @Nullable
    public final StyleTransition getHeatmapRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("heatmap-radius-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getHeatmapWeight() {
        return (Double) getPropertyValueWithType("heatmap-weight", Double.class);
    }

    @Nullable
    public final Expression getHeatmapWeightAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-weight");
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Double getMaxZoom() {
        return (Double) getPropertyValueWithType("maxzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Double getMinZoom() {
        return (Double) getPropertyValueWithType("minzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    @NotNull
    public final String getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final String getSourceLayer() {
        return (String) getPropertyValueWithType("source-layer", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getType$extension_style_release() {
        return "heatmap";
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Visibility getVisibility() {
        String str = (String) getPropertyValueWithType("visibility", String.class);
        if (str == null) {
            return null;
        }
        Visibility.Companion companion = Visibility.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public Expression getVisibilityAsExpression() {
        return (Expression) getPropertyValueWithType("visibility", Expression.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapColor(@NotNull Expression heatmapColor) {
        heatmapColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-color", heatmapColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @MapboxExperimental
    @NotNull
    public HeatmapLayer heatmapColorUseTheme(@NotNull String heatmapColorUseTheme) {
        heatmapColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-color-use-theme", heatmapColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapIntensity(double heatmapIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-intensity", Double.valueOf(heatmapIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapIntensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        heatmapIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapOpacity(double heatmapOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-opacity", Double.valueOf(heatmapOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        heatmapOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapRadius(double heatmapRadius) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-radius", Double.valueOf(heatmapRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapRadiusTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        heatmapRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapWeight(double heatmapWeight) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-weight", Double.valueOf(heatmapWeight)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HeatmapLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HeatmapLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HeatmapLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HeatmapLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0006R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0013\u0010#\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0013\u0010%\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0013\u0010)\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010\u0012R\u0013\u0010+\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer$Companion;", "", "()V", "defaultHeatmapColor", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultHeatmapColor", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultHeatmapColorUseTheme", "", "getDefaultHeatmapColorUseTheme$annotations", "getDefaultHeatmapColorUseTheme", "()Ljava/lang/String;", "defaultHeatmapColorUseThemeAsExpression", "getDefaultHeatmapColorUseThemeAsExpression$annotations", "getDefaultHeatmapColorUseThemeAsExpression", "defaultHeatmapIntensity", "", "getDefaultHeatmapIntensity", "()Ljava/lang/Double;", "defaultHeatmapIntensityAsExpression", "getDefaultHeatmapIntensityAsExpression", "defaultHeatmapIntensityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultHeatmapIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultHeatmapOpacity", "getDefaultHeatmapOpacity", "defaultHeatmapOpacityAsExpression", "getDefaultHeatmapOpacityAsExpression", "defaultHeatmapOpacityTransition", "getDefaultHeatmapOpacityTransition", "defaultHeatmapRadius", "getDefaultHeatmapRadius", "defaultHeatmapRadiusAsExpression", "getDefaultHeatmapRadiusAsExpression", "defaultHeatmapRadiusTransition", "getDefaultHeatmapRadiusTransition", "defaultHeatmapWeight", "getDefaultHeatmapWeight", "defaultHeatmapWeightAsExpression", "getDefaultHeatmapWeightAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Expression getDefaultHeatmapColor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Expression) obj;
        }

        @Nullable
        public final String getDefaultHeatmapColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultHeatmapColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            String defaultHeatmapColorUseTheme = getDefaultHeatmapColorUseTheme();
            if (defaultHeatmapColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHeatmapColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultHeatmapIntensity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultHeatmapIntensityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultHeatmapIntensity = getDefaultHeatmapIntensity();
            if (defaultHeatmapIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapIntensity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultHeatmapIntensityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultHeatmapOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultHeatmapOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultHeatmapOpacity = getDefaultHeatmapOpacity();
            if (defaultHeatmapOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultHeatmapOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultHeatmapRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultHeatmapRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultHeatmapRadius = getDefaultHeatmapRadius();
            if (defaultHeatmapRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapRadius.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultHeatmapRadiusTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultHeatmapWeight() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-weight");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultHeatmapWeightAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-weight");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Expression expression = (Expression) obj;
            if (expression != null) {
                return expression;
            }
            Double defaultHeatmapWeight = getDefaultHeatmapWeight();
            if (defaultHeatmapWeight == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapWeight.doubleValue());
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "maxzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Double getDefaultMinZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Visibility getDefaultVisibility() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "visibility");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            Visibility.Companion companion = Visibility.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        private Companion() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHeatmapColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHeatmapColorUseThemeAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @MapboxExperimental
    @NotNull
    public HeatmapLayer heatmapColorUseTheme(@NotNull Expression heatmapColorUseTheme) {
        heatmapColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-color-use-theme", heatmapColorUseTheme));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getHeatmapColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHeatmapColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapIntensity(@NotNull Expression heatmapIntensity) {
        heatmapIntensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-intensity", heatmapIntensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapOpacity(@NotNull Expression heatmapOpacity) {
        heatmapOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-opacity", heatmapOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapRadius(@NotNull Expression heatmapRadius) {
        heatmapRadius.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-radius", heatmapRadius));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapWeight(@NotNull Expression heatmapWeight) {
        heatmapWeight.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-weight", heatmapWeight));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HeatmapLayer visibility(@NotNull Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapIntensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @NotNull
    public HeatmapLayer heatmapRadiusTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-radius-transition", options));
        return this;
    }
}
