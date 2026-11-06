package com.brentvatne.common.react;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import com.amazon.alexa.ra.core.ui.fragments.list.AlexaResponseFragmentKt;
import com.facebook.react.bridge.WritableMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class VideoEventEmitter$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ VideoEventEmitter$$ExternalSyntheticLambda1(long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
        this.f$1 = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit addEventEmitters$lambda$20$lambda$19;
        DrawResult DeepThinkingText$lambda$136$lambda$135;
        switch (this.$r8$classId) {
            case 0:
                addEventEmitters$lambda$20$lambda$19 = VideoEventEmitter.addEventEmitters$lambda$20$lambda$19(this.f$0, this.f$1, (WritableMap) obj);
                return addEventEmitters$lambda$20$lambda$19;
            default:
                DeepThinkingText$lambda$136$lambda$135 = AlexaResponseFragmentKt.DeepThinkingText$lambda$136$lambda$135(this.f$0, this.f$1, (CacheDrawScope) obj);
                return DeepThinkingText$lambda$136$lambda$135;
        }
    }
}
