package kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class EmptySimpleLock implements SimpleLock {

    @NotNull
    public static final EmptySimpleLock INSTANCE = new EmptySimpleLock();

    private EmptySimpleLock() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }
}
