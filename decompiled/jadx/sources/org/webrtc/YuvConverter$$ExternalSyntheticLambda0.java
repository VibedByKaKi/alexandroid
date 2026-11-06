package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class YuvConverter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ByteBuffer f$0;

    public /* synthetic */ YuvConverter$$ExternalSyntheticLambda0(ByteBuffer byteBuffer, int i) {
        this.$r8$classId = i;
        this.f$0 = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ByteBuffer byteBuffer = this.f$0;
        switch (i) {
            case 0:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
        }
    }
}
