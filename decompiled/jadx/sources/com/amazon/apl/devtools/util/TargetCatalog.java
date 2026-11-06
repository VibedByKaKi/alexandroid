package com.amazon.apl.devtools.util;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.amazon.apl.devtools.models.Target;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TargetCatalog {
    private Context context;
    private final Handler mHandler;
    private final HandlerThread mHandlerThread;
    private final SortedMap<String, WeakReference<Target>> mTargets = new TreeMap();

    public TargetCatalog() {
        HandlerThread handlerThread = new HandlerThread("TargetCatalogThread");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }

    public void add(Target target) {
        this.mTargets.put(target.getTargetId(), new WeakReference<>(target));
    }

    public void cleanup() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandlerThread.quit();
    }

    @Nullable
    public Target get(String str) {
        WeakReference<Target> weakReference = this.mTargets.get(str);
        if (weakReference == null) {
            return null;
        }
        Target target = weakReference.get();
        if (target != null) {
            return target;
        }
        remove(str);
        return null;
    }

    public Collection<WeakReference<Target>> getAll() {
        return this.mTargets.values();
    }

    public Context getAppContext() {
        return this.context;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public void post(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    public void remove(String str) {
        this.mTargets.remove(str);
    }

    public void setAppContext(Context context) {
        this.context = context;
    }
}
