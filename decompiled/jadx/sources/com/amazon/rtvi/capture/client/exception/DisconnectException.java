package com.amazon.rtvi.capture.client.exception;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class DisconnectException extends Exception {
    private static final long serialVersionUID = 1;
    private final DisconnectReason reason;

    public DisconnectException(DisconnectReason disconnectReason, String str) {
        super(str);
        this.reason = disconnectReason;
    }

    public DisconnectReason getReason() {
        return this.reason;
    }

    public DisconnectException(DisconnectReason disconnectReason, String str, Throwable th) {
        super(str, th);
        this.reason = disconnectReason;
    }
}
