package com.amazon.tarazed.ui.menu.databinding;

import androidx.databinding.ObservableBoolean;
import com.amazon.tarazed.notifier.TarazedNotificationEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/amazon/tarazed/notifier/TarazedNotificationEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.tarazed.ui.menu.databinding.MediaConnectedManager$notificationHandler$1", f = "MediaConnectedManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes19.dex */
public final class MediaConnectedManager$notificationHandler$1 extends SuspendLambda implements Function2<TarazedNotificationEvent, Continuation<? super Unit>, Object> {
    final /* synthetic */ ObservableBoolean $mediaConnectedObservable;
    /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TarazedNotificationEvent.values().length];
            try {
                iArr[TarazedNotificationEvent.MEDIA_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaConnectedManager$notificationHandler$1(ObservableBoolean observableBoolean, Continuation<? super MediaConnectedManager$notificationHandler$1> continuation) {
        super(2, continuation);
        this.$mediaConnectedObservable = observableBoolean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MediaConnectedManager$notificationHandler$1 mediaConnectedManager$notificationHandler$1 = new MediaConnectedManager$notificationHandler$1(this.$mediaConnectedObservable, continuation);
        mediaConnectedManager$notificationHandler$1.L$0 = obj;
        return mediaConnectedManager$notificationHandler$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull TarazedNotificationEvent tarazedNotificationEvent, @Nullable Continuation<? super Unit> continuation) {
        return ((MediaConnectedManager$notificationHandler$1) create(tarazedNotificationEvent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        if (WhenMappings.$EnumSwitchMapping$0[((TarazedNotificationEvent) this.L$0).ordinal()] == 1) {
            this.$mediaConnectedObservable.set(true);
        }
        return Unit.INSTANCE;
    }
}
