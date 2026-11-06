package com.amazon.alexa.api.compat.model;

import android.os.HandlerThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\n\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fJ\u0012\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\nJ\u0006\u0010\u0013\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/api/compat/model/MessageReceiversManager;", "", "<init>", "()V", "messageHandlerManager", "Lcom/amazon/alexa/api/compat/model/MessageHandlerManager;", "messengers", "", "Landroid/os/HandlerThread;", "", "Lcom/amazon/alexa/api/compat/model/MessageReceiver;", "createMessageReceiver", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/api/compat/model/AlexaMessageType;", "messageProcessor", "Lcom/amazon/alexa/api/compat/model/MessageProcessor;", "removeMessageReceiver", "", "messageReceiver", MetricsConstants.Method.CACHE_CLEAR, "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageReceiversManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageReceiversManager.kt\ncom/amazon/alexa/api/compat/model/MessageReceiversManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,67:1\n381#2,7:68\n*S KotlinDebug\n*F\n+ 1 MessageReceiversManager.kt\ncom/amazon/alexa/api/compat/model/MessageReceiversManager\n*L\n28#1:68,7\n*E\n"})
/* loaded from: classes16.dex */
public final class MessageReceiversManager {

    @NotNull
    private static final String TAG = "MessageReceiversManager";

    @NotNull
    private final MessageHandlerManager messageHandlerManager = new MessageHandlerManager();

    @NotNull
    private final Map<HandlerThread, Set<MessageReceiver<?>>> messengers = new LinkedHashMap();
    public static final int $stable = 8;

    public final synchronized void clear() {
        this.messengers.clear();
        this.messageHandlerManager.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final synchronized <T extends AlexaMessageType> MessageReceiver<T> createMessageReceiver(@NotNull MessageProcessor<T> messageProcessor) {
        MessageReceiver<T> messageReceiver;
        try {
            messageProcessor.getClass();
            HandlerThread handlerThread = this.messageHandlerManager.getHandlerThread(messageProcessor.getClass());
            messageReceiver = new MessageReceiver<>(messageProcessor, handlerThread, null, 4, null);
            Map<HandlerThread, Set<MessageReceiver<?>>> map = this.messengers;
            Set<MessageReceiver<?>> set = map.get(handlerThread);
            if (set == null) {
                set = new LinkedHashSet<>();
                map.put(handlerThread, set);
            }
            set.add(messageReceiver);
        } catch (Throwable th) {
            throw th;
        }
        return messageReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void removeMessageReceiver(@NotNull MessageReceiver<?> messageReceiver) {
        messageReceiver.getClass();
        Class<?> cls = messageReceiver.getMessageProcessor().getClass();
        HandlerThread handlerThread = this.messageHandlerManager.getHandlerThread(cls);
        Set<MessageReceiver<?>> set = this.messengers.get(handlerThread);
        if (set == null) {
            this.messageHandlerManager.releaseHandlerThread(cls);
            return;
        }
        set.remove(messageReceiver);
        if (set.isEmpty()) {
            this.messengers.remove(handlerThread);
            this.messageHandlerManager.releaseHandlerThread(cls);
        }
    }
}
