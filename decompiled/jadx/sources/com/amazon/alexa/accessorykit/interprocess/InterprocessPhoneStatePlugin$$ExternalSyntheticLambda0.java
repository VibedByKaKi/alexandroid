package com.amazon.alexa.accessorykit.interprocess;

import com.amazon.alexa.accessory.protocol.StateOuterClass;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class InterprocessPhoneStatePlugin$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InterprocessPhoneStatePlugin f$0;

    public /* synthetic */ InterprocessPhoneStatePlugin$$ExternalSyntheticLambda0(InterprocessPhoneStatePlugin interprocessPhoneStatePlugin, int i) {
        this.$r8$classId = i;
        this.f$0 = interprocessPhoneStatePlugin;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        StateOuterClass.State lambda$getState$2;
        SingleSource lambda$getState$3;
        StateOuterClass.State lambda$queryState$0;
        int i = this.$r8$classId;
        InterprocessPhoneStatePlugin interprocessPhoneStatePlugin = this.f$0;
        switch (i) {
            case 0:
                lambda$getState$2 = interprocessPhoneStatePlugin.lambda$getState$2((Set) obj);
                return lambda$getState$2;
            case 1:
                lambda$getState$3 = interprocessPhoneStatePlugin.lambda$getState$3((StateOuterClass.State) obj);
                return lambda$getState$3;
            default:
                lambda$queryState$0 = interprocessPhoneStatePlugin.lambda$queryState$0((Map) obj);
                return lambda$queryState$0;
        }
    }
}
