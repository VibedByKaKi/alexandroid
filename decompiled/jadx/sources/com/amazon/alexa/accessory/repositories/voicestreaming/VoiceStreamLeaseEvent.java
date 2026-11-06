package com.amazon.alexa.accessory.repositories.voicestreaming;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class VoiceStreamLeaseEvent {
    private final Kind kind;
    private final int leaseId;
    private final int winningPriority;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        GRANTED,
        PREEMPTED
    }

    private VoiceStreamLeaseEvent(Kind kind, int i, int i2) {
        this.kind = kind;
        this.leaseId = i;
        this.winningPriority = i2;
    }

    public static VoiceStreamLeaseEvent granted(int i) {
        return new VoiceStreamLeaseEvent(Kind.GRANTED, i, 0);
    }

    public static VoiceStreamLeaseEvent preempted(int i) {
        return new VoiceStreamLeaseEvent(Kind.PREEMPTED, 0, i);
    }

    public Kind getKind() {
        return this.kind;
    }

    public int getLeaseId() {
        return this.leaseId;
    }

    public int getWinningPriority() {
        return this.winningPriority;
    }
}
