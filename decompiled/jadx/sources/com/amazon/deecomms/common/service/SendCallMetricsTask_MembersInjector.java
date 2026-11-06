package com.amazon.deecomms.common.service;

import com.amazon.deecomms.api.CommsIdentityManager;
import com.amazon.deecomms.calling.util.CallHistoryHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class SendCallMetricsTask_MembersInjector implements MembersInjector<SendCallMetricsTask> {
    private final Provider<CallHistoryHelper> callHistoryHelperProvider;
    private final Provider<CommsIdentityManager> commsIdentityManagerProvider;

    public SendCallMetricsTask_MembersInjector(Provider<CommsIdentityManager> provider, Provider<CallHistoryHelper> provider2) {
        this.commsIdentityManagerProvider = provider;
        this.callHistoryHelperProvider = provider2;
    }

    public static MembersInjector<SendCallMetricsTask> create(Provider<CommsIdentityManager> provider, Provider<CallHistoryHelper> provider2) {
        return new SendCallMetricsTask_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.deecomms.common.service.SendCallMetricsTask.callHistoryHelper")
    public static void injectCallHistoryHelper(SendCallMetricsTask sendCallMetricsTask, CallHistoryHelper callHistoryHelper) {
        sendCallMetricsTask.callHistoryHelper = callHistoryHelper;
    }

    @InjectedFieldSignature("com.amazon.deecomms.common.service.SendCallMetricsTask.commsIdentityManager")
    public static void injectCommsIdentityManager(SendCallMetricsTask sendCallMetricsTask, CommsIdentityManager commsIdentityManager) {
        sendCallMetricsTask.commsIdentityManager = commsIdentityManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SendCallMetricsTask sendCallMetricsTask) {
        injectCommsIdentityManager(sendCallMetricsTask, this.commsIdentityManagerProvider.get());
        injectCallHistoryHelper(sendCallMetricsTask, this.callHistoryHelperProvider.get());
    }
}
