package com.amazon.alexa.mobile.assistant.client;

import com.amazon.alexa.mobile.assistant.client.device.DeviceInformationProvider;
import com.amazon.alexa.mobile.assistant.client.device.DevicePersistentStorage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultAlexaAssistantClient$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAlexaAssistantClient f$0;

    public /* synthetic */ DefaultAlexaAssistantClient$$ExternalSyntheticLambda3(DefaultAlexaAssistantClient defaultAlexaAssistantClient, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAlexaAssistantClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DevicePersistentStorage deviceInformationProvider_delegate$lambda$14$lambda$11;
        boolean assistantMobilyticsMetricsConnector_delegate$lambda$16$lambda$15;
        String deviceInformationProvider_delegate$lambda$14$lambda$12;
        String deviceInformationProvider_delegate$lambda$14$lambda$13;
        Unit conversationsApiImplLazy$lambda$35$lambda$34$lambda$33;
        DeviceInformationProvider deviceInformationProvider_delegate$lambda$14;
        int i = this.$r8$classId;
        DefaultAlexaAssistantClient defaultAlexaAssistantClient = this.f$0;
        switch (i) {
            case 0:
                deviceInformationProvider_delegate$lambda$14$lambda$11 = DefaultAlexaAssistantClient.deviceInformationProvider_delegate$lambda$14$lambda$11(defaultAlexaAssistantClient);
                return deviceInformationProvider_delegate$lambda$14$lambda$11;
            case 1:
                assistantMobilyticsMetricsConnector_delegate$lambda$16$lambda$15 = DefaultAlexaAssistantClient.assistantMobilyticsMetricsConnector_delegate$lambda$16$lambda$15(defaultAlexaAssistantClient);
                return Boolean.valueOf(assistantMobilyticsMetricsConnector_delegate$lambda$16$lambda$15);
            case 2:
                deviceInformationProvider_delegate$lambda$14$lambda$12 = DefaultAlexaAssistantClient.deviceInformationProvider_delegate$lambda$14$lambda$12(defaultAlexaAssistantClient);
                return deviceInformationProvider_delegate$lambda$14$lambda$12;
            case 3:
                deviceInformationProvider_delegate$lambda$14$lambda$13 = DefaultAlexaAssistantClient.deviceInformationProvider_delegate$lambda$14$lambda$13(defaultAlexaAssistantClient);
                return deviceInformationProvider_delegate$lambda$14$lambda$13;
            case 4:
                conversationsApiImplLazy$lambda$35$lambda$34$lambda$33 = DefaultAlexaAssistantClient.conversationsApiImplLazy$lambda$35$lambda$34$lambda$33(defaultAlexaAssistantClient);
                return conversationsApiImplLazy$lambda$35$lambda$34$lambda$33;
            default:
                deviceInformationProvider_delegate$lambda$14 = DefaultAlexaAssistantClient.deviceInformationProvider_delegate$lambda$14(defaultAlexaAssistantClient);
                return deviceInformationProvider_delegate$lambda$14;
        }
    }
}
