package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class GmsRpc$$ExternalSyntheticLambda0 implements Continuation, OnCompleteListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ GmsRpc$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 1:
                WakeLockHolder.completeWakefulIntent((Intent) obj);
                break;
            case 2:
                ((WithinAppServiceConnection.BindRequest) obj).finish();
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String lambda$extractResponseWhenComplete$0;
        lambda$extractResponseWhenComplete$0 = ((GmsRpc) this.f$0).lambda$extractResponseWhenComplete$0(task);
        return lambda$extractResponseWhenComplete$0;
    }
}
