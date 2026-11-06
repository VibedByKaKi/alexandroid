package com.amazon.tarazed.activity;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.tarazed.activity.ActivityTracker$handleSubsriberAction$1$1", f = "ActivityTracker.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
public final class ActivityTracker$handleSubsriberAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityLifecycleAction $action;
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Function3<Activity, ActivityLifecycleAction, Continuation<? super Unit>, Object> $subscriber;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityTracker$handleSubsriberAction$1$1(Function3<? super Activity, ? super ActivityLifecycleAction, ? super Continuation<? super Unit>, ? extends Object> function3, Activity activity, ActivityLifecycleAction activityLifecycleAction, Continuation<? super ActivityTracker$handleSubsriberAction$1$1> continuation) {
        super(2, continuation);
        this.$subscriber = function3;
        this.$activity = activity;
        this.$action = activityLifecycleAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ActivityTracker$handleSubsriberAction$1$1(this.$subscriber, this.$activity, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ActivityTracker$handleSubsriberAction$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function3<Activity, ActivityLifecycleAction, Continuation<? super Unit>, Object> function3 = this.$subscriber;
            Activity activity = this.$activity;
            ActivityLifecycleAction activityLifecycleAction = this.$action;
            this.label = 1;
            if (function3.invoke(activity, activityLifecycleAction, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
