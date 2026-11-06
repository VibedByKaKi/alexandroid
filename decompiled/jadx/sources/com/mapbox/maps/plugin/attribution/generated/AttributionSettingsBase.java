package com.mapbox.maps.plugin.attribution.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020,H$J\b\u0010-\u001a\u00020\u0014H\u0016J!\u0010.\u001a\u00020,2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020,00¢\u0006\u0002\b2H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0014X¤\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\"\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010%\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR$\u0010(\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012¨\u00063"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsBase;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsInterface;", "()V", "value", "", "clickable", "getClickable", "()Z", "setClickable", "(Z)V", "enabled", "getEnabled", "setEnabled", "", "iconColor", "getIconColor", "()I", "setIconColor", "(I)V", "internalSettings", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;)V", "", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "position", "getPosition", "setPosition", "applySettings", "", "getSettings", "updateSettings", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class AttributionSettingsBase implements AttributionSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public boolean getClickable() {
        return getInternalSettings().getClickable();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public int getIconColor() {
        return getInternalSettings().getIconColor();
    }

    @NotNull
    public abstract AttributionSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginBottom() {
        return getInternalSettings().getMarginBottom();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginLeft() {
        return getInternalSettings().getMarginLeft();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginRight() {
        return getInternalSettings().getMarginRight();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginTop() {
        return getInternalSettings().getMarginTop();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public int getPosition() {
        return getInternalSettings().getPosition();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    @NotNull
    public AttributionSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setClickable(boolean z) {
        if (getInternalSettings().getClickable() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setClickable(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setEnabled(boolean z) {
        if (getInternalSettings().getEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setIconColor(int i) {
        if (getInternalSettings().getIconColor() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setIconColor(i).build());
            applySettings();
        }
    }

    public abstract void setInternalSettings(@NotNull AttributionSettings attributionSettings);

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginBottom(float f) {
        if (getInternalSettings().getMarginBottom() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginBottom(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginLeft(float f) {
        if (getInternalSettings().getMarginLeft() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginLeft(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginRight(float f) {
        if (getInternalSettings().getMarginRight() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginRight(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginTop(float f) {
        if (getInternalSettings().getMarginTop() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginTop(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setPosition(int i) {
        if (getInternalSettings().getPosition() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setPosition(i).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void updateSettings(@NotNull Function1<? super AttributionSettings.Builder, Unit> block) {
        block.getClass();
        AttributionSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        AttributionSettings build = builder.build();
        setEnabled(build.getEnabled());
        setInternalSettings(build);
        applySettings();
    }
}
