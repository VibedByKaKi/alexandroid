package com.amazon.alexa.ra.android.smartfragment.crypto;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.android.smartfragment.crypto.DigestOutcome;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestRequest;", "", "algorithm", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm;", "encoding", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding;", "<init>", "(Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm;Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding;)V", "getAlgorithm", "()Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm;", "getEncoding", "()Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class DigestRequest {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DigestAlgorithm algorithm;

    @NotNull
    private final DigestEncoding encoding;

    public DigestRequest(@NotNull DigestAlgorithm digestAlgorithm, @NotNull DigestEncoding digestEncoding) {
        digestAlgorithm.getClass();
        digestEncoding.getClass();
        this.algorithm = digestAlgorithm;
        this.encoding = digestEncoding;
    }

    public static /* synthetic */ DigestRequest copy$default(DigestRequest digestRequest, DigestAlgorithm digestAlgorithm, DigestEncoding digestEncoding, int i, Object obj) {
        if ((i & 1) != 0) {
            digestAlgorithm = digestRequest.algorithm;
        }
        if ((i & 2) != 0) {
            digestEncoding = digestRequest.encoding;
        }
        return digestRequest.copy(digestAlgorithm, digestEncoding);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DigestAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DigestEncoding getEncoding() {
        return this.encoding;
    }

    @NotNull
    public final DigestRequest copy(@NotNull DigestAlgorithm algorithm, @NotNull DigestEncoding encoding) {
        algorithm.getClass();
        encoding.getClass();
        return new DigestRequest(algorithm, encoding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigestRequest)) {
            return false;
        }
        DigestRequest digestRequest = (DigestRequest) other;
        return this.algorithm == digestRequest.algorithm && this.encoding == digestRequest.encoding;
    }

    @NotNull
    public final DigestAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    public final DigestEncoding getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return this.encoding.hashCode() + (this.algorithm.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DigestRequest(algorithm=" + this.algorithm + ", encoding=" + this.encoding + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestRequest$Companion;", "", "<init>", "()V", "parse", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestOutcome;", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestRequest;", "algorithm", "", "options", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DigestOutcome<DigestRequest> parse(@NotNull String algorithm, @Nullable Map<String, ? extends Object> options) {
            algorithm.getClass();
            DigestAlgorithm parse = DigestAlgorithm.INSTANCE.parse(algorithm);
            if (parse == null) {
                return new DigestOutcome.Failure(DigestError.UNSUPPORTED_ALGORITHM);
            }
            DigestEncoding parse2 = DigestEncoding.INSTANCE.parse(options);
            return parse2 == null ? new DigestOutcome.Failure(DigestError.UNSUPPORTED_ENCODING) : new DigestOutcome.Success(new DigestRequest(parse, parse2));
        }

        private Companion() {
        }
    }
}
