package org.jetbrains.kotlin.util;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/util/DummyLogger;", "Lorg/jetbrains/kotlin/util/Logger;", "()V", "error", "", "message", "", "fatal", "", "log", "warning", "kotlin-util-io"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class DummyLogger implements Logger {

    @NotNull
    public static final DummyLogger INSTANCE = new DummyLogger();

    private DummyLogger() {
    }

    @Override // org.jetbrains.kotlin.util.Logger
    /* renamed from: error */
    public void mo27386error(@NotNull String message) {
        System.out.println((Object) ChatData$$ExternalSyntheticOutline0.m(message, "e: ", message));
    }

    @Override // org.jetbrains.kotlin.util.Logger
    @NotNull
    public Void fatal(@NotNull String message) {
        System.out.println((Object) ChatData$$ExternalSyntheticOutline0.m(message, "e: ", message));
        System.exit(1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // org.jetbrains.kotlin.util.Logger
    public void log(@NotNull String message) {
        message.getClass();
        System.out.println((Object) message);
    }

    @Override // org.jetbrains.kotlin.util.Logger
    public void warning(@NotNull String message) {
        System.out.println((Object) ChatData$$ExternalSyntheticOutline0.m(message, "w: ", message));
    }
}
