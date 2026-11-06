package com.dee.app.contacts.common.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dee.app.contacts.common.models.enums.ActivityLifecycle;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ActivityLifecycleUtil implements Application.ActivityLifecycleCallbacks {
    private ActivityLifecycle activityLifecycle;
    private Activity mActivity;

    @Inject
    public ActivityLifecycleUtil(@NonNull Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity getCurrentActivity() {
        return this.mActivity;
    }

    public ActivityLifecycle getCurrentActivityLifecycle() {
        return this.activityLifecycle;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        this.mActivity = activity;
        this.activityLifecycle = ActivityLifecycle.ON_CREATE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        this.mActivity = null;
        this.activityLifecycle = ActivityLifecycle.ON_DESTROY;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.mActivity = activity;
        this.activityLifecycle = ActivityLifecycle.ON_PAUSE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.mActivity = activity;
        this.activityLifecycle = ActivityLifecycle.ON_RESUME;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.mActivity = activity;
        this.activityLifecycle = ActivityLifecycle.ON_START;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.mActivity = activity;
        this.activityLifecycle = ActivityLifecycle.ON_STOP;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
