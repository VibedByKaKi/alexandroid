package com.amazon.dee.app.framework.startup.taskmanagement;

import com.amazon.dee.app.framework.startup.tool.SystemTrace;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class StartupRunnable implements Runnable {
    private String componentName;
    private Runnable runnable;

    public StartupRunnable(String str, Runnable runnable) {
        this.componentName = str;
        this.runnable = runnable;
    }

    public String getComponentName() {
        return this.componentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        SystemTrace.beginSection(this.componentName);
        Runnable runnable = this.runnable;
        if (runnable != null) {
            runnable.run();
        }
        SystemTrace.endSection(this.componentName);
    }
}
