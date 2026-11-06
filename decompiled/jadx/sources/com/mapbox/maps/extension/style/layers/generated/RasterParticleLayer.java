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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\r\u0010V\u001a\u00020\u0004H\u0010¢\u0006\u0002\bWJ\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bH\u0017J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004H\u0017J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0017J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\bH\u0017J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0017J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\bH\u0017J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$H\u0017J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\bH\u0017J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000eH\u0017J\u0010\u00101\u001a\u00020\u00002\u0006\u0010X\u001a\u000202H\u0017J!\u00101\u001a\u00020\u00002\u0017\u0010Y\u001a\u0013\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0Z¢\u0006\u0002\b]H\u0017J\u0010\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\bH\u0017J\u0010\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000eH\u0017J\u0010\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\bH\u0017J\u0010\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000eH\u0017J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\bH\u0017J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u000eH\u0017J\u0010\u0010H\u001a\u00020\u00002\u0006\u0010X\u001a\u000202H\u0017J!\u0010H\u001a\u00020\u00002\u0017\u0010Y\u001a\u0013\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\\0Z¢\u0006\u0002\b]H\u0017J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0004H\u0016J\u0010\u0010N\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0004H\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\bH\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010P\u001a\u00020QH\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\fR\u001c\u0010 \u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\nR\u001c\u0010#\u001a\u0004\u0018\u00010$8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\nR\u001c\u0010+\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0010R\u001c\u0010.\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\nR\u001c\u00101\u001a\u0004\u0018\u0001028FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0015\u001a\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0015\u001a\u0004\b8\u0010\u0010R\u001c\u00109\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0015\u001a\u0004\b;\u0010\nR\u001c\u0010<\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010\u0010R\u001c\u0010?\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0015\u001a\u0004\bA\u0010\nR\u001c\u0010B\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0015\u001a\u0004\bD\u0010\u0010R\u001c\u0010E\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010\u0015\u001a\u0004\bG\u0010\nR\u001c\u0010H\u001a\u0004\u0018\u0001028FX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010\u0015\u001a\u0004\bJ\u00105R\u0016\u0010K\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\fR\u0013\u0010N\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bO\u0010\fR\u0016\u0010P\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010T\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\n¨\u0006_"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "filter", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getLayerId", "()Ljava/lang/String;", "maxZoom", "", "getMaxZoom", "()Ljava/lang/Double;", "minZoom", "getMinZoom", "rasterParticleArrayBand", "getRasterParticleArrayBand$annotations", "()V", "getRasterParticleArrayBand", "rasterParticleArrayBandAsExpression", "getRasterParticleArrayBandAsExpression$annotations", "getRasterParticleArrayBandAsExpression", "rasterParticleColor", "getRasterParticleColor$annotations", "getRasterParticleColor", "rasterParticleColorUseTheme", "getRasterParticleColorUseTheme$annotations", "getRasterParticleColorUseTheme", "rasterParticleColorUseThemeAsExpression", "getRasterParticleColorUseThemeAsExpression$annotations", "getRasterParticleColorUseThemeAsExpression", "rasterParticleCount", "", "getRasterParticleCount$annotations", "getRasterParticleCount", "()Ljava/lang/Long;", "rasterParticleCountAsExpression", "getRasterParticleCountAsExpression$annotations", "getRasterParticleCountAsExpression", "rasterParticleFadeOpacityFactor", "getRasterParticleFadeOpacityFactor$annotations", "getRasterParticleFadeOpacityFactor", "rasterParticleFadeOpacityFactorAsExpression", "getRasterParticleFadeOpacityFactorAsExpression$annotations", "getRasterParticleFadeOpacityFactorAsExpression", "rasterParticleFadeOpacityFactorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getRasterParticleFadeOpacityFactorTransition$annotations", "getRasterParticleFadeOpacityFactorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "rasterParticleMaxSpeed", "getRasterParticleMaxSpeed$annotations", "getRasterParticleMaxSpeed", "rasterParticleMaxSpeedAsExpression", "getRasterParticleMaxSpeedAsExpression$annotations", "getRasterParticleMaxSpeedAsExpression", "rasterParticleResetRateFactor", "getRasterParticleResetRateFactor$annotations", "getRasterParticleResetRateFactor", "rasterParticleResetRateFactorAsExpression", "getRasterParticleResetRateFactorAsExpression$annotations", "getRasterParticleResetRateFactorAsExpression", "rasterParticleSpeedFactor", "getRasterParticleSpeedFactor$annotations", "getRasterParticleSpeedFactor", "rasterParticleSpeedFactorAsExpression", "getRasterParticleSpeedFactorAsExpression$annotations", "getRasterParticleSpeedFactorAsExpression", "rasterParticleSpeedFactorTransition", "getRasterParticleSpeedFactorTransition$annotations", "getRasterParticleSpeedFactorTransition", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "getType", "getType$extension_style_release", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
@MapboxExperimental
/* loaded from: classes9.dex */
public final class RasterParticleLayer extends Layer implements RasterParticleLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public RasterParticleLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @NotNull
    public RasterParticleLayer filter(@NotNull Expression filter) {
        filter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("filter", filter));
        return this;
    }

    @Nullable
    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
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

    @Nullable
    public final String getRasterParticleArrayBand() {
        return (String) getPropertyValueWithType("raster-particle-array-band", String.class);
    }

    @Nullable
    public final Expression getRasterParticleArrayBandAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-array-band");
    }

    @Nullable
    public final Expression getRasterParticleColor() {
        return (Expression) getPropertyValueWithType("raster-particle-color", Expression.class);
    }

    @Nullable
    public final String getRasterParticleColorUseTheme() {
        return (String) getPropertyValueWithType("raster-particle-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getRasterParticleColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-color-use-theme");
    }

    @Nullable
    public final Long getRasterParticleCount() {
        Number number = (Number) getPropertyValueWithType("raster-particle-count", Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    @Nullable
    public final Expression getRasterParticleCountAsExpression() {
        Expression propertyValueAsExpressionOrLiteralExpression$extension_style_release = getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-count");
        if (propertyValueAsExpressionOrLiteralExpression$extension_style_release == null) {
            return null;
        }
        Object literalValue = propertyValueAsExpressionOrLiteralExpression$extension_style_release.getLiteralValue();
        Number number = literalValue instanceof Number ? (Number) literalValue : null;
        if (number != null) {
            Expression literal = Expression.INSTANCE.literal(number.longValue());
            if (literal != null) {
                return literal;
            }
        }
        return propertyValueAsExpressionOrLiteralExpression$extension_style_release;
    }

    @Nullable
    public final Double getRasterParticleFadeOpacityFactor() {
        return (Double) getPropertyValueWithType("raster-particle-fade-opacity-factor", Double.class);
    }

    @Nullable
    public final Expression getRasterParticleFadeOpacityFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-fade-opacity-factor");
    }

    @Nullable
    public final StyleTransition getRasterParticleFadeOpacityFactorTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-particle-fade-opacity-factor-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getRasterParticleMaxSpeed() {
        return (Double) getPropertyValueWithType("raster-particle-max-speed", Double.class);
    }

    @Nullable
    public final Expression getRasterParticleMaxSpeedAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-max-speed");
    }

    @Nullable
    public final Double getRasterParticleResetRateFactor() {
        return (Double) getPropertyValueWithType("raster-particle-reset-rate-factor", Double.class);
    }

    @Nullable
    public final Expression getRasterParticleResetRateFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-reset-rate-factor");
    }

    @Nullable
    public final Double getRasterParticleSpeedFactor() {
        return (Double) getPropertyValueWithType("raster-particle-speed-factor", Double.class);
    }

    @Nullable
    public final Expression getRasterParticleSpeedFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-speed-factor");
    }

    @Nullable
    public final StyleTransition getRasterParticleSpeedFactorTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-particle-speed-factor-transition", StyleTransition.class);
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
        return "raster-particle";
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

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterParticleLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterParticleLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleArrayBand(@NotNull String rasterParticleArrayBand) {
        rasterParticleArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-array-band", rasterParticleArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleColor(@NotNull Expression rasterParticleColor) {
        rasterParticleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-color", rasterParticleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleColorUseTheme(@NotNull String rasterParticleColorUseTheme) {
        rasterParticleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-color-use-theme", rasterParticleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleCount(long rasterParticleCount) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-count", Long.valueOf(rasterParticleCount)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleFadeOpacityFactor(double rasterParticleFadeOpacityFactor) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-fade-opacity-factor", Double.valueOf(rasterParticleFadeOpacityFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleFadeOpacityFactorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterParticleFadeOpacityFactorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleMaxSpeed(double rasterParticleMaxSpeed) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-max-speed", Double.valueOf(rasterParticleMaxSpeed)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleResetRateFactor(double rasterParticleResetRateFactor) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-reset-rate-factor", Double.valueOf(rasterParticleResetRateFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleSpeedFactor(double rasterParticleSpeedFactor) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-speed-factor", Double.valueOf(rasterParticleSpeedFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleSpeedFactorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterParticleSpeedFactorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterParticleLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @NotNull
    public RasterParticleLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterParticleLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0012R\u001c\u0010$\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0006R\u001c\u0010'\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0012R\u001c\u0010*\u001a\u0004\u0018\u00010+8FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0006R\u001c\u00102\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0012R\u001c\u00105\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0006R\u001c\u00108\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0012R\u001c\u0010;\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0006R\u001c\u0010>\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0012R\u001c\u0010A\u001a\u0004\u0018\u00010+8FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010.R\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultRasterParticleArrayBand", "", "getDefaultRasterParticleArrayBand$annotations", "getDefaultRasterParticleArrayBand", "()Ljava/lang/String;", "defaultRasterParticleArrayBandAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultRasterParticleArrayBandAsExpression$annotations", "getDefaultRasterParticleArrayBandAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultRasterParticleColor", "getDefaultRasterParticleColor$annotations", "getDefaultRasterParticleColor", "defaultRasterParticleColorUseTheme", "getDefaultRasterParticleColorUseTheme$annotations", "getDefaultRasterParticleColorUseTheme", "defaultRasterParticleColorUseThemeAsExpression", "getDefaultRasterParticleColorUseThemeAsExpression$annotations", "getDefaultRasterParticleColorUseThemeAsExpression", "defaultRasterParticleCount", "", "getDefaultRasterParticleCount$annotations", "getDefaultRasterParticleCount", "()Ljava/lang/Long;", "defaultRasterParticleCountAsExpression", "getDefaultRasterParticleCountAsExpression$annotations", "getDefaultRasterParticleCountAsExpression", "defaultRasterParticleFadeOpacityFactor", "getDefaultRasterParticleFadeOpacityFactor$annotations", "getDefaultRasterParticleFadeOpacityFactor", "defaultRasterParticleFadeOpacityFactorAsExpression", "getDefaultRasterParticleFadeOpacityFactorAsExpression$annotations", "getDefaultRasterParticleFadeOpacityFactorAsExpression", "defaultRasterParticleFadeOpacityFactorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultRasterParticleFadeOpacityFactorTransition$annotations", "getDefaultRasterParticleFadeOpacityFactorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultRasterParticleMaxSpeed", "getDefaultRasterParticleMaxSpeed$annotations", "getDefaultRasterParticleMaxSpeed", "defaultRasterParticleMaxSpeedAsExpression", "getDefaultRasterParticleMaxSpeedAsExpression$annotations", "getDefaultRasterParticleMaxSpeedAsExpression", "defaultRasterParticleResetRateFactor", "getDefaultRasterParticleResetRateFactor$annotations", "getDefaultRasterParticleResetRateFactor", "defaultRasterParticleResetRateFactorAsExpression", "getDefaultRasterParticleResetRateFactorAsExpression$annotations", "getDefaultRasterParticleResetRateFactorAsExpression", "defaultRasterParticleSpeedFactor", "getDefaultRasterParticleSpeedFactor$annotations", "getDefaultRasterParticleSpeedFactor", "defaultRasterParticleSpeedFactorAsExpression", "getDefaultRasterParticleSpeedFactorAsExpression$annotations", "getDefaultRasterParticleSpeedFactorAsExpression", "defaultRasterParticleSpeedFactorTransition", "getDefaultRasterParticleSpeedFactorTransition$annotations", "getDefaultRasterParticleSpeedFactorTransition", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final String getDefaultRasterParticleArrayBand() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-array-band");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultRasterParticleArrayBandAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-array-band");
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
            String defaultRasterParticleArrayBand = getDefaultRasterParticleArrayBand();
            if (defaultRasterParticleArrayBand != null) {
                return Expression.INSTANCE.literal(defaultRasterParticleArrayBand);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultRasterParticleColor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Expression) obj;
        }

        @Nullable
        public final String getDefaultRasterParticleColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultRasterParticleColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-color-use-theme");
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
            String defaultRasterParticleColorUseTheme = getDefaultRasterParticleColorUseTheme();
            if (defaultRasterParticleColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultRasterParticleColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Long getDefaultRasterParticleCount() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-count");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Number.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            Number number = (Number) obj;
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultRasterParticleCountAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-count");
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
            Long defaultRasterParticleCount = getDefaultRasterParticleCount();
            if (defaultRasterParticleCount == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleCount.longValue());
        }

        @Nullable
        public final Double getDefaultRasterParticleFadeOpacityFactor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-fade-opacity-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterParticleFadeOpacityFactorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-fade-opacity-factor");
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
            Double defaultRasterParticleFadeOpacityFactor = getDefaultRasterParticleFadeOpacityFactor();
            if (defaultRasterParticleFadeOpacityFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleFadeOpacityFactor.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterParticleFadeOpacityFactorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-fade-opacity-factor-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultRasterParticleMaxSpeed() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-max-speed");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterParticleMaxSpeedAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-max-speed");
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
            Double defaultRasterParticleMaxSpeed = getDefaultRasterParticleMaxSpeed();
            if (defaultRasterParticleMaxSpeed == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleMaxSpeed.doubleValue());
        }

        @Nullable
        public final Double getDefaultRasterParticleResetRateFactor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-reset-rate-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterParticleResetRateFactorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-reset-rate-factor");
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
            Double defaultRasterParticleResetRateFactor = getDefaultRasterParticleResetRateFactor();
            if (defaultRasterParticleResetRateFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleResetRateFactor.doubleValue());
        }

        @Nullable
        public final Double getDefaultRasterParticleSpeedFactor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-speed-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultRasterParticleSpeedFactorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-speed-factor");
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
            Double defaultRasterParticleSpeedFactor = getDefaultRasterParticleSpeedFactor();
            if (defaultRasterParticleSpeedFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleSpeedFactor.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultRasterParticleSpeedFactorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-speed-factor-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Visibility getDefaultVisibility() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "visibility");
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
        public static /* synthetic */ void getDefaultRasterParticleArrayBand$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleArrayBandAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleCount$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleCountAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleFadeOpacityFactor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleFadeOpacityFactorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleFadeOpacityFactorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleMaxSpeed$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleMaxSpeedAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleResetRateFactor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleResetRateFactorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleSpeedFactor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleSpeedFactorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleSpeedFactorTransition$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleArrayBand(@NotNull Expression rasterParticleArrayBand) {
        rasterParticleArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-array-band", rasterParticleArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleColorUseTheme(@NotNull Expression rasterParticleColorUseTheme) {
        rasterParticleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-color-use-theme", rasterParticleColorUseTheme));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleArrayBand$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleArrayBandAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleCount$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleCountAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleMaxSpeed$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleMaxSpeedAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleResetRateFactor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleResetRateFactorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactorTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleCount(@NotNull Expression rasterParticleCount) {
        rasterParticleCount.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-count", rasterParticleCount));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleFadeOpacityFactor(@NotNull Expression rasterParticleFadeOpacityFactor) {
        rasterParticleFadeOpacityFactor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-fade-opacity-factor", rasterParticleFadeOpacityFactor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleMaxSpeed(@NotNull Expression rasterParticleMaxSpeed) {
        rasterParticleMaxSpeed.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-max-speed", rasterParticleMaxSpeed));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleResetRateFactor(@NotNull Expression rasterParticleResetRateFactor) {
        rasterParticleResetRateFactor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-reset-rate-factor", rasterParticleResetRateFactor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleSpeedFactor(@NotNull Expression rasterParticleSpeedFactor) {
        rasterParticleSpeedFactor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-speed-factor", rasterParticleSpeedFactor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public RasterParticleLayer visibility(@NotNull Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleFadeOpacityFactorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-fade-opacity-factor-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    @NotNull
    public RasterParticleLayer rasterParticleSpeedFactorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-speed-factor-transition", options));
        return this;
    }
}
