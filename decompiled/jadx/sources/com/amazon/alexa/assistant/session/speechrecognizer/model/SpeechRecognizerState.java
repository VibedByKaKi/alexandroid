package com.amazon.alexa.assistant.session.speechrecognizer.model;

import com.amazon.alexa.assistant.foundation.model.WakeWord;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState;", "", "<init>", "()V", "Idle", "Expecting", "Recognizing", "Busy", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Busy;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Expecting;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Idle;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Recognizing;", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SpeechRecognizerState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Idle;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle extends SpeechRecognizerState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return -1333660300;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    public /* synthetic */ SpeechRecognizerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SpeechRecognizerState() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Busy;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState;", "wakeWord", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/WakeWord;)V", "getWakeWord", "()Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Busy extends SpeechRecognizerState {

        @Nullable
        private final WakeWord wakeWord;

        public /* synthetic */ Busy(WakeWord wakeWord, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : wakeWord);
        }

        public static /* synthetic */ Busy copy$default(Busy busy, WakeWord wakeWord, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWord = busy.wakeWord;
            }
            return busy.copy(wakeWord);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final WakeWord getWakeWord() {
            return this.wakeWord;
        }

        @NotNull
        public final Busy copy(@Nullable WakeWord wakeWord) {
            return new Busy(wakeWord);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Busy) && Intrinsics.areEqual(this.wakeWord, ((Busy) other).wakeWord);
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
            return "Busy(wakeWord=" + this.wakeWord + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Busy() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Busy(@Nullable WakeWord wakeWord) {
            super(null);
            this.wakeWord = wakeWord;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Expecting;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState;", "wakeWord", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/WakeWord;)V", "getWakeWord", "()Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Expecting extends SpeechRecognizerState {

        @Nullable
        private final WakeWord wakeWord;

        public /* synthetic */ Expecting(WakeWord wakeWord, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : wakeWord);
        }

        public static /* synthetic */ Expecting copy$default(Expecting expecting, WakeWord wakeWord, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWord = expecting.wakeWord;
            }
            return expecting.copy(wakeWord);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final WakeWord getWakeWord() {
            return this.wakeWord;
        }

        @NotNull
        public final Expecting copy(@Nullable WakeWord wakeWord) {
            return new Expecting(wakeWord);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Expecting) && Intrinsics.areEqual(this.wakeWord, ((Expecting) other).wakeWord);
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
            return "Expecting(wakeWord=" + this.wakeWord + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Expecting() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Expecting(@Nullable WakeWord wakeWord) {
            super(null);
            this.wakeWord = wakeWord;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState$Recognizing;", "Lcom/amazon/alexa/assistant/session/speechrecognizer/model/SpeechRecognizerState;", "wakeWord", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/WakeWord;)V", "getWakeWord", "()Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Recognizing extends SpeechRecognizerState {

        @Nullable
        private final WakeWord wakeWord;

        public /* synthetic */ Recognizing(WakeWord wakeWord, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : wakeWord);
        }

        public static /* synthetic */ Recognizing copy$default(Recognizing recognizing, WakeWord wakeWord, int i, Object obj) {
            if ((i & 1) != 0) {
                wakeWord = recognizing.wakeWord;
            }
            return recognizing.copy(wakeWord);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final WakeWord getWakeWord() {
            return this.wakeWord;
        }

        @NotNull
        public final Recognizing copy(@Nullable WakeWord wakeWord) {
            return new Recognizing(wakeWord);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Recognizing) && Intrinsics.areEqual(this.wakeWord, ((Recognizing) other).wakeWord);
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
            return "Recognizing(wakeWord=" + this.wakeWord + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Recognizing() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Recognizing(@Nullable WakeWord wakeWord) {
            super(null);
            this.wakeWord = wakeWord;
        }
    }
}
