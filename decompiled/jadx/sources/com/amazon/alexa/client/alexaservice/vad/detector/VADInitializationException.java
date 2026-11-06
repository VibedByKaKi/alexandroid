package com.amazon.alexa.client.alexaservice.vad.detector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VADInitializationException extends Exception {
    private final Reason reason;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Reason {
        MODEL_FILE_NOT_FOUND,
        FAILED_TO_LOAD_MODEL
    }

    public VADInitializationException(String str) {
        this(Reason.FAILED_TO_LOAD_MODEL, str);
    }

    public Reason getReason() {
        return this.reason;
    }

    public VADInitializationException(Throwable th) {
        this(Reason.FAILED_TO_LOAD_MODEL, th);
    }

    public VADInitializationException(String str, Throwable th) {
        this(Reason.FAILED_TO_LOAD_MODEL, str, th);
    }

    public VADInitializationException(Reason reason, String str) {
        super(str);
        this.reason = reason;
    }

    public VADInitializationException(Reason reason, Throwable th) {
        super(th);
        this.reason = reason;
    }

    public VADInitializationException(Reason reason, String str, Throwable th) {
        super(str, th);
        this.reason = reason;
    }
}
