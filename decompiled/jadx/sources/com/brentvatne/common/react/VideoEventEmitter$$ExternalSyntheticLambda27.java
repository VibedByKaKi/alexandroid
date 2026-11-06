package com.brentvatne.common.react;

import com.brentvatne.common.react.VideoEventEmitter;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class VideoEventEmitter$$ExternalSyntheticLambda27 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ VideoEventEmitter$$ExternalSyntheticLambda27(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit addEventEmitters$lambda$45;
        Unit addEventEmitters$lambda$47;
        Unit addEventEmitters$lambda$49;
        Unit addEventEmitters$lambda$55$lambda$54;
        switch (this.$r8$classId) {
            case 0:
                addEventEmitters$lambda$45 = VideoEventEmitter.addEventEmitters$lambda$45((VideoEventEmitter.EventBuilder) this.f$0, (VideoEventEmitter) this.f$1, (ArrayList) obj);
                return addEventEmitters$lambda$45;
            case 1:
                addEventEmitters$lambda$47 = VideoEventEmitter.addEventEmitters$lambda$47((VideoEventEmitter.EventBuilder) this.f$0, (VideoEventEmitter) this.f$1, (ArrayList) obj);
                return addEventEmitters$lambda$47;
            case 2:
                addEventEmitters$lambda$49 = VideoEventEmitter.addEventEmitters$lambda$49((VideoEventEmitter.EventBuilder) this.f$0, (VideoEventEmitter) this.f$1, (ArrayList) obj);
                return addEventEmitters$lambda$49;
            default:
                addEventEmitters$lambda$55$lambda$54 = VideoEventEmitter.addEventEmitters$lambda$55$lambda$54((String) this.f$0, (Map) this.f$1, (WritableMap) obj);
                return addEventEmitters$lambda$55$lambda$54;
        }
    }
}
