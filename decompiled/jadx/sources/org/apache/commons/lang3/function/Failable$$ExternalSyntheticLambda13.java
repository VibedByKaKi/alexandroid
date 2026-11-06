package org.apache.commons.lang3.function;

import org.apache.commons.lang3.exception.ExceptionUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Failable$$ExternalSyntheticLambda13 implements FailableConsumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Failable$$ExternalSyntheticLambda13(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.lang3.function.FailableConsumer
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.$r8$classId) {
            case 0:
                Failable.rethrow(th);
                break;
            default:
                ExceptionUtils.rethrow(th);
                break;
        }
    }
}
