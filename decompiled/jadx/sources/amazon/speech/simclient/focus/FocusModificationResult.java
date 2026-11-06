package amazon.speech.simclient.focus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum FocusModificationResult {
    SUCCESS(false),
    FAIL_NOT_ALLOWED(false),
    FAIL_INTERNAL_ERROR(true);

    private final boolean mRetryable;

    FocusModificationResult(boolean z) {
        this.mRetryable = z;
    }

    public boolean isRetryable() {
        return this.mRetryable;
    }
}
