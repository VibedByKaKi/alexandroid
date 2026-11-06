package com.amazon.alexa.mobile.assistant.client.metrics;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH&J\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH&J\b\u0010\f\u001a\u00020\u0006H&¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/metrics/UserIdentityProvider;", "", "getDirectedId", "", "getMarketplaceId", "isChildProfile", "", "addUserChangedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "removeUserChangedListener", "getEntitlementStatus", "metrics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface UserIdentityProvider {
    void addUserChangedListener(@NotNull Function0<Unit> listener);

    @Nullable
    String getDirectedId();

    boolean getEntitlementStatus();

    @Nullable
    String getMarketplaceId();

    boolean isChildProfile();

    void removeUserChangedListener(@NotNull Function0<Unit> listener);
}
