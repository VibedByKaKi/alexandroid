package com.amazon.alexa.voice.tta.statemachine.scxml;

import com.amazon.alexa.api.TextResponse;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.simba.api.data.SearchResult;
import com.amazon.alexa.voice.ui.tta.TtaResponseCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/scxml/InAppSearchEventData;", "", "avsTextResponse", "Lcom/amazon/alexa/api/TextResponse;", "simbaResults", "", "Lcom/amazon/alexa/simba/api/data/SearchResult;", "ttaResponseCard", "Lcom/amazon/alexa/voice/ui/tta/TtaResponseCard;", "userText", "", "callContext", "Lcom/amazon/alexa/voice/tta/statemachine/scxml/SIMBACallContext;", "<init>", "(Lcom/amazon/alexa/api/TextResponse;Ljava/util/List;Lcom/amazon/alexa/voice/ui/tta/TtaResponseCard;Ljava/lang/String;Lcom/amazon/alexa/voice/tta/statemachine/scxml/SIMBACallContext;)V", "getAvsTextResponse", "()Lcom/amazon/alexa/api/TextResponse;", "getSimbaResults", "()Ljava/util/List;", "getTtaResponseCard", "()Lcom/amazon/alexa/voice/ui/tta/TtaResponseCard;", "getUserText", "()Ljava/lang/String;", "getCallContext", "()Lcom/amazon/alexa/voice/tta/statemachine/scxml/SIMBACallContext;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class InAppSearchEventData {

    @Nullable
    private final TextResponse avsTextResponse;

    @Nullable
    private final SIMBACallContext callContext;

    @Nullable
    private final List<SearchResult> simbaResults;

    @Nullable
    private final TtaResponseCard ttaResponseCard;

    @Nullable
    private final String userText;

    public /* synthetic */ InAppSearchEventData(TextResponse textResponse, List list, TtaResponseCard ttaResponseCard, String str, SIMBACallContext sIMBACallContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textResponse, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : ttaResponseCard, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : sIMBACallContext);
    }

    public static /* synthetic */ InAppSearchEventData copy$default(InAppSearchEventData inAppSearchEventData, TextResponse textResponse, List list, TtaResponseCard ttaResponseCard, String str, SIMBACallContext sIMBACallContext, int i, Object obj) {
        if ((i & 1) != 0) {
            textResponse = inAppSearchEventData.avsTextResponse;
        }
        if ((i & 2) != 0) {
            list = inAppSearchEventData.simbaResults;
        }
        if ((i & 4) != 0) {
            ttaResponseCard = inAppSearchEventData.ttaResponseCard;
        }
        if ((i & 8) != 0) {
            str = inAppSearchEventData.userText;
        }
        if ((i & 16) != 0) {
            sIMBACallContext = inAppSearchEventData.callContext;
        }
        SIMBACallContext sIMBACallContext2 = sIMBACallContext;
        TtaResponseCard ttaResponseCard2 = ttaResponseCard;
        return inAppSearchEventData.copy(textResponse, list, ttaResponseCard2, str, sIMBACallContext2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final TextResponse getAvsTextResponse() {
        return this.avsTextResponse;
    }

    @Nullable
    public final List<SearchResult> component2() {
        return this.simbaResults;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final TtaResponseCard getTtaResponseCard() {
        return this.ttaResponseCard;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getUserText() {
        return this.userText;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final SIMBACallContext getCallContext() {
        return this.callContext;
    }

    @NotNull
    public final InAppSearchEventData copy(@Nullable TextResponse avsTextResponse, @Nullable List<SearchResult> simbaResults, @Nullable TtaResponseCard ttaResponseCard, @Nullable String userText, @Nullable SIMBACallContext callContext) {
        return new InAppSearchEventData(avsTextResponse, simbaResults, ttaResponseCard, userText, callContext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppSearchEventData)) {
            return false;
        }
        InAppSearchEventData inAppSearchEventData = (InAppSearchEventData) other;
        return Intrinsics.areEqual(this.avsTextResponse, inAppSearchEventData.avsTextResponse) && Intrinsics.areEqual(this.simbaResults, inAppSearchEventData.simbaResults) && Intrinsics.areEqual(this.ttaResponseCard, inAppSearchEventData.ttaResponseCard) && Intrinsics.areEqual(this.userText, inAppSearchEventData.userText) && Intrinsics.areEqual(this.callContext, inAppSearchEventData.callContext);
    }

    @Nullable
    public final TextResponse getAvsTextResponse() {
        return this.avsTextResponse;
    }

    @Nullable
    public final SIMBACallContext getCallContext() {
        return this.callContext;
    }

    @Nullable
    public final List<SearchResult> getSimbaResults() {
        return this.simbaResults;
    }

    @Nullable
    public final TtaResponseCard getTtaResponseCard() {
        return this.ttaResponseCard;
    }

    @Nullable
    public final String getUserText() {
        return this.userText;
    }

    public int hashCode() {
        TextResponse textResponse = this.avsTextResponse;
        int hashCode = (textResponse == null ? 0 : textResponse.hashCode()) * 31;
        List<SearchResult> list = this.simbaResults;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        TtaResponseCard ttaResponseCard = this.ttaResponseCard;
        int hashCode3 = (hashCode2 + (ttaResponseCard == null ? 0 : ttaResponseCard.hashCode())) * 31;
        String str = this.userText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        SIMBACallContext sIMBACallContext = this.callContext;
        return hashCode4 + (sIMBACallContext != null ? sIMBACallContext.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InAppSearchEventData(avsTextResponse=" + this.avsTextResponse + ", simbaResults=" + this.simbaResults + ", ttaResponseCard=" + this.ttaResponseCard + ", userText=" + this.userText + ", callContext=" + this.callContext + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public InAppSearchEventData(@Nullable TextResponse textResponse, @Nullable List<SearchResult> list, @Nullable TtaResponseCard ttaResponseCard, @Nullable String str, @Nullable SIMBACallContext sIMBACallContext) {
        this.avsTextResponse = textResponse;
        this.simbaResults = list;
        this.ttaResponseCard = ttaResponseCard;
        this.userText = str;
        this.callContext = sIMBACallContext;
    }

    public InAppSearchEventData() {
        this(null, null, null, null, null, 31, null);
    }
}
