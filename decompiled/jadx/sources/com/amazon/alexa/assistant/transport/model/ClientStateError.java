package com.amazon.alexa.assistant.transport.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.coral.profiler.ProfilerCategory;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "", "<init>", "()V", "toString", "", "NoInternetConnection", "NoAuthToken", "InvalidToken", ProfilerCategory.OTHER, "Lcom/amazon/alexa/assistant/transport/model/ClientStateError$InvalidToken;", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError$NoAuthToken;", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError$NoInternetConnection;", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError$Other;", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ClientStateError {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientStateError$InvalidToken;", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InvalidToken extends ClientStateError {

        @NotNull
        public static final InvalidToken INSTANCE = new InvalidToken();

        private InvalidToken() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof InvalidToken);
        }

        public int hashCode() {
            return -1250539988;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientStateError
        @NotNull
        public String toString() {
            return "InvalidToken";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientStateError$NoAuthToken;", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoAuthToken extends ClientStateError {

        @NotNull
        public static final NoAuthToken INSTANCE = new NoAuthToken();

        private NoAuthToken() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NoAuthToken);
        }

        public int hashCode() {
            return 885014342;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientStateError
        @NotNull
        public String toString() {
            return "NoAuthToken";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientStateError$NoInternetConnection;", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoInternetConnection extends ClientStateError {

        @NotNull
        public static final NoInternetConnection INSTANCE = new NoInternetConnection();

        private NoInternetConnection() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NoInternetConnection);
        }

        public int hashCode() {
            return 1245856394;
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientStateError
        @NotNull
        public String toString() {
            return "NoInternetConnection";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/transport/model/ClientStateError$Other;", "Lcom/amazon/alexa/assistant/transport/model/ClientStateError;", "description", "", "<init>", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Other extends ClientStateError {

        @NotNull
        private final String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(@NotNull String str) {
            super(null);
            str.getClass();
            this.description = str;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.description;
            }
            return other.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final Other copy(@NotNull String description) {
            description.getClass();
            return new Other(description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Other) && Intrinsics.areEqual(this.description, ((Other) other).description);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        @Override // com.amazon.alexa.assistant.transport.model.ClientStateError
        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Other(description=", this.description, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ ClientStateError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof NoInternetConnection) {
            return "NoInternetConnection";
        }
        if (this instanceof NoAuthToken) {
            return "NoAuthToken";
        }
        if (this instanceof InvalidToken) {
            return "InvalidToken";
        }
        if (this instanceof Other) {
            return a$$ExternalSyntheticOutline0.m("Other(", ((Other) this).getDescription(), MarkdownConstants.RIGHT_PARENTHESIS);
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private ClientStateError() {
    }
}
