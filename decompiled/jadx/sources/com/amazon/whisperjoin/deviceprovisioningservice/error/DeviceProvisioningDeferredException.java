package com.amazon.whisperjoin.deviceprovisioningservice.error;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceProvisioningDeferredException extends Exception {
    public final long mWaitTime;

    public DeviceProvisioningDeferredException(long j) {
        this.mWaitTime = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mWaitTime == ((DeviceProvisioningDeferredException) obj).mWaitTime;
    }

    public int hashCode() {
        long j = this.mWaitTime;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Throwable
    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m(new StringBuilder("DeviceProvisioningDeferredException{mWaitTime="), this.mWaitTime, AbstractJsonLexerKt.END_OBJ);
    }
}
