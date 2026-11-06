package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class AssistantApiReplyHandle {
    private static final String TAG = "AssistantApiReplyHandle";
    private final AtomicBoolean replied = new AtomicBoolean(false);
    private final Messenger replyTo;
    private final String requestId;
    private final int specIndex;

    public AssistantApiReplyHandle(Messenger messenger, String str, int i) {
        this.replyTo = messenger;
        this.requestId = str;
        this.specIndex = i;
    }

    private void sendReply(boolean z, String str) {
        if (this.replyTo == null || this.requestId == null) {
            Log.w(TAG, "Cannot send reply: replyTo or requestId is null");
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = -1;
        obtain.arg1 = this.specIndex;
        Bundle bundle = new Bundle();
        bundle.putString(AssistantApiReplyKeys.REQUEST_ID, this.requestId);
        bundle.putBoolean(AssistantApiReplyKeys.SUCCESS, z);
        if (str != null) {
            bundle.putString(AssistantApiReplyKeys.FAILURE_MESSAGE, str);
        }
        obtain.setData(bundle);
        try {
            this.replyTo.send(obtain);
        } catch (RemoteException e) {
            Log.w(TAG, "Failed to send reply for requestId=" + this.requestId, e);
        }
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getSpecIndex() {
        return this.specIndex;
    }

    public void sendFailure(String str) {
        if (this.replied.compareAndSet(false, true)) {
            sendReply(false, str);
        }
    }

    public void sendSuccess() {
        if (this.replied.compareAndSet(false, true)) {
            sendReply(true, null);
        }
    }
}
