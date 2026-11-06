package com.amazon.alexa.sharing.api.model;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.sharing.repo.models.Result;
import com.amazon.commsnetworking.api.INetworkResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ResultHandler {
    private final String sourceClass;

    public ResultHandler(@NonNull String str) {
        this.sourceClass = str;
    }

    public Result exceptionOccurredResponse(String str) {
        Result result = new Result();
        result.setSuccess(false);
        result.setErrorMessage(DoubleList$$ExternalSyntheticOutline0.m(new StringBuilder(), this.sourceClass, ".", str, " not successful"));
        return result;
    }

    public Result processNetworkResponse(INetworkResponse iNetworkResponse, String str) {
        Result result = new Result();
        if (iNetworkResponse != null && iNetworkResponse.isSuccessful()) {
            result.setSuccess(true);
            return result;
        }
        Log.e(this.sourceClass + "." + str, "was not successful");
        result.setSuccess(false);
        result.setErrorMessage(DoubleList$$ExternalSyntheticOutline0.m(new StringBuilder(), this.sourceClass, ".", str, " not successful"));
        return result;
    }
}
