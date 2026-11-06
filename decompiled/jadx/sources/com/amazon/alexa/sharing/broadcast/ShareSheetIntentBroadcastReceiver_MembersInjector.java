package com.amazon.alexa.sharing.broadcast;

import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class ShareSheetIntentBroadcastReceiver_MembersInjector implements MembersInjector<ShareSheetIntentBroadcastReceiver> {
    private final Provider<AlexaCommsCoreMetricsService> metricsServiceLazyProvider;

    public ShareSheetIntentBroadcastReceiver_MembersInjector(Provider<AlexaCommsCoreMetricsService> provider) {
        this.metricsServiceLazyProvider = provider;
    }

    public static MembersInjector<ShareSheetIntentBroadcastReceiver> create(Provider<AlexaCommsCoreMetricsService> provider) {
        return new ShareSheetIntentBroadcastReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.sharing.broadcast.ShareSheetIntentBroadcastReceiver.metricsServiceLazy")
    public static void injectMetricsServiceLazy(ShareSheetIntentBroadcastReceiver shareSheetIntentBroadcastReceiver, Lazy<AlexaCommsCoreMetricsService> lazy) {
        shareSheetIntentBroadcastReceiver.metricsServiceLazy = lazy;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ShareSheetIntentBroadcastReceiver shareSheetIntentBroadcastReceiver) {
        injectMetricsServiceLazy(shareSheetIntentBroadcastReceiver, DoubleCheck.lazy(this.metricsServiceLazyProvider));
    }
}
