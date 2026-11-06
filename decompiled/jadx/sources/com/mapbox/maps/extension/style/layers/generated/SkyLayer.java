package com.mapbox.maps.extension.style.layers.generated;

import androidx.annotation.ColorInt;
import androidx.annotation.UiThread;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.SkyType;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\r\u0010]\u001a\u00020\u0004H\u0010¢\u0006\u0002\b^J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0012\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0015H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H\u0017J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004H\u0017J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0012\u0010!\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0015H\u0016J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0007H\u0017J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004H\u0017J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0007H\u0016J\u0016\u0010-\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0.H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\rH\u0016J\u0010\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0007H\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0007H\u0016J\u0016\u00109\u001a\u00020\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00020\r0.H\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0007H\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\rH\u0016J\u0010\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0007H\u0017J\u0010\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0004H\u0017J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u0007H\u0016J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\rH\u0016J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010_\u001a\u00020LH\u0016J!\u0010K\u001a\u00020\u00002\u0017\u0010`\u001a\u0013\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0a¢\u0006\u0002\bdH\u0016J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0007H\u0016J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004H\u0016J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0007H\u0016J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010W\u001a\u00020XH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\tR\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000bR\u0013\u0010#\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b$\u0010\u0017R\u0013\u0010%\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010\tR\u001c\u0010'\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u000bR\u001c\u0010*\u001a\u0004\u0018\u00010\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\tR\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b2\u0010\tR\u0013\u00103\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b4\u0010\u000fR\u0013\u00105\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b6\u0010\tR\u0013\u00107\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b8\u0010\tR\u0019\u00109\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b:\u00100R\u0013\u0010;\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b<\u0010\tR\u0013\u0010=\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b>\u0010\u000fR\u0013\u0010?\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b@\u0010\tR\u001c\u0010A\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010\u000bR\u001c\u0010D\u001a\u0004\u0018\u00010\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010\tR\u0013\u0010G\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bH\u0010\u000fR\u0013\u0010I\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bJ\u0010\tR\u0013\u0010K\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010O\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010S\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bT\u0010\tR\u0016\u0010U\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u000bR\u0016\u0010W\u001a\u0004\u0018\u00010X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0016\u0010[\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\t¨\u0006f"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/SkyLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "(Ljava/lang/String;)V", "filter", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getLayerId", "()Ljava/lang/String;", "maxZoom", "", "getMaxZoom", "()Ljava/lang/Double;", "minZoom", "getMinZoom", "skyAtmosphereColor", "getSkyAtmosphereColor", "skyAtmosphereColorAsColorInt", "", "getSkyAtmosphereColorAsColorInt", "()Ljava/lang/Integer;", "skyAtmosphereColorAsExpression", "getSkyAtmosphereColorAsExpression", "skyAtmosphereColorUseTheme", "getSkyAtmosphereColorUseTheme$annotations", "()V", "getSkyAtmosphereColorUseTheme", "skyAtmosphereColorUseThemeAsExpression", "getSkyAtmosphereColorUseThemeAsExpression$annotations", "getSkyAtmosphereColorUseThemeAsExpression", "skyAtmosphereHaloColor", "getSkyAtmosphereHaloColor", "skyAtmosphereHaloColorAsColorInt", "getSkyAtmosphereHaloColorAsColorInt", "skyAtmosphereHaloColorAsExpression", "getSkyAtmosphereHaloColorAsExpression", "skyAtmosphereHaloColorUseTheme", "getSkyAtmosphereHaloColorUseTheme$annotations", "getSkyAtmosphereHaloColorUseTheme", "skyAtmosphereHaloColorUseThemeAsExpression", "getSkyAtmosphereHaloColorUseThemeAsExpression$annotations", "getSkyAtmosphereHaloColorUseThemeAsExpression", "skyAtmosphereSun", "", "getSkyAtmosphereSun", "()Ljava/util/List;", "skyAtmosphereSunAsExpression", "getSkyAtmosphereSunAsExpression", "skyAtmosphereSunIntensity", "getSkyAtmosphereSunIntensity", "skyAtmosphereSunIntensityAsExpression", "getSkyAtmosphereSunIntensityAsExpression", "skyGradient", "getSkyGradient", "skyGradientCenter", "getSkyGradientCenter", "skyGradientCenterAsExpression", "getSkyGradientCenterAsExpression", "skyGradientRadius", "getSkyGradientRadius", "skyGradientRadiusAsExpression", "getSkyGradientRadiusAsExpression", "skyGradientUseTheme", "getSkyGradientUseTheme$annotations", "getSkyGradientUseTheme", "skyGradientUseThemeAsExpression", "getSkyGradientUseThemeAsExpression$annotations", "getSkyGradientUseThemeAsExpression", "skyOpacity", "getSkyOpacity", "skyOpacityAsExpression", "getSkyOpacityAsExpression", "skyOpacityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getSkyOpacityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "skyType", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "getSkyType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "skyTypeAsExpression", "getSkyTypeAsExpression", "slot", "getSlot", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "getType", "getType$extension_style_release", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class SkyLayer extends Layer implements SkyLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    public SkyLayer(@NotNull String str) {
        str.getClass();
        this.layerId = str;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer filter(@NotNull Expression filter) {
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
    public final String getSkyAtmosphereColor() {
        Expression skyAtmosphereColorAsExpression = getSkyAtmosphereColorAsExpression();
        if (skyAtmosphereColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(skyAtmosphereColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getSkyAtmosphereColorAsColorInt() {
        Expression skyAtmosphereColorAsExpression = getSkyAtmosphereColorAsExpression();
        if (skyAtmosphereColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(skyAtmosphereColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getSkyAtmosphereColorAsExpression() {
        return (Expression) getPropertyValueWithType("sky-atmosphere-color", Expression.class);
    }

    @Nullable
    public final String getSkyAtmosphereColorUseTheme() {
        return (String) getPropertyValueWithType("sky-atmosphere-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getSkyAtmosphereColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-color-use-theme");
    }

    @Nullable
    public final String getSkyAtmosphereHaloColor() {
        Expression skyAtmosphereHaloColorAsExpression = getSkyAtmosphereHaloColorAsExpression();
        if (skyAtmosphereHaloColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(skyAtmosphereHaloColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getSkyAtmosphereHaloColorAsColorInt() {
        Expression skyAtmosphereHaloColorAsExpression = getSkyAtmosphereHaloColorAsExpression();
        if (skyAtmosphereHaloColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(skyAtmosphereHaloColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getSkyAtmosphereHaloColorAsExpression() {
        return (Expression) getPropertyValueWithType("sky-atmosphere-halo-color", Expression.class);
    }

    @Nullable
    public final String getSkyAtmosphereHaloColorUseTheme() {
        return (String) getPropertyValueWithType("sky-atmosphere-halo-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getSkyAtmosphereHaloColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-halo-color-use-theme");
    }

    @Nullable
    public final List<Double> getSkyAtmosphereSun() {
        return (List) getPropertyValueWithType("sky-atmosphere-sun", List.class);
    }

    @Nullable
    public final Expression getSkyAtmosphereSunAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-sun");
    }

    @Nullable
    public final Double getSkyAtmosphereSunIntensity() {
        return (Double) getPropertyValueWithType("sky-atmosphere-sun-intensity", Double.class);
    }

    @Nullable
    public final Expression getSkyAtmosphereSunIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-atmosphere-sun-intensity");
    }

    @Nullable
    public final Expression getSkyGradient() {
        return (Expression) getPropertyValueWithType("sky-gradient", Expression.class);
    }

    @Nullable
    public final List<Double> getSkyGradientCenter() {
        return (List) getPropertyValueWithType("sky-gradient-center", List.class);
    }

    @Nullable
    public final Expression getSkyGradientCenterAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-gradient-center");
    }

    @Nullable
    public final Double getSkyGradientRadius() {
        return (Double) getPropertyValueWithType("sky-gradient-radius", Double.class);
    }

    @Nullable
    public final Expression getSkyGradientRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-gradient-radius");
    }

    @Nullable
    public final String getSkyGradientUseTheme() {
        return (String) getPropertyValueWithType("sky-gradient-use-theme", String.class);
    }

    @Nullable
    public final Expression getSkyGradientUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-gradient-use-theme");
    }

    @Nullable
    public final Double getSkyOpacity() {
        return (Double) getPropertyValueWithType("sky-opacity", Double.class);
    }

    @Nullable
    public final Expression getSkyOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("sky-opacity");
    }

    @Nullable
    public final StyleTransition getSkyOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("sky-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final SkyType getSkyType() {
        String str = (String) getPropertyValueWithType("sky-type", String.class);
        if (str == null) {
            return null;
        }
        SkyType.Companion companion = SkyType.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getSkyTypeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("sky-type", Expression.class);
        if (expression != null) {
            return expression;
        }
        SkyType skyType = getSkyType();
        if (skyType != null) {
            return Expression.INSTANCE.literal(skyType.getValue());
        }
        return null;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @Nullable
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getType$extension_style_release() {
        return "sky";
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
    public SkyLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public SkyLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereColor(@ColorInt int skyAtmosphereColor) {
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(skyAtmosphereColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    @NotNull
    public SkyLayer skyAtmosphereColorUseTheme(@NotNull String skyAtmosphereColorUseTheme) {
        skyAtmosphereColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color-use-theme", skyAtmosphereColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereHaloColor(@ColorInt int skyAtmosphereHaloColor) {
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(skyAtmosphereHaloColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    @NotNull
    public SkyLayer skyAtmosphereHaloColorUseTheme(@NotNull String skyAtmosphereHaloColorUseTheme) {
        skyAtmosphereHaloColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color-use-theme", skyAtmosphereHaloColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereSun(@NotNull List<Double> skyAtmosphereSun) {
        skyAtmosphereSun.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun", skyAtmosphereSun));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereSunIntensity(double skyAtmosphereSunIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun-intensity", Double.valueOf(skyAtmosphereSunIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyGradient(@NotNull Expression skyGradient) {
        skyGradient.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient", skyGradient));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyGradientCenter(@NotNull List<Double> skyGradientCenter) {
        skyGradientCenter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-center", skyGradientCenter));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyGradientRadius(double skyGradientRadius) {
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-radius", Double.valueOf(skyGradientRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    @NotNull
    public SkyLayer skyGradientUseTheme(@NotNull String skyGradientUseTheme) {
        skyGradientUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-use-theme", skyGradientUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyOpacity(double skyOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("sky-opacity", Double.valueOf(skyOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        skyOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyType(@NotNull SkyType skyType) {
        skyType.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-type", skyType));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public SkyLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public SkyLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0014R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010\u0014R\u0013\u0010-\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0013\u0010/\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b0\u0010\u0014R\u0013\u00101\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b2\u0010\u0014R\u0019\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b4\u0010*R\u0013\u00105\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b6\u0010\u0014R\u0013\u00107\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0013\u00109\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010\u0014R\u001c\u0010;\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\fR\u001c\u0010>\u001a\u0004\u0018\u00010\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0014R\u0013\u0010A\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0013\u0010C\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bD\u0010\u0014R\u0013\u0010E\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010I\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010M\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bN\u0010\u0014R\u0013\u0010O\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultSkyAtmosphereColor", "", "getDefaultSkyAtmosphereColor", "()Ljava/lang/String;", "defaultSkyAtmosphereColorAsColorInt", "", "getDefaultSkyAtmosphereColorAsColorInt", "()Ljava/lang/Integer;", "defaultSkyAtmosphereColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultSkyAtmosphereColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultSkyAtmosphereColorUseTheme", "getDefaultSkyAtmosphereColorUseTheme$annotations", "getDefaultSkyAtmosphereColorUseTheme", "defaultSkyAtmosphereColorUseThemeAsExpression", "getDefaultSkyAtmosphereColorUseThemeAsExpression$annotations", "getDefaultSkyAtmosphereColorUseThemeAsExpression", "defaultSkyAtmosphereHaloColor", "getDefaultSkyAtmosphereHaloColor", "defaultSkyAtmosphereHaloColorAsColorInt", "getDefaultSkyAtmosphereHaloColorAsColorInt", "defaultSkyAtmosphereHaloColorAsExpression", "getDefaultSkyAtmosphereHaloColorAsExpression", "defaultSkyAtmosphereHaloColorUseTheme", "getDefaultSkyAtmosphereHaloColorUseTheme$annotations", "getDefaultSkyAtmosphereHaloColorUseTheme", "defaultSkyAtmosphereHaloColorUseThemeAsExpression", "getDefaultSkyAtmosphereHaloColorUseThemeAsExpression$annotations", "getDefaultSkyAtmosphereHaloColorUseThemeAsExpression", "defaultSkyAtmosphereSun", "", "getDefaultSkyAtmosphereSun", "()Ljava/util/List;", "defaultSkyAtmosphereSunAsExpression", "getDefaultSkyAtmosphereSunAsExpression", "defaultSkyAtmosphereSunIntensity", "getDefaultSkyAtmosphereSunIntensity", "defaultSkyAtmosphereSunIntensityAsExpression", "getDefaultSkyAtmosphereSunIntensityAsExpression", "defaultSkyGradient", "getDefaultSkyGradient", "defaultSkyGradientCenter", "getDefaultSkyGradientCenter", "defaultSkyGradientCenterAsExpression", "getDefaultSkyGradientCenterAsExpression", "defaultSkyGradientRadius", "getDefaultSkyGradientRadius", "defaultSkyGradientRadiusAsExpression", "getDefaultSkyGradientRadiusAsExpression", "defaultSkyGradientUseTheme", "getDefaultSkyGradientUseTheme$annotations", "getDefaultSkyGradientUseTheme", "defaultSkyGradientUseThemeAsExpression", "getDefaultSkyGradientUseThemeAsExpression$annotations", "getDefaultSkyGradientUseThemeAsExpression", "defaultSkyOpacity", "getDefaultSkyOpacity", "defaultSkyOpacityAsExpression", "getDefaultSkyOpacityAsExpression", "defaultSkyOpacityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultSkyOpacityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultSkyType", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "getDefaultSkyType", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "defaultSkyTypeAsExpression", "getDefaultSkyTypeAsExpression", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final String getDefaultSkyAtmosphereColor() {
            Expression defaultSkyAtmosphereColorAsExpression = getDefaultSkyAtmosphereColorAsExpression();
            if (defaultSkyAtmosphereColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultSkyAtmosphereColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultSkyAtmosphereColorAsColorInt() {
            Expression defaultSkyAtmosphereColorAsExpression = getDefaultSkyAtmosphereColorAsExpression();
            if (defaultSkyAtmosphereColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultSkyAtmosphereColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultSkyAtmosphereColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color");
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
            return null;
        }

        @Nullable
        public final String getDefaultSkyAtmosphereColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultSkyAtmosphereColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color-use-theme");
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
            String defaultSkyAtmosphereColorUseTheme = getDefaultSkyAtmosphereColorUseTheme();
            if (defaultSkyAtmosphereColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultSkyAtmosphereColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final String getDefaultSkyAtmosphereHaloColor() {
            Expression defaultSkyAtmosphereHaloColorAsExpression = getDefaultSkyAtmosphereHaloColorAsExpression();
            if (defaultSkyAtmosphereHaloColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultSkyAtmosphereHaloColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultSkyAtmosphereHaloColorAsColorInt() {
            Expression defaultSkyAtmosphereHaloColorAsExpression = getDefaultSkyAtmosphereHaloColorAsExpression();
            if (defaultSkyAtmosphereHaloColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultSkyAtmosphereHaloColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultSkyAtmosphereHaloColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color");
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
            return null;
        }

        @Nullable
        public final String getDefaultSkyAtmosphereHaloColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultSkyAtmosphereHaloColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color-use-theme");
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
            String defaultSkyAtmosphereHaloColorUseTheme = getDefaultSkyAtmosphereHaloColorUseTheme();
            if (defaultSkyAtmosphereHaloColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultSkyAtmosphereHaloColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final List<Double> getDefaultSkyAtmosphereSun() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultSkyAtmosphereSunAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun");
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
            List<Double> defaultSkyAtmosphereSun = getDefaultSkyAtmosphereSun();
            if (defaultSkyAtmosphereSun != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultSkyAtmosphereSun);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultSkyAtmosphereSunIntensity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultSkyAtmosphereSunIntensityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun-intensity");
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
            Double defaultSkyAtmosphereSunIntensity = getDefaultSkyAtmosphereSunIntensity();
            if (defaultSkyAtmosphereSunIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultSkyAtmosphereSunIntensity.doubleValue());
        }

        @Nullable
        public final Expression getDefaultSkyGradient() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Expression) obj;
        }

        @Nullable
        public final List<Double> getDefaultSkyGradientCenter() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-center");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (List) obj;
        }

        @Nullable
        public final Expression getDefaultSkyGradientCenterAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-center");
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
            List<Double> defaultSkyGradientCenter = getDefaultSkyGradientCenter();
            if (defaultSkyGradientCenter != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultSkyGradientCenter);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultSkyGradientRadius() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultSkyGradientRadiusAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-radius");
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
            Double defaultSkyGradientRadius = getDefaultSkyGradientRadius();
            if (defaultSkyGradientRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultSkyGradientRadius.doubleValue());
        }

        @Nullable
        public final String getDefaultSkyGradientUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultSkyGradientUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-use-theme");
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
            String defaultSkyGradientUseTheme = getDefaultSkyGradientUseTheme();
            if (defaultSkyGradientUseTheme != null) {
                return Expression.INSTANCE.literal(defaultSkyGradientUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultSkyOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultSkyOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity");
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
            Double defaultSkyOpacity = getDefaultSkyOpacity();
            if (defaultSkyOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultSkyOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultSkyOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final SkyType getDefaultSkyType() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-type");
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
            SkyType.Companion companion = SkyType.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultSkyTypeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-type");
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
            SkyType defaultSkyType = getDefaultSkyType();
            if (defaultSkyType != null) {
                return Expression.INSTANCE.literal(defaultSkyType.getValue());
            }
            return null;
        }

        @Nullable
        public final Visibility getDefaultVisibility() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("sky", "visibility");
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
        public static /* synthetic */ void getDefaultSkyAtmosphereColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyAtmosphereColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyAtmosphereHaloColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyAtmosphereHaloColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyGradientUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultSkyGradientUseThemeAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    @NotNull
    public SkyLayer skyAtmosphereColorUseTheme(@NotNull Expression skyAtmosphereColorUseTheme) {
        skyAtmosphereColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color-use-theme", skyAtmosphereColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    @NotNull
    public SkyLayer skyAtmosphereHaloColorUseTheme(@NotNull Expression skyAtmosphereHaloColorUseTheme) {
        skyAtmosphereHaloColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color-use-theme", skyAtmosphereHaloColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereSun(@NotNull Expression skyAtmosphereSun) {
        skyAtmosphereSun.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun", skyAtmosphereSun));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyGradientCenter(@NotNull Expression skyGradientCenter) {
        skyGradientCenter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-center", skyGradientCenter));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @MapboxExperimental
    @NotNull
    public SkyLayer skyGradientUseTheme(@NotNull Expression skyGradientUseTheme) {
        skyGradientUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-use-theme", skyGradientUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyType(@NotNull Expression skyType) {
        skyType.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-type", skyType));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereHaloColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyAtmosphereHaloColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyGradientUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSkyGradientUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereSunIntensity(@NotNull Expression skyAtmosphereSunIntensity) {
        skyAtmosphereSunIntensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-sun-intensity", skyAtmosphereSunIntensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyGradientRadius(@NotNull Expression skyGradientRadius) {
        skyGradientRadius.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-gradient-radius", skyGradientRadius));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyOpacity(@NotNull Expression skyOpacity) {
        skyOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-opacity", skyOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public SkyLayer visibility(@NotNull Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereColor(@NotNull Expression skyAtmosphereColor) {
        skyAtmosphereColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color", skyAtmosphereColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereHaloColor(@NotNull Expression skyAtmosphereHaloColor) {
        skyAtmosphereHaloColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color", skyAtmosphereHaloColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereColor(@NotNull String skyAtmosphereColor) {
        skyAtmosphereColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-color", skyAtmosphereColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyAtmosphereHaloColor(@NotNull String skyAtmosphereHaloColor) {
        skyAtmosphereHaloColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-atmosphere-halo-color", skyAtmosphereHaloColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.SkyLayerDsl
    @NotNull
    public SkyLayer skyOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("sky-opacity-transition", options));
        return this;
    }
}
