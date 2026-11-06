package androidx.activity.result;

import android.content.Context;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.amazon.alexa.assistant.ui.conversation.view.ftux.PermissionRequestStateKt;
import com.amazon.alexa.assistant.ui.conversation.view.ftux.PermissionStateMachine;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ActivityResultRegistry$$ExternalSyntheticLambda0 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ ActivityResultRegistry$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.$r8$classId) {
            case 0:
                ActivityResultRegistry.register$lambda$1((ActivityResultRegistry) this.f$0, (String) this.f$1, (ActivityResultCallback) this.f$2, (ActivityResultContract) this.f$3, lifecycleOwner, event);
                break;
            default:
                PermissionRequestStateKt.rememberPermissionRequestState$lambda$15$lambda$14$lambda$12((PermissionStateMachine) this.f$0, (List) this.f$1, (Function0) this.f$2, (Context) this.f$3, lifecycleOwner, event);
                break;
        }
    }
}
