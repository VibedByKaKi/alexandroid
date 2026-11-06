package com.amazon.whisperjoin.provisionerSDK.utility;

import android.os.Handler;
import android.os.Looper;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class Observers<EventType> {
    private static final String TAG = "com.amazon.whisperjoin.provisionerSDK.utility.Observers";
    private final Handler mHandler;
    private final List<RunnableEvent<EventType>> mObservers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RunnableEvent<EventType> {
        void run(Object obj, EventType eventtype);
    }

    public Observers(Collection<RunnableEvent<EventType>> collection, Handler handler) {
        if (handler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        } else {
            this.mHandler = handler;
        }
        if (collection == null) {
            this.mObservers = new CopyOnWriteArrayList();
        } else {
            this.mObservers = new CopyOnWriteArrayList(collection);
        }
    }

    public void addObserver(RunnableEvent<EventType> runnableEvent) {
        if (runnableEvent != null) {
            this.mObservers.add(runnableEvent);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("observer can not be null");
        }
    }

    public void invoke(final Object obj, final EventType eventtype) {
        for (final RunnableEvent<EventType> runnableEvent : this.mObservers) {
            try {
                this.mHandler.post(new Runnable() { // from class: com.amazon.whisperjoin.provisionerSDK.utility.Observers.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        runnableEvent.run(obj, eventtype);
                    }
                });
            } catch (Exception e) {
                WJLog.e(TAG, e.toString());
            }
        }
    }

    public void removeObserver(RunnableEvent<EventType> runnableEvent) {
        if (runnableEvent != null) {
            this.mObservers.remove(runnableEvent);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("observer can not be null");
        }
    }

    public long size() {
        return this.mObservers.size();
    }

    public Observers() {
        this(new ArrayList(), null);
    }

    public Observers(Collection<RunnableEvent<EventType>> collection) {
        this(collection, null);
    }

    public Observers(Handler handler) {
        this(new ArrayList(), handler);
    }
}
