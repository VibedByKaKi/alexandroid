package com.amazon.alexa.voice.tta.metrics;

import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum TtaConversationEvent implements TtaEvent {
    MESSAGE_WELCOME_SHOWN("VOX_TTA_MESSAGE_WELCOME_SHOWN"),
    MESSAGE_RETURNING_SHOWN("VOX_TTA_MESSAGE_RETURNING_SHOWN"),
    MESSAGE_HISTORY_SHOWN("VOX_TTA_MESSAGE_HISTORY_SHOWN"),
    MESSAGE_REFRESH_SHOWN("VOX_TTA_MESSAGE_REFRESH_SHOWN"),
    DIALOG_SESSION_ENDED("VOX_TTA_DIALOG_SESSION_ENDED"),
    CLEAR_SCREEN_ON_VOICE("VOX_TTA_CLEAR_SCREEN_ON_VOICE"),
    BS_WELCOME_MESSAGE_SHOWN("BS_VOX_TTA_WELCOME_MESSAGE_SHOWN");

    private final String name;

    TtaConversationEvent(String str) {
        this.name = str;
    }

    @Override // com.amazon.alexa.voice.ui.tta.metrics.TtaEvent
    public String getName() {
        return this.name;
    }
}
