package com.amazon.alexa.ra.core.ui.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.CardType;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.data.fragments.ContentType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/ProviderKey;", "", "contentType", "Lcom/amazon/alexa/ra/core/data/fragments/ContentType;", Content.CARD_TYPE, "Lcom/amazon/alexa/ra/core/data/fragments/CardType;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/ContentType;Lcom/amazon/alexa/ra/core/data/fragments/CardType;)V", "getContentType", "()Lcom/amazon/alexa/ra/core/data/fragments/ContentType;", "getCardType", "()Lcom/amazon/alexa/ra/core/data/fragments/CardType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ProviderKey {
    public static final int $stable = 0;

    @Nullable
    private final CardType cardType;

    @NotNull
    private final ContentType contentType;

    public ProviderKey(@NotNull ContentType contentType, @Nullable CardType cardType) {
        contentType.getClass();
        this.contentType = contentType;
        this.cardType = cardType;
    }

    public static /* synthetic */ ProviderKey copy$default(ProviderKey providerKey, ContentType contentType, CardType cardType, int i, Object obj) {
        if ((i & 1) != 0) {
            contentType = providerKey.contentType;
        }
        if ((i & 2) != 0) {
            cardType = providerKey.cardType;
        }
        return providerKey.copy(contentType, cardType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ContentType getContentType() {
        return this.contentType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final CardType getCardType() {
        return this.cardType;
    }

    @NotNull
    public final ProviderKey copy(@NotNull ContentType contentType, @Nullable CardType cardType) {
        contentType.getClass();
        return new ProviderKey(contentType, cardType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderKey)) {
            return false;
        }
        ProviderKey providerKey = (ProviderKey) other;
        return this.contentType == providerKey.contentType && this.cardType == providerKey.cardType;
    }

    @Nullable
    public final CardType getCardType() {
        return this.cardType;
    }

    @NotNull
    public final ContentType getContentType() {
        return this.contentType;
    }

    public int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        CardType cardType = this.cardType;
        return hashCode + (cardType == null ? 0 : cardType.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProviderKey(contentType=" + this.contentType + ", cardType=" + this.cardType + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ ProviderKey(ContentType contentType, CardType cardType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentType, (i & 2) != 0 ? null : cardType);
    }
}
