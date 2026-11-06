package com.amazon.alexa.assistant.foundation.attentionsystem.model;

import com.amazon.alexa.assistant.foundation.model.WakeWord;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "", "<init>", "()V", "Idle", "Listening", "Thinking", "Speaking", "Error", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Error;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Idle;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Listening;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Speaking;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Thinking;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AttentionState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Error;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends AttentionState {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 68364758;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Idle;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle extends AttentionState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return 972142150;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Listening;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "wakeWord", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/WakeWord;)V", "getWakeWord", "()Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Listening extends AttentionState {

        @Nullable
        private final WakeWord wakeWord;

        public Listening(@Nullable WakeWord wakeWord) {
            super(null);
            this.wakeWord = wakeWord;
        }

        public static /* synthetic */ Listening copy$default(Listening listening, WakeWord wakeWord, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWord = listening.wakeWord;
            }
            return listening.copy(wakeWord);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final WakeWord getWakeWord() {
            return this.wakeWord;
        }

        @NotNull
        public final Listening copy(@Nullable WakeWord wakeWord) {
            return new Listening(wakeWord);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Listening) && Intrinsics.areEqual(this.wakeWord, ((Listening) other).wakeWord);
        }

        @Nullable
        public final WakeWord getWakeWord() {
            return this.wakeWord;
        }

        public int hashCode() {
            WakeWord wakeWord = this.wakeWord;
            if (wakeWord == null) {
                return 0;
            }
            return wakeWord.hashCode();
        }

        @NotNull
        public String toString() {
            return "Listening(wakeWord=" + this.wakeWord + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Speaking;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Speaking extends AttentionState {

        @NotNull
        public static final Speaking INSTANCE = new Speaking();

        private Speaking() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Speaking);
        }

        public int hashCode() {
            return 1604295746;
        }

        @NotNull
        public String toString() {
            return "Speaking";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState$Thinking;", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Thinking extends AttentionState {

        @NotNull
        public static final Thinking INSTANCE = new Thinking();

        private Thinking() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Thinking);
        }

        public int hashCode() {
            return 668566306;
        }

        @NotNull
        public String toString() {
            return "Thinking";
        }
    }

    public /* synthetic */ AttentionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AttentionState() {
    }
}
