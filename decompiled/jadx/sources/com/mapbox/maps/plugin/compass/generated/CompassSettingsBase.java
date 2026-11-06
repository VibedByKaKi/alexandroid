package com.mapbox.maps.plugin.compass.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010:\u001a\u00020;H$J\b\u0010<\u001a\u00020\u0017H\u0016J!\u0010=\u001a\u00020;2\u0017\u0010>\u001a\u0013\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020;0?¢\u0006\u0002\bAH\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017X¤\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010%\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R$\u0010(\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R$\u0010+\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R$\u0010/\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020.8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R$\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\t¨\u0006B"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsBase;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsInterface;", "()V", "value", "", "clickable", "getClickable", "()Z", "setClickable", "(Z)V", "enabled", "getEnabled", "setEnabled", "fadeWhenFacingNorth", "getFadeWhenFacingNorth", "setFadeWhenFacingNorth", "Lcom/mapbox/maps/ImageHolder;", "image", "getImage", "()Lcom/mapbox/maps/ImageHolder;", "setImage", "(Lcom/mapbox/maps/ImageHolder;)V", "internalSettings", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;)V", "", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "opacity", "getOpacity", "setOpacity", "", "position", "getPosition", "()I", "setPosition", "(I)V", "rotation", "getRotation", "setRotation", "visibility", "getVisibility", "setVisibility", "applySettings", "", "getSettings", "updateSettings", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CompassSettingsBase implements CompassSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getClickable() {
        return getInternalSettings().getClickable();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getFadeWhenFacingNorth() {
        return getInternalSettings().getFadeWhenFacingNorth();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    @Nullable
    public ImageHolder getImage() {
        return getInternalSettings().getImage();
    }

    @NotNull
    public abstract CompassSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginBottom() {
        return getInternalSettings().getMarginBottom();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginLeft() {
        return getInternalSettings().getMarginLeft();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginRight() {
        return getInternalSettings().getMarginRight();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginTop() {
        return getInternalSettings().getMarginTop();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getOpacity() {
        return getInternalSettings().getOpacity();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public int getPosition() {
        return getInternalSettings().getPosition();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getRotation() {
        return getInternalSettings().getRotation();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    @NotNull
    public CompassSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getVisibility() {
        return getInternalSettings().getVisibility();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setClickable(boolean z) {
        if (getInternalSettings().getClickable() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setClickable(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setEnabled(boolean z) {
        if (getInternalSettings().getEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setFadeWhenFacingNorth(boolean z) {
        if (getInternalSettings().getFadeWhenFacingNorth() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setFadeWhenFacingNorth(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setImage(@Nullable ImageHolder imageHolder) {
        if (Intrinsics.areEqual(getInternalSettings().getImage(), imageHolder)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setImage(imageHolder).build());
        applySettings();
    }

    public abstract void setInternalSettings(@NotNull CompassSettings compassSettings);

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginBottom(float f) {
        if (getInternalSettings().getMarginBottom() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginBottom(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginLeft(float f) {
        if (getInternalSettings().getMarginLeft() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginLeft(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginRight(float f) {
        if (getInternalSettings().getMarginRight() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginRight(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginTop(float f) {
        if (getInternalSettings().getMarginTop() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginTop(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setOpacity(float f) {
        if (getInternalSettings().getOpacity() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setOpacity(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setPosition(int i) {
        if (getInternalSettings().getPosition() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setPosition(i).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setRotation(float f) {
        if (getInternalSettings().getRotation() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setRotation(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setVisibility(boolean z) {
        if (getInternalSettings().getVisibility() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setVisibility(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void updateSettings(@NotNull Function1<? super CompassSettings.Builder, Unit> block) {
        block.getClass();
        CompassSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        CompassSettings build = builder.build();
        setEnabled(build.getEnabled());
        setInternalSettings(build);
        applySettings();
    }
}
