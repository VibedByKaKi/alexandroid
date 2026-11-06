package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.facebook.react.bridge.MemoryPressureListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0017J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/MemoryPressureRouter;", "Landroid/content/ComponentCallbacks2;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/facebook/react/bridge/MemoryPressureListener;", "destroy", "", "addMemoryPressureListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeMemoryPressureListener", "onTrimMemory", ModelTransformer.KEY_BATTERY_LEVEL, "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "dispatchMemoryPressure", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class MemoryPressureRouter implements ComponentCallbacks2 {

    @NotNull
    private final CopyOnWriteArrayList<MemoryPressureListener> listeners;

    public MemoryPressureRouter(@NotNull Context context) {
        context.getClass();
        this.listeners = new CopyOnWriteArrayList<>();
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private final void dispatchMemoryPressure(int level) {
        Iterator<MemoryPressureListener> it2 = this.listeners.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            it2.next().handleMemoryPressure(level);
        }
    }

    public final void addMemoryPressureListener(@NotNull MemoryPressureListener listener) {
        listener.getClass();
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    public final void destroy(@NotNull Context context) {
        context.getClass();
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        newConfig.getClass();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        dispatchMemoryPressure(level);
    }

    public final void removeMemoryPressureListener(@NotNull MemoryPressureListener listener) {
        listener.getClass();
        this.listeners.remove(listener);
    }

    @Override // android.content.ComponentCallbacks
    @Deprecated(message = "onLowMemory is deprecated, use onTrimMemory instead.", replaceWith = @ReplaceWith(expression = "onTrimMemory(level)", imports = {}))
    public void onLowMemory() {
    }
}
