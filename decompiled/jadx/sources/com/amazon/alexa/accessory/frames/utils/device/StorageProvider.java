package com.amazon.alexa.accessory.frames.utils.device;

import android.os.Environment;
import android.os.StatFs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/frames/utils/device/StorageProvider;", "", "<init>", "()V", "getAvailableStorageBytes", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StorageProvider {

    @NotNull
    public static final StorageProvider INSTANCE = new StorageProvider();

    private StorageProvider() {
    }

    @JvmStatic
    public static final long getAvailableStorageBytes() {
        return new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes();
    }
}
