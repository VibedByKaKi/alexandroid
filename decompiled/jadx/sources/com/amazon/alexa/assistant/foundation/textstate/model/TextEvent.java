package com.amazon.alexa.assistant.foundation.textstate.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextEvent;", "", "<init>", "()V", "Error", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextEvent$Error;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class TextEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/textstate/model/TextEvent$Error;", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextEvent;", "error", "Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestError;", "dialogRequestId", "", "<init>", "(Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestError;Ljava/lang/String;)V", "getError", "()Lcom/amazon/alexa/assistant/foundation/textstate/model/TextRequestError;", "getDialogRequestId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends TextEvent {

        @NotNull
        private final String dialogRequestId;

        @NotNull
        private final TextRequestError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull TextRequestError textRequestError, @NotNull String str) {
            super(null);
            textRequestError.getClass();
            str.getClass();
            this.error = textRequestError;
            this.dialogRequestId = str;
        }

        public static /* synthetic */ Error copy$default(Error error, TextRequestError textRequestError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                textRequestError = error.error;
            }
            if ((i & 2) != 0) {
                str = error.dialogRequestId;
            }
            return error.copy(textRequestError, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextRequestError getError() {
            return this.error;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final Error copy(@NotNull TextRequestError error, @NotNull String dialogRequestId) {
            error.getClass();
            dialogRequestId.getClass();
            return new Error(error, dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.error == error.error && Intrinsics.areEqual(this.dialogRequestId, error.dialogRequestId);
        }

        @NotNull
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final TextRequestError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode() + (this.error.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + ", dialogRequestId=" + this.dialogRequestId + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ TextEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TextEvent() {
    }
}
