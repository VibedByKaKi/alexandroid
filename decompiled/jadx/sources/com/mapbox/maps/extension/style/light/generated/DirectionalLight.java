package com.mapbox.maps.extension.style.light.generated;

import androidx.annotation.ColorInt;
import androidx.annotation.UiThread;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.light.Light;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000bH\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0018H\u0016J!\u0010\u0017\u001a\u00020\u00002\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0A¢\u0006\u0002\bDH\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0017J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0017J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0016\u0010\"\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0018H\u0016J!\u0010)\u001a\u00020\u00002\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0A¢\u0006\u0002\bDH\u0016J\r\u0010E\u001a\u00020\u0004H\u0010¢\u0006\u0002\bFJ\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020$H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0018H\u0016J!\u00100\u001a\u00020\u00002\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0A¢\u0006\u0002\bDH\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u000bH\u0017J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0004H\u0017J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000bH\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020$H\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0018H\u0016J!\u0010=\u001a\u00020\u00002\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0A¢\u0006\u0002\bDH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\rR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\rR\u0013\u0010)\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0013\u0010+\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010\rR\u0013\u00100\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b1\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0010R\u001c\u00103\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u0010R\u001c\u00106\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\rR\u0013\u00109\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b:\u0010-R\u0013\u0010;\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010\rR\u0013\u0010=\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b>\u0010\u001a¨\u0006G"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lcom/mapbox/maps/extension/style/light/generated/DirectionalLightDslReceiver;", "Lcom/mapbox/maps/extension/style/light/Light;", "lightId", "", "(Ljava/lang/String;)V", "castShadows", "", "getCastShadows", "()Ljava/lang/Boolean;", "castShadowsAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getCastShadowsAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "color", "getColor", "()Ljava/lang/String;", "colorAsColorInt", "", "getColorAsColorInt", "()Ljava/lang/Integer;", "colorAsExpression", "getColorAsExpression", "colorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "colorUseTheme", "getColorUseTheme$annotations", "()V", "getColorUseTheme", "colorUseThemeAsExpression", "getColorUseThemeAsExpression$annotations", "getColorUseThemeAsExpression", "direction", "", "", "getDirection", "()Ljava/util/List;", "directionAsExpression", "getDirectionAsExpression", "directionTransition", "getDirectionTransition", "intensity", "getIntensity", "()Ljava/lang/Double;", "intensityAsExpression", "getIntensityAsExpression", "intensityTransition", "getIntensityTransition", "getLightId", "shadowDrawBeforeLayer", "getShadowDrawBeforeLayer$annotations", "getShadowDrawBeforeLayer", "shadowDrawBeforeLayerAsExpression", "getShadowDrawBeforeLayerAsExpression$annotations", "getShadowDrawBeforeLayerAsExpression", "shadowIntensity", "getShadowIntensity", "shadowIntensityAsExpression", "getShadowIntensityAsExpression", "shadowIntensityTransition", "getShadowIntensityTransition", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getType", "getType$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class DirectionalLight extends Light implements DirectionalLightDslReceiver {

    @NotNull
    private final String lightId;

    public DirectionalLight(@NotNull String str) {
        str.getClass();
        this.lightId = str;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight castShadows(boolean castShadows) {
        setProperty$extension_style_release(new PropertyValue<>("cast-shadows", Boolean.valueOf(castShadows)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight color(@ColorInt int color) {
        setProperty$extension_style_release(new PropertyValue<>("color", ColorUtils.INSTANCE.colorIntToRgbaExpression(color)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight colorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        colorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @MapboxExperimental
    @NotNull
    public DirectionalLight colorUseTheme(@NotNull String colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight direction(@NotNull List<Double> direction) {
        direction.getClass();
        setProperty$extension_style_release(new PropertyValue<>("direction", direction));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight directionTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        directionTransition(builder.build());
        return this;
    }

    @Nullable
    public final Boolean getCastShadows() {
        return (Boolean) getPropertyValueWithType("cast-shadows", Boolean.class);
    }

    @Nullable
    public final Expression getCastShadowsAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("cast-shadows", Expression.class);
        if (expression != null) {
            return expression;
        }
        Boolean castShadows = getCastShadows();
        if (castShadows == null) {
            return null;
        }
        return Expression.INSTANCE.literal(castShadows.booleanValue());
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
    public final List<Double> getDirection() {
        return (List) getPropertyValueWithType("direction", List.class);
    }

    @Nullable
    public final Expression getDirectionAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("direction", Expression.class);
        if (expression != null) {
            return expression;
        }
        List<Double> direction = getDirection();
        if (direction != null) {
            return Expression.INSTANCE.literal$extension_style_release(direction);
        }
        return null;
    }

    @Nullable
    public final StyleTransition getDirectionTransition() {
        return getTransitionProperty$extension_style_release("direction-transition");
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
    public final String getShadowDrawBeforeLayer() {
        return (String) getPropertyValueWithType("shadow-draw-before-layer", String.class);
    }

    @Nullable
    public final Expression getShadowDrawBeforeLayerAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("shadow-draw-before-layer", Expression.class);
        if (expression != null) {
            return expression;
        }
        String shadowDrawBeforeLayer = getShadowDrawBeforeLayer();
        if (shadowDrawBeforeLayer != null) {
            return Expression.INSTANCE.literal(shadowDrawBeforeLayer);
        }
        return null;
    }

    @Nullable
    public final Double getShadowIntensity() {
        return (Double) getPropertyValueWithType("shadow-intensity", Double.class);
    }

    @Nullable
    public final Expression getShadowIntensityAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("shadow-intensity", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double shadowIntensity = getShadowIntensity();
        if (shadowIntensity == null) {
            return null;
        }
        return Expression.INSTANCE.literal(shadowIntensity.doubleValue());
    }

    @Nullable
    public final StyleTransition getShadowIntensityTransition() {
        return getTransitionProperty$extension_style_release("shadow-intensity-transition");
    }

    @Override // com.mapbox.maps.extension.style.light.Light
    @NotNull
    public String getType$extension_style_release() {
        return "directional";
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight intensity(double intensity) {
        setProperty$extension_style_release(new PropertyValue<>("intensity", Double.valueOf(intensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight intensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        intensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @MapboxExperimental
    @NotNull
    public DirectionalLight shadowDrawBeforeLayer(@NotNull String shadowDrawBeforeLayer) {
        shadowDrawBeforeLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-draw-before-layer", shadowDrawBeforeLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight shadowIntensity(double shadowIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("shadow-intensity", Double.valueOf(shadowIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight shadowIntensityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        shadowIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @MapboxExperimental
    @NotNull
    public DirectionalLight colorUseTheme(@NotNull Expression colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight direction(@NotNull Expression direction) {
        direction.getClass();
        setProperty$extension_style_release(new PropertyValue<>("direction", direction));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @MapboxExperimental
    @NotNull
    public DirectionalLight shadowDrawBeforeLayer(@NotNull Expression shadowDrawBeforeLayer) {
        shadowDrawBeforeLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-draw-before-layer", shadowDrawBeforeLayer));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getShadowDrawBeforeLayer$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getShadowDrawBeforeLayerAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight castShadows(@NotNull Expression castShadows) {
        castShadows.getClass();
        setProperty$extension_style_release(new PropertyValue<>("cast-shadows", castShadows));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight intensity(@NotNull Expression intensity) {
        intensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity", intensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight shadowIntensity(@NotNull Expression shadowIntensity) {
        shadowIntensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-intensity", shadowIntensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight color(@NotNull String color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color", color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight color(@NotNull Expression color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color", color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight colorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight directionTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("direction-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight intensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @NotNull
    public DirectionalLight shadowIntensityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-intensity-transition", options));
        return this;
    }
}
