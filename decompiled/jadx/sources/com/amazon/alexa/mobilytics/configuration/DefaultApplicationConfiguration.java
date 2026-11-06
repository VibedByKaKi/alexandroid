package com.amazon.alexa.mobilytics.configuration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class DefaultApplicationConfiguration implements ApplicationConfiguration {
    private static final String TAG = Log.tag((Class<?>) DefaultApplicationConfiguration.class);
    private final String appId;
    private final String packageName;
    private final String title;
    private final String versionCode;
    private final String versionName;

    @Inject
    public DefaultApplicationConfiguration(@NonNull MobilyticsConfiguration mobilyticsConfiguration) {
        String str;
        String str2;
        String str3;
        PackageInfo packageInfo;
        String str4 = "Unknown";
        Context context = mobilyticsConfiguration.context();
        try {
            PackageManager packageManager = context.getPackageManager();
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageInfo.packageName, 0));
        } catch (Exception e) {
            e = e;
            str = "Unknown";
            str2 = str;
        }
        try {
            str2 = packageInfo.packageName;
            try {
                str3 = String.valueOf(packageInfo.versionCode);
            } catch (Exception e2) {
                e = e2;
                str3 = "Unknown";
            }
            try {
                str4 = packageInfo.versionName;
            } catch (Exception e3) {
                e = e3;
                Log.w(TAG, e, "Unable to determine package details for: " + mobilyticsConfiguration.context().getPackageName(), new Object[0]);
                this.appId = mobilyticsConfiguration.applicationId();
                this.title = str;
                this.packageName = str2;
                this.versionName = str4;
                this.versionCode = str3;
            }
        } catch (Exception e4) {
            e = e4;
            str2 = "Unknown";
            str3 = str2;
            Log.w(TAG, e, "Unable to determine package details for: " + mobilyticsConfiguration.context().getPackageName(), new Object[0]);
            this.appId = mobilyticsConfiguration.applicationId();
            this.title = str;
            this.packageName = str2;
            this.versionName = str4;
            this.versionCode = str3;
        }
        this.appId = mobilyticsConfiguration.applicationId();
        this.title = str;
        this.packageName = str2;
        this.versionName = str4;
        this.versionCode = str3;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.ApplicationConfiguration
    @NonNull
    public String id() {
        return this.appId;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.ApplicationConfiguration
    @NonNull
    public String packageName() {
        return this.packageName;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.ApplicationConfiguration
    @NonNull
    public String title() {
        return this.title;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicationConfiguration[");
        sb.append("applicationId: " + this.appId + "; ");
        sb.append("title: " + this.title + "; ");
        sb.append("packageName: " + this.packageName + "; ");
        sb.append("versionName: " + this.versionName + "; ");
        sb.append("versionCode: " + this.versionCode + "; ");
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    @Override // com.amazon.alexa.mobilytics.configuration.ApplicationConfiguration
    @NonNull
    public String versionCode() {
        return this.versionCode;
    }

    @Override // com.amazon.alexa.mobilytics.configuration.ApplicationConfiguration
    @NonNull
    public String versionName() {
        return this.versionName;
    }
}
