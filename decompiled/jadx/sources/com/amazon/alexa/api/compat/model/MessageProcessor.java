package com.amazon.alexa.api.compat.model;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.api.compat.model.AlexaMessageType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0004¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/api/compat/model/MessageProcessor;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/api/compat/model/AlexaMessageType;", "", "<init>", "()V", "getMessageType", "message", "Landroid/os/Message;", "(Landroid/os/Message;)Lcom/amazon/alexa/api/compat/model/AlexaMessageType;", "processMessage", "", "messageType", "payload", "Landroid/os/Bundle;", "replyTo", "Landroid/os/Messenger;", "(Lcom/amazon/alexa/api/compat/model/AlexaMessageType;Landroid/os/Bundle;Landroid/os/Messenger;)V", "reply", "type", "(Landroid/os/Messenger;Lcom/amazon/alexa/api/compat/model/AlexaMessageType;Landroid/os/Bundle;)V", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class MessageProcessor<T extends AlexaMessageType> {
    public static final int $stable = 0;

    @NotNull
    private static final String TAG = "MessageProcessor";

    @NotNull
    public abstract T getMessageType(@NotNull Message message);

    public abstract void processMessage(@NotNull T messageType, @NotNull Bundle payload, @Nullable Messenger replyTo) throws RemoteException;

    public final void reply(@NotNull Messenger replyTo, @NotNull T type, @NotNull Bundle payload) throws RemoteException {
        replyTo.getClass();
        type.getClass();
        payload.getClass();
        Log.i(TAG, "sending a reply for " + type);
        Messages.sendMessage(replyTo, Messages.createMessage$default(type, payload, null, 4, null));
    }
}
