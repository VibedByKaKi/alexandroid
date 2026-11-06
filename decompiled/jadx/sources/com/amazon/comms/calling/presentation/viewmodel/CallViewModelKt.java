package com.amazon.comms.calling.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"createWithFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModel;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallViewModelKt {
    @NotNull
    public static final ViewModelProvider.Factory createWithFactory(@NotNull final Function0<? extends ViewModel> function0) {
        function0.getClass();
        return new ViewModelProvider.Factory() { // from class: com.amazon.comms.calling.presentation.viewmodel.CallViewModelKt$createWithFactory$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                modelClass.getClass();
                ViewModel invoke = function0.invoke();
                invoke.getClass();
                return (T) invoke;
            }
        };
    }
}
