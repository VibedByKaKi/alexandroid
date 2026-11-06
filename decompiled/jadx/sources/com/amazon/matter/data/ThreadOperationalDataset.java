package com.amazon.matter.data;

import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.matter.utils.MatterUtilities;
import com.google.common.primitives.Bytes;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ThreadOperationalDataset {
    private static final String TAG = "OperationalDatasetTLV";
    private int channel;
    private String extendedPanId;
    private String networkKey;
    private String networkName;
    private String panId;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ThreadOperationalDataset(String str, String str2, String str3, String str4, int i) {
        this.networkName = str;
        this.extendedPanId = str2;
        this.networkKey = str3;
        this.panId = str4;
        this.channel = i;
    }

    private byte[] getOperationalDataTLV(OperationalDataParam operationalDataParam, byte[] bArr) {
        if (bArr.length != operationalDataParam.getLength()) {
            Log.w(TAG, "OperationalDataset: Operation Data Param Type (" + ((int) operationalDataParam.getType()) + ") is unexpected length");
        }
        return MatterUtilities.buildTLVByteArray(operationalDataParam.getType(), (byte) bArr.length, bArr);
    }

    public byte[] encodeToTLV() {
        toString();
        byte[] concat = Bytes.concat(getOperationalDataTLV(OperationalDataParam.EXTENDED_PAN_ID, MatterUtilities.hexStringToByteArray(this.extendedPanId)), getOperationalDataTLV(OperationalDataParam.PAN_ID, MatterUtilities.hexStringToByteArray(this.panId)), getOperationalDataTLV(OperationalDataParam.NETWORK_KEY, MatterUtilities.hexStringToByteArray(this.networkKey)), getOperationalDataTLV(OperationalDataParam.CHANNEL, new byte[]{0, 0, (byte) this.channel}), getOperationalDataTLV(OperationalDataParam.NETWORK_NAME, MatterUtilities.stringToHexByteArray(this.networkName)));
        Arrays.toString(concat);
        return concat;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getChannel() {
        return this.channel;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkKey() {
        return this.networkKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkName() {
        return this.networkName;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getPanId() {
        return this.panId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThreadOperationalDataset{networkName='");
        sb.append(this.networkName);
        sb.append("', extendedPanId='");
        sb.append(this.extendedPanId);
        sb.append("', networkKey='");
        sb.append(this.networkKey);
        sb.append("', panId='");
        sb.append(this.panId);
        sb.append("', channel=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.channel, AbstractJsonLexerKt.END_OBJ);
    }
}
