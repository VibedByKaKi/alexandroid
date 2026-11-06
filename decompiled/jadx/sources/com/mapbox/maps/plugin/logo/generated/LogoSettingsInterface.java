package com.mapbox.maps.plugin.logo.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.plugin.logo.generated.LogoSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u001d\u001a\u00020\u001eH&J!\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020 0\"¢\u0006\u0002\b$H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0018\u0010\u0014\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u0018\u0010\u0017\u001a\u00020\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/mapbox/maps/plugin/logo/generated/LogoSettingsInterface;", "", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", ViewProps.MARGIN_BOTTOM, "", "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "position", "", "getPosition", "()I", "setPosition", "(I)V", "getSettings", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "updateSettings", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface LogoSettingsInterface {
    boolean getEnabled();

    float getMarginBottom();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    int getPosition();

    @NotNull
    LogoSettings getSettings();

    void setEnabled(boolean z);

    void setMarginBottom(float f);

    void setMarginLeft(float f);

    void setMarginRight(float f);

    void setMarginTop(float f);

    void setPosition(int i);

    void updateSettings(@NotNull Function1<? super LogoSettings.Builder, Unit> block);
}
