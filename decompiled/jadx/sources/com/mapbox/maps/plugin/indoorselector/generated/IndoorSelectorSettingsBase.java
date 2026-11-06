package com.mapbox.maps.plugin.indoorselector.generated;

import com.facebook.react.uimanager.ViewProps;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H$J\b\u0010'\u001a\u00020\u000bH\u0016J!\u0010(\u001a\u00020&2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020&0*¢\u0006\u0002\b,H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¤\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettingsBase;", "Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettingsInterface;", "()V", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "internalSettings", "Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings;)V", "", ViewProps.MARGIN_BOTTOM, "getMarginBottom", "()F", "setMarginBottom", "(F)V", ViewProps.MARGIN_LEFT, "getMarginLeft", "setMarginLeft", ViewProps.MARGIN_RIGHT, "getMarginRight", "setMarginRight", ViewProps.MARGIN_TOP, "getMarginTop", "setMarginTop", "", "position", "getPosition", "()I", "setPosition", "(I)V", "applySettings", "", "getSettings", "updateSettings", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/indoorselector/generated/IndoorSelectorSettings$Builder;", "Lkotlin/ExtensionFunctionType;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public abstract class IndoorSelectorSettingsBase implements IndoorSelectorSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @NotNull
    public abstract IndoorSelectorSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public float getMarginBottom() {
        return getInternalSettings().getMarginBottom();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public float getMarginLeft() {
        return getInternalSettings().getMarginLeft();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public float getMarginRight() {
        return getInternalSettings().getMarginRight();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public float getMarginTop() {
        return getInternalSettings().getMarginTop();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public int getPosition() {
        return getInternalSettings().getPosition();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    @NotNull
    public IndoorSelectorSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public void setEnabled(boolean z) {
        if (getInternalSettings().getEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z).build());
            applySettings();
        }
    }

    public abstract void setInternalSettings(@NotNull IndoorSelectorSettings indoorSelectorSettings);

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public void setMarginBottom(float f) {
        if (getInternalSettings().getMarginBottom() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginBottom(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public void setMarginLeft(float f) {
        if (getInternalSettings().getMarginLeft() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginLeft(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public void setMarginRight(float f) {
        if (getInternalSettings().getMarginRight() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginRight(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public void setMarginTop(float f) {
        if (getInternalSettings().getMarginTop() == f) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginTop(f).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public void setPosition(int i) {
        if (getInternalSettings().getPosition() != i) {
            setInternalSettings(getInternalSettings().toBuilder().setPosition(i).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettingsInterface
    public void updateSettings(@NotNull Function1<? super IndoorSelectorSettings.Builder, Unit> block) {
        block.getClass();
        IndoorSelectorSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        IndoorSelectorSettings build = builder.build();
        setEnabled(build.getEnabled());
        setInternalSettings(build);
        applySettings();
    }
}
