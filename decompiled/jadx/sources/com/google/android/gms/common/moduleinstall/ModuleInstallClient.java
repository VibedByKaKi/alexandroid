package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @NonNull
    Task<ModuleAvailabilityResponse> areModulesAvailable(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    Task<Void> deferredInstall(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    Task<ModuleInstallIntentResponse> getInstallModulesIntent(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    @ResultIgnorabilityUnspecified
    Task<ModuleInstallResponse> installModules(@NonNull ModuleInstallRequest moduleInstallRequest);

    @NonNull
    Task<Void> releaseModules(@NonNull OptionalModuleApi... optionalModuleApiArr);

    @NonNull
    @ResultIgnorabilityUnspecified
    Task<Boolean> unregisterListener(@NonNull InstallStatusListener installStatusListener);
}
