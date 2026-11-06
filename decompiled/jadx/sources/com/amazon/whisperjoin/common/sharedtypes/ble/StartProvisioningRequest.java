package com.amazon.whisperjoin.common.sharedtypes.ble;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.security.SecureRandom;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StartProvisioningRequest {
    private static final String TAG = "StartProvisioningRequest";
    private int mRequestID;

    public StartProvisioningRequest(int i) {
        this.mRequestID = i;
    }

    public static StartProvisioningRequest createRequest() {
        return new StartProvisioningRequest(new SecureRandom().nextInt());
    }

    public int getRequestID() {
        return this.mRequestID;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("StartProvisioningRequest [id="), this.mRequestID, MarkdownConstants.RIGHT_BRACKET);
    }
}
