package com.amazon.comms.calling.data.repo;

import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.ConflatedBroadcastChannel;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TelecomRepositoryImpl$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TelecomRepositoryImpl$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ConflatedBroadcastChannel telecomEventChannel_delegate$lambda$0;
        ConflatedBroadcastChannel callingEventChannel_delegate$lambda$0;
        HashSet sentEvents_delegate$lambda$0;
        Mutex mutex_delegate$lambda$1;
        ConflatedBroadcastChannel mediaStreamsChannel_delegate$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                telecomEventChannel_delegate$lambda$0 = TelecomRepositoryImpl.telecomEventChannel_delegate$lambda$0();
                return telecomEventChannel_delegate$lambda$0;
            case 1:
                callingEventChannel_delegate$lambda$0 = CallStateRepositoryImpl.callingEventChannel_delegate$lambda$0();
                return callingEventChannel_delegate$lambda$0;
            case 2:
                sentEvents_delegate$lambda$0 = CallingMetricsRepoImpl.sentEvents_delegate$lambda$0();
                return sentEvents_delegate$lambda$0;
            case 3:
                mutex_delegate$lambda$1 = CallingMetricsRepoImpl.mutex_delegate$lambda$1();
                return mutex_delegate$lambda$1;
            default:
                mediaStreamsChannel_delegate$lambda$0 = MediaStreamsRepositoryImpl.mediaStreamsChannel_delegate$lambda$0();
                return mediaStreamsChannel_delegate$lambda$0;
        }
    }
}
