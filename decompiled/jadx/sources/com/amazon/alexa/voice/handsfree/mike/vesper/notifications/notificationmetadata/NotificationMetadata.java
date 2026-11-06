package com.amazon.alexa.voice.handsfree.mike.vesper.notifications.notificationmetadata;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.mike.vesper.notifications.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum NotificationMetadata {
    PARTNER_VOICE_APP_DOWNLOAD(R.string.partner_voice_app_download_notification_text);


    @DrawableRes
    public static final int INVALID_ICON_ASSET = -1;
    public static final String NOTIFICATION_ICON_METADATA_NAME = "setup_notification_icon";
    private static final String TAG = "NotificationMetadata";
    private final int mTextResource;

    NotificationMetadata(int i) {
        this.mTextResource = i;
    }

    @DrawableRes
    public int getNotificationIconAsset(@NonNull Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.getInt("setup_notification_icon", -1);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "Icon asset cannot be found in the package", e, new Object[0]);
        }
        return -1;
    }

    public String getNotificationText(@NonNull Context context) {
        return context.getString(this.mTextResource);
    }
}
