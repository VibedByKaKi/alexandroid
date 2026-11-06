package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface AppUpdateManager {
    @NonNull
    Task<Void> completeUpdate();

    @NonNull
    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(@NonNull InstallStateUpdatedListener installStateUpdatedListener);

    Task<Integer> startUpdateFlow(@NonNull AppUpdateInfo appUpdateInfo, @NonNull Activity activity, @NonNull AppUpdateOptions appUpdateOptions);

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i, @NonNull Activity activity, int i2) throws IntentSender.SendIntentException;

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, int i2) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull Activity activity, @NonNull AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, @NonNull AppUpdateOptions appUpdateOptions);

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, @NonNull AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException;

    void unregisterListener(@NonNull InstallStateUpdatedListener installStateUpdatedListener);
}
