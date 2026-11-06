package com.amazon.alexa.voice.ui;

import com.amazon.alexa.voice.metrics.MetricsBridge;
import com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CardMetricsInteractorImpl implements CardMetricsInteractor {
    public static final String EVENT_CARD_SHOWN = "Displayed.";
    public static final String EVENT_EXTERNAL_NAVIGATION = "UserNavigation.LinkOut.";
    public static final String EVENT_INTERNAL_NAVIGATION = "UserNavigation.LinkIn.";
    public static final String EVENT_USER_INTERACTION = "UserInteraction.";
    private final MetricsBridge metricsBridge;

    public CardMetricsInteractorImpl(MetricsBridge metricsBridge) {
        this.metricsBridge = metricsBridge;
    }

    @Override // com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor
    public void reportCardInteracted(String str, boolean z) {
        this.metricsBridge.reportOccurrence("vox_speech", a$$ExternalSyntheticOutline0.m("UserInteraction.", str), z, null);
    }

    @Override // com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor
    public void reportCardShown(String str) {
        this.metricsBridge.reportEvent("vox_speech", "Displayed." + str, null);
    }

    @Override // com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor
    public void reportNavigationToExternalLink(String str) {
        this.metricsBridge.reportEvent("vox_speech", EVENT_EXTERNAL_NAVIGATION + str, null);
    }

    @Override // com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor
    public void reportNavigationToInternalCard(String str) {
        this.metricsBridge.reportEvent("vox_speech", "UserNavigation.LinkIn." + str, null);
    }

    @Override // com.amazon.alexa.voice.ui.metrics.CardMetricsInteractor
    public void startTimerWhenTappingIngressButtonOnCard() {
        this.metricsBridge.startTimerWhenTappingIngressButtonOnCard();
    }
}
