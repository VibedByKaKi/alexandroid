package com.amazon.alexa.voice.ui.onedesign.tta;

import com.amazon.alexa.voice.ui.onedesign.rv.RvAdapter;
import com.amazon.alexa.voice.ui.onedesign.tta.items.AlexaResponseTtaItem;
import com.amazon.alexa.voice.ui.onedesign.tta.metrics.TtaUiEvent;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEventSender;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtaConversationAdapter extends RvAdapter {
    private static final String TAG = "TtaConversationAdapter";
    private final TtaEventSender eventSender;

    public TtaConversationAdapter(TtaEventSender ttaEventSender) {
        this.eventSender = ttaEventSender;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.rv.RvArrayAdapter
    public void add(Object obj) {
        int i;
        obj.toString();
        if (obj instanceof AlexaResponseTtaItem) {
            i = indexOf(obj);
            this.eventSender.sendEvent(TtaUiEvent.RESPONSE_MESSAGE_RENDER);
        } else {
            i = -1;
        }
        if (i != -1) {
            set(i, obj, true);
        } else {
            super.add((TtaConversationAdapter) obj, true);
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.rv.RvArrayAdapter
    public void clear() {
        super.clear(true);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.rv.RvArrayAdapter
    public void remove(Object obj) {
        obj.toString();
        super.remove((TtaConversationAdapter) obj, true);
    }
}
