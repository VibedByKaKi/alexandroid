package com.amazon.whisperjoin.common.sharedtypes.devices;

import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;
import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.amazon.whisperjoin.protobuf.ErrorCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WhisperJoinPeripheralDeviceDetailsV2 extends WhisperJoinPeripheralDeviceDetails {
    private final byte mDistressCode;
    private final WJError mWJError;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder extends WhisperJoinPeripheralDeviceDetails.Builder {
        private byte mDistressCode = 0;
        private WJError mWJError = null;

        @Override // com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails.Builder
        public WhisperJoinPeripheralDeviceDetailsV2 build() {
            return new WhisperJoinPeripheralDeviceDetailsV2(this);
        }

        public Builder withDistressCode(byte b) {
            this.mDistressCode = b;
            this.mWJError = new WJError(ErrorCodes.Domain.PROVISIONING_FAILURE.getNumber(), this.mDistressCode, ErrorCodes.Resolution.CUSTOMER.getNumber());
            return this;
        }
    }

    public WhisperJoinPeripheralDeviceDetailsV2(Builder builder) {
        super(builder);
        this.mDistressCode = builder.mDistressCode;
        this.mWJError = builder.mWJError;
    }

    public byte getDistressCode() {
        return this.mDistressCode;
    }

    public String getDistressErrorCode() {
        WJError wJError = this.mWJError;
        if (wJError != null) {
            return wJError.getErrorCode();
        }
        return null;
    }

    public WJError getDistressErrorObject() {
        return this.mWJError;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails
    public boolean isDistressed() {
        return true;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails
    public String toString() {
        return super.toString() + "\n mDistressCode: " + ((int) this.mDistressCode);
    }
}
