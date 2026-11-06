package androidx.webkit;

import androidx.webkit.Profile;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Profile.ExperimentalUrlPrefetch
/* loaded from: classes14.dex */
public class PrefetchNetworkException extends PrefetchException {
    public static final int NO_HTTP_RESPONSE_STATUS_CODE = 0;
    public final int httpResponseStatusCode;

    public PrefetchNetworkException(String str, int i) {
        super(str);
        this.httpResponseStatusCode = i;
    }

    public PrefetchNetworkException(String str) {
        this(str, 0);
    }

    public PrefetchNetworkException(int i) {
        this.httpResponseStatusCode = i;
    }

    public PrefetchNetworkException() {
        this(0);
    }
}
