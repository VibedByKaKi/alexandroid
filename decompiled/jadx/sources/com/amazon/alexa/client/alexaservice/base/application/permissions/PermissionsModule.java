package com.amazon.alexa.client.alexaservice.base.application.permissions;

import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/application/permissions/PermissionsModule;", "", "()V", "providesPermissionChecker", "Lcom/amazon/alexa/client/alexaservice/base/application/permissions/PermissionsChecker;", "clientConfiguration", "Lcom/amazon/alexa/client/core/configuration/ClientConfiguration;", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes17.dex */
public final class PermissionsModule {
    @Provides
    @Singleton
    @NotNull
    public final PermissionsChecker providesPermissionChecker(@NotNull ClientConfiguration clientConfiguration) {
        clientConfiguration.getClass();
        return Intrinsics.areEqual(clientConfiguration.getLocationPermissionsAllowed(), Boolean.TRUE) ? new DefaultPermissionsChecker() : new NoGeolocationPermissionsChecker();
    }
}
