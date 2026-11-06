package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "before", "after"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
public final class SeparatorsKt$insertEventSeparators$separatorState$1<R, T> extends SuspendLambda implements Function3<T, T, Continuation<? super R>, Object> {
    final /* synthetic */ Function3<T, T, Continuation<? super R>, Object> $generator;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorsKt$insertEventSeparators$separatorState$1(Function3<? super T, ? super T, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super SeparatorsKt$insertEventSeparators$separatorState$1> continuation) {
        super(3, continuation);
        this.$generator = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@Nullable T t, @Nullable T t2, @Nullable Continuation<? super R> continuation) {
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.$generator, continuation);
        separatorsKt$insertEventSeparators$separatorState$1.L$0 = t;
        separatorsKt$insertEventSeparators$separatorState$1.L$1 = t2;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        Function3<T, T, Continuation<? super R>, Object> function3 = this.$generator;
        this.L$0 = null;
        this.label = 1;
        Object invoke = function3.invoke(obj2, obj3, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}
