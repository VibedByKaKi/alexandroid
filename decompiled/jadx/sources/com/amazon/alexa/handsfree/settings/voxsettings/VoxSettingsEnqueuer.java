package com.amazon.alexa.handsfree.settings.voxsettings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoxSettingsEnqueuer {
    @Inject
    public VoxSettingsEnqueuer() {
    }

    @VisibleForTesting
    public ResultReceiver getParceledReceiver(@NonNull ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    public void getShowOnLockscreen(@NonNull Context context, @NonNull ResultReceiver resultReceiver) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.amazon.alexa.handsfree.voxconfig.EXTRA_RESULT_RECEIVER", getParceledReceiver(resultReceiver));
        sendIntent(VoxSettingsJobIntentService.REQUEST_GET, context, bundle);
    }

    @VisibleForTesting
    public void sendIntent(@NonNull String str, @NonNull Context context, @Nullable Bundle bundle) {
        Intent m = TableInfo$$ExternalSyntheticOutline0.m(context, VoxSettingsJobIntentService.class, str);
        if (bundle != null) {
            m.putExtras(bundle);
        }
        JobIntentService.enqueueWork(context, (Class<?>) VoxSettingsJobIntentService.class, 30033, m);
    }

    public void syncShowOnLockscreenPref(@NonNull Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("retryAttempt", 0);
        syncShowOnLockscreenPrefWithBundle(context, bundle);
    }

    public void syncShowOnLockscreenPrefWithBundle(@NonNull Context context, @NonNull Bundle bundle) {
        sendIntent(VoxSettingsJobIntentService.REQUEST_SET, context, bundle);
    }

    public void updateLegacyShowOnLockscreenPref(@NonNull Context context, boolean z, @NonNull ResultReceiver resultReceiver) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, z);
        bundle.putInt("retryAttempt", 0);
        bundle.putParcelable("com.amazon.alexa.handsfree.voxconfig.SET_RESULT_RECEIVER", getParceledReceiver(resultReceiver));
        syncShowOnLockscreenPrefWithBundle(context, bundle);
    }

    public void updateShowOnLockscreenPref(@NonNull Context context, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, z);
        bundle.putInt("retryAttempt", 0);
        syncShowOnLockscreenPrefWithBundle(context, bundle);
    }
}
