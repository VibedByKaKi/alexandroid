package com.amazon.alexa.voice.handsfree.notifications.providers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.api.UVRSettingsProvider;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRVendorSettings;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.UserInfo;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback;
import com.amazon.alexa.handsfree.settings.voxsettings.ShowOnLockscreenResultReceiver;
import com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsEnqueuer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationUVRSettingsProvider implements UVRSettingsProvider {
    private static final String TAG = "NotiUVRSettingsProvider";
    private static final int TIME_OUT_MILLIS = 3000;
    private final UVRVendorSettings mUVRVendorSettings;
    private final VoxSettingsEnqueuer mVoxSettingsEnqueuer;

    public NotificationUVRSettingsProvider(@Nullable UVRVendorSettings uVRVendorSettings) {
        this(uVRVendorSettings, new VoxSettingsEnqueuer());
    }

    @Override // com.amazon.alexa.handsfree.notification.api.UVRSettingsProvider
    @RequiresApi(24)
    public boolean isShowOnLockscreenEnabled(@NonNull Context context) {
        final CompletableFuture completableFuture = new CompletableFuture();
        this.mVoxSettingsEnqueuer.getShowOnLockscreen(context, new ShowOnLockscreenResultReceiver(new PreferenceCallback() { // from class: com.amazon.alexa.voice.handsfree.notifications.providers.NotificationUVRSettingsProvider.1
            @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback
            public void onPreferenceChanged(boolean z) {
                completableFuture.complete(Boolean.valueOf(z));
            }
        }));
        try {
            return ((Boolean) completableFuture.get(3000L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(TAG, "isShowOnLockScreenEnabled: ", e, new Object[0]);
            return true;
        }
    }

    @Override // com.amazon.alexa.handsfree.notification.api.UVRSettingsProvider
    public boolean isUVRAvailable() {
        UVRVendorSettings uVRVendorSettings = this.mUVRVendorSettings;
        return uVRVendorSettings != null && uVRVendorSettings.isUVRAvailable();
    }

    @Override // com.amazon.alexa.handsfree.notification.api.UVRSettingsProvider
    public boolean isUVREnabled() {
        UVRVendorSettings uVRVendorSettings = this.mUVRVendorSettings;
        return uVRVendorSettings != null && uVRVendorSettings.isUVREnrolled(UserInfo.DEFAULT_USER);
    }

    @VisibleForTesting
    public NotificationUVRSettingsProvider(@Nullable UVRVendorSettings uVRVendorSettings, @NonNull VoxSettingsEnqueuer voxSettingsEnqueuer) {
        this.mUVRVendorSettings = uVRVendorSettings;
        this.mVoxSettingsEnqueuer = voxSettingsEnqueuer;
    }
}
