package com.amazon.dee.app.services.internetsharing.nan;

import com.amazon.alexa.redesign.view.container.CardStudioSurfaceHealth;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.client.utils.CacheControl;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH&J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/nan/NanSubscriberManager;", "", "isAvailable", "", "setOnDisconnectListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", CardStudioSurfaceHealth.Stage.ATTACH, "Lio/reactivex/rxjava3/core/Single;", "discoverAndConnect", "Lcom/amazon/dee/app/services/internetsharing/nan/NanConnection;", "serviceName", "", "passphrase", "tearDown", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NanSubscriberManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Single discoverAndConnect$default(NanSubscriberManager nanSubscriberManager, String str, String str2, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: discoverAndConnect");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return nanSubscriberManager.discoverAndConnect(str, str2);
    }

    @NotNull
    Single<Boolean> attach();

    @NotNull
    Single<NanConnection> discoverAndConnect(@NotNull String serviceName, @NotNull String passphrase);

    boolean isAvailable();

    void setOnDisconnectListener(@Nullable Function0<Unit> listener);

    void tearDown();
}
