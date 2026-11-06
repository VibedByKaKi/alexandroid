package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.DialogRequestDeniedReason;
import com.amazon.alexa.api.compat.Reason;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogRequestDeniedReason;", "", "reason", "Lcom/amazon/alexa/api/compat/Reason;", "message", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lcom/amazon/alexa/api/compat/Reason;Ljava/lang/String;Ljava/lang/Exception;)V", "getReason", "()Lcom/amazon/alexa/api/compat/Reason;", "getMessage", "()Ljava/lang/String;", "getException", "()Ljava/lang/Exception;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DialogRequestDeniedReason {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Exception exception;

    @Nullable
    private final String message;

    @NotNull
    private final Reason reason;

    public /* synthetic */ DialogRequestDeniedReason(Reason reason, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : exc);
    }

    public static /* synthetic */ DialogRequestDeniedReason copy$default(DialogRequestDeniedReason dialogRequestDeniedReason, Reason reason, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            reason = dialogRequestDeniedReason.reason;
        }
        if ((i & 2) != 0) {
            str = dialogRequestDeniedReason.message;
        }
        if ((i & 4) != 0) {
            exc = dialogRequestDeniedReason.exception;
        }
        return dialogRequestDeniedReason.copy(reason, str, exc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Exception getException() {
        return this.exception;
    }

    @NotNull
    public final DialogRequestDeniedReason copy(@NotNull Reason reason, @Nullable String message, @Nullable Exception exception) {
        reason.getClass();
        return new DialogRequestDeniedReason(reason, message, exception);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogRequestDeniedReason)) {
            return false;
        }
        DialogRequestDeniedReason dialogRequestDeniedReason = (DialogRequestDeniedReason) other;
        return this.reason == dialogRequestDeniedReason.reason && Intrinsics.areEqual(this.message, dialogRequestDeniedReason.message) && Intrinsics.areEqual(this.exception, dialogRequestDeniedReason.exception);
    }

    @Nullable
    public final Exception getException() {
        return this.exception;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int hashCode = this.reason.hashCode() * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Exception exc = this.exception;
        return hashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DialogRequestDeniedReason(reason=" + this.reason + ", message=" + this.message + ", exception=" + this.exception + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogRequestDeniedReason$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/DialogRequestDeniedReason;", "noncompatReason", "Lcom/amazon/alexa/api/DialogRequestDeniedReason;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DialogRequestDeniedReason convertToCompat(@NotNull com.amazon.alexa.api.DialogRequestDeniedReason noncompatReason) {
            noncompatReason.getClass();
            Reason.Companion companion = Reason.INSTANCE;
            DialogRequestDeniedReason.Reason reason = noncompatReason.getReason();
            reason.getClass();
            return new DialogRequestDeniedReason(companion.convertToCompat(reason), noncompatReason.getMessage(), noncompatReason.getException());
        }

        private Companion() {
        }
    }

    public DialogRequestDeniedReason(@NotNull Reason reason, @Nullable String str, @Nullable Exception exc) {
        reason.getClass();
        this.reason = reason;
        this.message = str;
        this.exception = exc;
    }
}
