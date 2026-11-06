package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import android.telecom.TelecomManager;
import com.amazon.comms.calling.infrastructure.telecom.TelecomProviderService;
import com.amazon.comms.calling.infrastructure.telecom.TelecomProviderServiceImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/dependency/modules/TelecomModule;", "", "<init>", "()V", "providesTelecomManager", "Landroid/telecom/TelecomManager;", "context", "Landroid/content/Context;", "providesTelecomServiceProvider", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomProviderService;", "telecomProviderServiceImpl", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomProviderServiceImpl;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class TelecomModule {
    @Provides
    @Singleton
    @NotNull
    public final TelecomManager providesTelecomManager(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("telecom");
        systemService.getClass();
        return (TelecomManager) systemService;
    }

    @Provides
    @Singleton
    @NotNull
    public final TelecomProviderService providesTelecomServiceProvider(@NotNull TelecomProviderServiceImpl telecomProviderServiceImpl) {
        telecomProviderServiceImpl.getClass();
        return telecomProviderServiceImpl;
    }
}
