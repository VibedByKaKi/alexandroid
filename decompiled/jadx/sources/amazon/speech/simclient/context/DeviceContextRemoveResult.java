package amazon.speech.simclient.context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum DeviceContextRemoveResult {
    SUCCESS(false),
    FAIL_INTERNAL_ERROR(true);

    private final boolean mRetryable;

    DeviceContextRemoveResult(boolean z) {
        this.mRetryable = z;
    }

    public boolean isRetryable() {
        return this.mRetryable;
    }
}
