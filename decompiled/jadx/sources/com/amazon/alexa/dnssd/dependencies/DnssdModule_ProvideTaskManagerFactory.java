package com.amazon.alexa.dnssd.dependencies;

import com.amazon.alexa.tasks.api.TaskManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DnssdModule_ProvideTaskManagerFactory implements Factory<TaskManager> {
    private final DnssdModule module;

    public DnssdModule_ProvideTaskManagerFactory(DnssdModule dnssdModule) {
        this.module = dnssdModule;
    }

    public static DnssdModule_ProvideTaskManagerFactory create(DnssdModule dnssdModule) {
        return new DnssdModule_ProvideTaskManagerFactory(dnssdModule);
    }

    public static TaskManager provideTaskManager(DnssdModule dnssdModule) {
        return (TaskManager) Preconditions.checkNotNullFromProvides(dnssdModule.provideTaskManager());
    }

    @Override // javax.inject.Provider
    public TaskManager get() {
        return provideTaskManager(this.module);
    }
}
