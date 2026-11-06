package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.alexa.assetManagementService.api.AssetManagementService;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.notification.api.NotificationCenterLocalProtocol;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.comms.calling.data.network.EventBusProvider;
import com.amazon.comms.calling.data.network.EventBusProviderImpl;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.data.util.UtilsImpl;
import com.amazon.comms.calling.foundation.CommsCallUri;
import com.amazon.comms.calling.foundation.CommsCallUriImpl;
import com.amazon.comms.calling.foundation.storage.providers.SharedPreferenceStorageProvider;
import com.amazon.comms.calling.foundation.storage.providers.StorageProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.UtcDateTypeAdapter;
import dagger.Module;
import dagger.Provides;
import java.util.Date;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006 "}, d2 = {"Lcom/amazon/comms/calling/dependency/modules/FoundationModule;", "", "<init>", "()V", "providesStorageProvider", "Lcom/amazon/comms/calling/foundation/storage/providers/StorageProvider;", "context", "Landroid/content/Context;", "providesGson", "Lcom/google/gson/Gson;", "providesEventBus", "Lcom/amazon/alexa/eventbus/api/EventBus;", "componentRegistry", "Lcom/amazon/alexa/protocols/service/api/ComponentRegistry;", "providesEventBusProvider", "Lcom/amazon/comms/calling/data/network/EventBusProvider;", "eventBusProviderImpl", "Lcom/amazon/comms/calling/data/network/EventBusProviderImpl;", "providesUtils", "Lcom/amazon/comms/calling/data/util/Utils;", "utilsImpl", "Lcom/amazon/comms/calling/data/util/UtilsImpl;", "providesAssetManagementService", "Lcom/amazon/alexa/assetManagementService/api/AssetManagementService;", "providesCommsCallUri", "Lcom/amazon/comms/calling/foundation/CommsCallUri;", "commsCallUriImpl", "Lcom/amazon/comms/calling/foundation/CommsCallUriImpl;", "providesPackageManager", "Landroid/content/pm/PackageManager;", "providesNotificationCenter", "Lcom/amazon/alexa/notification/api/NotificationCenterLocalProtocol;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class FoundationModule {
    @Provides
    @NotNull
    public final AssetManagementService providesAssetManagementService(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        Object obj = componentRegistry.getLazy(AssetManagementService.class).get();
        obj.getClass();
        return (AssetManagementService) obj;
    }

    @Provides
    @Singleton
    @NotNull
    public final CommsCallUri providesCommsCallUri(@NotNull CommsCallUriImpl commsCallUriImpl) {
        commsCallUriImpl.getClass();
        return commsCallUriImpl;
    }

    @Provides
    @NotNull
    public final EventBus providesEventBus(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        Object obj = componentRegistry.getLazy(EventBus.class).get();
        obj.getClass();
        return (EventBus) obj;
    }

    @Provides
    @NotNull
    public final EventBusProvider providesEventBusProvider(@NotNull EventBusProviderImpl eventBusProviderImpl) {
        eventBusProviderImpl.getClass();
        return eventBusProviderImpl;
    }

    @Provides
    @Singleton
    @NotNull
    public final Gson providesGson() {
        Gson create = new GsonBuilder().registerTypeAdapter(Date.class, new UtcDateTypeAdapter()).create();
        create.getClass();
        return create;
    }

    @Provides
    @Singleton
    @NotNull
    public final NotificationCenterLocalProtocol providesNotificationCenter(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        Object obj = componentRegistry.getLazy(NotificationCenterLocalProtocol.class).get();
        obj.getClass();
        return (NotificationCenterLocalProtocol) obj;
    }

    @Provides
    @NotNull
    public final PackageManager providesPackageManager(@NotNull Context context) {
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        return packageManager;
    }

    @Provides
    @NotNull
    public final StorageProvider providesStorageProvider(@NotNull Context context) {
        context.getClass();
        return new SharedPreferenceStorageProvider(context);
    }

    @Provides
    @NotNull
    public final Utils providesUtils(@NotNull UtilsImpl utilsImpl) {
        utilsImpl.getClass();
        return utilsImpl;
    }
}
