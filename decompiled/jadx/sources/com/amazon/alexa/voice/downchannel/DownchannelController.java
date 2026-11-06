package com.amazon.alexa.voice.downchannel;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class DownchannelController {
    private final Context context;
    private final AlexaMobileFrameworkApisV2 frameworkApis;

    public DownchannelController(Context context, AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2) {
        this.context = context;
        this.frameworkApis = alexaMobileFrameworkApisV2;
    }

    public void wakeUp() {
        this.frameworkApis.wakeUp(this.context);
    }
}
