package com.amazon.alexa.ra.android.smartfragment.react;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/react/ViewClaim;", "", "viewId", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Ljava/lang/ref/WeakReference;", "<init>", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V", "getViewId", "()Ljava/lang/String;", "isOwnerCollected", "", "()Z", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ViewClaim {
    public static final int $stable = 8;

    @Nullable
    private final WeakReference<? extends Object> owner;

    @NotNull
    private final String viewId;

    public ViewClaim(@NotNull String str, @Nullable WeakReference<? extends Object> weakReference) {
        str.getClass();
        this.viewId = str;
        this.owner = weakReference;
    }

    @NotNull
    public final String getViewId() {
        return this.viewId;
    }

    public final boolean isOwnerCollected() {
        WeakReference<? extends Object> weakReference = this.owner;
        return weakReference != null && weakReference.get() == null;
    }

    public /* synthetic */ ViewClaim(String str, WeakReference weakReference, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : weakReference);
    }
}
