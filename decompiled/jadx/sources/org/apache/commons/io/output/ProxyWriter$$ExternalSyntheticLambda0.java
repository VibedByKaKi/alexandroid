package org.apache.commons.io.output;

import java.io.Closeable;
import java.io.IOException;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ProxyInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class ProxyWriter$$ExternalSyntheticLambda0 implements IOConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Closeable f$0;

    public /* synthetic */ ProxyWriter$$ExternalSyntheticLambda0(Closeable closeable, int i) {
        this.$r8$classId = i;
        this.f$0 = closeable;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Closeable closeable = this.f$0;
        switch (i) {
            case 0:
                ((ProxyWriter) closeable).handleIOException((IOException) obj);
                break;
            case 1:
                ((ProxyInputStream) closeable).handleIOException((IOException) obj);
                break;
            default:
                ((ProxyOutputStream) closeable).handleIOException((IOException) obj);
                break;
        }
    }
}
