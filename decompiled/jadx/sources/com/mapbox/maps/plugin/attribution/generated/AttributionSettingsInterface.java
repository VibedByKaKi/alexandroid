package com.mapbox.maps.plugin.attribution.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010#\u001a\u00020$H&J!\u0010%\u001a\u00020&2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020&0(¢\u0006\u0002\b*H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0018\u0010\u001a\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u0018\u0010\u001d\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u0018\u0010 \u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010¨\u0006+"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsInterface;", "", "clickable", "", "getClickable", "()Z", "setClickable", "(Z)V", "enabled", "getEnabled", "setEnabled", "iconColor", "", "getIconColor", "()I", "setIconColor", "(I)V", ViewProps.MARGIN_BOTTOM, "", "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "position", "getPosition", "setPosition", "getSettings", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "updateSettings", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface AttributionSettingsInterface {
    boolean getClickable();

    boolean getEnabled();

    int getIconColor();

    float getMarginBottom();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    int getPosition();

    @NotNull
    AttributionSettings getSettings();

    void setClickable(boolean z);

    void setEnabled(boolean z);

    void setIconColor(int i);

    void setMarginBottom(float f);

    void setMarginLeft(float f);

    void setMarginRight(float f);

    void setMarginTop(float f);

    void setPosition(int i);

    void updateSettings(@NotNull Function1<? super AttributionSettings.Builder, Unit> block);
}
