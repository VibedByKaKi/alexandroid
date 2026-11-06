package com.amazon.alexa.assistant.toolkit.audio.device;

import com.amazon.alexa.assistant.foundation.audio.BuildType$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/audio/device/CommunicationDeviceCallbackExecutor;", "", "<init>", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor$delegate", "Lkotlin/Lazy;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommunicationDeviceCallbackExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommunicationDeviceCallbackExecutor.kt\ncom/amazon/alexa/assistant/toolkit/audio/device/CommunicationDeviceCallbackExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/* loaded from: classes17.dex */
public final class CommunicationDeviceCallbackExecutor {

    @NotNull
    public static final CommunicationDeviceCallbackExecutor INSTANCE = new CommunicationDeviceCallbackExecutor();

    /* renamed from: executor$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy executor = LazyKt.lazy(new BuildType$$ExternalSyntheticLambda0(17));

    private CommunicationDeviceCallbackExecutor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService executor_delegate$lambda$2() {
        return Executors.newSingleThreadExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executor_delegate$lambda$2$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "CommunicationDeviceCallbacks");
        thread.setDaemon(true);
        return thread;
    }

    @NotNull
    public final Executor getExecutor() {
        Object value = executor.getValue();
        value.getClass();
        return (Executor) value;
    }
}
