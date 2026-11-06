package com.amazon.alexa.voiceui.ra;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.tta.search.TextPillResultItem;
import com.amazon.alexa.voice.ui.tta.search.ResultItem;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Hint {
    private final String actionPayload;
    private final ActionType actionType;
    private final String id = UUID.randomUUID().toString();
    private final String text;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ActionType {
        UNKNOWN("Unknown"),
        SEND_TEXT("SendText");

        private final String name;

        ActionType(String str) {
            this.name = str;
        }

        public static ActionType fromString(String str) {
            for (ActionType actionType : values()) {
                if (actionType.name.equalsIgnoreCase(str)) {
                    return actionType;
                }
            }
            return UNKNOWN;
        }
    }

    public Hint(@NonNull String str, @NonNull String str2, @NonNull ActionType actionType) {
        this.text = str;
        this.actionPayload = str2;
        this.actionType = actionType;
    }

    public ResultItem toResultItem() {
        return new TextPillResultItem(this.text, 2, this.actionPayload, this.id, Boolean.FALSE);
    }
}
