package com.amazon.alexa.voice.tta.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.voice.tta.sdk.UiEventReporter;
import com.amazon.alexa.voice.ui.onedesign.remarkable.metrics.RemarkableAlexaSheetUiEvent;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RemarkableAlexaUiEventProcessor implements MetricEventProcessor {
    private static final Map<TtaEvent, UiEventName> EVENT_MAP;

    @NonNull
    private final UiEventReporter sdkEventReporter;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_COLLAPSED, UiEventName.RA_COLLAPSED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_EGRESS_BACK_TAPPED, UiEventName.RA_EGRESS_BACK_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_APP_UPDATE, UiEventName.RA_APP_UPDATE);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_PREVIEW_LANDING_SHOWN, UiEventName.RA_PREVIEW_LANDING_SHOWN);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_MICROPHONE_TAPPED, UiEventName.RA_MICROPHONE_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_TYPE_REQUEST_SENT, UiEventName.RA_TYPE_REQUEST_SENT);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_PILL_SHOWN, UiEventName.RA_PILL_SHOWN);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_PILL_TAPPED, UiEventName.RA_PILL_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_CARD_LINK_TAPPED, UiEventName.RA_CARD_LINK_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_MINI_CARDS_RENDER, UiEventName.RA_MINI_CARDS_RENDER);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_MINI_CARD_RECEIVED, UiEventName.RA_MINI_CARD_RECEIVED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_MINI_CARD_RENDERED, UiEventName.RA_MINI_CARD_RENDERED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_RESPONSE_MESSAGE_RENDER, UiEventName.RA_RESPONSE_MESSAGE_RENDER);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_REQUEST_LONG_PRESS, UiEventName.RA_REQUEST_LONG_PRESS);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_REQUEST_COPIED, UiEventName.RA_REQUEST_COPIED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_RESPONSE_LONG_PRESS, UiEventName.RA_RESPONSE_LONG_PRESS);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_RESPONSE_LIKED, UiEventName.RA_RESPONSE_LIKED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_RESPONSE_DISLIKED, UiEventName.RA_RESPONSE_DISLIKED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_RESPONSE_SHARED, UiEventName.RA_RESPONSE_SHARED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_RESPONSE_COPIED, UiEventName.RA_RESPONSE_COPIED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_BACKGROUND_MINI_CARD_LONG_PRESS, UiEventName.RA_BACKGROUND_MINI_CARD_LONG_PRESS);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_CAROUSEL_MINI_CARD_LONG_PRESS, UiEventName.RA_CAROUSEL_MINI_CARD_LONG_PRESS);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_DETAIL_MINI_CARD_LONG_PRESS, UiEventName.RA_DETAIL_MINI_CARD_LONG_PRESS);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_BACKGROUND_MINI_CARD_DEEP_BROWSE, UiEventName.RA_BACKGROUND_MINI_CARD_DEEP_BROWSE);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_CAROUSEL_MINI_CARD_DEEP_BROWSE, UiEventName.RA_CAROUSEL_MINI_CARD_DEEP_BROWSE);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_DETAIL_MINI_CARD_DEEP_BROWSE, UiEventName.RA_DETAIL_MINI_CARD_DEEP_BROWSE);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_SETTINGS_TAPPED, UiEventName.RA_SETTINGS_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_SETTINGS_ACTIVITY_TAPPED, UiEventName.RA_SETTINGS_ACTIVITY_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_SETTINGS_VOICE_RESPONSES_TAPPED, UiEventName.RA_SETTINGS_VOICE_RESPONSES_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_SETTINGS_ALEXA_PRIVACY_TAPPED, UiEventName.RA_SETTINGS_ALEXA_PRIVACY_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_SETTINGS_ABOUT_TAPPED, UiEventName.RA_SETTINGS_ABOUT_TAPPED);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_MICROPHONE_CHROME_LISTENING_SHOWN, UiEventName.RA_MICROPHONE_CHROME_LISTENING_SHOWN);
        hashMap.put(RemarkableAlexaSheetUiEvent.RA_WAKEWORD_CHROME_LISTENING_SHOWN, UiEventName.RA_WAKEWORD_CHROME_LISTENING_SHOWN);
        EVENT_MAP = Collections.unmodifiableMap(hashMap);
    }

    public RemarkableAlexaUiEventProcessor(@NonNull UiEventReporter uiEventReporter) {
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
