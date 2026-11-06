package com.amazon.alexa.ra.core.features.windowresize;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\nH&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/windowresize/WindowResizeClient;", "", "toggleMaximize", "", "contentResolver", "Landroid/content/ContentResolver;", "maximize", "", "queryMaximizeState", "registerObserver", "Landroid/database/ContentObserver;", "handler", "Landroid/os/Handler;", "onChange", "Lkotlin/Function0;", "unregisterObserver", "observer", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface WindowResizeClient {
    boolean queryMaximizeState(@NotNull ContentResolver contentResolver);

    @Nullable
    ContentObserver registerObserver(@NotNull ContentResolver contentResolver, @NotNull Handler handler, @NotNull Function0<Unit> onChange);

    void toggleMaximize(@NotNull ContentResolver contentResolver, boolean maximize);

    void unregisterObserver(@NotNull ContentResolver contentResolver, @NotNull ContentObserver observer);
}
