package com.amazon.alexa.ra.apl.deepbrowse.repos;

import com.amazon.alexa.api.compat.model.AlexaAudioTask;
import com.amazon.alexa.ra.apl.deepbrowse.apis.DeepBrowseVoiceApis;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public /* synthetic */ class DeepBrowseVoiceRepository$send$1$task$1 extends AdaptedFunctionReference implements Function1<AlexaAudioTask, Unit> {
    public DeepBrowseVoiceRepository$send$1$task$1(Object obj) {
        super(1, obj, DeepBrowseVoiceApis.class, "unschedule", "unschedule(Lcom/amazon/alexa/api/compat/model/AlexaAudioTask;)Lkotlin/Unit;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AlexaAudioTask alexaAudioTask) {
        invoke2(alexaAudioTask);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AlexaAudioTask alexaAudioTask) {
        ((DeepBrowseVoiceApis) this.receiver).unschedule(alexaAudioTask);
    }
}
