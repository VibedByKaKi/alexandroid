package com.amazon.leaderselection;

import android.os.Bundle;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class MessageBody {
    static final String LEADER_KEY = "LEADER_KEY";
    static final String MOST_PREFERRED_KEY = "MOST_PREFERRED_KEY";
    static final String SENDER_KEY = "SENDER_KEY";
    static final String USURPER_KEY = "USURPER_KEY";
    private final Candidate leader;
    private final Bundle messageBodyData;
    private final Candidate mostPreferred;
    private final Candidate sender;
    private final Candidate usurper;

    public MessageBody(Bundle bundle) {
        this.messageBodyData = bundle;
        bundle.setClassLoader(MessageBody.class.getClassLoader());
        this.sender = (Candidate) bundle.getParcelable(SENDER_KEY);
        this.leader = (Candidate) bundle.getParcelable(LEADER_KEY);
        this.mostPreferred = (Candidate) bundle.getParcelable(MOST_PREFERRED_KEY);
        this.usurper = (Candidate) bundle.getParcelable(USURPER_KEY);
    }

    public static boolean isValidMessageBodyData(MessageType messageType, Bundle bundle) {
        if (messageType != null && bundle != null) {
            bundle.setClassLoader(MessageBody.class.getClassLoader());
            boolean z = (MessageType.MOST_PREFERRED_INFORMATION == messageType && bundle.containsKey(MOST_PREFERRED_KEY) && bundle.get(MOST_PREFERRED_KEY) == null) ? false : true;
            boolean z2 = (MessageType.LEADERSHIP_USURPED == messageType && bundle.containsKey(USURPER_KEY) && bundle.get(USURPER_KEY) == null) ? false : true;
            if (bundle.containsKey(SENDER_KEY) && bundle.containsKey(LEADER_KEY) && z && z2) {
                return true;
            }
        }
        return false;
    }

    public Candidate getLeader() {
        return this.leader;
    }

    public Bundle getMessageData() {
        return this.messageBodyData;
    }

    public Candidate getMostPreferred() {
        return this.mostPreferred;
    }

    public Candidate getSender() {
        return this.sender;
    }

    @Nullable
    public Candidate getUsurper() {
        return this.usurper;
    }

    public MessageBody(Candidate candidate, Candidate candidate2, Candidate candidate3) {
        this(candidate, candidate2, candidate3, null);
    }

    public MessageBody(Candidate candidate, Candidate candidate2, Candidate candidate3, @Nullable Candidate candidate4) {
        Bundle bundle = new Bundle(MessageBody.class.getClassLoader());
        this.messageBodyData = bundle;
        bundle.putParcelable(SENDER_KEY, candidate);
        bundle.putParcelable(LEADER_KEY, candidate2);
        bundle.putParcelable(MOST_PREFERRED_KEY, candidate3);
        if (candidate4 != null) {
            bundle.putParcelable(USURPER_KEY, candidate4);
        }
        this.sender = candidate;
        this.leader = candidate2;
        this.mostPreferred = candidate3;
        this.usurper = candidate4;
    }
}
