package com.amazon.alexa.accessory.frames.media.pipeline;

import com.amazon.alexa.accessorykit.factoryreset.FactoryResetModule;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AssetPipeline$$ExternalSyntheticLambda2 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ AssetPipeline$$ExternalSyntheticLambda2(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                AssetPipeline.run$lambda$1(str);
                break;
            case 1:
                FactoryResetModule.lambda$performUnlink$15(str);
                break;
            default:
                FactoryResetModule.lambda$performDeregistration$12(str);
                break;
        }
    }
}
