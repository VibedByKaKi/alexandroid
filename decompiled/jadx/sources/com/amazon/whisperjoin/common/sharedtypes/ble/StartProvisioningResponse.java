package com.amazon.whisperjoin.common.sharedtypes.ble;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.collect.ImmutableMap;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StartProvisioningResponse {
    public static final byte DENIED_ACTIVELY_PROVISIONING_ALREADY = 1;
    public static final byte DENIED_INTERNAL_ERROR = 2;
    public static final byte GRANTED = 0;
    private static final Map<Byte, String> STATUS_MAP = ImmutableMap.builder().put((byte) 0, "Granted.").put((byte) 1, "Denied, active provisioning already started.").put((byte) 2, "Denied, internal error.").build();
    private static final String TAG = "StartProvisioningResponse";
    private final int mRequestID;
    private final byte mStatus;

    public StartProvisioningResponse(int i, byte b) {
        if (!STATUS_MAP.containsKey(Byte.valueOf(b))) {
            Single$$ExternalSyntheticBUOutline0.m$3("status must align with one of the pre-defined values.");
            throw null;
        }
        this.mRequestID = i;
        this.mStatus = b;
    }

    public int getRequestID() {
        return this.mRequestID;
    }

    public byte getStatus() {
        return this.mStatus;
    }

    public String getStatusMessage() {
        return STATUS_MAP.get(Byte.valueOf(this.mStatus));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartProvisioningResponse [id=");
        sb.append(this.mRequestID);
        sb.append(", status=");
        return a$$ExternalSyntheticOutline0.m(sb, STATUS_MAP.get(Byte.valueOf(this.mStatus)), MarkdownConstants.RIGHT_BRACKET);
    }
}
