package com.amazon.alexa.apl.handler.event;

import com.amazon.alexa.api.AlexaEvent;
import com.amazon.alexa.api.AlexaHeader;
import com.amazon.alexa.api.AlexaPayload;
import com.amazon.alexa.apl.sdk.AlexaClientSdkApis;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/apl/handler/event/EventHandler;", "", "alexaClientSdkApis", "Lcom/amazon/alexa/apl/sdk/AlexaClientSdkApis;", "(Lcom/amazon/alexa/apl/sdk/AlexaClientSdkApis;)V", "constructAlexaEvent", "Lcom/amazon/alexa/api/AlexaEvent;", "alexaHeader", "Lcom/amazon/alexa/api/AlexaHeader;", "alexaPayload", "Lcom/amazon/alexa/api/AlexaPayload;", "constructAlexaHeader", "namespace", "", "eventName", "sendEvent", "", "alexaEvent", "withContext", "", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class EventHandler {

    @NotNull
    private final AlexaClientSdkApis alexaClientSdkApis;

    public EventHandler(@NotNull AlexaClientSdkApis alexaClientSdkApis) {
        alexaClientSdkApis.getClass();
        this.alexaClientSdkApis = alexaClientSdkApis;
    }

    @NotNull
    public final AlexaEvent constructAlexaEvent(@NotNull AlexaHeader alexaHeader, @NotNull AlexaPayload alexaPayload) {
        alexaHeader.getClass();
        alexaPayload.getClass();
        return new AlexaEvent(alexaHeader, alexaPayload);
    }

    @NotNull
    public final AlexaHeader constructAlexaHeader(@NotNull String namespace, @NotNull String eventName) {
        namespace.getClass();
        eventName.getClass();
        AlexaHeader create = AlexaHeader.create(namespace, eventName);
        create.getClass();
        return create;
    }

    public final void sendEvent(@NotNull AlexaEvent alexaEvent, boolean withContext) {
        alexaEvent.getClass();
        this.alexaClientSdkApis.sendEvent(alexaEvent, withContext);
    }
}
