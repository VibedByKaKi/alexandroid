package com.amazon.dee.app.dependencies;

import com.amazon.alexa.voice.app.LatencyReportingDelegate;
import com.amazon.dee.app.services.metrics.LatencyService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class VoiceModule$$ExternalSyntheticLambda11 implements LatencyReportingDelegate {
    @Override // com.amazon.alexa.voice.app.LatencyReportingDelegate
    public final void reportLaunchCompletion(String str) {
        LatencyService.complete("voice", str);
    }
}
