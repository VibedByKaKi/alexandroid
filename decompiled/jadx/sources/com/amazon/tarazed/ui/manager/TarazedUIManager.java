package com.amazon.tarazed.ui.manager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u000e\u0010\u0007\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/ui/manager/TarazedUIManager;", "", "displayToast", "", "message", "", "showSessionControls", "subscribeToActivityChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface TarazedUIManager {
    void displayToast(@NotNull String message);

    void showSessionControls();

    @Nullable
    Object subscribeToActivityChanges(@NotNull Continuation<? super Unit> continuation);
}
