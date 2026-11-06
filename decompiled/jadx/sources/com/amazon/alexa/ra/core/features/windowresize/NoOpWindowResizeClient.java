package com.amazon.alexa.ra.core.features.windowresize;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/features/windowresize/NoOpWindowResizeClient;", "Lcom/amazon/alexa/ra/core/features/windowresize/WindowResizeClient;", "<init>", "()V", "toggleMaximize", "", "contentResolver", "Landroid/content/ContentResolver;", "maximize", "", "queryMaximizeState", "registerObserver", "Landroid/database/ContentObserver;", "handler", "Landroid/os/Handler;", "onChange", "Lkotlin/Function0;", "unregisterObserver", "observer", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NoOpWindowResizeClient implements WindowResizeClient {
    public static final int $stable = 0;

    @Override // com.amazon.alexa.ra.core.features.windowresize.WindowResizeClient
    public boolean queryMaximizeState(@NotNull ContentResolver contentResolver) {
        contentResolver.getClass();
        return false;
    }

    @Override // com.amazon.alexa.ra.core.features.windowresize.WindowResizeClient
    @Nullable
    public ContentObserver registerObserver(@NotNull ContentResolver contentResolver, @NotNull Handler handler, @NotNull Function0<Unit> onChange) {
        contentResolver.getClass();
        handler.getClass();
        onChange.getClass();
        return null;
    }

    @Override // com.amazon.alexa.ra.core.features.windowresize.WindowResizeClient
    public void toggleMaximize(@NotNull ContentResolver contentResolver, boolean maximize) {
        contentResolver.getClass();
    }

    @Override // com.amazon.alexa.ra.core.features.windowresize.WindowResizeClient
    public void unregisterObserver(@NotNull ContentResolver contentResolver, @NotNull ContentObserver observer) {
        contentResolver.getClass();
        observer.getClass();
    }
}
