package com.amazon.alexa.voice.settings;

import com.amazon.alexa.voice.locale.LocaleParameters;
import com.amazon.alexa.voice.locale.LocaleUpdateCallback;
import com.amazon.alexa.voice.locale.SupportedLocalesCallback;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class LocaleSettingHandler$$ExternalSyntheticLambda0 implements LocaleUpdateCallback, SupportedLocalesCallback {
    public final /* synthetic */ LocaleSettingHandler f$0;

    public /* synthetic */ LocaleSettingHandler$$ExternalSyntheticLambda0(LocaleSettingHandler localeSettingHandler) {
        this.f$0 = localeSettingHandler;
    }

    @Override // com.amazon.alexa.voice.locale.SupportedLocalesCallback
    public void onLocaleParams(LocaleParameters localeParameters) {
        this.f$0.lambda$requestAllLocaleSettingsInfo$1(localeParameters);
    }

    @Override // com.amazon.alexa.voice.locale.LocaleUpdateCallback
    public void onLocaleUpdated(boolean z, List list) {
        this.f$0.lambda$handle$0(z, list);
    }
}
