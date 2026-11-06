package com.brentvatne.common.react;

import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class VideoEventEmitter$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VideoEventEmitter f$0;
    public final /* synthetic */ ArrayList f$1;

    public /* synthetic */ VideoEventEmitter$$ExternalSyntheticLambda4(VideoEventEmitter videoEventEmitter, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = videoEventEmitter;
        this.f$1 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return VideoEventEmitter.addEventEmitters$lambda$45$lambda$44(this.f$0, this.f$1, (WritableMap) obj);
            case 1:
                return VideoEventEmitter.addEventEmitters$lambda$49$lambda$48(this.f$0, this.f$1, (WritableMap) obj);
            default:
                return VideoEventEmitter.addEventEmitters$lambda$47$lambda$46(this.f$0, this.f$1, (WritableMap) obj);
        }
    }
}
