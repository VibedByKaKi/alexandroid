package com.amazon.alexa.ra.core.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange;", "", "Started", "Loaded", "CardTranscriptLoaded", "SwitchedByService", "Cleared", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$CardTranscriptLoaded;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$Cleared;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$Loaded;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$Started;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$SwitchedByService;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ConversationChange {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$CardTranscriptLoaded;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardTranscriptLoaded implements ConversationChange {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        public CardTranscriptLoaded(@NotNull String str) {
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ CardTranscriptLoaded copy$default(CardTranscriptLoaded cardTranscriptLoaded, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardTranscriptLoaded.conversationId;
            }
            return cardTranscriptLoaded.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final CardTranscriptLoaded copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new CardTranscriptLoaded(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardTranscriptLoaded) && Intrinsics.areEqual(this.conversationId, ((CardTranscriptLoaded) other).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("CardTranscriptLoaded(conversationId=", this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$Cleared;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cleared implements ConversationChange {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        public Cleared(@NotNull String str) {
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ Cleared copy$default(Cleared cleared, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cleared.conversationId;
            }
            return cleared.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Cleared copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new Cleared(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cleared) && Intrinsics.areEqual(this.conversationId, ((Cleared) other).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Cleared(conversationId=", this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$Loaded;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange;", "conversationId", "", "window", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationWindow;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/viewmodel/ConversationWindow;)V", "getConversationId", "()Ljava/lang/String;", "getWindow", "()Lcom/amazon/alexa/ra/core/viewmodel/ConversationWindow;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded implements ConversationChange {
        public static final int $stable = 0;

        @NotNull
        private final String conversationId;

        @NotNull
        private final ConversationWindow window;

        public Loaded(@NotNull String str, @NotNull ConversationWindow conversationWindow) {
            str.getClass();
            conversationWindow.getClass();
            this.conversationId = str;
            this.window = conversationWindow;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ConversationWindow conversationWindow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.conversationId;
            }
            if ((i & 2) != 0) {
                conversationWindow = loaded.window;
            }
            return loaded.copy(str, conversationWindow);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ConversationWindow getWindow() {
            return this.window;
        }

        @NotNull
        public final Loaded copy(@NotNull String conversationId, @NotNull ConversationWindow window) {
            conversationId.getClass();
            window.getClass();
            return new Loaded(conversationId, window);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.conversationId, loaded.conversationId) && this.window == loaded.window;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final ConversationWindow getWindow() {
            return this.window;
        }

        public int hashCode() {
            return this.window.hashCode() + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Loaded(conversationId=" + this.conversationId + ", window=" + this.window + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$Started;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Started implements ConversationChange {
        public static final int $stable = 0;

        @NotNull
        public static final Started INSTANCE = new Started();

        private Started() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange$SwitchedByService;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationChange;", "from", "", TypedValues.TransitionType.S_TO, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwitchedByService implements ConversationChange {
        public static final int $stable = 0;

        @NotNull
        private final String from;

        @NotNull
        private final String to;

        public SwitchedByService(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.from = str;
            this.to = str2;
        }

        public static /* synthetic */ SwitchedByService copy$default(SwitchedByService switchedByService, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = switchedByService.from;
            }
            if ((i & 2) != 0) {
                str2 = switchedByService.to;
            }
            return switchedByService.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTo() {
            return this.to;
        }

        @NotNull
        public final SwitchedByService copy(@NotNull String from, @NotNull String to) {
            from.getClass();
            to.getClass();
            return new SwitchedByService(from, to);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwitchedByService)) {
                return false;
            }
            SwitchedByService switchedByService = (SwitchedByService) other;
            return Intrinsics.areEqual(this.from, switchedByService.from) && Intrinsics.areEqual(this.to, switchedByService.to);
        }

        @NotNull
        public final String getFrom() {
            return this.from;
        }

        @NotNull
        public final String getTo() {
            return this.to;
        }

        public int hashCode() {
            return this.to.hashCode() + (this.from.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SwitchedByService(from=", this.from, ", to=", this.to, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }
}
