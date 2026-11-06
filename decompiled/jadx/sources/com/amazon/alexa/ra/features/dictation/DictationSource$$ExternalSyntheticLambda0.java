package com.amazon.alexa.ra.features.dictation;

import android.content.Context;
import android.content.res.Resources;
import com.amazon.alexa.accessory.notificationpublisher.consumption.ConversationComponent;
import com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ProcessExit;
import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeCommandCatalog;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DictationSource$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ DictationSource$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit _init_$lambda$0;
        ProcessExit recoverOrphanedSession$lambda$10$lambda$9;
        Resources fromContext$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                _init_$lambda$0 = DictationSource._init_$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                return _init_$lambda$0;
            case 1:
                recoverOrphanedSession$lambda$10$lambda$9 = ConversationComponent.recoverOrphanedSession$lambda$10$lambda$9(this.f$0, ((Long) obj).longValue());
                return recoverOrphanedSession$lambda$10$lambda$9;
            default:
                fromContext$lambda$1 = LiveModeCommandCatalog.Companion.fromContext$lambda$1(this.f$0, (Locale) obj);
                return fromContext$lambda$1;
        }
    }
}
