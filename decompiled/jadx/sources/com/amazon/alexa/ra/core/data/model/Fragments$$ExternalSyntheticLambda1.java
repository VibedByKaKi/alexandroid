package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.ra.core.data.fragments.ConversationManager;
import com.amazon.alexa.ra.core.data.fragments.Relation;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableArrayBuilder;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class Fragments$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Set f$0;

    public /* synthetic */ Fragments$$ExternalSyntheticLambda1(Set set, int i) {
        this.$r8$classId = i;
        this.f$0 = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean blockFragmentsForRoot$lambda$66$lambda$64;
        boolean removeFragments$lambda$37;
        Unit userDrivenScrollEnded$lambda$2$lambda$1;
        int i = this.$r8$classId;
        Set set = this.f$0;
        switch (i) {
            case 0:
                blockFragmentsForRoot$lambda$66$lambda$64 = Fragments.getBlockFragmentsForRoot$lambda$66$lambda$64(set, (Relation) obj);
                return Boolean.valueOf(blockFragmentsForRoot$lambda$66$lambda$64);
            case 1:
                removeFragments$lambda$37 = ConversationManager.removeFragments$lambda$37(set, (Map.Entry) obj);
                return Boolean.valueOf(removeFragments$lambda$37);
            default:
                userDrivenScrollEnded$lambda$2$lambda$1 = NativeAnimatedModule.userDrivenScrollEnded$lambda$2$lambda$1(set, (ReadableArrayBuilder) obj);
                return userDrivenScrollEnded$lambda$2$lambda$1;
        }
    }
}
