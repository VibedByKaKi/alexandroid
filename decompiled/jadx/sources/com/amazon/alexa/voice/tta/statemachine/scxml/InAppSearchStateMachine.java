package com.amazon.alexa.voice.tta.statemachine.scxml;

import com.amazon.alexa.api.TextResponse;
import com.amazon.alexa.simba.api.data.SearchResult;
import com.amazon.alexa.voice.ui.tta.TtaResponseCard;
import com.amazon.scxml.SCXMLStateMachine;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/scxml/InAppSearchStateMachine;", "", "start", "", "getProcessor", "Lcom/amazon/scxml/SCXMLStateMachine;", "handleGotAvsTextResponse", "textResponse", "Lcom/amazon/alexa/api/TextResponse;", "handleWillSendText", "text", "", "handleGotSIMBAResults", "simbaResults", "", "Lcom/amazon/alexa/simba/api/data/SearchResult;", "callContext", "Lcom/amazon/alexa/voice/tta/statemachine/scxml/SIMBACallContext;", "handleGotExpectTextDirective", "handleSIMBAError", "handleSIMBATimeout", "handleGotRenderCardDirective", "card", "Lcom/amazon/alexa/voice/ui/tta/TtaResponseCard;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface InAppSearchStateMachine {
    @NotNull
    SCXMLStateMachine getProcessor();

    void handleGotAvsTextResponse(@NotNull TextResponse textResponse);

    void handleGotExpectTextDirective();

    void handleGotRenderCardDirective(@Nullable TtaResponseCard card);

    void handleGotSIMBAResults(@NotNull List<SearchResult> simbaResults, @Nullable SIMBACallContext callContext);

    void handleSIMBAError(@Nullable SIMBACallContext callContext);

    void handleSIMBATimeout(@Nullable SIMBACallContext callContext);

    void handleWillSendText(@NotNull String text);

    void start();
}
