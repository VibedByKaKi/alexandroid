package com.amazon.alexa.api.compat.model;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.api.compat.model.AlexaMessageType;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0019*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u0018\u0019B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J#\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/api/compat/model/MessageReceiver;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/api/compat/model/AlexaMessageType;", "", "messageProcessor", "Lcom/amazon/alexa/api/compat/model/MessageProcessor;", "handlerThread", "Landroid/os/HandlerThread;", "exceptionReporter", "Lcom/amazon/alexa/api/compat/model/ExceptionReporter;", "<init>", "(Lcom/amazon/alexa/api/compat/model/MessageProcessor;Landroid/os/HandlerThread;Lcom/amazon/alexa/api/compat/model/ExceptionReporter;)V", "messenger", "Landroid/os/Messenger;", "getMessenger", "()Landroid/os/Messenger;", "getMessageProcessor", "reply", "", "replyTo", "type", "payload", "Landroid/os/Bundle;", "(Landroid/os/Messenger;Lcom/amazon/alexa/api/compat/model/AlexaMessageType;Landroid/os/Bundle;)V", "MessageHandler", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MessageReceiver<T extends AlexaMessageType> {

    @NotNull
    private static final String TAG = "MessageReceiver";

    @Nullable
    private final ExceptionReporter exceptionReporter;

    @NotNull
    private final HandlerThread handlerThread;

    @NotNull
    private final MessageProcessor<T> messageProcessor;

    @NotNull
    private final Messenger messenger;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/api/compat/model/MessageReceiver$MessageHandler;", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "exceptionReporter", "Lcom/amazon/alexa/api/compat/model/ExceptionReporter;", "<init>", "(Lcom/amazon/alexa/api/compat/model/MessageReceiver;Landroid/os/HandlerThread;Lcom/amazon/alexa/api/compat/model/ExceptionReporter;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "sendMessageAtTime", "", "uptimeMillis", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SuppressLint({"HandlerLeak"})
    public final class MessageHandler extends Handler {

        @Nullable
        private final ExceptionReporter exceptionReporter;

        @NotNull
        private final HandlerThread handlerThread;
        final /* synthetic */ MessageReceiver<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageHandler(@NotNull MessageReceiver messageReceiver, @Nullable HandlerThread handlerThread, ExceptionReporter exceptionReporter) {
            super(handlerThread.getLooper());
            handlerThread.getClass();
            this.this$0 = messageReceiver;
            this.handlerThread = handlerThread;
            this.exceptionReporter = exceptionReporter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            msg.getClass();
            AlexaMessageType messageType = ((MessageReceiver) this.this$0).messageProcessor.getMessageType(msg);
            Objects.toString(Thread.currentThread());
            Objects.toString(messageType);
            try {
                ((MessageReceiver) this.this$0).messageProcessor.processMessage(messageType, Messages.getPayload(msg), Messages.getReplyHandlingMessenger(msg));
            } catch (Throwable th) {
                Log.e(MessageReceiver.TAG, "Unable to handle message: " + messageType, th);
                ExceptionReporter exceptionReporter = this.exceptionReporter;
                if (exceptionReporter != null) {
                    exceptionReporter.onError(th);
                }
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(@NotNull Message msg, long uptimeMillis) {
            msg.getClass();
            AlexaMessageType messageType = ((MessageReceiver) this.this$0).messageProcessor.getMessageType(msg);
            if (this.handlerThread.isAlive()) {
                Looper looper = getLooper();
                Objects.toString(messageType);
                Objects.toString(looper);
                return super.sendMessageAtTime(msg, uptimeMillis);
            }
            Log.w(MessageReceiver.TAG, "HandlerThread " + this.handlerThread.getThreadId() + " is no longer alive. Dropping message: " + messageType);
            return false;
        }
    }

    public MessageReceiver(@NotNull MessageProcessor<T> messageProcessor, @NotNull HandlerThread handlerThread, @Nullable ExceptionReporter exceptionReporter) {
        messageProcessor.getClass();
        handlerThread.getClass();
        this.messageProcessor = messageProcessor;
        this.handlerThread = handlerThread;
        this.exceptionReporter = exceptionReporter;
        this.messenger = new Messenger(new MessageHandler(this, handlerThread, exceptionReporter));
    }

    @NotNull
    public final MessageProcessor<T> getMessageProcessor() {
        return this.messageProcessor;
    }

    @NotNull
    public final Messenger getMessenger() {
        return this.messenger;
    }

    public final void reply(@NotNull Messenger replyTo, @NotNull T type, @NotNull Bundle payload) throws RemoteException {
        replyTo.getClass();
        type.getClass();
        payload.getClass();
        Log.i(TAG, "sending a reply for " + type);
        Messages.sendMessage(replyTo, Messages.createMessage$default(type, payload, null, 4, null));
    }

    public /* synthetic */ MessageReceiver(MessageProcessor messageProcessor, HandlerThread handlerThread, ExceptionReporter exceptionReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageProcessor, handlerThread, (i & 4) != 0 ? null : exceptionReporter);
    }
}
