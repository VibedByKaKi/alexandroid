package com.amazon.dee.app.services.metrics.kinesis.system;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.dee.app.services.logging.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\fJ\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/system/AndroidAppDetails;", "Lcom/amazon/dee/app/services/metrics/kinesis/system/AppDetails;", "context", "Landroid/content/Context;", SettingsStorageModule.FILTER_SETTINGS_APP_ID_KEY, "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "packageName", "versionCode", ModelTransformer.KEY_FIRMWARE_VERSION_NAME, "appTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppTitle", "getAppId", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidAppDetails implements AppDetails {

    @NotNull
    private static final String TAG = Log.tag((Class<?>) AndroidAppDetails.class);

    @NotNull
    private static final String UNKNOWN = "Unknown";

    @NotNull
    private final String appId;

    @NotNull
    private final String appTitle;

    @NotNull
    private final String packageName;

    @NotNull
    private final String versionCode;

    @NotNull
    private final String versionName;

    public AndroidAppDetails(@NotNull Context context, @NotNull String str) {
        String str2;
        String str3;
        String str4;
        PackageInfo packageInfo;
        context.getClass();
        str.getClass();
        this.appId = str;
        Context applicationContext = context.getApplicationContext();
        String str5 = "Unknown";
        try {
            PackageManager packageManager = applicationContext.getPackageManager();
            packageInfo = packageManager.getPackageInfo(applicationContext.getPackageName(), 0);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageInfo.packageName, 0);
            applicationInfo.getClass();
            str2 = packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Unknown";
            str3 = str2;
        }
        try {
            str3 = packageInfo.packageName;
            str3.getClass();
            try {
                str4 = String.valueOf(packageInfo.versionCode);
                try {
                    String str6 = packageInfo.versionName;
                    if (str6 != null) {
                        str5 = str6;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    Log.w(TAG, "Unable to get details for package " + applicationContext.getPackageName());
                    this.appTitle = str2;
                    this.packageName = str3;
                    this.versionCode = str4;
                    this.versionName = str5;
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str4 = "Unknown";
            }
        } catch (PackageManager.NameNotFoundException unused4) {
            str3 = "Unknown";
            str4 = str3;
            Log.w(TAG, "Unable to get details for package " + applicationContext.getPackageName());
            this.appTitle = str2;
            this.packageName = str3;
            this.versionCode = str4;
            this.versionName = str5;
        }
        this.appTitle = str2;
        this.packageName = str3;
        this.versionCode = str4;
        this.versionName = str5;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.AppDetails
    @NotNull
    public String getAppId() {
        return this.appId;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.AppDetails
    @NotNull
    public String getAppTitle() {
        return this.appTitle;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.AppDetails
    @NotNull
    /* renamed from: packageName, reason: from getter */
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.AppDetails
    @NotNull
    /* renamed from: versionCode, reason: from getter */
    public String getVersionCode() {
        return this.versionCode;
    }

    @Override // com.amazon.dee.app.services.metrics.kinesis.system.AppDetails
    @NotNull
    /* renamed from: versionName, reason: from getter */
    public String getVersionName() {
        return this.versionName;
    }

    public AndroidAppDetails(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Automotive$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.packageName = str;
        this.versionCode = str2;
        this.versionName = str3;
        this.appTitle = str4;
        this.appId = str5;
    }
}
