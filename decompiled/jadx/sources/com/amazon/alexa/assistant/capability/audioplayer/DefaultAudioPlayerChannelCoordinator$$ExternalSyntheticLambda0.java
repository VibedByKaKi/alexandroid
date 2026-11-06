package com.amazon.alexa.assistant.capability.audioplayer;

import com.amazon.alexa.assistant.foundation.audio.AudioPlayableTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAudioPlayerChannelCoordinator$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAudioPlayerChannelCoordinator f$0;
    public final /* synthetic */ AudioPlayableTask f$1;

    public /* synthetic */ DefaultAudioPlayerChannelCoordinator$$ExternalSyntheticLambda0(DefaultAudioPlayerChannelCoordinator defaultAudioPlayerChannelCoordinator, AudioPlayableTask audioPlayableTask, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAudioPlayerChannelCoordinator;
        this.f$1 = audioPlayableTask;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit processProgressReportFor$lambda$2$lambda$1;
        Unit invokeSuspend$lambda$1$lambda$0;
        Unit processProgressReportFor$lambda$4$lambda$3;
        Long l = (Long) obj;
        switch (this.$r8$classId) {
            case 0:
                processProgressReportFor$lambda$2$lambda$1 = DefaultAudioPlayerChannelCoordinator.processProgressReportFor$lambda$2$lambda$1(this.f$0, this.f$1, l.longValue());
                return processProgressReportFor$lambda$2$lambda$1;
            case 1:
                invokeSuspend$lambda$1$lambda$0 = DefaultAudioPlayerChannelCoordinator$updateProgressReportInterval$1.invokeSuspend$lambda$1$lambda$0(this.f$0, this.f$1, l.longValue());
                return invokeSuspend$lambda$1$lambda$0;
            default:
                processProgressReportFor$lambda$4$lambda$3 = DefaultAudioPlayerChannelCoordinator.processProgressReportFor$lambda$4$lambda$3(this.f$0, this.f$1, l.longValue());
                return processProgressReportFor$lambda$4$lambda$3;
        }
    }
}
