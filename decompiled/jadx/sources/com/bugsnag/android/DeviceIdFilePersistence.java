package com.bugsnag.android;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bugsnag/android/DeviceIdFilePersistence;", "Lcom/bugsnag/android/DeviceIdPersistence;", "file", "Ljava/io/File;", "deviceIdGenerator", "Lkotlin/Function0;", "Ljava/util/UUID;", "logger", "Lcom/bugsnag/android/Logger;", "(Ljava/io/File;Lkotlin/jvm/functions/Function0;Lcom/bugsnag/android/Logger;)V", "synchronizedStreamableStore", "Lcom/bugsnag/android/SynchronizedStreamableStore;", "Lcom/bugsnag/android/DeviceId;", "loadDeviceId", "", "requestCreateIfDoesNotExist", "", "loadDeviceIdInternal", "persistNewDeviceIdWithLock", "channel", "Ljava/nio/channels/FileChannel;", "uuid", "persistNewDeviceUuid", "waitForFileLock", "Ljava/nio/channels/FileLock;", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DeviceIdFilePersistence implements DeviceIdPersistence {
    private static final long FILE_LOCK_WAIT_MS = 25;
    private static final int MAX_FILE_LOCK_ATTEMPTS = 20;
    private final Function0<UUID> deviceIdGenerator;
    private final File file;
    private final Logger logger;
    private final SynchronizedStreamableStore<DeviceId> synchronizedStreamableStore;

    public DeviceIdFilePersistence(@NotNull File file, @NotNull Function0<UUID> function0, @NotNull Logger logger) {
        file.getClass();
        function0.getClass();
        logger.getClass();
        this.file = file;
        this.deviceIdGenerator = function0;
        this.logger = logger;
        try {
            file.createNewFile();
        } catch (Throwable th) {
            this.logger.w("Failed to created device ID file", th);
        }
        this.synchronizedStreamableStore = new SynchronizedStreamableStore<>(this.file);
    }

    private final DeviceId loadDeviceIdInternal() {
        if (this.file.length() <= 0) {
            return null;
        }
        try {
            return this.synchronizedStreamableStore.load(new DeviceIdFilePersistence$loadDeviceIdInternal$1(DeviceId.INSTANCE));
        } catch (Throwable th) {
            this.logger.w("Failed to load device ID", th);
            return null;
        }
    }

    private final String persistNewDeviceIdWithLock(FileChannel channel, UUID uuid) {
        String id;
        FileLock waitForFileLock = waitForFileLock(channel);
        if (waitForFileLock == null) {
            return null;
        }
        try {
            DeviceId loadDeviceIdInternal = loadDeviceIdInternal();
            if ((loadDeviceIdInternal != null ? loadDeviceIdInternal.getId() : null) != null) {
                id = loadDeviceIdInternal.getId();
            } else {
                DeviceId deviceId = new DeviceId(uuid.toString());
                this.synchronizedStreamableStore.persist(deviceId);
                id = deviceId.getId();
            }
            waitForFileLock.release();
            return id;
        } catch (Throwable th) {
            waitForFileLock.release();
            throw th;
        }
    }

    private final String persistNewDeviceUuid(UUID uuid) {
        try {
            FileChannel channel = new FileOutputStream(this.file).getChannel();
            try {
                channel.getClass();
                String persistNewDeviceIdWithLock = persistNewDeviceIdWithLock(channel, uuid);
                CloseableKt.closeFinally(channel, null);
                return persistNewDeviceIdWithLock;
            } finally {
            }
        } catch (IOException e) {
            this.logger.w("Failed to persist device ID", e);
            return null;
        }
    }

    private final FileLock waitForFileLock(FileChannel channel) {
        for (int i = 0; i < 20; i++) {
            try {
                return channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                java.lang.Thread.sleep(FILE_LOCK_WAIT_MS);
            }
        }
        return null;
    }

    @Override // com.bugsnag.android.DeviceIdPersistence
    @Nullable
    public String loadDeviceId(boolean requestCreateIfDoesNotExist) {
        try {
            DeviceId loadDeviceIdInternal = loadDeviceIdInternal();
            if ((loadDeviceIdInternal != null ? loadDeviceIdInternal.getId() : null) != null) {
                return loadDeviceIdInternal.getId();
            }
            if (requestCreateIfDoesNotExist) {
                return persistNewDeviceUuid(this.deviceIdGenerator.invoke());
            }
            return null;
        } catch (Throwable th) {
            this.logger.w("Failed to load device ID", th);
            return null;
        }
    }
}
