package com.amazon.deecomms.common.ui.helper;

import android.app.Activity;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ActivitiesManager {
    private Activity topActivity;

    @Nullable
    public synchronized Activity getTopActivity() {
        return this.topActivity;
    }

    public synchronized void setTopActivity(@Nullable Activity activity) {
        this.topActivity = activity;
    }
}
