package com.amazon.alexa.redesign.compose.home;

import com.amazon.alexa.redesign.entity.agentforward.domain.WelcomeCardDrawerItemContent;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeKt$$ExternalSyntheticLambda34 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;

    public /* synthetic */ HomeKt$$ExternalSyntheticLambda34(Object obj, Function function, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = function;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit ContentItems$lambda$218$lambda$217$lambda$216$lambda$211$lambda$210;
        Unit ForYouCardItem$lambda$13$lambda$12;
        switch (this.$r8$classId) {
            case 0:
                ContentItems$lambda$218$lambda$217$lambda$216$lambda$211$lambda$210 = HomeKt.ContentItems$lambda$218$lambda$217$lambda$216$lambda$211$lambda$210((WelcomeCardDrawerItemContent) this.f$0, (Function1) this.f$1);
                return ContentItems$lambda$218$lambda$217$lambda$216$lambda$211$lambda$210;
            default:
                ForYouCardItem$lambda$13$lambda$12 = ForYouCardListKt.ForYouCardItem$lambda$13$lambda$12((Function0) this.f$0, (Function0) this.f$1);
                return ForYouCardItem$lambda$13$lambda$12;
        }
    }
}
