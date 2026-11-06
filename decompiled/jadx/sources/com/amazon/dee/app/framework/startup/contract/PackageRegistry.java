package com.amazon.dee.app.framework.startup.contract;

import com.amazon.dee.app.framework.startup.taskmanagement.StartupTask;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface PackageRegistry {
    List<StartupTask> getTasks();

    void registerAllTasks();
}
