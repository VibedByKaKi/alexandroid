package com.amazon.dee.app.framework.startup.implementation;

import com.amazon.dee.app.framework.startup.contract.PackageRegistry;
import com.amazon.dee.app.framework.startup.model.PackageDetail;
import com.amazon.dee.app.framework.startup.taskmanagement.StartupRunnable;
import com.amazon.dee.app.framework.startup.taskmanagement.StartupTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public abstract class BasePackageRegistry implements PackageRegistry {
    private static final String TAG = "BasePackageRegistry";
    private List<StartupTask> tasks = new ArrayList();

    public BasePackageRegistry() {
        registerAllTasks();
    }

    public StartupTask debugLog(String str) {
        StartupTask create = StartupTask.create(str, 5);
        this.tasks.add(create);
        return create;
    }

    @Override // com.amazon.dee.app.framework.startup.contract.PackageRegistry
    public List<StartupTask> getTasks() {
        return this.tasks;
    }

    public StartupTask infoLog(String str) {
        StartupTask create = StartupTask.create(str, 3);
        this.tasks.add(create);
        return create;
    }

    public StartupTask registerBackgroundTask(String str, Runnable runnable) {
        StartupTask create = StartupTask.create(new StartupRunnable(str, runnable), 4);
        this.tasks.add(create);
        return create;
    }

    public StartupTask registerPackage(Class cls, String str, String str2) {
        Objects.toString(cls);
        StartupTask create = StartupTask.create(new PackageDetail.PackageDetailBuilder().setClassName(cls).setComponentName(str).setResourceId(str2).create(), 1);
        this.tasks.add(create);
        return create;
    }

    public StartupTask registerTask(String str, Runnable runnable) {
        StartupTask create = StartupTask.create(new StartupRunnable(str, runnable), 2);
        this.tasks.add(create);
        return create;
    }
}
