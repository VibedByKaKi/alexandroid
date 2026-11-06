package amazon.speech.simclient.event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum EventResult {
    SUCCESS(false),
    ALEXA_DISCONNECTED(true),
    INTERNAL_ERROR(true),
    TIMEOUT(true),
    INVALID_EVENT(false),
    UNKNOWN_ERROR(true);

    private final boolean mIsRetryable;

    EventResult(boolean z) {
        this.mIsRetryable = z;
    }

    public boolean isRetryable() {
        return this.mIsRetryable;
    }
}
