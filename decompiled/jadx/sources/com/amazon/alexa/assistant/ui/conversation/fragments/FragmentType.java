package com.amazon.alexa.assistant.ui.conversation.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.capability.conversation.FragmentCardType;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", "", "<init>", "()V", "Card", "Apl", "Smart", "Html", "Private", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Apl;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Card;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Html;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Private;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Smart;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FragmentType {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Apl;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Apl extends FragmentType {
        public static final int $stable = 0;

        @NotNull
        public static final Apl INSTANCE = new Apl();

        private Apl() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Card;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", Content.CARD_TYPE, "Lcom/amazon/alexa/assistant/capability/conversation/FragmentCardType;", "<init>", "(Lcom/amazon/alexa/assistant/capability/conversation/FragmentCardType;)V", "getCardType", "()Lcom/amazon/alexa/assistant/capability/conversation/FragmentCardType;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card extends FragmentType {
        public static final int $stable = 0;

        @NotNull
        private final FragmentCardType cardType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(@NotNull FragmentCardType fragmentCardType) {
            super(null);
            fragmentCardType.getClass();
            this.cardType = fragmentCardType;
        }

        public static /* synthetic */ Card copy$default(Card card, FragmentCardType fragmentCardType, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentCardType = card.cardType;
            }
            return card.copy(fragmentCardType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final FragmentCardType getCardType() {
            return this.cardType;
        }

        @NotNull
        public final Card copy(@NotNull FragmentCardType cardType) {
            cardType.getClass();
            return new Card(cardType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Card) && this.cardType == ((Card) other).cardType;
        }

        @NotNull
        public final FragmentCardType getCardType() {
            return this.cardType;
        }

        public int hashCode() {
            return this.cardType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Card(cardType=" + this.cardType + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Html;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Html extends FragmentType {
        public static final int $stable = 0;

        @NotNull
        public static final Html INSTANCE = new Html();

        private Html() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Private;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Private extends FragmentType {
        public static final int $stable = 0;

        @NotNull
        public static final Private INSTANCE = new Private();

        private Private() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType$Smart;", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentType;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Smart extends FragmentType {
        public static final int $stable = 0;

        @NotNull
        public static final Smart INSTANCE = new Smart();

        private Smart() {
            super(null);
        }
    }

    public /* synthetic */ FragmentType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FragmentType() {
    }
}
