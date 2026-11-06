package com.amazon.comms.calling.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.deecomms.calling.api.Result;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ar\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062*\b\u0002\u0010\t\u001a$\b\u0001\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H\u0086@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"applyResult", "", ExifInterface.GPS_DIRECTION_TRUE, "result", "Lcom/amazon/deecomms/calling/api/Result;", "onSuccess", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/amazon/deecomms/calling/api/Result;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallingAPIKt {
    @Nullable
    public static final <T> Object applyResult(@NotNull Result<T> result, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Function2<? super Exception, ? super Continuation<? super Unit>, ? extends Object> function22, @NotNull Continuation<? super Unit> continuation) {
        if (result instanceof Result.Success) {
            Object invoke = function2.invoke((Object) ((Result.Success) result).getData(), continuation);
            return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
        }
        if (!(result instanceof Result.Error) || function22 == null) {
            return Unit.INSTANCE;
        }
        Exception exception = ((Result.Error) result).getException();
        exception.getClass();
        Object invoke2 = function22.invoke(exception, continuation);
        return invoke2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke2 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object applyResult$default(Result result, Function2 function2, Function2 function22, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function22 = null;
        }
        return applyResult(result, function2, function22, continuation);
    }
}
