package com.amazon.alexa.ra.core.ui.fragments.button;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/button/PulsatingStateObserverApi;", "", "observe", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "", BulkOperationType.remove, "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PulsatingStateObserverApi {
    void observe(@NotNull LifecycleOwner owner, @NotNull Observer<Boolean> observer);

    void remove(@NotNull Observer<Boolean> observer);
}
