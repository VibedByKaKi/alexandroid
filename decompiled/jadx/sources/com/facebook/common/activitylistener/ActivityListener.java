package com.facebook.common.activitylistener;

import android.app.Activity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ActivityListener {
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;

    int getPriority();

    void onActivityCreate(Activity activity);

    void onDestroy(Activity activity);

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onStart(Activity activity);

    void onStop(Activity activity);
}
