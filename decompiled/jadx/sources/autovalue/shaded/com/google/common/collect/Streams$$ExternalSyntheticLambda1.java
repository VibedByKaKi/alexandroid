package autovalue.shaded.com.google.common.collect;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Streams$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Streams$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Streams.closeAll((LongStream[]) obj);
                break;
            case 1:
                Streams.closeAll((DoubleStream[]) obj);
                break;
            case 2:
                ((DoubleStream) obj).close();
                break;
            case 3:
                ((IntStream) obj).close();
                break;
            case 4:
                ((LongStream) obj).close();
                break;
            case 5:
                Streams.closeAll((IntStream[]) obj);
                break;
            case 6:
                ((Stream) obj).close();
                break;
            default:
                Streams.closeAll((Stream[]) obj);
                break;
        }
    }
}
