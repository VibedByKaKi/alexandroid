package com.amazon.alexa.voice.settings;

import com.amazon.alexa.voice.locale.LocaleCombinationParameters;
import com.amazon.alexa.voice.locale.LocaleUpdateCallback;
import com.amazon.alexa.voice.locale.SupportedLocaleCombinationsCallback;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class LocaleCombinationSettingHandler$$ExternalSyntheticLambda0 implements LocaleUpdateCallback, SupportedLocaleCombinationsCallback {
    public final /* synthetic */ LocaleCombinationSettingHandler f$0;

    public /* synthetic */ LocaleCombinationSettingHandler$$ExternalSyntheticLambda0(LocaleCombinationSettingHandler localeCombinationSettingHandler) {
        this.f$0 = localeCombinationSettingHandler;
    }

    @Override // com.amazon.alexa.voice.locale.SupportedLocaleCombinationsCallback
    public void onLocaleCombinationParams(LocaleCombinationParameters localeCombinationParameters) {
        this.f$0.lambda$requestAllLocaleSettingsInfo$1(localeCombinationParameters);
    }

    @Override // com.amazon.alexa.voice.locale.LocaleUpdateCallback
    public void onLocaleUpdated(boolean z, List list) {
        this.f$0.lambda$handle$0(z, list);
    }
}
