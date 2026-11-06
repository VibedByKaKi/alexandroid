package com.bugsnag.android.internal.dag;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/internal/dag/ContextModule;", "Lcom/bugsnag/android/internal/dag/DependencyModule;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ctx", "getCtx", "()Landroid/content/Context;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ContextModule extends DependencyModule {

    @NotNull
    private final Context ctx;

    public ContextModule(@NotNull Context context) {
        context.getClass();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
            context.getClass();
        }
        this.ctx = context;
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }
}
