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
import com.mapbox.maps.extension.style.layers.properties.generated.HillshadeIlluminationAnchor;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0001iB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\r\u0010a\u001a\u00020\u0004H\u0010¢\u0006\u0002\bbJ\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000fH\u0016J\u0012\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0013H\u0016J!\u0010\u0012\u001a\u00020\u00002\u0017\u0010d\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020g0e¢\u0006\u0002\bhH\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000fH\u0017J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0017J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0013H\u0016J!\u0010#\u001a\u00020\u00002\u0017\u0010d\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020g0e¢\u0006\u0002\bhH\u0016J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001eH\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0013H\u0016J!\u0010)\u001a\u00020\u00002\u0017\u0010d\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020g0e¢\u0006\u0002\bhH\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000fH\u0016J\u0012\u0010+\u001a\u00020\u00002\b\b\u0001\u0010+\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0004H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0013H\u0016J!\u00101\u001a\u00020\u00002\u0017\u0010d\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020g0e¢\u0006\u0002\bhH\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u000fH\u0017J\u0010\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0004H\u0017J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000fH\u0016J\u0010\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000fH\u0016J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u001eH\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u000fH\u0016J\u0012\u0010C\u001a\u00020\u00002\b\b\u0001\u0010C\u001a\u00020\u000bH\u0016J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0004H\u0016J\u0010\u0010I\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u0013H\u0016J!\u0010I\u001a\u00020\u00002\u0017\u0010d\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020g0e¢\u0006\u0002\bhH\u0016J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u000fH\u0017J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0004H\u0017J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u001eH\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u001eH\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0004H\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u0004H\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\u000fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\\H\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0013\u0010#\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0013\u0010%\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0013\u0010'\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0011R\u0013\u0010)\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0013\u0010+\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010\tR\u0013\u0010-\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b.\u0010\rR\u0013\u0010/\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0011R\u0013\u00101\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b2\u0010\u0015R\u001c\u00103\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0018\u001a\u0004\b5\u0010\tR\u001c\u00106\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0018\u001a\u0004\b8\u0010\u0011R\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010=\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0011R\u0013\u0010?\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b@\u0010 R\u0013\u0010A\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bB\u0010\u0011R\u0013\u0010C\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bD\u0010\tR\u0013\u0010E\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\bF\u0010\rR\u0013\u0010G\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bH\u0010\u0011R\u0013\u0010I\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0015R\u001c\u0010K\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0018\u001a\u0004\bM\u0010\tR\u001c\u0010N\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0018\u001a\u0004\bP\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\tR\u0016\u0010R\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010 R\u0016\u0010T\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010 R\u0016\u0010V\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\tR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bZ\u0010\tR\u0016\u0010[\u001a\u0004\u0018\u00010\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0016\u0010_\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0011¨\u0006j"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "layerId", "", "sourceId", "(Ljava/lang/String;Ljava/lang/String;)V", "hillshadeAccentColor", "getHillshadeAccentColor", "()Ljava/lang/String;", "hillshadeAccentColorAsColorInt", "", "getHillshadeAccentColorAsColorInt", "()Ljava/lang/Integer;", "hillshadeAccentColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getHillshadeAccentColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "hillshadeAccentColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getHillshadeAccentColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "hillshadeAccentColorUseTheme", "getHillshadeAccentColorUseTheme$annotations", "()V", "getHillshadeAccentColorUseTheme", "hillshadeAccentColorUseThemeAsExpression", "getHillshadeAccentColorUseThemeAsExpression$annotations", "getHillshadeAccentColorUseThemeAsExpression", "hillshadeEmissiveStrength", "", "getHillshadeEmissiveStrength", "()Ljava/lang/Double;", "hillshadeEmissiveStrengthAsExpression", "getHillshadeEmissiveStrengthAsExpression", "hillshadeEmissiveStrengthTransition", "getHillshadeEmissiveStrengthTransition", "hillshadeExaggeration", "getHillshadeExaggeration", "hillshadeExaggerationAsExpression", "getHillshadeExaggerationAsExpression", "hillshadeExaggerationTransition", "getHillshadeExaggerationTransition", "hillshadeHighlightColor", "getHillshadeHighlightColor", "hillshadeHighlightColorAsColorInt", "getHillshadeHighlightColorAsColorInt", "hillshadeHighlightColorAsExpression", "getHillshadeHighlightColorAsExpression", "hillshadeHighlightColorTransition", "getHillshadeHighlightColorTransition", "hillshadeHighlightColorUseTheme", "getHillshadeHighlightColorUseTheme$annotations", "getHillshadeHighlightColorUseTheme", "hillshadeHighlightColorUseThemeAsExpression", "getHillshadeHighlightColorUseThemeAsExpression$annotations", "getHillshadeHighlightColorUseThemeAsExpression", "hillshadeIlluminationAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "getHillshadeIlluminationAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "hillshadeIlluminationAnchorAsExpression", "getHillshadeIlluminationAnchorAsExpression", "hillshadeIlluminationDirection", "getHillshadeIlluminationDirection", "hillshadeIlluminationDirectionAsExpression", "getHillshadeIlluminationDirectionAsExpression", "hillshadeShadowColor", "getHillshadeShadowColor", "hillshadeShadowColorAsColorInt", "getHillshadeShadowColorAsColorInt", "hillshadeShadowColorAsExpression", "getHillshadeShadowColorAsExpression", "hillshadeShadowColorTransition", "getHillshadeShadowColorTransition", "hillshadeShadowColorUseTheme", "getHillshadeShadowColorUseTheme$annotations", "getHillshadeShadowColorUseTheme", "hillshadeShadowColorUseThemeAsExpression", "getHillshadeShadowColorUseThemeAsExpression$annotations", "getHillshadeShadowColorUseThemeAsExpression", "getLayerId", "maxZoom", "getMaxZoom", "minZoom", "getMinZoom", "slot", "getSlot", "getSourceId", "sourceLayer", "getSourceLayer", "visibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibilityAsExpression", "getVisibilityAsExpression", "getType", "getType$extension_style_release", "options", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class HillshadeLayer extends Layer implements HillshadeLayerDsl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String layerId;

    @NotNull
    private final String sourceId;

    public HillshadeLayer(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @Nullable
    public final String getHillshadeAccentColor() {
        Expression hillshadeAccentColorAsExpression = getHillshadeAccentColorAsExpression();
        if (hillshadeAccentColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(hillshadeAccentColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getHillshadeAccentColorAsColorInt() {
        Expression hillshadeAccentColorAsExpression = getHillshadeAccentColorAsExpression();
        if (hillshadeAccentColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(hillshadeAccentColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getHillshadeAccentColorAsExpression() {
        return (Expression) getPropertyValueWithType("hillshade-accent-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getHillshadeAccentColorTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-accent-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getHillshadeAccentColorUseTheme() {
        return (String) getPropertyValueWithType("hillshade-accent-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getHillshadeAccentColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-accent-color-use-theme");
    }

    @Nullable
    public final Double getHillshadeEmissiveStrength() {
        return (Double) getPropertyValueWithType("hillshade-emissive-strength", Double.class);
    }

    @Nullable
    public final Expression getHillshadeEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-emissive-strength");
    }

    @Nullable
    public final StyleTransition getHillshadeEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-emissive-strength-transition", StyleTransition.class);
    }

    @Nullable
    public final Double getHillshadeExaggeration() {
        return (Double) getPropertyValueWithType("hillshade-exaggeration", Double.class);
    }

    @Nullable
    public final Expression getHillshadeExaggerationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-exaggeration");
    }

    @Nullable
    public final StyleTransition getHillshadeExaggerationTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-exaggeration-transition", StyleTransition.class);
    }

    @Nullable
    public final String getHillshadeHighlightColor() {
        Expression hillshadeHighlightColorAsExpression = getHillshadeHighlightColorAsExpression();
        if (hillshadeHighlightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(hillshadeHighlightColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getHillshadeHighlightColorAsColorInt() {
        Expression hillshadeHighlightColorAsExpression = getHillshadeHighlightColorAsExpression();
        if (hillshadeHighlightColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(hillshadeHighlightColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getHillshadeHighlightColorAsExpression() {
        return (Expression) getPropertyValueWithType("hillshade-highlight-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getHillshadeHighlightColorTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-highlight-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getHillshadeHighlightColorUseTheme() {
        return (String) getPropertyValueWithType("hillshade-highlight-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getHillshadeHighlightColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-highlight-color-use-theme");
    }

    @Nullable
    public final HillshadeIlluminationAnchor getHillshadeIlluminationAnchor() {
        String str = (String) getPropertyValueWithType("hillshade-illumination-anchor", String.class);
        if (str == null) {
            return null;
        }
        HillshadeIlluminationAnchor.Companion companion = HillshadeIlluminationAnchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
    }

    @Nullable
    public final Expression getHillshadeIlluminationAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("hillshade-illumination-anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        HillshadeIlluminationAnchor hillshadeIlluminationAnchor = getHillshadeIlluminationAnchor();
        if (hillshadeIlluminationAnchor != null) {
            return Expression.INSTANCE.literal(hillshadeIlluminationAnchor.getValue());
        }
        return null;
    }

    @Nullable
    public final Double getHillshadeIlluminationDirection() {
        return (Double) getPropertyValueWithType("hillshade-illumination-direction", Double.class);
    }

    @Nullable
    public final Expression getHillshadeIlluminationDirectionAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-illumination-direction");
    }

    @Nullable
    public final String getHillshadeShadowColor() {
        Expression hillshadeShadowColorAsExpression = getHillshadeShadowColorAsExpression();
        if (hillshadeShadowColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(hillshadeShadowColorAsExpression);
        }
        return null;
    }

    @ColorInt
    @Nullable
    public final Integer getHillshadeShadowColorAsColorInt() {
        Expression hillshadeShadowColorAsExpression = getHillshadeShadowColorAsExpression();
        if (hillshadeShadowColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(hillshadeShadowColorAsExpression);
        }
        return null;
    }

    @Nullable
    public final Expression getHillshadeShadowColorAsExpression() {
        return (Expression) getPropertyValueWithType("hillshade-shadow-color", Expression.class);
    }

    @Nullable
    public final StyleTransition getHillshadeShadowColorTransition() {
        return (StyleTransition) getPropertyValueWithType("hillshade-shadow-color-transition", StyleTransition.class);
    }

    @Nullable
    public final String getHillshadeShadowColorUseTheme() {
        return (String) getPropertyValueWithType("hillshade-shadow-color-use-theme", String.class);
    }

    @Nullable
    public final Expression getHillshadeShadowColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("hillshade-shadow-color-use-theme");
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
        return "hillshade";
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

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeAccentColor(@ColorInt int hillshadeAccentColor) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(hillshadeAccentColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeAccentColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeAccentColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    @NotNull
    public HillshadeLayer hillshadeAccentColorUseTheme(@NotNull String hillshadeAccentColorUseTheme) {
        hillshadeAccentColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color-use-theme", hillshadeAccentColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeEmissiveStrength(double hillshadeEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-emissive-strength", Double.valueOf(hillshadeEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeEmissiveStrengthTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeExaggeration(double hillshadeExaggeration) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-exaggeration", Double.valueOf(hillshadeExaggeration)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeExaggerationTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeExaggerationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeHighlightColor(@ColorInt int hillshadeHighlightColor) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(hillshadeHighlightColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeHighlightColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeHighlightColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    @NotNull
    public HillshadeLayer hillshadeHighlightColorUseTheme(@NotNull String hillshadeHighlightColorUseTheme) {
        hillshadeHighlightColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color-use-theme", hillshadeHighlightColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeIlluminationAnchor(@NotNull HillshadeIlluminationAnchor hillshadeIlluminationAnchor) {
        hillshadeIlluminationAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-anchor", hillshadeIlluminationAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeIlluminationDirection(double hillshadeIlluminationDirection) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-direction", Double.valueOf(hillshadeIlluminationDirection)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeShadowColor(@ColorInt int hillshadeShadowColor) {
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(hillshadeShadowColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeShadowColorTransition(@NotNull Function1<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        hillshadeShadowColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    @NotNull
    public HillshadeLayer hillshadeShadowColorUseTheme(@NotNull String hillshadeShadowColorUseTheme) {
        hillshadeShadowColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color-use-theme", hillshadeShadowColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HillshadeLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HillshadeLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HillshadeLayer slot(@NotNull String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer sourceLayer(@NotNull String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HillshadeLayer visibility(@NotNull Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u000eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010!\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0013\u0010%\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0013\u0010)\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b*\u0010\nR\u0013\u0010+\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u0013\u0010-\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u001c\u0010/\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0006R\u001c\u00102\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b:\u0010\u000eR\u0013\u0010;\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001cR\u0013\u0010=\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b>\u0010\u000eR\u0013\u0010?\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010\u0006R\u0013\u0010A\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\bB\u0010\nR\u0013\u0010C\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR\u0013\u0010E\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u001c\u0010G\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0006R\u001c\u0010J\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u000eR\u0013\u0010M\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bN\u0010\u001cR\u0013\u0010O\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bP\u0010\u001cR\u0013\u0010Q\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer$Companion;", "", "()V", "defaultHillshadeAccentColor", "", "getDefaultHillshadeAccentColor", "()Ljava/lang/String;", "defaultHillshadeAccentColorAsColorInt", "", "getDefaultHillshadeAccentColorAsColorInt", "()Ljava/lang/Integer;", "defaultHillshadeAccentColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultHillshadeAccentColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultHillshadeAccentColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultHillshadeAccentColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultHillshadeAccentColorUseTheme", "getDefaultHillshadeAccentColorUseTheme$annotations", "getDefaultHillshadeAccentColorUseTheme", "defaultHillshadeAccentColorUseThemeAsExpression", "getDefaultHillshadeAccentColorUseThemeAsExpression$annotations", "getDefaultHillshadeAccentColorUseThemeAsExpression", "defaultHillshadeEmissiveStrength", "", "getDefaultHillshadeEmissiveStrength", "()Ljava/lang/Double;", "defaultHillshadeEmissiveStrengthAsExpression", "getDefaultHillshadeEmissiveStrengthAsExpression", "defaultHillshadeEmissiveStrengthTransition", "getDefaultHillshadeEmissiveStrengthTransition", "defaultHillshadeExaggeration", "getDefaultHillshadeExaggeration", "defaultHillshadeExaggerationAsExpression", "getDefaultHillshadeExaggerationAsExpression", "defaultHillshadeExaggerationTransition", "getDefaultHillshadeExaggerationTransition", "defaultHillshadeHighlightColor", "getDefaultHillshadeHighlightColor", "defaultHillshadeHighlightColorAsColorInt", "getDefaultHillshadeHighlightColorAsColorInt", "defaultHillshadeHighlightColorAsExpression", "getDefaultHillshadeHighlightColorAsExpression", "defaultHillshadeHighlightColorTransition", "getDefaultHillshadeHighlightColorTransition", "defaultHillshadeHighlightColorUseTheme", "getDefaultHillshadeHighlightColorUseTheme$annotations", "getDefaultHillshadeHighlightColorUseTheme", "defaultHillshadeHighlightColorUseThemeAsExpression", "getDefaultHillshadeHighlightColorUseThemeAsExpression$annotations", "getDefaultHillshadeHighlightColorUseThemeAsExpression", "defaultHillshadeIlluminationAnchor", "Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "getDefaultHillshadeIlluminationAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "defaultHillshadeIlluminationAnchorAsExpression", "getDefaultHillshadeIlluminationAnchorAsExpression", "defaultHillshadeIlluminationDirection", "getDefaultHillshadeIlluminationDirection", "defaultHillshadeIlluminationDirectionAsExpression", "getDefaultHillshadeIlluminationDirectionAsExpression", "defaultHillshadeShadowColor", "getDefaultHillshadeShadowColor", "defaultHillshadeShadowColorAsColorInt", "getDefaultHillshadeShadowColorAsColorInt", "defaultHillshadeShadowColorAsExpression", "getDefaultHillshadeShadowColorAsExpression", "defaultHillshadeShadowColorTransition", "getDefaultHillshadeShadowColorTransition", "defaultHillshadeShadowColorUseTheme", "getDefaultHillshadeShadowColorUseTheme$annotations", "getDefaultHillshadeShadowColorUseTheme", "defaultHillshadeShadowColorUseThemeAsExpression", "getDefaultHillshadeShadowColorUseThemeAsExpression$annotations", "getDefaultHillshadeShadowColorUseThemeAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getDefaultHillshadeAccentColor() {
            Expression defaultHillshadeAccentColorAsExpression = getDefaultHillshadeAccentColorAsExpression();
            if (defaultHillshadeAccentColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultHillshadeAccentColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultHillshadeAccentColorAsColorInt() {
            Expression defaultHillshadeAccentColorAsExpression = getDefaultHillshadeAccentColorAsExpression();
            if (defaultHillshadeAccentColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultHillshadeAccentColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultHillshadeAccentColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color");
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
        public final StyleTransition getDefaultHillshadeAccentColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultHillshadeAccentColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultHillshadeAccentColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-accent-color-use-theme");
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
            String defaultHillshadeAccentColorUseTheme = getDefaultHillshadeAccentColorUseTheme();
            if (defaultHillshadeAccentColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHillshadeAccentColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultHillshadeEmissiveStrength() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultHillshadeEmissiveStrengthAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-emissive-strength");
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
            Double defaultHillshadeEmissiveStrength = getDefaultHillshadeEmissiveStrength();
            if (defaultHillshadeEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHillshadeEmissiveStrength.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultHillshadeEmissiveStrengthTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final Double getDefaultHillshadeExaggeration() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-exaggeration");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultHillshadeExaggerationAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-exaggeration");
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
            Double defaultHillshadeExaggeration = getDefaultHillshadeExaggeration();
            if (defaultHillshadeExaggeration == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHillshadeExaggeration.doubleValue());
        }

        @Nullable
        public final StyleTransition getDefaultHillshadeExaggerationTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-exaggeration-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultHillshadeHighlightColor() {
            Expression defaultHillshadeHighlightColorAsExpression = getDefaultHillshadeHighlightColorAsExpression();
            if (defaultHillshadeHighlightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultHillshadeHighlightColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultHillshadeHighlightColorAsColorInt() {
            Expression defaultHillshadeHighlightColorAsExpression = getDefaultHillshadeHighlightColorAsExpression();
            if (defaultHillshadeHighlightColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultHillshadeHighlightColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultHillshadeHighlightColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color");
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
        public final StyleTransition getDefaultHillshadeHighlightColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultHillshadeHighlightColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultHillshadeHighlightColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-highlight-color-use-theme");
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
            String defaultHillshadeHighlightColorUseTheme = getDefaultHillshadeHighlightColorUseTheme();
            if (defaultHillshadeHighlightColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHillshadeHighlightColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final HillshadeIlluminationAnchor getDefaultHillshadeIlluminationAnchor() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-anchor");
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
            HillshadeIlluminationAnchor.Companion companion = HillshadeIlluminationAnchor.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(RegionDefaults$$ExternalSyntheticOutline0.m(locale, str, locale, '-', '_'));
        }

        @Nullable
        public final Expression getDefaultHillshadeIlluminationAnchorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-anchor");
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
            HillshadeIlluminationAnchor defaultHillshadeIlluminationAnchor = getDefaultHillshadeIlluminationAnchor();
            if (defaultHillshadeIlluminationAnchor != null) {
                return Expression.INSTANCE.literal(defaultHillshadeIlluminationAnchor.getValue());
            }
            return null;
        }

        @Nullable
        public final Double getDefaultHillshadeIlluminationDirection() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-direction");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Double) obj;
        }

        @Nullable
        public final Expression getDefaultHillshadeIlluminationDirectionAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-illumination-direction");
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
            Double defaultHillshadeIlluminationDirection = getDefaultHillshadeIlluminationDirection();
            if (defaultHillshadeIlluminationDirection == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHillshadeIlluminationDirection.doubleValue());
        }

        @Nullable
        public final String getDefaultHillshadeShadowColor() {
            Expression defaultHillshadeShadowColorAsExpression = getDefaultHillshadeShadowColorAsExpression();
            if (defaultHillshadeShadowColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultHillshadeShadowColorAsExpression);
            }
            return null;
        }

        @ColorInt
        @Nullable
        public final Integer getDefaultHillshadeShadowColorAsColorInt() {
            Expression defaultHillshadeShadowColorAsExpression = getDefaultHillshadeShadowColorAsExpression();
            if (defaultHillshadeShadowColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultHillshadeShadowColorAsExpression);
            }
            return null;
        }

        @Nullable
        public final Expression getDefaultHillshadeShadowColorAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color");
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
        public final StyleTransition getDefaultHillshadeShadowColorTransition() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (StyleTransition) obj;
        }

        @Nullable
        public final String getDefaultHillshadeShadowColorUseTheme() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (String) obj;
        }

        @Nullable
        public final Expression getDefaultHillshadeShadowColorUseThemeAsExpression() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "hillshade-shadow-color-use-theme");
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
            String defaultHillshadeShadowColorUseTheme = getDefaultHillshadeShadowColorUseTheme();
            if (defaultHillshadeShadowColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHillshadeShadowColorUseTheme);
            }
            return null;
        }

        @Nullable
        public final Double getDefaultMaxZoom() {
            Object obj;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("hillshade", "visibility");
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
        public static /* synthetic */ void getDefaultHillshadeAccentColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeAccentColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeHighlightColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeHighlightColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeShadowColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHillshadeShadowColorUseThemeAsExpression$annotations() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    @NotNull
    public HillshadeLayer hillshadeAccentColorUseTheme(@NotNull Expression hillshadeAccentColorUseTheme) {
        hillshadeAccentColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color-use-theme", hillshadeAccentColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    @NotNull
    public HillshadeLayer hillshadeHighlightColorUseTheme(@NotNull Expression hillshadeHighlightColorUseTheme) {
        hillshadeHighlightColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color-use-theme", hillshadeHighlightColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeIlluminationAnchor(@NotNull Expression hillshadeIlluminationAnchor) {
        hillshadeIlluminationAnchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-anchor", hillshadeIlluminationAnchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @MapboxExperimental
    @NotNull
    public HillshadeLayer hillshadeShadowColorUseTheme(@NotNull Expression hillshadeShadowColorUseTheme) {
        hillshadeShadowColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color-use-theme", hillshadeShadowColorUseTheme));
        return this;
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeAccentColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeAccentColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeHighlightColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeHighlightColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeShadowColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHillshadeShadowColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeEmissiveStrength(@NotNull Expression hillshadeEmissiveStrength) {
        hillshadeEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-emissive-strength", hillshadeEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeExaggeration(@NotNull Expression hillshadeExaggeration) {
        hillshadeExaggeration.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-exaggeration", hillshadeExaggeration));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeIlluminationDirection(@NotNull Expression hillshadeIlluminationDirection) {
        hillshadeIlluminationDirection.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-illumination-direction", hillshadeIlluminationDirection));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    @NotNull
    public HillshadeLayer visibility(@NotNull Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeAccentColor(@NotNull Expression hillshadeAccentColor) {
        hillshadeAccentColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color", hillshadeAccentColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeHighlightColor(@NotNull Expression hillshadeHighlightColor) {
        hillshadeHighlightColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color", hillshadeHighlightColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeShadowColor(@NotNull Expression hillshadeShadowColor) {
        hillshadeShadowColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color", hillshadeShadowColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeAccentColor(@NotNull String hillshadeAccentColor) {
        hillshadeAccentColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color", hillshadeAccentColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeAccentColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-accent-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeEmissiveStrengthTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeExaggerationTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-exaggeration-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeHighlightColor(@NotNull String hillshadeHighlightColor) {
        hillshadeHighlightColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color", hillshadeHighlightColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeHighlightColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-highlight-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeShadowColor(@NotNull String hillshadeShadowColor) {
        hillshadeShadowColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color", hillshadeShadowColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HillshadeLayerDsl
    @NotNull
    public HillshadeLayer hillshadeShadowColorTransition(@NotNull StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("hillshade-shadow-color-transition", options));
        return this;
    }
}
