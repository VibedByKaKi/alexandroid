package com.amazon.alexa.ra.core.data.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/IntentProvider;", "", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "action", "", "uri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "cls", "Ljava/lang/Class;", "getIntentFilter", "Landroid/content/IntentFilter;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class IntentProvider {
    public static final int $stable = 0;

    @NotNull
    public static final IntentProvider INSTANCE = new IntentProvider();

    private IntentProvider() {
    }

    @NotNull
    public final Intent getIntent(@NotNull String action, @NotNull Uri uri) {
        action.getClass();
        uri.getClass();
        return new Intent(action, uri);
    }

    @NotNull
    public final IntentFilter getIntentFilter() {
        return new IntentFilter();
    }

    @NotNull
    public final Intent getIntent(@NotNull String action) {
        action.getClass();
        return new Intent(action);
    }

    @NotNull
    public final Intent getIntent() {
        return new Intent();
    }

    @NotNull
    public final Intent getIntent(@NotNull Context context, @NotNull Class<?> cls) {
        context.getClass();
        cls.getClass();
        return new Intent(context, cls);
    }
}
