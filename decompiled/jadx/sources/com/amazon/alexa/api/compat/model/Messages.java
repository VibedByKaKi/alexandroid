package com.amazon.alexa.api.compat.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/api/compat/model/Messages;", "", "<init>", "()V", "createMessage", "Landroid/os/Message;", "type", "Lcom/amazon/alexa/api/compat/model/AlexaMessageType;", "payload", "Landroid/os/Bundle;", "replyTo", "Landroid/os/Messenger;", "getPayload", "message", "getReplyHandlingMessenger", "sendMessage", "", "messenger", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Messages {
    public static final int $stable = 0;

    @NotNull
    public static final Messages INSTANCE = new Messages();

    private Messages() {
    }

    @JvmStatic
    @NotNull
    public static final Message createMessage(@NotNull AlexaMessageType type, @NotNull Bundle payload, @Nullable Messenger replyTo) {
        type.getClass();
        payload.getClass();
        Message obtain = Message.obtain((Handler) null, type.toOrdinal());
        obtain.setData(payload);
        if (replyTo != null) {
            obtain.replyTo = replyTo;
        }
        return obtain;
    }

    public static /* synthetic */ Message createMessage$default(AlexaMessageType alexaMessageType, Bundle bundle, Messenger messenger, int i, Object obj) {
        if ((i & 4) != 0) {
            messenger = null;
        }
        return createMessage(alexaMessageType, bundle, messenger);
    }

    @JvmStatic
    @NotNull
    public static final Bundle getPayload(@NotNull Message message) {
        message.getClass();
        Bundle data = message.getData();
        if (data == null) {
            data = new Bundle();
        }
        data.setClassLoader(Messages.class.getClassLoader());
        return data;
    }

    @JvmStatic
    @Nullable
    public static final Messenger getReplyHandlingMessenger(@NotNull Message message) {
        message.getClass();
        return message.replyTo;
    }

    @JvmStatic
    public static final void sendMessage(@NotNull Messenger messenger, @NotNull Message message) throws RemoteException {
        messenger.getClass();
        message.getClass();
        messenger.send(message);
    }
}
