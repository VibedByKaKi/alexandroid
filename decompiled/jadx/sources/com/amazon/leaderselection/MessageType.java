package com.amazon.leaderselection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
enum MessageType {
    ERROR,
    FINISHED,
    SELECT_LEADER,
    DEFER_LEADERSHIP_DECISION,
    MAKE_SENDER_LEADER,
    MAKE_SELF_LEADER,
    USURP_LEADERSHIP,
    LEADERSHIP_USURPED,
    REQUEST_CANDIDATE_INFORMATION,
    CANDIDATE_INFORMATION,
    REQUEST_MOST_PREFERRED_INFORMATION,
    MOST_PREFERRED_INFORMATION;

    public static boolean isValidMessageOrdinal(int i) {
        return i >= 0 && i < values().length;
    }

    public static MessageType valueAt(int i) {
        if (isValidMessageOrdinal(i)) {
            return values()[i];
        }
        return null;
    }
}
