package com.amazon.alexa.accessory.internal.bluetooth;

import android.os.ParcelUuid;
import android.text.TextUtils;
import com.amazon.alexa.accessory.internal.util.UuidUtils;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SdpRecords {
    private final Set<UUID> uuids;

    public SdpRecords(ParcelUuid[] parcelUuidArr) {
        this.uuids = UuidUtils.setOfUuidsFromParcelArray(parcelUuidArr);
    }

    public boolean containsUuid(UUID uuid) {
        return this.uuids.contains(uuid) || this.uuids.contains(UuidUtils.invertUuid(uuid));
    }

    public String toString() {
        return "SdpRecord={" + TextUtils.join(", ", this.uuids) + AbstractJsonLexerKt.END_OBJ;
    }

    public SdpRecords() {
        this.uuids = Collections.EMPTY_SET;
    }
}
