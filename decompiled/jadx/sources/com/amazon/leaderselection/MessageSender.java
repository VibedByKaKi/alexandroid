package com.amazon.leaderselection;

import android.content.Context;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class MessageSender {
    private static final String TAG = "MessageSender";
    private final CandidateConnectionCache candidateConnectionCache;
    private final Context context;
    private final MessageFactory messageFactory;

    public MessageSender(Context context, CandidateConnectionCache candidateConnectionCache, MessageFactory messageFactory) {
        this.context = context;
        this.candidateConnectionCache = candidateConnectionCache;
        this.messageFactory = messageFactory;
    }

    private Message send(Message message, Candidate candidate) {
        LeaderSelectionServiceInterface leaderSelectionServiceInterface;
        CandidateConnection candidateConnection = this.candidateConnectionCache.get(this.context, candidate.getComponentName());
        if (candidateConnection != null && (leaderSelectionServiceInterface = candidateConnection.get()) != null) {
            try {
                return leaderSelectionServiceInterface.send(message);
            } catch (RemoteException unused) {
                Log.e(TAG, "Not connected to candidateService: " + candidate.getPackageName());
                this.candidateConnectionCache.remove(candidateConnection);
            }
        }
        Log.e(TAG, "Failed to send message to candidate. Message: " + MessageType.valueAt(message.what) + ", Candidate: " + candidate.getPackageName());
        return MessageFactory.ERROR_MESSAGE;
    }

    public Message sendUsurped(Candidate candidate, Candidate candidate2) {
        this.context.getPackageName();
        Objects.toString(MessageType.USURP_LEADERSHIP);
        Objects.toString(candidate2);
        return send(this.messageFactory.createUsurpedMessage(candidate), candidate2);
    }

    public Message send(MessageType messageType, Candidate candidate) {
        this.context.getPackageName();
        Objects.toString(messageType);
        Objects.toString(candidate);
        return send(this.messageFactory.createMessage(messageType), candidate);
    }
}
