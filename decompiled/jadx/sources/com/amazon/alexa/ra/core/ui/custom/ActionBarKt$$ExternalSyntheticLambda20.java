package com.amazon.alexa.ra.core.ui.custom;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import com.amazon.alexa.ra.core.data.model.UserRequestAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ActionBarKt$$ExternalSyntheticLambda20 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ ActionBarKt$$ExternalSyntheticLambda20(boolean z, ActivityResultLauncher activityResultLauncher, Context context, ActivityResultLauncher activityResultLauncher2, Function1 function1, MutableState mutableState) {
        this.f$0 = z;
        this.f$3 = activityResultLauncher;
        this.f$2 = context;
        this.f$4 = activityResultLauncher2;
        this.f$5 = function1;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Job ActionBar$lambda$22$lambda$21;
        Unit MicrophonePermissionPrimer$lambda$14$lambda$13$lambda$10$lambda$9$lambda$8;
        switch (this.$r8$classId) {
            case 0:
                ActionBar$lambda$22$lambda$21 = ActionBarKt.ActionBar$lambda$22$lambda$21(this.f$0, this.f$1, (String) this.f$2, (MutableState) this.f$3, (CoroutineScope) this.f$4, (UserRequestAction) this.f$5);
                return ActionBar$lambda$22$lambda$21;
            default:
                MicrophonePermissionPrimer$lambda$14$lambda$13$lambda$10$lambda$9$lambda$8 = MicrophonePermissionPrimerKt.MicrophonePermissionPrimer$lambda$14$lambda$13$lambda$10$lambda$9$lambda$8(this.f$0, (ActivityResultLauncher) this.f$3, (Context) this.f$2, (ActivityResultLauncher) this.f$4, (Function1) this.f$5, this.f$1);
                return MicrophonePermissionPrimer$lambda$14$lambda$13$lambda$10$lambda$9$lambda$8;
        }
    }

    public /* synthetic */ ActionBarKt$$ExternalSyntheticLambda20(boolean z, MutableState mutableState, String str, MutableState mutableState2, CoroutineScope coroutineScope, UserRequestAction userRequestAction) {
        this.f$0 = z;
        this.f$1 = mutableState;
        this.f$2 = str;
        this.f$3 = mutableState2;
        this.f$4 = coroutineScope;
        this.f$5 = userRequestAction;
    }
}
