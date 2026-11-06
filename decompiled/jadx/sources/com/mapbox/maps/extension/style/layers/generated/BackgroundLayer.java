package com.mapbox.maps.extension.style.layers.generated;

import androidx.annotation.ColorInt;
import androidx.annotation.UiThread;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.facebook.react.modules.appstate.AppStateModule;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.BackgroundPitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000eH\u0016J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0012H\u0016J!\u0010\u0011\u001a\u00020\u00002\u0017\u0010D\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E¢\u0006\u0002\bHH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000eH\u0017J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004H\u0017J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0012H\u0016J!\u0010\"\u001a\u00020\u00002\u0017\u0010D\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E¢\u0006\u0002\bHH\u0016J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0012H\u0016J!\u0010(\u001a\u00020\u00002\u0017\u0010D\u001a\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0E¢\u0006\u0002\bHH\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000eH\u0017J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/H\u0017J\r\u0010I\u001a\u00020\u0004H\u0010¢\u0006\u0002\bJJ\u0010\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u001dH\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u001dH\u0016J\u0010\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0004H\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000eH\u0016J\u0010\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0010R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b#\u0010\u0014R\u0013\u0010$\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0013\u0010&\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0010R\u0013\u0010(\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0013\u0010*\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010\bR\u0013\u0010,\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u001c\u0010.\u001a\u0004\u0018\u00010/8FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0017\u001a\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0017\u001a\u0004\b5\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR\u0016\u00107\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001fR\u0016\u00109\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001fR\u0016\u0010;\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\bR\u0016\u0010=\u001a\u0004\u0018\u00010>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0010¨\u0006L"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "(Ljava/lang/String;)V", "backgroundColor", "getBackgroundColor", "()Ljava/lang/String;", "backgroundColorAsColorInt", "", "getBackgroundColorAsColorInt", "()Ljava/lang/Integer;", "backgroundColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getBackgroundColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "backgroundColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getBackgroundColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "backgroundColorUseTheme", "getBackgroundColorUseTheme$annotations", "()V", "getBackgroundColorUseTheme", "backgroundColorUseThemeAsExpression", "getBackgroundColorUseThemeAsExpression$annotations", "getBackgroundColorUseThemeAsExpression", "backgroundEmissiveStrength", "", "getBackgroundEmissiveStrength", "()Ljava/lang/Double;", "backgroundEmissiveStrengthAsExpression", "getBackgroundEmissiveStrengthAsExpression", "backgroundEmissiveStrengthTransition", "getBackgroundEmissiveStrengthTransition", "backgroundOpacity", "getBackgroundOpacity", "backgroundOpacityAsExpression", "getBackgroundOpacityAsExpression", "backgroundOpacityTransition", "getBackgroundOpacityTransition", "backgroundPattern", "getBackgroundPattern", "backgroundPatternAsExpression", "getBackgroundPatternAsExpression", "backgroundPitchAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "getBackgroundPitchAlignment$annotations", "getBackgroundPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "backgroundPitchAlignmentAsExpression", "getBackgroundPitchAlignmentAsExpression$annotations", "getBackgroundPitchAlignmentAsExpression", "getLayerId", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "slot", "getSlot", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getType", "getType$extension_style_release", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class BackgroundLayer extends Layer implements BackgroundLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    public BackgroundLayer(@NotNull String str) {
        str.getClass();
        this.layerId = str;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundColor(@ColorInt int backgroundColor) {
        setProperty$extension_style_release(new PropertyValue<>("background-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(backgroundColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        backgroundColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    @NotNull
    public BackgroundLayer backgroundColorUseTheme(@NotNull String backgroundColorUseTheme) {
        backgroundColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color-use-theme", backgroundColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundEmissiveStrength(double backgroundEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("background-emissive-strength", Double.valueOf(backgroundEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        backgroundEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundOpacity(double backgroundOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("background-opacity", Double.valueOf(backgroundOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundOpacityTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        backgroundOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundPattern(@NotNull String backgroundPattern) {
        backgroundPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pattern", backgroundPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    @NotNull
    public BackgroundLayer backgroundPitchAlignment(@NotNull BackgroundPitchAlignment backgroundPitchAlignment) {
        backgroundPitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pitch-alignment", backgroundPitchAlignment));
        return this;
    }

    @Nullable
    public final String getBackgroundColor() {
        Expression backgroundColorAsExpression = getBackgroundColorAsExpression();
        if (backgroundColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(backgroundColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getBackgroundColorAsColorInt() {
        Expression backgroundColorAsExpression = getBackgroundColorAsExpression();
        if (backgroundColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(backgroundColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getBackgroundColorAsExpression() {
        return (Expression) getPropertyValueWithType("background-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getBackgroundColorTransition() {
        return (StyleTransition) getPropertyValueWithType("background-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getBackgroundColorUseTheme() {
        return (String) getPropertyValueWithType("background-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getBackgroundColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-color-use-theme");
    }

    @Nullable
    public final Double getBackgroundEmissiveStrength() {
        return (Double) getPropertyValueWithType("background-emissive-strength", Double.class);
    }

    @Nullable
    public final Expression getBackgroundEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-emissive-strength");
    }

    @Nullable
    public final StyleTransition getBackgroundEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("background-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getBackgroundOpacity() {
        return (Double) getPropertyValueWithType("background-opacity", Double.class);
    }

    @Nullable
    public final Expression getBackgroundOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-opacity");
    }

    @Nullable
    public final StyleTransition getBackgroundOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("background-opacity-transition", StyleTransition.class);
    }

    @Nullable
    public final String getBackgroundPattern() {
        return (String) getPropertyValueWithType("background-pattern", String.class);
    }

    @Nullable
    public final Expression getBackgroundPatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-pattern");
    }

    @Nullable
    public final BackgroundPitchAlignment getBackgroundPitchAlignment() {
        String str = (String) getPropertyValueWithType("background-pitch-alignment", String.class);
        if (str == null) {
            return null;
        }
        BackgroundPitchAlignment.Companion companion = BackgroundPitchAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getBackgroundPitchAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("background-pitch-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        BackgroundPitchAlignment backgroundPitchAlignment = getBackgroundPitchAlignment();
        if (backgroundPitchAlignment != null) {
            return Expression.INSTANCE.literal(backgroundPitchAlignment.getValue());
        }
        return null;
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

    @Override // com.mapbox.maps.extension.style.layers.Layer
    @NotNull
    public String getType$extension_style_release() {
        return AppStateModule.APP_STATE_BACKGROUND;
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
    public BackgroundLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public BackgroundLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public BackgroundLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public BackgroundLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u000eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010!\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0013\u0010%\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0013\u0010)\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u001c\u0010+\u001a\u0004\u0018\u00010,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u000eR\u0013\u00103\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0013\u00105\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer$Companion;", "", "()V", "defaultBackgroundColor", "", "getDefaultBackgroundColor", "()Ljava/lang/String;", "defaultBackgroundColorAsColorInt", "", "getDefaultBackgroundColorAsColorInt", "()Ljava/lang/Integer;", "defaultBackgroundColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultBackgroundColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultBackgroundColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultBackgroundColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultBackgroundColorUseTheme", "getDefaultBackgroundColorUseTheme$annotations", "getDefaultBackgroundColorUseTheme", "defaultBackgroundColorUseThemeAsExpression", "getDefaultBackgroundColorUseThemeAsExpression$annotations", "getDefaultBackgroundColorUseThemeAsExpression", "defaultBackgroundEmissiveStrength", "", "getDefaultBackgroundEmissiveStrength", "()Ljava/lang/Double;", "defaultBackgroundEmissiveStrengthAsExpression", "getDefaultBackgroundEmissiveStrengthAsExpression", "defaultBackgroundEmissiveStrengthTransition", "getDefaultBackgroundEmissiveStrengthTransition", "defaultBackgroundOpacity", "getDefaultBackgroundOpacity", "defaultBackgroundOpacityAsExpression", "getDefaultBackgroundOpacityAsExpression", "defaultBackgroundOpacityTransition", "getDefaultBackgroundOpacityTransition", "defaultBackgroundPattern", "getDefaultBackgroundPattern", "defaultBackgroundPatternAsExpression", "getDefaultBackgroundPatternAsExpression", "defaultBackgroundPitchAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "getDefaultBackgroundPitchAlignment$annotations", "getDefaultBackgroundPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "defaultBackgroundPitchAlignmentAsExpression", "getDefaultBackgroundPitchAlignmentAsExpression$annotations", "getDefaultBackgroundPitchAlignmentAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getDefaultBackgroundColor() {
            Expression defaultBackgroundColorAsExpression = getDefaultBackgroundColorAsExpression();
            if (defaultBackgroundColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultBackgroundColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultBackgroundColorAsColorInt() {
            Expression defaultBackgroundColorAsExpression = getDefaultBackgroundColorAsExpression();
            if (defaultBackgroundColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultBackgroundColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultBackgroundColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-color");
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
        public final StyleTransition getDefaultBackgroundColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultBackgroundColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultBackgroundColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-color-use-theme");
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
            String defaultBackgroundColorUseTheme = getDefaultBackgroundColorUseTheme();
            if (defaultBackgroundColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultBackgroundColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultBackgroundEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultBackgroundEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-emissive-strength");
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
            Double defaultBackgroundEmissiveStrength = getDefaultBackgroundEmissiveStrength();
            if (defaultBackgroundEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBackgroundEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultBackgroundEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultBackgroundOpacity() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultBackgroundOpacityAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-opacity");
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
            Double defaultBackgroundOpacity = getDefaultBackgroundOpacity();
            if (defaultBackgroundOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBackgroundOpacity.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultBackgroundOpacityTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultBackgroundPattern() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-pattern");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultBackgroundPatternAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-pattern");
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
            String defaultBackgroundPattern = getDefaultBackgroundPattern();
            if (defaultBackgroundPattern != null) {
                return Expression.INSTANCE.literal(defaultBackgroundPattern);
            }
            return null;
        }

        @Nullable
        public final BackgroundPitchAlignment getDefaultBackgroundPitchAlignment() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-pitch-alignment");
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
            BackgroundPitchAlignment.Companion companion = BackgroundPitchAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultBackgroundPitchAlignmentAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "background-pitch-alignment");
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
            BackgroundPitchAlignment defaultBackgroundPitchAlignment = getDefaultBackgroundPitchAlignment();
            if (defaultBackgroundPitchAlignment != null) {
                return Expression.INSTANCE.literal(defaultBackgroundPitchAlignment.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue(AppStateModule.APP_STATE_BACKGROUND, "visibility");
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
        public static /* synthetic */ void getDefaultBackgroundColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultBackgroundColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultBackgroundPitchAlignment$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultBackgroundPitchAlignmentAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    @NotNull
    public BackgroundLayer backgroundColorUseTheme(@NotNull Expression backgroundColorUseTheme) {
        backgroundColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color-use-theme", backgroundColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundPattern(@NotNull Expression backgroundPattern) {
        backgroundPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pattern", backgroundPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    @NotNull
    public BackgroundLayer backgroundPitchAlignment(@NotNull Expression backgroundPitchAlignment) {
        backgroundPitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pitch-alignment", backgroundPitchAlignment));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundPitchAlignment$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundPitchAlignmentAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundEmissiveStrength(@NotNull Expression backgroundEmissiveStrength) {
        backgroundEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-emissive-strength", backgroundEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundOpacity(@NotNull Expression backgroundOpacity) {
        backgroundOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-opacity", backgroundOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public BackgroundLayer visibility(@NotNull Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundColor(@NotNull Expression backgroundColor) {
        backgroundColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color", backgroundColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundColor(@NotNull String backgroundColor) {
        backgroundColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color", backgroundColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @NotNull
    public BackgroundLayer backgroundOpacityTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-opacity-transition", options));
        return this;
    }
}
