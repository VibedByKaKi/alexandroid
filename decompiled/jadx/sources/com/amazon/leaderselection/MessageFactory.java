package com.amazon.leaderselection;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class MessageFactory {
    static final Message ERROR_MESSAGE = Message.obtain((Handler) null, MessageType.ERROR.ordinal());
    private static final String TAG = "MessageFactory";
    private final Candidate candidate;
    private final LeaderAuthority leaderAuthority;
    private final OtherCandidates otherCandidates;

    public MessageFactory(Candidate candidate, OtherCandidates otherCandidates, LeaderAuthority leaderAuthority) {
        this.candidate = candidate;
        this.otherCandidates = otherCandidates;
        this.leaderAuthority = leaderAuthority;
    }

    private Candidate getMostPreferred() {
        return this.otherCandidates.isCandidateMorePreferredThanOthers(this.candidate) ? this.candidate : this.otherCandidates.getMostPreferredOtherCandidate();
    }

    public static boolean isMessageValid(Message message) {
        if (message == null || !MessageType.isValidMessageOrdinal(message.what)) {
            return false;
        }
        if (MessageType.valueAt(message.what) == MessageType.ERROR) {
            return true;
        }
        return MessageBody.isValidMessageBodyData(MessageType.valueAt(message.what), message.getData());
    }

    public Message createMessage(MessageType messageType) {
        Message obtain = Message.obtain((Handler) null, messageType.ordinal());
        obtain.setData(new MessageBody(this.candidate, this.leaderAuthority.get(), getMostPreferred()).getMessageData());
        return obtain;
    }

    public Message createUsurpedMessage(Candidate candidate) {
        Message obtain = Message.obtain((Handler) null, MessageType.LEADERSHIP_USURPED.ordinal());
        obtain.setData(new MessageBody(this.candidate, candidate, getMostPreferred(), candidate).getMessageData());
        return obtain;
    }
}
