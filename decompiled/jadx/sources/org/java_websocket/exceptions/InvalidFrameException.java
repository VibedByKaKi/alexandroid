package org.java_websocket.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InvalidFrameException extends InvalidDataException {
    private static final long serialVersionUID = -9016496369828887591L;

    public InvalidFrameException() {
        super(1002);
    }

    public InvalidFrameException(String str) {
        super(1002, str);
    }

    public InvalidFrameException(Throwable th) {
        super(1002, th);
    }

    public InvalidFrameException(String str, Throwable th) {
        super(1002, str, th);
    }
}
