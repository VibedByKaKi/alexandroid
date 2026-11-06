package com.amazon.alexa.assistant.session.gateway.model;

import com.amazon.alexa.assistant.toolkit.session.model.SessionException;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState;", "", "<init>", "()V", "toString", "", "Unverified", "Verifying", "Verified", UploadWorker.FAILED_PREFIX, "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Failed;", "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Unverified;", "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Verified;", "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Verifying;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class GatewayVerificationState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Failed;", "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$GatewayVerificationCoordinatorException;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$GatewayVerificationCoordinatorException;)V", "getException", "()Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$GatewayVerificationCoordinatorException;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends GatewayVerificationState {

        @NotNull
        private final SessionException.GatewayVerificationCoordinatorException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull SessionException.GatewayVerificationCoordinatorException gatewayVerificationCoordinatorException) {
            super(null);
            gatewayVerificationCoordinatorException.getClass();
            this.exception = gatewayVerificationCoordinatorException;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, SessionException.GatewayVerificationCoordinatorException gatewayVerificationCoordinatorException, int i, Object obj) {
            if ((i & 1) != 0) {
                gatewayVerificationCoordinatorException = failed.exception;
            }
            return failed.copy(gatewayVerificationCoordinatorException);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SessionException.GatewayVerificationCoordinatorException getException() {
            return this.exception;
        }

        @NotNull
        public final Failed copy(@NotNull SessionException.GatewayVerificationCoordinatorException exception) {
            exception.getClass();
            return new Failed(exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.exception, ((Failed) other).exception);
        }

        @NotNull
        public final SessionException.GatewayVerificationCoordinatorException getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.amazon.alexa.assistant.session.gateway.model.GatewayVerificationState
        @NotNull
        public String toString() {
            return "Failed(exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Unverified;", "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unverified extends GatewayVerificationState {

        @NotNull
        public static final Unverified INSTANCE = new Unverified();

        private Unverified() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Unverified);
        }

        public int hashCode() {
            return 575389086;
        }

        @Override // com.amazon.alexa.assistant.session.gateway.model.GatewayVerificationState
        @NotNull
        public String toString() {
            return "Unverified";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Verified;", "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Verified extends GatewayVerificationState {

        @NotNull
        public static final Verified INSTANCE = new Verified();

        private Verified() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Verified);
        }

        public int hashCode() {
            return -1403354299;
        }

        @Override // com.amazon.alexa.assistant.session.gateway.model.GatewayVerificationState
        @NotNull
        public String toString() {
            return "Verified";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState$Verifying;", "Lcom/amazon/alexa/assistant/session/gateway/model/GatewayVerificationState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Verifying extends GatewayVerificationState {

        @NotNull
        public static final Verifying INSTANCE = new Verifying();

        private Verifying() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Verifying);
        }

        public int hashCode() {
            return -553829396;
        }

        @Override // com.amazon.alexa.assistant.session.gateway.model.GatewayVerificationState
        @NotNull
        public String toString() {
            return "Verifying";
        }
    }

    public /* synthetic */ GatewayVerificationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof Unverified) {
            return "Unverified";
        }
        if (this instanceof Verifying) {
            return "Verifying";
        }
        if (this instanceof Verified) {
            return "Verified";
        }
        if (this instanceof Failed) {
            return a$$ExternalSyntheticOutline0.m("Failed(", ((Failed) this).getException().getReason(), MarkdownConstants.RIGHT_PARENTHESIS);
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private GatewayVerificationState() {
    }
}
