package com.amazon.alexa.voice.ui.onedesign.tta;

import com.amazon.alexa.voice.ui.tta.TtaResponseCard;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtaResponseRenderedCard implements TtaResponseCard {
    private static final String EMPTY_DIALOG_REQUEST_ID = "";
    private final String cardType;
    private final String description;
    private final String id;
    private final String linkUrl;
    private final String msg;

    public TtaResponseRenderedCard(String str, String str2, String str3, String str4, String str5) {
        this.description = str3;
        this.linkUrl = str4;
        this.msg = str2;
        this.cardType = str5;
        this.id = str;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseCard
    public String getCardType() {
        return this.cardType;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseCard
    public String getDescription() {
        return this.description;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage
    public String getDialogRequestId() {
        return "";
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseCard
    public String getLinkUrl() {
        return this.linkUrl;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage, com.amazon.alexa.voice.ui.tta.TtaMessage
    public String getMessage() {
        return this.msg;
    }
}
