package com.amazon.alexa.voice.settings;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.alexa.tarazed.dmps.DMPSHandlerDefault;
import com.amazon.alexa.tarazed.routing.RouteProviderAlexaMobile;
import com.amazon.comms.calling.data.network.EventBusProviderImpl;
import com.amazon.comms.calling.data.network.SubscribeEventBusType;
import com.amazon.dee.app.services.network.reachability.DefaultReachabilityService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class VoiceSettings$$ExternalSyntheticLambda0 implements MessageFilter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ VoiceSettings$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public final boolean isMatch(Message message) {
        boolean lambda$onMainActivityStarted$0;
        boolean subscribe$lambda$0;
        boolean subscribe$lambda$1;
        boolean subscribeTo$lambda$3;
        boolean observeAuthEvent$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$onMainActivityStarted$0 = VoiceSettings.lambda$onMainActivityStarted$0((SettingsHandler) obj, message);
                return lambda$onMainActivityStarted$0;
            case 1:
                subscribe$lambda$0 = DMPSHandlerDefault.subscribe$lambda$0((DMPSHandlerDefault) obj, message);
                return subscribe$lambda$0;
            case 2:
                subscribe$lambda$1 = RouteProviderAlexaMobile.subscribe$lambda$1((RouteProviderAlexaMobile) obj, message);
                return subscribe$lambda$1;
            case 3:
                subscribeTo$lambda$3 = EventBusProviderImpl.subscribeTo$lambda$3((SubscribeEventBusType) obj, message);
                return subscribeTo$lambda$3;
            default:
                observeAuthEvent$lambda$0 = DefaultReachabilityService.observeAuthEvent$lambda$0((String) obj, message);
                return observeAuthEvent$lambda$0;
        }
    }
}
