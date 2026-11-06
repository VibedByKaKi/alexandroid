package com.google.common.collect;

import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BaseStream[] f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda1(BaseStream[] baseStreamArr, int i) {
        this.$r8$classId = i;
        this.f$0 = baseStreamArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BaseStream[] baseStreamArr = this.f$0;
        switch (i) {
            case 0:
                Streams.closeAll((DoubleStream[]) baseStreamArr);
                break;
            case 1:
                Streams.closeAll((LongStream[]) baseStreamArr);
                break;
            case 2:
                Streams.closeAll((Stream[]) baseStreamArr);
                break;
            default:
                Streams.closeAll((IntStream[]) baseStreamArr);
                break;
        }
    }
}
