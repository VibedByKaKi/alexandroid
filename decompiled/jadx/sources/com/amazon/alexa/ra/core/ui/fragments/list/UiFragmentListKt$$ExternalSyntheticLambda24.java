package com.amazon.alexa.ra.core.ui.fragments.list;

import android.media.AudioManager;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClient;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClientCallback;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentEvent;
import com.amazon.alexa.assistant.capability.speaker.volume.SystemVolumeInteractor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda24 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda24(ClassifyIntentEvent.Failed failed, boolean z) {
        this.$r8$classId = 1;
        this.f$1 = failed;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int FragmentLists_S3D76Zc$lambda$102$lambda$91;
        Unit handleTextFrame$lambda$20;
        Unit mute$lambda$13$lambda$12;
        switch (this.$r8$classId) {
            case 0:
                FragmentLists_S3D76Zc$lambda$102$lambda$91 = UiFragmentListKt.FragmentLists_S3D76Zc$lambda$102$lambda$91(this.f$0, (Ref.IntRef) this.f$1, ((Boolean) obj).booleanValue());
                return Integer.valueOf(FragmentLists_S3D76Zc$lambda$102$lambda$91);
            case 1:
                handleTextFrame$lambda$20 = ClassifyIntentClient.handleTextFrame$lambda$20((ClassifyIntentEvent.Failed) this.f$1, this.f$0, (ClassifyIntentClientCallback) obj);
                return handleTextFrame$lambda$20;
            default:
                mute$lambda$13$lambda$12 = SystemVolumeInteractor.setMute$lambda$13$lambda$12(this.f$0, (SystemVolumeInteractor) this.f$1, (AudioManager) obj);
                return mute$lambda$13$lambda$12;
        }
    }

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda24(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = obj;
    }
}
