package androidx.compose.material;

import com.amazon.alexa.accessory.protocol.Accessories;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {Accessories.Response.GET_SAVED_WI_FI_NETWORKS_RESPONSE_FIELD_NUMBER}, m = "snapElevation", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FloatingActionButtonElevationAnimatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation<? super FloatingActionButtonElevationAnimatable$snapElevation$1> continuation) {
        super(continuation);
        this.this$0 = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object snapElevation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        snapElevation = this.this$0.snapElevation(this);
        return snapElevation;
    }
}
