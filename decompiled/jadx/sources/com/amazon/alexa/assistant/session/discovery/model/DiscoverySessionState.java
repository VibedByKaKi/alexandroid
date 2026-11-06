package com.amazon.alexa.assistant.session.discovery.model;

import com.amazon.alexa.assistant.toolkit.session.model.AuthorizationSessionUser;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState;", "", "<init>", "()V", "toString", "", "Undiscovered", "Discovering", "Discovered", UploadWorker.FAILED_PREFIX, "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Discovered;", "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Discovering;", "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Failed;", "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Undiscovered;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class DiscoverySessionState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Discovered;", "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState;", "user", "Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionUser;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionUser;)V", "getUser", "()Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionUser;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Discovered extends DiscoverySessionState {

        @NotNull
        private final AuthorizationSessionUser user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Discovered(@NotNull AuthorizationSessionUser authorizationSessionUser) {
            super(null);
            authorizationSessionUser.getClass();
            this.user = authorizationSessionUser;
        }

        public static /* synthetic */ Discovered copy$default(Discovered discovered, AuthorizationSessionUser authorizationSessionUser, int i, Object obj) {
            if ((i & 1) != 0) {
                authorizationSessionUser = discovered.user;
            }
            return discovered.copy(authorizationSessionUser);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AuthorizationSessionUser getUser() {
            return this.user;
        }

        @NotNull
        public final Discovered copy(@NotNull AuthorizationSessionUser user) {
            user.getClass();
            return new Discovered(user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Discovered) && Intrinsics.areEqual(this.user, ((Discovered) other).user);
        }

        @NotNull
        public final AuthorizationSessionUser getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        @Override // com.amazon.alexa.assistant.session.discovery.model.DiscoverySessionState
        @NotNull
        public String toString() {
            return "Discovered(user=" + this.user + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Discovering;", "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState;", "user", "Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionUser;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionUser;)V", "getUser", "()Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionUser;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Discovering extends DiscoverySessionState {

        @NotNull
        private final AuthorizationSessionUser user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Discovering(@NotNull AuthorizationSessionUser authorizationSessionUser) {
            super(null);
            authorizationSessionUser.getClass();
            this.user = authorizationSessionUser;
        }

        public static /* synthetic */ Discovering copy$default(Discovering discovering, AuthorizationSessionUser authorizationSessionUser, int i, Object obj) {
            if ((i & 1) != 0) {
                authorizationSessionUser = discovering.user;
            }
            return discovering.copy(authorizationSessionUser);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AuthorizationSessionUser getUser() {
            return this.user;
        }

        @NotNull
        public final Discovering copy(@NotNull AuthorizationSessionUser user) {
            user.getClass();
            return new Discovering(user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Discovering) && Intrinsics.areEqual(this.user, ((Discovering) other).user);
        }

        @NotNull
        public final AuthorizationSessionUser getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        @Override // com.amazon.alexa.assistant.session.discovery.model.DiscoverySessionState
        @NotNull
        public String toString() {
            return "Discovering(user=" + this.user + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Failed;", "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$DiscoveryCoordinatorException;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$DiscoveryCoordinatorException;)V", "getException", "()Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$DiscoveryCoordinatorException;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends DiscoverySessionState {

        @NotNull
        private final SessionException.DiscoveryCoordinatorException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull SessionException.DiscoveryCoordinatorException discoveryCoordinatorException) {
            super(null);
            discoveryCoordinatorException.getClass();
            this.exception = discoveryCoordinatorException;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, SessionException.DiscoveryCoordinatorException discoveryCoordinatorException, int i, Object obj) {
            if ((i & 1) != 0) {
                discoveryCoordinatorException = failed.exception;
            }
            return failed.copy(discoveryCoordinatorException);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SessionException.DiscoveryCoordinatorException getException() {
            return this.exception;
        }

        @NotNull
        public final Failed copy(@NotNull SessionException.DiscoveryCoordinatorException exception) {
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
        public final SessionException.DiscoveryCoordinatorException getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.amazon.alexa.assistant.session.discovery.model.DiscoverySessionState
        @NotNull
        public String toString() {
            return "Failed(exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState$Undiscovered;", "Lcom/amazon/alexa/assistant/session/discovery/model/DiscoverySessionState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Undiscovered extends DiscoverySessionState {

        @NotNull
        public static final Undiscovered INSTANCE = new Undiscovered();

        private Undiscovered() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Undiscovered);
        }

        public int hashCode() {
            return 1615063127;
        }

        @Override // com.amazon.alexa.assistant.session.discovery.model.DiscoverySessionState
        @NotNull
        public String toString() {
            return "Undiscovered";
        }
    }

    public /* synthetic */ DiscoverySessionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof Undiscovered) {
            return "Undiscovered";
        }
        if (this instanceof Discovering) {
            return a$$ExternalSyntheticOutline0.m("Discovering(userId=", ((Discovering) this).getUser().getUserId(), MarkdownConstants.RIGHT_PARENTHESIS);
        }
        if (this instanceof Discovered) {
            return a$$ExternalSyntheticOutline0.m("Discovered(userId=", ((Discovered) this).getUser().getUserId(), MarkdownConstants.RIGHT_PARENTHESIS);
        }
        if (this instanceof Failed) {
            return a$$ExternalSyntheticOutline0.m("Failed(", ((Failed) this).getException().getReason(), MarkdownConstants.RIGHT_PARENTHESIS);
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private DiscoverySessionState() {
    }
}
