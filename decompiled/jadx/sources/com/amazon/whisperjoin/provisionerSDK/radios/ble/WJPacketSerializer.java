package com.amazon.whisperjoin.provisionerSDK.radios.ble;

import com.amazon.whisperjoin.common.sharedtypes.ble.WhisperJoinBlePacket;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface WJPacketSerializer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultWJPacketSerializer implements WJPacketSerializer {
        @Override // com.amazon.whisperjoin.provisionerSDK.radios.ble.WJPacketSerializer
        public List<WhisperJoinBlePacket> serialize(byte[] bArr) {
            return WhisperJoinBlePacket.createPackets(bArr);
        }
    }

    List<WhisperJoinBlePacket> serialize(byte[] bArr);
}
