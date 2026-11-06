package com.amazon.apl.viewhost.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.amazon.apl.viewhost.TimeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ListIterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DefaultTimeProvider extends BroadcastReceiver implements TimeProvider {
    private final String TAG = "DefaultTimeProvider";
    private final ArrayList<WeakReference<TimeProvider.LocalTimeOffsetListener>> mListeners = new ArrayList<>();
    private long mCurrentOffset = getLocalTimeOffset();

    public DefaultTimeProvider(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        context.registerReceiver(this, intentFilter);
    }

    @Override // com.amazon.apl.viewhost.TimeProvider
    public void addListener(WeakReference<TimeProvider.LocalTimeOffsetListener> weakReference) {
        synchronized (this.mListeners) {
            this.mListeners.add(weakReference);
        }
    }

    @Override // com.amazon.apl.viewhost.TimeProvider
    public long getLocalTimeOffset() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(16) + calendar.get(15);
    }

    @Override // com.amazon.apl.viewhost.TimeProvider
    public long getUTCTime() {
        return System.currentTimeMillis();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        long localTimeOffset = getLocalTimeOffset();
        if (this.mCurrentOffset != localTimeOffset) {
            Log.i(this.TAG, "Time offset change detected, notifying all listeners.");
            this.mCurrentOffset = localTimeOffset;
            synchronized (this.mListeners) {
                try {
                    ListIterator<WeakReference<TimeProvider.LocalTimeOffsetListener>> listIterator = this.mListeners.listIterator();
                    while (listIterator.hasNext()) {
                        TimeProvider.LocalTimeOffsetListener localTimeOffsetListener = listIterator.next().get();
                        if (localTimeOffsetListener == null) {
                            listIterator.remove();
                        } else {
                            localTimeOffsetListener.onLocalTimeOffsetUpdated(this.mCurrentOffset);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
