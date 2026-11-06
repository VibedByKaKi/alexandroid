package com.amazon.alexa.accessory.notificationpublisher.reply;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ReplyAction {
    private final RemoteInput remoteInput;
    private final NotificationCompat.Action replyAction;

    public ReplyAction(NotificationCompat.Action action, RemoteInput remoteInput) {
        Preconditions.notNull(action, "replyAction");
        Preconditions.notNull(remoteInput, "remoteInput");
        this.replyAction = action;
        this.remoteInput = remoteInput;
    }

    public NotificationCompat.Action getReplyAction() {
        return this.replyAction;
    }

    public RemoteInput getReplyRemoteInput() {
        return this.remoteInput;
    }

    public void send(Context context, String str) throws PendingIntent.CanceledException {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putCharSequence(this.remoteInput.getResultKey(), str);
        RemoteInput.addResultsToIntent(new RemoteInput[]{this.remoteInput}, intent, bundle);
        this.replyAction.actionIntent.send(context, 0, intent);
    }
}
