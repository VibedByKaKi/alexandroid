package com.amazon.alexa.ra.android.smartfragment.config;

import android.os.Bundle;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006&"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/config/SandboxConfiguration;", "", "bridgeId", "", "bundleSource", "viewId", "componentName", "initialProperties", "Landroid/os/Bundle;", "allowedTurboModules", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Set;)V", "getBridgeId", "()Ljava/lang/String;", "getBundleSource", "getViewId", "getComponentName", "getInitialProperties", "()Landroid/os/Bundle;", "getAllowedTurboModules", "()Ljava/util/Set;", "isFileOrUrlBundle", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SandboxConfiguration {

    @Nullable
    private static final Set<String> DEFAULT_ALLOWED_MODULES = null;

    @NotNull
    public static final String DEFAULT_BUNDLE_SOURCE = "smartfragments.bundle.hbc";

    @NotNull
    public static final String DENSITY_KEY = "density";

    @NotNull
    public static final String RELEVANCY_KEY = "relevancy";

    @Nullable
    private final Set<String> allowedTurboModules;

    @NotNull
    private final String bridgeId;

    @NotNull
    private final String bundleSource;

    @NotNull
    private final String componentName;

    @Nullable
    private final Bundle initialProperties;

    @NotNull
    private final String viewId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SandboxConfiguration(String str, String str2, String str3, String str4, Bundle bundle, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? DEFAULT_BUNDLE_SOURCE : str2, str3, str4, (i & 16) != 0 ? null : bundle, (i & 32) != 0 ? DEFAULT_ALLOWED_MODULES : set);
    }

    public static /* synthetic */ SandboxConfiguration copy$default(SandboxConfiguration sandboxConfiguration, String str, String str2, String str3, String str4, Bundle bundle, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sandboxConfiguration.bridgeId;
        }
        if ((i & 2) != 0) {
            str2 = sandboxConfiguration.bundleSource;
        }
        if ((i & 4) != 0) {
            str3 = sandboxConfiguration.viewId;
        }
        if ((i & 8) != 0) {
            str4 = sandboxConfiguration.componentName;
        }
        if ((i & 16) != 0) {
            bundle = sandboxConfiguration.initialProperties;
        }
        if ((i & 32) != 0) {
            set = sandboxConfiguration.allowedTurboModules;
        }
        Bundle bundle2 = bundle;
        Set set2 = set;
        return sandboxConfiguration.copy(str, str2, str3, str4, bundle2, set2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBundleSource() {
        return this.bundleSource;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Bundle getInitialProperties() {
        return this.initialProperties;
    }

    @Nullable
    public final Set<String> component6() {
        return this.allowedTurboModules;
    }

    @NotNull
    public final SandboxConfiguration copy(@NotNull String bridgeId, @NotNull String bundleSource, @NotNull String viewId, @NotNull String componentName, @Nullable Bundle initialProperties, @Nullable Set<String> allowedTurboModules) {
        bridgeId.getClass();
        bundleSource.getClass();
        viewId.getClass();
        componentName.getClass();
        return new SandboxConfiguration(bridgeId, bundleSource, viewId, componentName, initialProperties, allowedTurboModules);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SandboxConfiguration)) {
            return false;
        }
        SandboxConfiguration sandboxConfiguration = (SandboxConfiguration) other;
        return Intrinsics.areEqual(this.bridgeId, sandboxConfiguration.bridgeId) && Intrinsics.areEqual(this.bundleSource, sandboxConfiguration.bundleSource) && Intrinsics.areEqual(this.viewId, sandboxConfiguration.viewId) && Intrinsics.areEqual(this.componentName, sandboxConfiguration.componentName) && Intrinsics.areEqual(this.initialProperties, sandboxConfiguration.initialProperties) && Intrinsics.areEqual(this.allowedTurboModules, sandboxConfiguration.allowedTurboModules);
    }

    @Nullable
    public final Set<String> getAllowedTurboModules() {
        return this.allowedTurboModules;
    }

    @NotNull
    public final String getBridgeId() {
        return this.bridgeId;
    }

    @NotNull
    public final String getBundleSource() {
        return this.bundleSource;
    }

    @NotNull
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final Bundle getInitialProperties() {
        return this.initialProperties;
    }

    @NotNull
    public final String getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.bridgeId.hashCode() * 31, 31, this.bundleSource), 31, this.viewId), 31, this.componentName);
        Bundle bundle = this.initialProperties;
        int hashCode = (m + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Set<String> set = this.allowedTurboModules;
        return hashCode + (set != null ? set.hashCode() : 0);
    }

    public final boolean isFileOrUrlBundle() {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.bundleSource, "/", false, 2, null);
        if (startsWith$default) {
            return true;
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(this.bundleSource, "http://", false, 2, null);
        if (startsWith$default2) {
            return true;
        }
        startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(this.bundleSource, "https://", false, 2, null);
        return startsWith$default3;
    }

    @NotNull
    public String toString() {
        String str = this.bridgeId;
        String str2 = this.bundleSource;
        String str3 = this.viewId;
        String str4 = this.componentName;
        Bundle bundle = this.initialProperties;
        Set<String> set = this.allowedTurboModules;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SandboxConfiguration(bridgeId=", str, ", bundleSource=", str2, ", viewId=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", componentName=", str4, ", initialProperties=");
        m.append(bundle);
        m.append(", allowedTurboModules=");
        m.append(set);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/config/SandboxConfiguration$Companion;", "", "<init>", "()V", "DEFAULT_BUNDLE_SOURCE", "", "RELEVANCY_KEY", "DENSITY_KEY", "DEFAULT_ALLOWED_MODULES", "", "getDEFAULT_ALLOWED_MODULES", "()Ljava/util/Set;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Set<String> getDEFAULT_ALLOWED_MODULES() {
            return SandboxConfiguration.DEFAULT_ALLOWED_MODULES;
        }

        private Companion() {
        }
    }

    public SandboxConfiguration(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Bundle bundle, @Nullable Set<String> set) {
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14725m(str, str2, str3, str4);
        this.bridgeId = str;
        this.bundleSource = str2;
        this.viewId = str3;
        this.componentName = str4;
        this.initialProperties = bundle;
        this.allowedTurboModules = set;
    }
}
