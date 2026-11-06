package com.mapbox.maps.plugin.compass.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u00102\u001a\u000203H&J!\u00104\u001a\u0002052\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020507¢\u0006\u0002\b9H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0018\u0010\u001d\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u0018\u0010 \u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u0018\u0010#\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u0018\u0010&\u001a\u00020'X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020\u0015X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\u0018\u0010/\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007¨\u0006:"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsInterface;", "", "clickable", "", "getClickable", "()Z", "setClickable", "(Z)V", "enabled", "getEnabled", "setEnabled", "fadeWhenFacingNorth", "getFadeWhenFacingNorth", "setFadeWhenFacingNorth", "image", "Lcom/mapbox/maps/ImageHolder;", "getImage", "()Lcom/mapbox/maps/ImageHolder;", "setImage", "(Lcom/mapbox/maps/ImageHolder;)V", ViewProps.MARGIN_BOTTOM, "", "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "opacity", "getOpacity", "setOpacity", "position", "", "getPosition", "()I", "setPosition", "(I)V", "rotation", "getRotation", "setRotation", "visibility", "getVisibility", "setVisibility", "getSettings", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "updateSettings", "", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface CompassSettingsInterface {
    boolean getClickable();

    boolean getEnabled();

    boolean getFadeWhenFacingNorth();

    @Nullable
    ImageHolder getImage();

    float getMarginBottom();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    float getOpacity();

    int getPosition();

    float getRotation();

    @NotNull
    CompassSettings getSettings();

    boolean getVisibility();

    void setClickable(boolean z);

    void setEnabled(boolean z);

    void setFadeWhenFacingNorth(boolean z);

    void setImage(@Nullable ImageHolder imageHolder);

    void setMarginBottom(float f);

    void setMarginLeft(float f);

    void setMarginRight(float f);

    void setMarginTop(float f);

    void setOpacity(float f);

    void setPosition(int i);

    void setRotation(float f);

    void setVisibility(boolean z);

    void updateSettings(@NotNull Function1<? super CompassSettings.Builder, Unit> block);
}
