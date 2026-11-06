package com.amazon.alexa.assistant.session.textstate.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent;", "", "<init>", "()V", "ProcessingStarted", "ProcessingCompleted", "ProcessingCancelled", "Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent$ProcessingCancelled;", "Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent$ProcessingCompleted;", "Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent$ProcessingStarted;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TextProcessingEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent$ProcessingCancelled;", "Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent;", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProcessingCancelled extends TextProcessingEvent {

        @NotNull
        private final String dialogRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessingCancelled(@NotNull String str) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
        }

        public static /* synthetic */ ProcessingCancelled copy$default(ProcessingCancelled processingCancelled, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = processingCancelled.dialogRequestId;
            }
            return processingCancelled.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final ProcessingCancelled copy(@NotNull String dialogRequestId) {
            dialogRequestId.getClass();
            return new ProcessingCancelled(dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessingCancelled) && Intrinsics.areEqual(this.dialogRequestId, ((ProcessingCancelled) other).dialogRequestId);
        }

        @NotNull
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ProcessingCancelled(dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent$ProcessingCompleted;", "Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent;", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProcessingCompleted extends TextProcessingEvent {

        @NotNull
        private final String dialogRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessingCompleted(@NotNull String str) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
        }

        public static /* synthetic */ ProcessingCompleted copy$default(ProcessingCompleted processingCompleted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = processingCompleted.dialogRequestId;
            }
            return processingCompleted.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final ProcessingCompleted copy(@NotNull String dialogRequestId) {
            dialogRequestId.getClass();
            return new ProcessingCompleted(dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessingCompleted) && Intrinsics.areEqual(this.dialogRequestId, ((ProcessingCompleted) other).dialogRequestId);
        }

        @NotNull
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ProcessingCompleted(dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent$ProcessingStarted;", "Lcom/amazon/alexa/assistant/session/textstate/model/TextProcessingEvent;", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProcessingStarted extends TextProcessingEvent {

        @NotNull
        private final String dialogRequestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessingStarted(@NotNull String str) {
            super(null);
            str.getClass();
            this.dialogRequestId = str;
        }

        public static /* synthetic */ ProcessingStarted copy$default(ProcessingStarted processingStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = processingStarted.dialogRequestId;
            }
            return processingStarted.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        @NotNull
        public final ProcessingStarted copy(@NotNull String dialogRequestId) {
            dialogRequestId.getClass();
            return new ProcessingStarted(dialogRequestId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessingStarted) && Intrinsics.areEqual(this.dialogRequestId, ((ProcessingStarted) other).dialogRequestId);
        }

        @NotNull
        public final String getDialogRequestId() {
            return this.dialogRequestId;
        }

        public int hashCode() {
            return this.dialogRequestId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ProcessingStarted(dialogRequestId=", this.dialogRequestId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ TextProcessingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TextProcessingEvent() {
    }
}
