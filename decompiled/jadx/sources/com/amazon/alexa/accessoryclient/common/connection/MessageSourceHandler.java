package com.amazon.alexa.accessoryclient.common.connection;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/connection/MessageSourceHandler;", "Landroid/os/Handler;", "Lcom/amazon/alexa/accessoryclient/common/connection/MessageSource;", "()V", "looper", "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "messageSink", "Lcom/amazon/alexa/accessoryclient/common/connection/MessageSink;", "handleMessage", "", "msg", "Landroid/os/Message;", "setMessageSink", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MessageSourceHandler extends Handler implements MessageSource {
    private MessageSink messageSink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageSourceHandler(@NotNull Looper looper) {
        super(looper);
        looper.getClass();
    }

    @Override // android.os.Handler
    public void handleMessage(@NotNull Message msg) {
        msg.getClass();
        MessageSink messageSink = this.messageSink;
        if (messageSink == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSink");
            messageSink = null;
        }
        messageSink.handleMessage(msg);
    }

    @Override // com.amazon.alexa.accessoryclient.common.connection.MessageSource
    public void setMessageSink(@NotNull MessageSink messageSink) {
        messageSink.getClass();
        this.messageSink = messageSink;
    }

    public MessageSourceHandler() {
    }
}
