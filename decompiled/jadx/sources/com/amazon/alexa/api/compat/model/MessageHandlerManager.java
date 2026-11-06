package com.amazon.alexa.api.compat.model;

import android.os.HandlerThread;
import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.metrics.MetricsConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\u0006J\u001a\u0010\u000b\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\u0006J\u0006\u0010\r\u001a\u00020\fR\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/MessageHandlerManager;", "", "<init>", "()V", "handlers", "", "Ljava/lang/Class;", "Landroid/os/HandlerThread;", "getHandlerThread", "messageProcessorClass", "Lcom/amazon/alexa/api/compat/model/MessageProcessor;", "releaseHandlerThread", "", MetricsConstants.Method.CACHE_CLEAR, "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageHandlerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageHandlerManager.kt\ncom/amazon/alexa/api/compat/model/MessageHandlerManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n381#2,3:48\n384#2,4:52\n1#3:51\n1863#4,2:56\n*S KotlinDebug\n*F\n+ 1 MessageHandlerManager.kt\ncom/amazon/alexa/api/compat/model/MessageHandlerManager\n*L\n21#1:48,3\n21#1:52,4\n39#1:56,2\n*E\n"})
/* loaded from: classes16.dex */
public final class MessageHandlerManager {

    @NotNull
    private static final String THREAD_NAME_SUFFIX = "-handlerThread";

    @NotNull
    private final Map<Class<?>, HandlerThread> handlers = new LinkedHashMap();
    public static final int $stable = 8;

    public final synchronized void clear() {
        try {
            Iterator<T> it2 = this.handlers.values().iterator();
            while (it2.hasNext()) {
                ((HandlerThread) it2.next()).quitSafely();
            }
            this.handlers.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final synchronized HandlerThread getHandlerThread(@NotNull Class<? extends MessageProcessor<?>> messageProcessorClass) {
        HandlerThread handlerThread;
        try {
            messageProcessorClass.getClass();
            Map<Class<?>, HandlerThread> map = this.handlers;
            handlerThread = map.get(messageProcessorClass);
            if (handlerThread == null) {
                handlerThread = new HandlerThread(messageProcessorClass.getSimpleName().concat(THREAD_NAME_SUFFIX));
                handlerThread.start();
                map.put(messageProcessorClass, handlerThread);
            }
        } catch (Throwable th) {
            throw th;
        }
        return handlerThread;
    }

    public final synchronized void releaseHandlerThread(@NotNull Class<? extends MessageProcessor<?>> messageProcessorClass) {
        messageProcessorClass.getClass();
        HandlerThread remove = this.handlers.remove(messageProcessorClass);
        if (remove != null) {
            remove.quitSafely();
        }
    }
}
