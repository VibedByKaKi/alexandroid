package com.amazon.alexa.voice.ui.onedesign.tta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.voice.ui.tta.search.ItemPosition;
import com.amazon.alexa.voice.ui.tta.search.ItemRoute;
import com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtaInChatResultRenderedCard implements TtaInChatResultCard {
    private static final String EMPTY_DIALOG_REQUEST_ID = "";
    private final int cardType;
    private final String id;
    private final ItemPosition itemPosition;
    private final ItemRoute itemRoute;
    private final String message;
    private final String secondMessage;

    public TtaInChatResultRenderedCard(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable ItemRoute itemRoute, @NonNull int i, @NonNull ItemPosition itemPosition) {
        this.id = str;
        this.message = str2;
        this.secondMessage = str3;
        this.itemRoute = itemRoute;
        this.cardType = i;
        this.itemPosition = itemPosition;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage
    public String getDialogRequestId() {
        return "";
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaResponseMessage
    public String getId() {
        return this.id;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard
    public ItemPosition getItemPosition() {
        return this.itemPosition;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard
    public ItemRoute getItemRoute() {
        return this.itemRoute;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard, com.amazon.alexa.voice.ui.tta.TtaResponseMessage, com.amazon.alexa.voice.ui.tta.TtaMessage
    public String getMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard
    public String getSecondMessage() {
        return this.secondMessage;
    }

    @Override // com.amazon.alexa.voice.ui.tta.search.TtaInChatResultCard
    public int getType() {
        return this.cardType;
    }
}
