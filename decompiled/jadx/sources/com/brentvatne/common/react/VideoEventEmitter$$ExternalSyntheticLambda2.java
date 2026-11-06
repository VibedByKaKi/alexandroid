package com.brentvatne.common.react;

import com.facebook.react.bridge.WritableMap;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class VideoEventEmitter$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Serializable f$0;

    public /* synthetic */ VideoEventEmitter$$ExternalSyntheticLambda2(Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit addEventEmitters$lambda$51$lambda$50;
        Unit addEventEmitters$lambda$36$lambda$35;
        int i = this.$r8$classId;
        Serializable serializable = this.f$0;
        switch (i) {
            case 0:
                addEventEmitters$lambda$51$lambda$50 = VideoEventEmitter.addEventEmitters$lambda$51$lambda$50((String) serializable, (WritableMap) obj);
                return addEventEmitters$lambda$51$lambda$50;
            default:
                addEventEmitters$lambda$36$lambda$35 = VideoEventEmitter.addEventEmitters$lambda$36$lambda$35((ArrayList) serializable, (WritableMap) obj);
                return addEventEmitters$lambda$36$lambda$35;
        }
    }
}
