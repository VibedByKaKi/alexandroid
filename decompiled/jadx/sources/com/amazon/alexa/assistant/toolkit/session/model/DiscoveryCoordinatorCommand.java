package com.amazon.alexa.assistant.toolkit.session.model;

import com.amazon.alexa.assistant.toolkit.session.model.SessionException;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand;", "", "<init>", "()V", "DiscoverySucceeded", "Reset", "DiscoveryFailed", "Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand$DiscoveryFailed;", "Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand$DiscoverySucceeded;", "Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand$Reset;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class DiscoveryCoordinatorCommand {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand$DiscoveryFailed;", "Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand;", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$DiscoveryCoordinatorException;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$DiscoveryCoordinatorException;)V", "getException", "()Lcom/amazon/alexa/assistant/toolkit/session/model/SessionException$DiscoveryCoordinatorException;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DiscoveryFailed extends DiscoveryCoordinatorCommand {

        @NotNull
        private final SessionException.DiscoveryCoordinatorException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscoveryFailed(@NotNull SessionException.DiscoveryCoordinatorException discoveryCoordinatorException) {
            super(null);
            discoveryCoordinatorException.getClass();
            this.exception = discoveryCoordinatorException;
        }

        public static /* synthetic */ DiscoveryFailed copy$default(DiscoveryFailed discoveryFailed, SessionException.DiscoveryCoordinatorException discoveryCoordinatorException, int i, Object obj) {
            if ((i & 1) != 0) {
                discoveryCoordinatorException = discoveryFailed.exception;
            }
            return discoveryFailed.copy(discoveryCoordinatorException);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SessionException.DiscoveryCoordinatorException getException() {
            return this.exception;
        }

        @NotNull
        public final DiscoveryFailed copy(@NotNull SessionException.DiscoveryCoordinatorException exception) {
            exception.getClass();
            return new DiscoveryFailed(exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DiscoveryFailed) && Intrinsics.areEqual(this.exception, ((DiscoveryFailed) other).exception);
        }

        @NotNull
        public final SessionException.DiscoveryCoordinatorException getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "DiscoveryFailed(exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand$DiscoverySucceeded;", "Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DiscoverySucceeded extends DiscoveryCoordinatorCommand {

        @NotNull
        public static final DiscoverySucceeded INSTANCE = new DiscoverySucceeded();

        private DiscoverySucceeded() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof DiscoverySucceeded);
        }

        public int hashCode() {
            return -473728935;
        }

        @NotNull
        public String toString() {
            return "DiscoverySucceeded";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand$Reset;", "Lcom/amazon/alexa/assistant/toolkit/session/model/DiscoveryCoordinatorCommand;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Reset extends DiscoveryCoordinatorCommand {

        @NotNull
        public static final Reset INSTANCE = new Reset();

        private Reset() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Reset);
        }

        public int hashCode() {
            return -1547394425;
        }

        @NotNull
        public String toString() {
            return "Reset";
        }
    }

    public /* synthetic */ DiscoveryCoordinatorCommand(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DiscoveryCoordinatorCommand() {
    }
}
