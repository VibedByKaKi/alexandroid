package kotlinx.coroutines.io;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/io/ReaderJob;", "Lkotlinx/coroutines/Job;", "channel", "Lkotlinx/coroutines/io/ByteWriteChannel;", "getChannel", "()Lkotlinx/coroutines/io/ByteWriteChannel;", "kotlinx-coroutines-io"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public interface ReaderJob extends Job {
    @NotNull
    ByteWriteChannel getChannel();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        public static <R> R fold(ReaderJob readerJob, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            function2.getClass();
            return (R) Job.DefaultImpls.fold(readerJob, r, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E get(ReaderJob readerJob, @NotNull CoroutineContext.Key<E> key) {
            key.getClass();
            return (E) Job.DefaultImpls.get(readerJob, key);
        }

        @NotNull
        public static CoroutineContext minusKey(ReaderJob readerJob, @NotNull CoroutineContext.Key<?> key) {
            key.getClass();
            return Job.DefaultImpls.minusKey(readerJob, key);
        }

        @NotNull
        public static CoroutineContext plus(ReaderJob readerJob, @NotNull CoroutineContext coroutineContext) {
            coroutineContext.getClass();
            return Job.DefaultImpls.plus(readerJob, coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static Job plus(ReaderJob readerJob, @NotNull Job job) {
            job.getClass();
            return Job.DefaultImpls.plus((Job) readerJob, job);
        }
    }
}
