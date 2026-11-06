package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import com.amazon.whisperjoin.common.sharedtypes.error.CommonErrorDetails;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.DataSerializationError;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CommonErrorDetailsProvider {
    public static int getCommonErrorDetails(Throwable th) {
        return th instanceof TimeoutException ? CommonErrorDetails.TIMEOUT_EXCEPTION : th instanceof DataSerializationError ? CommonErrorDetails.SERIALIZATION_ERROR : th instanceof IllegalStateException ? CommonErrorDetails.ILLEGAL_STATE_EXCEPTION : th instanceof IllegalArgumentException ? CommonErrorDetails.ILLEGAL_ARGUMENT_EXCEPTION : th instanceof IOException ? CommonErrorDetails.IO_EXCEPTION : th instanceof NullPointerException ? CommonErrorDetails.NULL_POINTER_EXCEPTION : CommonErrorDetails.UNKNOWN;
    }
}
