package chip.devicecontroller;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface ICDCheckInDelegate {
    void onCheckInComplete(@Nonnull ICDClientInfo iCDClientInfo);

    void onKeyRefreshDone(long j);

    @Nullable
    byte[] onKeyRefreshNeeded(@Nonnull ICDClientInfo iCDClientInfo);
}
