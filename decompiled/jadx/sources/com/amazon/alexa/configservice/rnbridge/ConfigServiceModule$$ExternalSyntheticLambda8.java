package com.amazon.alexa.configservice.rnbridge;

import com.amazon.alexa.accessory.notificationpublisher.consumption.StateManager;
import com.amazon.alexa.accessory.notificationpublisher.consumption.WorkflowConfiguration;
import com.amazon.alexa.configservice.rnbridge.ConfigServiceModule;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.JsonObject;
import java.util.function.Function;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConfigServiceModule$$ExternalSyntheticLambda8 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ConfigServiceModule$$ExternalSyntheticLambda8(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ConfigServiceModule.ConfigValidationMessage lambda$getMapConfig$2;
        WorkflowConfiguration lambda$handleNotificationEvent$0;
        ConfigServiceModule.ConfigValidationMessage lambda$getMapConfig$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$getMapConfig$2 = ((ConfigServiceModule) this.f$0).lambda$getMapConfig$2((String) this.f$1, (String) this.f$2, (ReadableMap) obj);
                return lambda$getMapConfig$2;
            case 1:
                lambda$handleNotificationEvent$0 = ((StateManager) this.f$0).lambda$handleNotificationEvent$0((String) this.f$1, (JSONObject) this.f$2, (String) obj);
                return lambda$handleNotificationEvent$0;
            default:
                lambda$getMapConfig$3 = ((ConfigServiceModule) this.f$0).lambda$getMapConfig$3((JsonObject) this.f$1, (ReadableMap) this.f$2, (JsonObject) obj);
                return lambda$getMapConfig$3;
        }
    }
}
