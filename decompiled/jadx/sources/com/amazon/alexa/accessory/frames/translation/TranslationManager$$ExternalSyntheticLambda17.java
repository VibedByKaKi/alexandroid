package com.amazon.alexa.accessory.frames.translation;

import com.amazon.alexa.accessory.frames.media.autoimport.AutoImportManager;
import com.amazon.alexa.accessory.protocol.Assettransfer;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TranslationManager$$ExternalSyntheticLambda17 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TranslationManager$$ExternalSyntheticLambda17(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit responseHandler$lambda$14$lambda$13;
        Unit subscribeToAssetNotifications$lambda$1;
        int i = this.$r8$classId;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                responseHandler$lambda$14$lambda$13 = TranslationManager.responseHandler$lambda$14$lambda$13((TranslationManager) obj4, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
                return responseHandler$lambda$14$lambda$13;
            default:
                subscribeToAssetNotifications$lambda$1 = AutoImportManager.subscribeToAssetNotifications$lambda$1((AutoImportManager) obj4, (Assettransfer.NotifyAssetAvailable) obj, ((Long) obj2).longValue(), ((Long) obj3).longValue());
                return subscribeToAssetNotifications$lambda$1;
        }
    }
}
