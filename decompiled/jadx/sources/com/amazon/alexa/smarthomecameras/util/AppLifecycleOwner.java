package com.amazon.alexa.smarthomecameras.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AppLifecycleOwner {
    private final List<AppLifecycleListener> listeners = new ArrayList();

    public synchronized void deregisterListener(AppLifecycleListener appLifecycleListener) {
        this.listeners.remove(appLifecycleListener);
    }

    public synchronized void onAppBackground() {
        Iterator<AppLifecycleListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAppBackground();
        }
    }

    public synchronized void onAppForeground() {
        Iterator<AppLifecycleListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAppForeground();
        }
    }

    public synchronized void registerListener(AppLifecycleListener appLifecycleListener) {
        this.listeners.add(appLifecycleListener);
    }

    public synchronized void teardown() {
        this.listeners.clear();
    }
}
