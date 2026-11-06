package com.amazon.alexa.voice.tta.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.voice.tta.sdk.UiEventReporter;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.metrics.BottomSheetUiEvent;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BottomSheetUiEventProcessor implements MetricEventProcessor {
    private static final Map<TtaEvent, UiEventName> EVENT_MAP;

    @NonNull
    private final UiEventReporter sdkEventReporter;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BottomSheetUiEvent.BS_SHOWN, UiEventName.BS_SHOWN);
        hashMap.put(BottomSheetUiEvent.BS_COLLAPSED, UiEventName.BS_COLLAPSED);
        hashMap.put(BottomSheetUiEvent.BS_TYPE_REQUEST_SENT, UiEventName.BS_TYPE_REQUEST_SENT);
        hashMap.put(BottomSheetUiEvent.BS_TYPE_IN_APP_REQUEST_SENT, UiEventName.BS_TYPE_IN_APP_REQUEST_SENT);
        hashMap.put(BottomSheetUiEvent.BS_VOICE_IN_APP_REQUEST_SENT, UiEventName.BS_VOICE_IN_APP_REQUEST_SENT);
        hashMap.put(BottomSheetUiEvent.BS_OVERFLOW_TAPPED, UiEventName.BS_OVERFLOW_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_OVERFLOW_ACTIVITY_TAPPED, UiEventName.BS_OVERFLOW_ACTIVITY_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_OVERFLOW_VOICE_RESPONSES_TAPPED, UiEventName.BS_OVERFLOW_VOICE_RESPONSES_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_OVERFLOW_ALEXA_PRIVACY_TAPPED, UiEventName.BS_OVERFLOW_ALEXA_PRIVACY_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_STATIC_PILL_TAPPED, UiEventName.BS_STATIC_PILL_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_IN_APP_SUGGESTION_TAPPED, UiEventName.BS_IN_APP_SUGGESTION_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_IN_CHAT_LINK_TAPPED, UiEventName.BS_IN_CHAT_LINK_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_MICROPHONE_TAPPED, UiEventName.BS_MICROPHONE_TAPPED);
        hashMap.put(BottomSheetUiEvent.BS_MICROPHONE_CHROME_LISTENING_SHOWN, UiEventName.BS_MICROPHONE_CHROME_LISTENING_SHOWN);
        hashMap.put(BottomSheetUiEvent.BS_WAKEWORD_CHROME_LISTENING_SHOWN, UiEventName.BS_WAKEWORD_CHROME_LISTENING_SHOWN);
        EVENT_MAP = Collections.unmodifiableMap(hashMap);
    }

    public BottomSheetUiEventProcessor(@NonNull UiEventReporter uiEventReporter) {
        this.sdkEventReporter = uiEventReporter;
    }

    @Override // com.amazon.alexa.voice.tta.metrics.MetricEventProcessor
    public boolean processEvent(@NonNull TtaEvent ttaEvent, @NonNull EventTime eventTime) {
        UiEventName uiEventName = EVENT_MAP.get(ttaEvent);
        if (uiEventName == null) {
            return false;
        }
        this.sdkEventReporter.sendEvent(uiEventName, null);
        return true;
    }
}
