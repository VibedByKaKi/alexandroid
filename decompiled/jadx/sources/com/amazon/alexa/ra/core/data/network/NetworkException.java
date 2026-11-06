package com.amazon.alexa.ra.core.data.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/NetworkException;", "", "statusCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getStatusCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "UnreachableHost", "Timeout", "SslFailure", "ConnectionFailure", "Unknown", "Companion", "Lcom/amazon/alexa/ra/core/data/network/NetworkException$ConnectionFailure;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException$SslFailure;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException$Timeout;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException$Unknown;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException$UnreachableHost;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class NetworkException {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String errorMessage;
    private final int statusCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/NetworkException$ConnectionFailure;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConnectionFailure extends NetworkException {
        public static final int $stable = 0;

        @NotNull
        public static final ConnectionFailure INSTANCE = new ConnectionFailure();

        private ConnectionFailure() {
            super(503, "Failed to connect to server", null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/NetworkException$SslFailure;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SslFailure extends NetworkException {
        public static final int $stable = 0;

        @NotNull
        public static final SslFailure INSTANCE = new SslFailure();

        private SslFailure() {
            super(525, "SSL/TLS handshake failed", null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/NetworkException$Timeout;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Timeout extends NetworkException {
        public static final int $stable = 0;

        @NotNull
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
            super(504, "Request timed out", null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/NetworkException$Unknown;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends NetworkException {
        public static final int $stable = 0;

        @Nullable
        private final String message;

        public Unknown(@Nullable String str) {
            super(502, a$$ExternalSyntheticOutline0.m("Network error: ", str), null);
            this.message = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            return unknown.copy(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Unknown copy(@Nullable String message) {
            return new Unknown(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && Intrinsics.areEqual(this.message, ((Unknown) other).message);
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Unknown(message=", this.message, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/NetworkException$UnreachableHost;", "Lcom/amazon/alexa/ra/core/data/network/NetworkException;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnreachableHost extends NetworkException {
        public static final int $stable = 0;

        @NotNull
        public static final UnreachableHost INSTANCE = new UnreachableHost();

        private UnreachableHost() {
            super(503, "Unable to resolve host", null);
        }
    }

    private NetworkException(int i, String str) {
        this.statusCode = i;
        this.errorMessage = str;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/NetworkException$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/ra/core/data/network/NetworkException;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkException from(@NotNull Exception exception) {
            exception.getClass();
            return exception instanceof UnknownHostException ? UnreachableHost.INSTANCE : exception instanceof SocketTimeoutException ? Timeout.INSTANCE : exception instanceof SSLException ? SslFailure.INSTANCE : exception instanceof ConnectException ? ConnectionFailure.INSTANCE : new Unknown(exception.getMessage());
        }

        private Companion() {
        }
    }

    public /* synthetic */ NetworkException(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }
}
