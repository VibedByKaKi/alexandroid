package com.amazon.whisperjoin.common.sharedtypes.devices;

import com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WhisperJoinPeripheralDeviceDetailsEsim extends WhisperJoinPeripheralDeviceDetails {
    private final byte mPurposeCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder extends WhisperJoinPeripheralDeviceDetails.Builder {
        private byte mPurposeCode = 0;

        @Override // com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails.Builder
        public WhisperJoinPeripheralDeviceDetailsEsim build() {
            return new WhisperJoinPeripheralDeviceDetailsEsim(this);
        }

        public Builder withPurposeCode(byte b) {
            this.mPurposeCode = b;
            return this;
        }
    }

    public WhisperJoinPeripheralDeviceDetailsEsim(Builder builder) {
        super(builder);
        this.mPurposeCode = builder.mPurposeCode;
    }

    public byte getPurposeCode() {
        return this.mPurposeCode;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails
    public boolean isEsimSession() {
        return true;
    }

    @Override // com.amazon.whisperjoin.common.sharedtypes.devices.WhisperJoinPeripheralDeviceDetails
    public String toString() {
        return super.toString() + "\n mPurposeCode: " + ((int) this.mPurposeCode);
    }
}
