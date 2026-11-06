package org.apache.commons.io;

import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.output.ThresholdingOutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class IOUtils$$ExternalSyntheticLambda0 implements IOConsumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ IOUtils$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                IOUtils.lambda$toByteArray$0((ThresholdingOutputStream) obj);
                break;
            default:
                IOConsumer.lambda$static$0(obj);
                break;
        }
    }
}
