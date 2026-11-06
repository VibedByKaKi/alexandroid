package com.amazon.deecomms.common.ui.util;

import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class OnSingleClickListener implements View.OnClickListener {
    private static final long DEFAULT_CLICK_INTERVAL = 600;
    private final long mClickInterval;
    private volatile long mLastClickTime;

    public OnSingleClickListener(long j) {
        this.mLastClickTime = 0L;
        this.mClickInterval = j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.mLastClickTime >= this.mClickInterval) {
            onSingleClick(view);
            this.mLastClickTime = elapsedRealtime;
        }
    }

    public abstract void onSingleClick(View view);

    public OnSingleClickListener() {
        this(600L);
    }
}
