package com.mapbox.maps.plugin.logo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.logo.LogoPlugin;
import com.mapbox.maps.plugin.logo.generated.LogoAttributeParser;
import com.mapbox.maps.plugin.logo.generated.LogoSettings;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsBase;
import com.mapbox.maps.plugin.logo.generated.LogoSettingsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001aH\u0016R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/mapbox/maps/plugin/logo/LogoViewPlugin;", "Lcom/mapbox/maps/plugin/logo/LogoPlugin;", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettingsBase;", "viewImplProvider", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/mapbox/maps/plugin/logo/LogoViewImpl;", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "internalSettings", "Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/logo/generated/LogoSettings;)V", "logoView", "Lcom/mapbox/maps/plugin/logo/LogoView;", "applySettings", "", "bind", "Landroid/view/View;", "mapView", "Landroid/widget/FrameLayout;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "initialize", "onPluginView", "view", "plugin-logo_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes9.dex */
public final class LogoViewPlugin extends LogoSettingsBase implements LogoPlugin {

    @NotNull
    private LogoSettings internalSettings;
    private LogoView logoView;

    @NotNull
    private final Function1<Context, LogoViewImpl> viewImplProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public LogoViewPlugin(@NotNull Function1<? super Context, LogoViewImpl> function1) {
        function1.getClass();
        this.viewImplProvider = function1;
        this.internalSettings = LogoSettingsKt.LogoSettings(new Function1<LogoSettings.Builder, Unit>() { // from class: com.mapbox.maps.plugin.logo.LogoViewPlugin$internalSettings$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LogoSettings.Builder builder) {
                invoke2(builder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LogoSettings.Builder builder) {
                builder.getClass();
            }
        });
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase
    public void applySettings() {
        LogoView logoView = this.logoView;
        LogoView logoView2 = null;
        if (logoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logoView");
            logoView = null;
        }
        logoView.setLogoMargins((int) getInternalSettings().getMarginLeft(), (int) getInternalSettings().getMarginTop(), (int) getInternalSettings().getMarginRight(), (int) getInternalSettings().getMarginBottom());
        LogoView logoView3 = this.logoView;
        if (logoView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logoView");
            logoView3 = null;
        }
        logoView3.setLogoGravity(getInternalSettings().getPosition());
        LogoView logoView4 = this.logoView;
        if (logoView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logoView");
            logoView4 = null;
        }
        logoView4.setLogoEnabled(getInternalSettings().getEnabled());
        LogoView logoView5 = this.logoView;
        if (logoView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logoView");
        } else {
            logoView2 = logoView5;
        }
        logoView2.requestLayout();
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    @NotNull
    public View bind(@NotNull FrameLayout mapView, @Nullable AttributeSet attrs, float pixelRatio) {
        mapView.getClass();
        LogoAttributeParser logoAttributeParser = LogoAttributeParser.INSTANCE;
        Context context = mapView.getContext();
        context.getClass();
        setInternalSettings(logoAttributeParser.parseLogoSettings(context, attrs, pixelRatio));
        Function1<Context, LogoViewImpl> function1 = this.viewImplProvider;
        Context context2 = mapView.getContext();
        context2.getClass();
        LogoViewImpl invoke = function1.invoke(context2);
        invoke.injectPresenter$plugin_logo_release(this);
        return invoke;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        LogoPlugin.DefaultImpls.cleanup(this);
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase, com.mapbox.maps.plugin.logo.generated.LogoSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase
    @NotNull
    public LogoSettings getInternalSettings() {
        return this.internalSettings;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(@NotNull MapDelegateProvider mapDelegateProvider) {
        LogoPlugin.DefaultImpls.onDelegateProvider(this, mapDelegateProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.ViewPlugin
    public void onPluginView(@NotNull View view) {
        view.getClass();
        LogoView logoView = view instanceof LogoView ? (LogoView) view : null;
        if (logoView != null) {
            this.logoView = logoView;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The provided view needs to implement LogoContract.LogoView");
        }
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase, com.mapbox.maps.plugin.logo.generated.LogoSettingsInterface
    public void setEnabled(boolean z) {
        if (getInternalSettings().getEnabled() != z) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z).build());
            applySettings();
            LogoView logoView = this.logoView;
            if (logoView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("logoView");
                logoView = null;
            }
            logoView.setLogoEnabled(z);
        }
    }

    @Override // com.mapbox.maps.plugin.logo.generated.LogoSettingsBase
    public void setInternalSettings(@NotNull LogoSettings logoSettings) {
        logoSettings.getClass();
        this.internalSettings = logoSettings;
    }

    public /* synthetic */ LogoViewPlugin(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1<Context, LogoViewImpl>() { // from class: com.mapbox.maps.plugin.logo.LogoViewPlugin.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final LogoViewImpl invoke(@NotNull Context context) {
                context.getClass();
                return new LogoViewImpl(context);
            }
        } : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogoViewPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
