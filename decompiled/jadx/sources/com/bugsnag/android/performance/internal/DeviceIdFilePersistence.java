package com.bugsnag.android.performance.internal;

import android.content.Context;
import androidx.annotation.RestrictTo;
import chip.platform.ConfigurationManager;
import com.bugsnag.android.performance.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/performance/internal/DeviceIdFilePersistence;", "", "file", "Ljava/io/File;", "deviceIdGenerator", "Lkotlin/Function0;", "Ljava/util/UUID;", "(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V", "loadDeviceId", "", "requestCreateIfDoesNotExist", "", "loadDeviceIdInternal", "persistDeviceIdUnderLock", "uuid", "channel", "Ljava/nio/channels/FileChannel;", "persistNewDeviceIdWithLock", "persistNewDeviceUuid", "waitForFileLock", "Ljava/nio/channels/FileLock;", "Companion", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class DeviceIdFilePersistence {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_LOCK_WAIT_MS = 25;

    @NotNull
    private static final String KEY_ID = "id";
    private static final int MAX_FILE_LOCK_ATTEMPTS = 20;

    @NotNull
    private final Function0<UUID> deviceIdGenerator;

    @NotNull
    private final File file;

    public DeviceIdFilePersistence(@NotNull File file, @NotNull Function0<UUID> function0) {
        file.getClass();
        function0.getClass();
        this.file = file;
        this.deviceIdGenerator = function0;
    }

    private final String loadDeviceIdInternal() {
        String readText$default;
        if (this.file.length() > 0) {
            try {
                readText$default = FilesKt__FileReadWriteKt.readText$default(this.file, null, 1, null);
                return new JSONObject(readText$default).getString("id");
            } catch (Throwable th) {
                Logger.INSTANCE.w("Failed to load device ID", th);
            }
        }
        return null;
    }

    private final String persistDeviceIdUnderLock(UUID uuid, FileChannel channel) {
        String uuid2 = uuid.toString();
        uuid2.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid2);
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        byte[] bytes = jSONObject2.getBytes(Charsets.UTF_8);
        bytes.getClass();
        channel.write(ByteBuffer.wrap(bytes));
        return uuid2;
    }

    private final String persistNewDeviceIdWithLock(FileChannel channel, UUID uuid) {
        FileLock waitForFileLock = waitForFileLock(channel);
        if (waitForFileLock == null) {
            return null;
        }
        try {
            String loadDeviceIdInternal = loadDeviceIdInternal();
            if (loadDeviceIdInternal == null) {
                loadDeviceIdInternal = persistDeviceIdUnderLock(uuid, channel);
            }
            return loadDeviceIdInternal;
        } finally {
            waitForFileLock.release();
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
            Logger.INSTANCE.w("Failed to persist device ID", e);
            return null;
        }
    }

    private final FileLock waitForFileLock(FileChannel channel) {
        for (int i = 0; i < 20; i++) {
            try {
                return channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                Thread.sleep(FILE_LOCK_WAIT_MS);
            }
        }
        return null;
    }

    @Nullable
    public final String loadDeviceId(boolean requestCreateIfDoesNotExist) {
        try {
            String loadDeviceIdInternal = loadDeviceIdInternal();
            if (loadDeviceIdInternal != null) {
                return loadDeviceIdInternal;
            }
            if (requestCreateIfDoesNotExist) {
                return persistNewDeviceUuid(this.deviceIdGenerator.invoke());
            }
            return null;
        } catch (Throwable th) {
            Logger.INSTANCE.w("Failed to load device ID", th);
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/performance/internal/DeviceIdFilePersistence$Companion;", "", "()V", "FILE_LOCK_WAIT_MS", "", "KEY_ID", "", "MAX_FILE_LOCK_ATTEMPTS", "", "forContext", "Lcom/bugsnag/android/performance/internal/DeviceIdFilePersistence;", "context", "Landroid/content/Context;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceIdFilePersistence forContext(@NotNull Context context) {
            context.getClass();
            return new DeviceIdFilePersistence(new File(context.getFilesDir(), ConfigurationManager.kConfigKey_MfrDeviceId), DeviceIdFilePersistence$Companion$forContext$1.INSTANCE);
        }

        private Companion() {
        }
    }
}
