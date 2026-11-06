package com.amazon.alexa.client.alexaservice.base.device;

import com.amazon.alexa.client.core.device.PersistentStorage;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/device/UserDependentStorage;", "", "persistentStorages", "", "Lcom/amazon/alexa/client/core/device/PersistentStorage;", "([Lcom/amazon/alexa/client/core/device/PersistentStorage;)V", "[Lcom/amazon/alexa/client/core/device/PersistentStorage;", "deleteAllData", "", "Companion", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserDependentStorage {

    @NotNull
    private static final String TAG = "UserDependentStorage";

    @NotNull
    private final PersistentStorage[] persistentStorages;

    public UserDependentStorage(@NotNull PersistentStorage... persistentStorageArr) {
        persistentStorageArr.getClass();
        this.persistentStorages = persistentStorageArr;
    }

    public final boolean deleteAllData() {
        PersistentStorage[] persistentStorageArr = this.persistentStorages;
        if (persistentStorageArr.length == 0) {
            return false;
        }
        boolean z = true;
        for (PersistentStorage persistentStorage : persistentStorageArr) {
            z = persistentStorage.removeAll() && z;
        }
        return z;
    }
}
