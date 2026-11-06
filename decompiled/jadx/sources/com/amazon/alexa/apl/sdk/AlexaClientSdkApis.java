package com.amazon.alexa.apl.sdk;

import com.amazon.alexa.api.AlexaEvent;
import com.amazon.alexa.api.AlexaLivePreviewListener;
import com.amazon.alexa.api.AlexaMobileFrameworkApis;
import com.amazon.alexa.api.AlexaUserInterfaceOptions;
import com.amazon.alexa.api.AlexaVisualTask;
import com.amazon.alexa.api.AplState;
import com.amazon.alexa.api.LaunchType;
import com.amazon.alexa.api.TextAlexaDialogExtras;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0006J\u001e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/amazon/alexa/apl/sdk/AlexaClientSdkApis;", "", "mAlexaMobileFrameworkApis", "Lcom/amazon/alexa/api/AlexaMobileFrameworkApis;", "(Lcom/amazon/alexa/api/AlexaMobileFrameworkApis;)V", "deregisterLivePreviewListener", "", "alexaLivePreviewListener", "Lcom/amazon/alexa/api/AlexaLivePreviewListener;", "destroy", "isStarted", "", "registerLivePreviewListener", "reportAplState", "stateData", "Lcom/amazon/alexa/api/AplState;", "scheduleVisualTask", "alexaVisualTask", "Lcom/amazon/alexa/api/AlexaVisualTask;", "sendEvent", "alexaEvent", "Lcom/amazon/alexa/api/AlexaEvent;", "withContext", "sendMessage", "message", "", UserSpeechProviderBundleKeys.DIALOG_EXTRAS, "Lcom/amazon/alexa/api/TextAlexaDialogExtras;", "start", "startDialog", "invocationType", "launchType", "Lcom/amazon/alexa/api/LaunchType;", "alexaInterfaceOptions", "Lcom/amazon/alexa/api/AlexaUserInterfaceOptions;", "stop", "unscheduleVisualTask", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaClientSdkApis {
    private static final String TAG = "AlexaClientSdkApis";

    @NotNull
    private final AlexaMobileFrameworkApis mAlexaMobileFrameworkApis;

    @Inject
    public AlexaClientSdkApis(@NotNull AlexaMobileFrameworkApis alexaMobileFrameworkApis) {
        alexaMobileFrameworkApis.getClass();
        this.mAlexaMobileFrameworkApis = alexaMobileFrameworkApis;
    }

    public final void deregisterLivePreviewListener(@NotNull AlexaLivePreviewListener alexaLivePreviewListener) {
        alexaLivePreviewListener.getClass();
        this.mAlexaMobileFrameworkApis.getText().deregisterListener(alexaLivePreviewListener);
    }

    public final void destroy() {
        this.mAlexaMobileFrameworkApis.destroy();
    }

    public final boolean isStarted() {
        return this.mAlexaMobileFrameworkApis.isStarted();
    }

    public final void registerLivePreviewListener(@NotNull AlexaLivePreviewListener alexaLivePreviewListener) {
        alexaLivePreviewListener.getClass();
        this.mAlexaMobileFrameworkApis.getText().registerListener(alexaLivePreviewListener);
    }

    public final void reportAplState(@NotNull AplState stateData) {
        stateData.getClass();
        this.mAlexaMobileFrameworkApis.getCards().reportAplState(stateData);
    }

    public final void scheduleVisualTask(@NotNull AlexaVisualTask alexaVisualTask) {
        alexaVisualTask.getClass();
        this.mAlexaMobileFrameworkApis.getVisualTask().schedule(alexaVisualTask);
    }

    public final void sendEvent(@NotNull AlexaEvent alexaEvent, boolean withContext) {
        alexaEvent.getClass();
        this.mAlexaMobileFrameworkApis.getCapabilities().sendEvent(alexaEvent, withContext);
    }

    public final void sendMessage(@NotNull String message, @NotNull TextAlexaDialogExtras dialogExtras) {
        message.getClass();
        dialogExtras.getClass();
        this.mAlexaMobileFrameworkApis.getText().sendMessage(message, dialogExtras);
    }

    public final void start() {
        this.mAlexaMobileFrameworkApis.start();
    }

    public final void startDialog(@NotNull String invocationType, @NotNull LaunchType launchType, @NotNull AlexaUserInterfaceOptions alexaInterfaceOptions) {
        invocationType.getClass();
        launchType.getClass();
        alexaInterfaceOptions.getClass();
        this.mAlexaMobileFrameworkApis.getDialog().start(invocationType, launchType, alexaInterfaceOptions);
    }

    public final void stop() {
        this.mAlexaMobileFrameworkApis.stop();
    }

    public final void unscheduleVisualTask(@NotNull AlexaVisualTask alexaVisualTask) {
        alexaVisualTask.getClass();
        this.mAlexaMobileFrameworkApis.getVisualTask().unschedule(alexaVisualTask);
    }
}
