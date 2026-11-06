package com.amazon.alexa.redesign.view.homeFeed;

import com.amazon.alexa.redesign.entity.CardModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class BaseCardViewHolder$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BaseCardViewHolder f$0;
    public final /* synthetic */ CardModel f$1;

    public /* synthetic */ BaseCardViewHolder$$ExternalSyntheticLambda0(BaseCardViewHolder baseCardViewHolder, CardModel cardModel, int i) {
        this.$r8$classId = i;
        this.f$0 = baseCardViewHolder;
        this.f$1 = cardModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit sendCardLoadedSignal$lambda$15$lambda$14;
        Unit sendCardLoadedSignal$lambda$17$lambda$16;
        switch (this.$r8$classId) {
            case 0:
                sendCardLoadedSignal$lambda$15$lambda$14 = BaseCardViewHolder.sendCardLoadedSignal$lambda$15$lambda$14(this.f$0, this.f$1);
                return sendCardLoadedSignal$lambda$15$lambda$14;
            default:
                sendCardLoadedSignal$lambda$17$lambda$16 = BaseCardViewHolder.sendCardLoadedSignal$lambda$17$lambda$16(this.f$0, this.f$1);
                return sendCardLoadedSignal$lambda$17$lambda$16;
        }
    }
}
