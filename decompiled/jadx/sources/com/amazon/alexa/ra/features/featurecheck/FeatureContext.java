package com.amazon.alexa.ra.features.featurecheck;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/features/featurecheck/FeatureContext;", "", "locale", "Ljava/util/Locale;", "deviceClass", "Lcom/amazon/alexa/ra/features/featurecheck/DeviceClass;", "appType", "Lcom/amazon/alexa/ra/features/featurecheck/AppType;", "<init>", "(Ljava/util/Locale;Lcom/amazon/alexa/ra/features/featurecheck/DeviceClass;Lcom/amazon/alexa/ra/features/featurecheck/AppType;)V", "getLocale", "()Ljava/util/Locale;", "getDeviceClass", "()Lcom/amazon/alexa/ra/features/featurecheck/DeviceClass;", "getAppType", "()Lcom/amazon/alexa/ra/features/featurecheck/AppType;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FeatureContext {
    public static final int $stable = 8;

    @NotNull
    private final AppType appType;

    @NotNull
    private final DeviceClass deviceClass;

    @NotNull
    private final Locale locale;

    public FeatureContext(@NotNull Locale locale, @NotNull DeviceClass deviceClass, @NotNull AppType appType) {
        locale.getClass();
        deviceClass.getClass();
        appType.getClass();
        this.locale = locale;
        this.deviceClass = deviceClass;
        this.appType = appType;
    }

    public static /* synthetic */ FeatureContext copy$default(FeatureContext featureContext, Locale locale, DeviceClass deviceClass, AppType appType, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = featureContext.locale;
        }
        if ((i & 2) != 0) {
            deviceClass = featureContext.deviceClass;
        }
        if ((i & 4) != 0) {
            appType = featureContext.appType;
        }
        return featureContext.copy(locale, deviceClass, appType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DeviceClass getDeviceClass() {
        return this.deviceClass;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    @NotNull
    public final FeatureContext copy(@NotNull Locale locale, @NotNull DeviceClass deviceClass, @NotNull AppType appType) {
        locale.getClass();
        deviceClass.getClass();
        appType.getClass();
        return new FeatureContext(locale, deviceClass, appType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureContext)) {
            return false;
        }
        FeatureContext featureContext = (FeatureContext) other;
        return Intrinsics.areEqual(this.locale, featureContext.locale) && this.deviceClass == featureContext.deviceClass && this.appType == featureContext.appType;
    }

    @NotNull
    public final AppType getAppType() {
        return this.appType;
    }

    @NotNull
    public final DeviceClass getDeviceClass() {
        return this.deviceClass;
    }

    @NotNull
    public final Locale getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return this.appType.hashCode() + ((this.deviceClass.hashCode() + (this.locale.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FeatureContext(locale=" + this.locale + ", deviceClass=" + this.deviceClass + ", appType=" + this.appType + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ FeatureContext(Locale locale, DeviceClass deviceClass, AppType appType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, deviceClass, (i & 4) != 0 ? AppType.PRODUCTION : appType);
    }
}
