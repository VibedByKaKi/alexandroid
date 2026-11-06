package org.apache.commons.lang3;

import com.amazon.alexa.accessory.notificationpublisher.reply.ReplyClientHelper;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ThreadUtils$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ ThreadUtils$$ExternalSyntheticLambda3(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$findThreadById$0;
        boolean lambda$purgeExpiredSelfDismissed$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$findThreadById$0 = ThreadUtils.lambda$findThreadById$0(this.f$0, (Thread) obj);
                return lambda$findThreadById$0;
            default:
                lambda$purgeExpiredSelfDismissed$0 = ReplyClientHelper.lambda$purgeExpiredSelfDismissed$0(this.f$0, (Map.Entry) obj);
                return lambda$purgeExpiredSelfDismissed$0;
        }
    }
}
