package com.amazon.alexa.ra.core.features.permissions;

import com.amazon.alexa.ra.core.data.model.PermissionState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/permissions/PermissionSourceApi;", "", "hasPermission", "Lcom/amazon/alexa/ra/core/data/model/PermissionState;", "permissionName", "", "isBackgroundRestricted", "", "start", "", "stop", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PermissionSourceApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isBackgroundRestricted(@NotNull PermissionSourceApi permissionSourceApi) {
            return PermissionSourceApi.super.isBackgroundRestricted();
        }
    }

    @NotNull
    PermissionState hasPermission(@NotNull String permissionName);

    default boolean isBackgroundRestricted() {
        return false;
    }

    void start();

    void stop();
}
