package org.java_websocket.exceptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LimitExceededException extends InvalidDataException {
    private static final long serialVersionUID = 6908339749836826785L;
    private final int limit;

    public LimitExceededException(int i) {
        super(1009);
        this.limit = i;
    }

    public int getLimit() {
        return this.limit;
    }

    public LimitExceededException() {
        this(Integer.MAX_VALUE);
    }

    public LimitExceededException(String str, int i) {
        super(1009, str);
        this.limit = i;
    }

    public LimitExceededException(String str) {
        this(str, Integer.MAX_VALUE);
    }
}
