package com.amazon.alexa.assistant.ui.conversation.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.amazon.alexa.ra.core.ui.fragments.button.PulsatingStateObserverApi;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/NoOpPulsatingStateObserver;", "Lcom/amazon/alexa/ra/core/ui/fragments/button/PulsatingStateObserverApi;", "<init>", "()V", "observe", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "", BulkOperationType.remove, "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NoOpPulsatingStateObserver implements PulsatingStateObserverApi {
    public static final int $stable = 0;

    @NotNull
    public static final NoOpPulsatingStateObserver INSTANCE = new NoOpPulsatingStateObserver();

    private NoOpPulsatingStateObserver() {
    }

    @Override // com.amazon.alexa.ra.core.ui.fragments.button.PulsatingStateObserverApi
    public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<Boolean> observer) {
        owner.getClass();
        observer.getClass();
    }

    @Override // com.amazon.alexa.ra.core.ui.fragments.button.PulsatingStateObserverApi
    public void remove(@NotNull Observer<Boolean> observer) {
        observer.getClass();
    }
}
