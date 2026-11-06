package com.amazon.alexa.sharing.repo.models.acms.payload.sharing;

import com.amazon.clouddrive.extended.model.ReactionKind;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ACMSPayloadReaction {
    public static final String DEFAULT_REACTION_PAYLOAD_MESSAGE_TYPE = "reaction/default";
    public static final String SHARED_CONTENT_MESSAGE_TYPE = "message/shared-content";
    public static final String SHARED_MESSAGE_TYPE = "message/shared-message";
    public static final String SHOPPING_LIST_MESSAGE_TYPE = "alexa-shopping/shoppingList";
    public static final String SONG_MESSAGE_TYPE = "alexa-music/song";
    private final String type = "message/shared-message";
    private final String messageType = "reaction/default";
    private String text = "";
    private Action action = Action.withNoTargets();

    public static String convertTypeToUnicode(String str) {
        return str.equals(ReactionKind.LIKE) ? "❤️" : str.equals(ReactionKind.SURPRISE) ? "😮" : str.equals(ReactionKind.LAUGH) ? "😂" : "";
    }

    public Action getAction() {
        return this.action;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setText(String str) {
        this.text = str;
    }
}
