package com.amazon.coral.google.common.collect;

import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BaseStream[] f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda4(BaseStream[] baseStreamArr, int i) {
        this.$r8$classId = i;
        this.f$0 = baseStreamArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BaseStream[] baseStreamArr = this.f$0;
        switch (i) {
            case 0:
                Streams.lambda$concat$3((IntStream[]) baseStreamArr);
                break;
            case 1:
                Streams.lambda$concat$5((LongStream[]) baseStreamArr);
                break;
            case 2:
                Streams.lambda$concat$7((DoubleStream[]) baseStreamArr);
                break;
            default:
                Streams.lambda$concat$1((Stream[]) baseStreamArr);
                break;
        }
    }
}
