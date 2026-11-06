package com.bugsnag.android;

import android.content.Context;
import chip.platform.ConfigurationManager;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/DeviceIdStore;", "", "context", "Landroid/content/Context;", "deviceIdfile", "Ljava/io/File;", "deviceIdGenerator", "Lkotlin/Function0;", "Ljava/util/UUID;", "internalDeviceIdfile", "internalDeviceIdGenerator", "sharedPrefMigrator", "Lcom/bugsnag/android/SharedPrefMigrator;", "logger", "Lcom/bugsnag/android/Logger;", "(Landroid/content/Context;Ljava/io/File;Lkotlin/jvm/functions/Function0;Ljava/io/File;Lkotlin/jvm/functions/Function0;Lcom/bugsnag/android/SharedPrefMigrator;Lcom/bugsnag/android/Logger;)V", "internalPersistence", "Lcom/bugsnag/android/DeviceIdPersistence;", "persistence", "loadDeviceId", "", "loadInternalDeviceId", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DeviceIdStore {
    private final DeviceIdPersistence internalPersistence;
    private final DeviceIdPersistence persistence;
    private final SharedPrefMigrator sharedPrefMigrator;

    public /* synthetic */ DeviceIdStore(Context context, File file, Function0 function0, File file2, Function0 function02, SharedPrefMigrator sharedPrefMigrator, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new File(context.getFilesDir(), ConfigurationManager.kConfigKey_MfrDeviceId) : file, (i & 4) != 0 ? new Function0<UUID>() { // from class: com.bugsnag.android.DeviceIdStore.1
            @Override // kotlin.jvm.functions.Function0
            public final UUID invoke() {
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                return randomUUID;
            }
        } : function0, (i & 8) != 0 ? new File(context.getFilesDir(), "internal-device-id") : file2, (i & 16) != 0 ? new Function0<UUID>() { // from class: com.bugsnag.android.DeviceIdStore.2
            @Override // kotlin.jvm.functions.Function0
            public final UUID invoke() {
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                return randomUUID;
            }
        } : function02, sharedPrefMigrator, logger);
    }

    @Nullable
    public final String loadDeviceId() {
        String loadDeviceId = this.persistence.loadDeviceId(false);
        if (loadDeviceId != null) {
            return loadDeviceId;
        }
        String loadDeviceId2 = this.sharedPrefMigrator.loadDeviceId(false);
        return loadDeviceId2 != null ? loadDeviceId2 : this.persistence.loadDeviceId(true);
    }

    @Nullable
    public final String loadInternalDeviceId() {
        return this.internalPersistence.loadDeviceId(true);
    }

    @JvmOverloads
    public DeviceIdStore(@NotNull Context context, @NotNull File file, @NotNull SharedPrefMigrator sharedPrefMigrator, @NotNull Logger logger) {
        this(context, file, null, null, null, sharedPrefMigrator, logger, 28, null);
    }

    @JvmOverloads
    public DeviceIdStore(@NotNull Context context, @NotNull File file, @NotNull Function0<UUID> function0, @NotNull SharedPrefMigrator sharedPrefMigrator, @NotNull Logger logger) {
        this(context, file, function0, null, null, sharedPrefMigrator, logger, 24, null);
    }

    @JvmOverloads
    public DeviceIdStore(@NotNull Context context, @NotNull File file, @NotNull Function0<UUID> function0, @NotNull File file2, @NotNull SharedPrefMigrator sharedPrefMigrator, @NotNull Logger logger) {
        this(context, file, function0, file2, null, sharedPrefMigrator, logger, 16, null);
    }

    @JvmOverloads
    public DeviceIdStore(@NotNull Context context, @NotNull File file, @NotNull Function0<UUID> function0, @NotNull File file2, @NotNull Function0<UUID> function02, @NotNull SharedPrefMigrator sharedPrefMigrator, @NotNull Logger logger) {
        context.getClass();
        file.getClass();
        function0.getClass();
        file2.getClass();
        function02.getClass();
        sharedPrefMigrator.getClass();
        logger.getClass();
        this.sharedPrefMigrator = sharedPrefMigrator;
        this.persistence = new DeviceIdFilePersistence(file, function0, logger);
        this.internalPersistence = new DeviceIdFilePersistence(file2, function02, logger);
    }

    @JvmOverloads
    public DeviceIdStore(@NotNull Context context, @NotNull SharedPrefMigrator sharedPrefMigrator, @NotNull Logger logger) {
        this(context, null, null, null, null, sharedPrefMigrator, logger, 30, null);
    }
}
