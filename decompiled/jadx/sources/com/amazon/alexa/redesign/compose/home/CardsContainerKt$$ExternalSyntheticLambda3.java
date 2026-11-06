package com.amazon.alexa.redesign.compose.home;

import com.amazon.alexa.redesign.entity.agentforward.domain.ContentAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardsContainerKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function3 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CardsContainerKt$$ExternalSyntheticLambda3(int i, int i2, Function3 function3) {
        this.$r8$classId = i2;
        this.f$0 = function3;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$33$lambda$32;
        Unit invoke$lambda$29$lambda$21$lambda$20;
        Unit invoke$lambda$29$lambda$23$lambda$22;
        Unit CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$16$lambda$15;
        Unit CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$18$lambda$17;
        Unit CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$35$lambda$34;
        switch (this.$r8$classId) {
            case 0:
                CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$33$lambda$32 = CardsContainerKt.CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$33$lambda$32(this.f$0, this.f$1, (ContentAction) obj);
                return CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$33$lambda$32;
            case 1:
                invoke$lambda$29$lambda$21$lambda$20 = HomeKt$CardStack$6.invoke$lambda$29$lambda$21$lambda$20(this.f$0, this.f$1, (ContentAction) obj);
                return invoke$lambda$29$lambda$21$lambda$20;
            case 2:
                invoke$lambda$29$lambda$23$lambda$22 = HomeKt$CardStack$6.invoke$lambda$29$lambda$23$lambda$22(this.f$0, this.f$1, (ContentAction) obj);
                return invoke$lambda$29$lambda$23$lambda$22;
            case 3:
                CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$16$lambda$15 = CardsContainerKt.CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$16$lambda$15(this.f$0, this.f$1, (ContentAction) obj);
                return CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$16$lambda$15;
            case 4:
                CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$18$lambda$17 = CardsContainerKt.CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$18$lambda$17(this.f$0, this.f$1, (ContentAction) obj);
                return CardFeed_t7ov2YI$lambda$20$lambda$19$lambda$18$lambda$17;
            default:
                CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$35$lambda$34 = CardsContainerKt.CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$35$lambda$34(this.f$0, this.f$1, (ContentAction) obj);
                return CardCarousel_w41Enmo$lambda$37$lambda$36$lambda$35$lambda$34;
        }
    }
}
