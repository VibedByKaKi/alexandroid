package com.amazon.alexa.voice.ui.cards;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface CardCreationEventListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorType {
        UNKNOWN,
        CARD_DATA_NULL,
        INVALID_JSON,
        MISSING_CARD_TYPE
    }

    void cardControllerCreationFinished(String str, boolean z);

    void cardControllerCreationStart();

    void errorCreatingCard(String str, Exception exc);

    void errorCreatingCardController(String str, Exception exc);

    void errorParsingJson(ErrorType errorType, String str);

    void foundCardFactory(String str);

    void missingCardFactory(String str);

    void parsingJsonFinished(boolean z);

    void parsingJsonStart();
}
