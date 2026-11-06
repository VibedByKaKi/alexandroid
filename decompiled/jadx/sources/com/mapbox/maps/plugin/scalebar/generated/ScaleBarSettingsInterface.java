package com.mapbox.maps.plugin.scalebar.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.plugin.DistanceUnits;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import com.reactcommunity.rndatetimepicker.Common;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010N\u001a\u00020OH&J!\u0010P\u001a\u00020Q2\u0017\u0010R\u001a\u0013\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020Q0S¢\u0006\u0002\bUH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\"\u0010\u0017\u001a\u00020\u000f8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u0018\u0010\u001b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0005\"\u0004\b\u001d\u0010\u0007R\u0018\u0010\u001e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0005\"\u0004\b \u0010\u0007R\u0018\u0010!\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0005\"\u0004\b#\u0010\u0007R\u0018\u0010$\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0005\"\u0004\b&\u0010\u0007R\u0018\u0010'\u001a\u00020(X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010-\u001a\u00020(X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u0018\u00100\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0005\"\u0004\b2\u0010\u0007R\u0018\u00103\u001a\u000204X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u00109\u001a\u00020(X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\u0018\u0010<\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0011\"\u0004\b>\u0010\u0013R\u0018\u0010?\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0005\"\u0004\bA\u0010\u0007R\u0018\u0010B\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010\u0005\"\u0004\bD\u0010\u0007R\u0018\u0010E\u001a\u00020(X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R\u0018\u0010H\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0005\"\u0004\bJ\u0010\u0007R\u0018\u0010K\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0011\"\u0004\bM\u0010\u0013¨\u0006V"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsInterface;", "", ViewProps.BORDER_WIDTH, "", "getBorderWidth", "()F", "setBorderWidth", "(F)V", "distanceUnits", "Lcom/mapbox/maps/plugin/DistanceUnits;", "getDistanceUnits", "()Lcom/mapbox/maps/plugin/DistanceUnits;", "setDistanceUnits", "(Lcom/mapbox/maps/plugin/DistanceUnits;)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "height", "getHeight", "setHeight", "isMetricUnits", "isMetricUnits$annotations", "()V", "setMetricUnits", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "setMarginBottom", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "position", "", "getPosition", "()I", "setPosition", "(I)V", "primaryColor", "getPrimaryColor", "setPrimaryColor", "ratio", "getRatio", "setRatio", "refreshInterval", "", "getRefreshInterval", "()J", "setRefreshInterval", "(J)V", "secondaryColor", "getSecondaryColor", "setSecondaryColor", "showTextBorder", "getShowTextBorder", "setShowTextBorder", "textBarMargin", "getTextBarMargin", "setTextBarMargin", "textBorderWidth", "getTextBorderWidth", "setTextBorderWidth", Common.TEXT_COLOR, "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "useContinuousRendering", "getUseContinuousRendering", "setUseContinuousRendering", "getSettings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "updateSettings", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface ScaleBarSettingsInterface {
    float getBorderWidth();

    @NotNull
    DistanceUnits getDistanceUnits();

    boolean getEnabled();

    float getHeight();

    float getMarginBottom();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    int getPosition();

    int getPrimaryColor();

    float getRatio();

    long getRefreshInterval();

    int getSecondaryColor();

    @NotNull
    ScaleBarSettings getSettings();

    boolean getShowTextBorder();

    float getTextBarMargin();

    float getTextBorderWidth();

    int getTextColor();

    float getTextSize();

    boolean getUseContinuousRendering();

    boolean isMetricUnits();

    void setBorderWidth(float f);

    void setDistanceUnits(@NotNull DistanceUnits distanceUnits);

    void setEnabled(boolean z);

    void setHeight(float f);

    void setMarginBottom(float f);

    void setMarginLeft(float f);

    void setMarginRight(float f);

    void setMarginTop(float f);

    void setMetricUnits(boolean z);

    void setPosition(int i);

    void setPrimaryColor(int i);

    void setRatio(float f);

    void setRefreshInterval(long j);

    void setSecondaryColor(int i);

    void setShowTextBorder(boolean z);

    void setTextBarMargin(float f);

    void setTextBorderWidth(float f);

    void setTextColor(int i);

    void setTextSize(float f);

    void setUseContinuousRendering(boolean z);

    void updateSettings(@NotNull Function1<? super ScaleBarSettings.Builder, Unit> block);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(message = "Use distanceUnits instead.")
        public static /* synthetic */ void isMetricUnits$annotations() {
        }
    }
}
