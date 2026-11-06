package com.amazon.alexa.mobile.assistant.client.auth;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.identity.auth.device.api.MAPActorManager;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/auth/PushOutcome;", "", "Pushed", "NotPushed", "Lcom/amazon/alexa/mobile/assistant/client/auth/PushOutcome$NotPushed;", "Lcom/amazon/alexa/mobile/assistant/client/auth/PushOutcome$Pushed;", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PushOutcome {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/auth/PushOutcome$Pushed;", "Lcom/amazon/alexa/mobile/assistant/client/auth/PushOutcome;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Pushed implements PushOutcome {
        public static final int $stable = 0;

        @NotNull
        public static final Pushed INSTANCE = new Pushed();

        private Pushed() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Pushed);
        }

        public int hashCode() {
            return 1162071558;
        }

        @NotNull
        public String toString() {
            return "Pushed";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/auth/PushOutcome$NotPushed;", "Lcom/amazon/alexa/mobile/assistant/client/auth/PushOutcome;", "reason", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getException", MAPActorManager.KEY_RETRYABLE, "", "getRetryable", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotPushed implements PushOutcome {
        public static final int $stable = 0;

        @Nullable
        private final String exception;

        @NotNull
        private final String reason;

        public NotPushed(@NotNull String str, @Nullable String str2) {
            str.getClass();
            this.reason = str;
            this.exception = str2;
        }

        public static /* synthetic */ NotPushed copy$default(NotPushed notPushed, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notPushed.reason;
            }
            if ((i & 2) != 0) {
                str2 = notPushed.exception;
            }
            return notPushed.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getException() {
            return this.exception;
        }

        @NotNull
        public final NotPushed copy(@NotNull String reason, @Nullable String exception) {
            reason.getClass();
            return new NotPushed(reason, exception);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotPushed)) {
                return false;
            }
            NotPushed notPushed = (NotPushed) other;
            return Intrinsics.areEqual(this.reason, notPushed.reason) && Intrinsics.areEqual(this.exception, notPushed.exception);
        }

        @Nullable
        public final String getException() {
            return this.exception;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public final boolean getRetryable() {
            return (Intrinsics.areEqual(this.reason, AuthorizationDelegateAdapter.FAILURE_NO_ACCOUNT) || Intrinsics.areEqual(this.reason, AuthorizationDelegateAdapter.FAILURE_ACCOUNT_CHANGED)) ? false : true;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.exception;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("NotPushed(reason=", this.reason, ", exception=", this.exception, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public /* synthetic */ NotPushed(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }
}
