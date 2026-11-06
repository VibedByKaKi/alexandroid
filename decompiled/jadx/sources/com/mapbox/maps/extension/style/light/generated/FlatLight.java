package com.mapbox.maps.extension.style.light.generated;

import androidx.annotation.ColorInt;
import androidx.annotation.UiThread;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Anchor;
import com.mapbox.maps.extension.style.light.Light;
import com.mapbox.maps.extension.style.light.LightPosition;
import com.mapbox.maps.extension.style.light.LightUtils;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0013H\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0019H\u0016J!\u0010\u0018\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002050:¢\u0006\u0002\b<H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005H\u0017J\r\u0010=\u001a\u00020\u0005H\u0010¢\u0006\u0002\b>J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0019H\u0016J!\u0010)\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002050:¢\u0006\u0002\b<H\u0016J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\fH\u0016J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-H\u0016J \u0010,\u001a\u00020\u00002\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0019H\u0016J!\u00102\u001a\u00020\u00002\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002050:¢\u0006\u0002\b<H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001c\u0010 \u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u000eR\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u0013\u0010)\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0011R\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b1\u0010\u000eR\u0013\u00102\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b3\u0010\u001b¨\u0006B"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/light/generated/FlatLightDslReceiver;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "Lcom/mapbox/maps/extension/style/light/Light;", "lightId", "", "(Ljava/lang/String;)V", "anchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Anchor;", "getAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Anchor;", "anchorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getAnchorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "color", "getColor", "()Ljava/lang/String;", "colorAsColorInt", "", "getColorAsColorInt", "()Ljava/lang/Integer;", "colorAsExpression", "getColorAsExpression", "colorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "colorUseTheme", "getColorUseTheme$annotations", "()V", "getColorUseTheme", "colorUseThemeAsExpression", "getColorUseThemeAsExpression$annotations", "getColorUseThemeAsExpression", "intensity", "", "getIntensity", "()Ljava/lang/Double;", "intensityAsExpression", "getIntensityAsExpression", "intensityTransition", "getIntensityTransition", "getLightId", "position", "Lcom/mapbox/maps/extension/style/light/LightPosition;", "getPosition", "()Lcom/mapbox/maps/extension/style/light/LightPosition;", "positionAsExpression", "getPositionAsExpression", "positionTransition", "getPositionTransition", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "Lkotlin/ExtensionFunctionType;", "getType", "getType$extension_style_release", "radialCoordinate", "azimuthalAngle", "polarAngle", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class FlatLight extends Light implements FlatLightDslReceiver, StyleContract.StyleLightExtension {

    @NotNull
    private final String lightId;

    public FlatLight(@NotNull String str) {
        str.getClass();
        this.lightId = str;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight anchor(@NotNull Anchor anchor) {
        anchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("anchor", anchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleLightExtension
    public void bindTo(@NotNull MapboxStyleManager delegate) {
        delegate.getClass();
        LightUtils.setLight(delegate, this);
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight color(@ColorInt int color) {
        setProperty$extension_style_release(new PropertyValue<>("color", ColorUtils.INSTANCE.colorIntToRgbaExpression(color)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight colorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        colorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @MapboxExperimental
    @NotNull
    public FlatLight colorUseTheme(@NotNull String colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Nullable
    public final Anchor getAnchor() {
        String str = (String) getPropertyValueWithType("anchor", String.class);
        if (str == null) {
            return null;
        }
        Anchor.Companion companion = Anchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        Anchor anchor = getAnchor();
        if (anchor != null) {
            return Expression.INSTANCE.literal(anchor.getValue());
        }
        return null;
    }

    @Nullable
    public final String getColor() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(colorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getColorAsColorInt() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(colorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getColorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("color", Expression.class);
        if (expression != null) {
            return expression;
        }
        return null;
    }

    @Nullable
    public final StyleTransition getColorTransition() {
        return getTransitionProperty$extension_style_release("color-transition");
    }

    @Nullable
    public final String getColorUseTheme() {
        return (String) getPropertyValueWithType("color-use-theme", String.class);
    }

    @Nullable
    public final Expression getColorUseThemeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("color-use-theme", Expression.class);
        if (expression != null) {
            return expression;
        }
        String colorUseTheme = getColorUseTheme();
        if (colorUseTheme != null) {
            return Expression.INSTANCE.literal(colorUseTheme);
        }
        return null;
    }

    @Nullable
    public final Double getIntensity() {
        return (Double) getPropertyValueWithType("intensity", Double.class);
    }

    @Nullable
    public final Expression getIntensityAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("intensity", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double intensity = getIntensity();
        if (intensity == null) {
            return null;
        }
        return Expression.INSTANCE.literal(intensity.doubleValue());
    }

    @Nullable
    public final StyleTransition getIntensityTransition() {
        return getTransitionProperty$extension_style_release("intensity-transition");
    }

    @Override // com.mapbox.maps.extension.style.light.Light
    @NotNull
    public String getLightId() {
        return this.lightId;
    }

    @Nullable
    public final LightPosition getPosition() {
        List<Double> list = (List) getPropertyValueWithType("position", List.class);
        if (list != null) {
            return LightPosition.INSTANCE.fromList(list);
        }
        return null;
    }

    @Nullable
    public final Expression getPositionAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("position", Expression.class);
        if (expression != null) {
            return expression;
        }
        LightPosition position = getPosition();
        if (position != null) {
            return Expression.INSTANCE.literal$extension_style_release(position.toList());
        }
        return null;
    }

    @Nullable
    public final StyleTransition getPositionTransition() {
        return getTransitionProperty$extension_style_release("position-transition");
    }

    @Override // com.mapbox.maps.extension.style.light.Light
    @NotNull
    public String getType$extension_style_release() {
        return "flat";
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight intensity(double intensity) {
        setProperty$extension_style_release(new PropertyValue<>("intensity", Double.valueOf(intensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight intensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        intensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight position(@NotNull LightPosition position) {
        position.getClass();
        setProperty$extension_style_release(new PropertyValue<>("position", position));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight positionTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        positionTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight anchor(@NotNull Expression anchor) {
        anchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("anchor", anchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @MapboxExperimental
    @NotNull
    public FlatLight colorUseTheme(@NotNull Expression colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight position(double radialCoordinate, double azimuthalAngle, double polarAngle) {
        position(new LightPosition(radialCoordinate, azimuthalAngle, polarAngle));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight intensity(@NotNull Expression intensity) {
        intensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity", intensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight position(@NotNull Expression position) {
        position.getClass();
        setProperty$extension_style_release(new PropertyValue<>("position", position));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight color(@NotNull String color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color", color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight color(@NotNull Expression color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color", color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight colorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight intensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @NotNull
    public FlatLight positionTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("position-transition", options));
        return this;
    }
}
