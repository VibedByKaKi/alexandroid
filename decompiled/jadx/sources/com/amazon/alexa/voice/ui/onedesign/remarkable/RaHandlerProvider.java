package com.amazon.alexa.voice.ui.onedesign.remarkable;

import com.amazon.alexa.voice.ui.ra.AlexaMessageHandler;
import com.amazon.alexa.voice.ui.ra.AppUpdatePromptHandler;
import com.amazon.alexa.voice.ui.ra.RemarkableAlexaBackButtonHandler;
import com.amazon.alexa.voice.ui.ra.ResultHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RaHandlerProvider {
    private AlexaMessageHandler alexaMessageHandler;
    private AppUpdatePromptHandler appUpdatePromptHandler;
    private RemarkableAlexaBackButtonHandler remarkableAlexaBackButtonHandler;
    private ResultHandler resultHandler;

    public RaHandlerProvider(ResultHandler resultHandler, AlexaMessageHandler alexaMessageHandler, AppUpdatePromptHandler appUpdatePromptHandler, RemarkableAlexaBackButtonHandler remarkableAlexaBackButtonHandler) {
        this.resultHandler = resultHandler;
        this.alexaMessageHandler = alexaMessageHandler;
        this.appUpdatePromptHandler = appUpdatePromptHandler;
        this.remarkableAlexaBackButtonHandler = remarkableAlexaBackButtonHandler;
    }

    public AlexaMessageHandler getAlexaMessageHandler() {
        return this.alexaMessageHandler;
    }

    public AppUpdatePromptHandler getAppUpdatePromptHandler() {
        return this.appUpdatePromptHandler;
    }

    public RemarkableAlexaBackButtonHandler getRemarkableAlexaBackButtonHandler() {
        return this.remarkableAlexaBackButtonHandler;
    }

    public ResultHandler getResultHandler() {
        return this.resultHandler;
    }
}
