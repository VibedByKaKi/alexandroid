package io.branch.referral.util;

import io.branch.referral.BranchLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"androidBrowserClass", "", "billingGooglePlayClass", "huaweiAdvertisingIdClientClass", "huaweiInstallReferrerClass", "playStoreAdvertisingIdClientClass", "playStoreInstallReferrerClass", "samsungInstallReferrerClass", "xiaomiInstallReferrerClass", "classExists", "", "className", "Branch-SDK_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DependencyUtilsKt {

    @NotNull
    public static final String androidBrowserClass = "androidx.browser.customtabs.CustomTabsIntent";

    @NotNull
    public static final String billingGooglePlayClass = "com.android.billingclient.api.BillingClient";

    @NotNull
    public static final String huaweiAdvertisingIdClientClass = "com.huawei.hms.ads.identifier.AdvertisingIdClient";

    @NotNull
    public static final String huaweiInstallReferrerClass = "com.huawei.hms.ads.installreferrer.api.InstallReferrerClient";

    @NotNull
    public static final String playStoreAdvertisingIdClientClass = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    @NotNull
    public static final String playStoreInstallReferrerClass = "com.android.installreferrer.api.InstallReferrerClient";

    @NotNull
    public static final String samsungInstallReferrerClass = "com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient";

    @NotNull
    public static final String xiaomiInstallReferrerClass = "com.miui.referrer.api.GetAppsReferrerClient";

    public static final boolean classExists(@NotNull String str) {
        str.getClass();
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            BranchLogger.v("Could not find " + str + ". If expected, import the dependency into your app.");
            return false;
        }
    }
}
