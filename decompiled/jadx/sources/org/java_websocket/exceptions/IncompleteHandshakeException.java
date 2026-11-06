package org.java_websocket.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IncompleteHandshakeException extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;
    private final int preferredSize;

    public IncompleteHandshakeException() {
        this.preferredSize = 0;
    }

    public int getPreferredSize() {
        return this.preferredSize;
    }

    public IncompleteHandshakeException(int i) {
        this.preferredSize = i;
    }
}
