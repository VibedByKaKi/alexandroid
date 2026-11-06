package com.amazon.comms.calling.dependency;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/dependency/CoroutineModule;", "", "<init>", "()V", "providesDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesMainDispatcher", "providesIoDispatcher", "providesAppScope", "Lkotlinx/coroutines/CoroutineScope;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class CoroutineModule {
    @Provides
    @Singleton
    @NotNull
    public final CoroutineScope providesAppScope() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }

    @Provides
    @DefaultDispatcher
    @NotNull
    public final CoroutineDispatcher providesDefaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @Provides
    @IoDispatcher
    @NotNull
    public final CoroutineDispatcher providesIoDispatcher() {
        return Dispatchers.getIO();
    }

    @Provides
    @MainDispatcher
    @NotNull
    public final CoroutineDispatcher providesMainDispatcher() {
        return Dispatchers.getMain();
    }
}
