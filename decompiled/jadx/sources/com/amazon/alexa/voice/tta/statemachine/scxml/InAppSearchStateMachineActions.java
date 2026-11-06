package com.amazon.alexa.voice.tta.statemachine.scxml;

import com.amazon.alexa.api.TextResponse;
import com.amazon.alexa.simba.api.data.SearchResult;
import com.amazon.alexa.voice.ui.tta.TtaResponseCard;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J \u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/scxml/InAppSearchStateMachineActions;", "", "showExistingAvsTextResponse", "", "textResponse", "Lcom/amazon/alexa/api/TextResponse;", "renderCardData", "card", "Lcom/amazon/alexa/voice/ui/tta/TtaResponseCard;", "callSIMBA", "callContext", "Lcom/amazon/alexa/voice/tta/statemachine/scxml/SIMBACallContext;", "notifySIMBACallCancelled", "showSIMBAResults", "results", "", "Lcom/amazon/alexa/simba/api/data/SearchResult;", "showUserUtterance", "text", "", "notifyNoSimbaResults", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface InAppSearchStateMachineActions {
    void callSIMBA(@NotNull SIMBACallContext callContext);

    void notifyNoSimbaResults();

    void notifySIMBACallCancelled(@Nullable SIMBACallContext callContext);

    void renderCardData(@NotNull TtaResponseCard card);

    void showExistingAvsTextResponse(@NotNull TextResponse textResponse);

    void showSIMBAResults(@NotNull List<SearchResult> results, @Nullable SIMBACallContext callContext);

    void showUserUtterance(@NotNull String text);
}
