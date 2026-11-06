package androidx.media3.common.util;

import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClient;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Util$$ExternalSyntheticLambda4 implements ThreadFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ Util$$ExternalSyntheticLambda4(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$newSingleThreadExecutor$3;
        Thread lambda$newSingleThreadScheduledExecutor$4;
        Thread daemonThreadFactory$lambda$1;
        Thread lambda$newSingleThreadExecutor$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                lambda$newSingleThreadExecutor$3 = Util.lambda$newSingleThreadExecutor$3(str, runnable);
                return lambda$newSingleThreadExecutor$3;
            case 1:
                lambda$newSingleThreadScheduledExecutor$4 = Util.lambda$newSingleThreadScheduledExecutor$4(str, runnable);
                return lambda$newSingleThreadScheduledExecutor$4;
            case 2:
                daemonThreadFactory$lambda$1 = ClassifyIntentClient.Companion.daemonThreadFactory$lambda$1(str, runnable);
                return daemonThreadFactory$lambda$1;
            default:
                lambda$newSingleThreadExecutor$0 = com.google.android.exoplayer2.util.Util.lambda$newSingleThreadExecutor$0(str, runnable);
                return lambda$newSingleThreadExecutor$0;
        }
    }
}
