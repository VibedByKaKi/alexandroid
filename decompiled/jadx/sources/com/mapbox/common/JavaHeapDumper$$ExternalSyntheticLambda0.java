package com.mapbox.common;

import com.amazon.coral.util.CoralThreadFactory;
import java.lang.Thread;
import org.openjdk.tools.sjavac.server.ServerMain;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class JavaHeapDumper$$ExternalSyntheticLambda0 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ JavaHeapDumper$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                JavaHeapDumper.enable$lambda$1(thread, th);
                break;
            case 1:
                CoralThreadFactory.lambda$newThread$0(thread, th);
                break;
            default:
                ServerMain.lambda$run$0(thread, th);
                break;
        }
    }
}
