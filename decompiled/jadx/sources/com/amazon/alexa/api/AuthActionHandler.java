package com.amazon.alexa.api;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.os.SystemClock;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/api/AuthActionHandler;", "", "context", "Landroid/content/Context;", "resultReceiver", "Landroid/os/ResultReceiver;", "(Landroid/content/Context;Landroid/os/ResultReceiver;)V", "handleLogout", "", "AVSAndroidClient-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthActionHandler {

    @NotNull
    private final Context context;

    @NotNull
    private final ResultReceiver resultReceiver;

    public AuthActionHandler(@NotNull Context context, @NotNull ResultReceiver resultReceiver) {
        context.getClass();
        resultReceiver.getClass();
        this.context = context;
        this.resultReceiver = resultReceiver;
    }

    public final void handleLogout() {
        Intent intent = new Intent();
        intent.setAction(AuthConstans.ACTION_LOGOUT);
        intent.setPackage(this.context.getPackageName());
        intent.putExtra(AuthConstans.EXTRA_RESULT_RECEIVER, this.resultReceiver);
        intent.putExtra(AuthConstans.EXTRA_LOGOUT_ELAPSED_REALTIME_MS, SystemClock.elapsedRealtime());
        this.context.sendBroadcast(intent);
    }
}
