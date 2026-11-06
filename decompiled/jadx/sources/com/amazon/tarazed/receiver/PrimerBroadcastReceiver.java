package com.amazon.tarazed.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.tarazed.activity.TarazedPrimerActivity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/tarazed/receiver/PrimerBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "primerActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "Ljava/lang/ref/WeakReference;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PrimerBroadcastReceiver extends BroadcastReceiver {

    @NotNull
    private WeakReference<Activity> primerActivity;

    public PrimerBroadcastReceiver(@NotNull Activity activity) {
        activity.getClass();
        this.primerActivity = new WeakReference<>(activity);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Activity activity;
        context.getClass();
        intent.getClass();
        if (!Intrinsics.areEqual(intent.getAction(), TarazedPrimerActivity.ACTION_CLOSE_PRIMER) || (activity = this.primerActivity.get()) == null) {
            return;
        }
        activity.finish();
    }
}
