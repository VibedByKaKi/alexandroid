package com.google.android.gms.tflite;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.tensorflow.lite.DataType;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzb {
    public static String zza(DataType dataType) {
        switch (zza.zza[dataType.ordinal()]) {
            case 1:
                return TypedValues.Custom.S_FLOAT;
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return "long";
            case 7:
                return "bool";
            case 8:
                return TypedValues.Custom.S_STRING;
            default:
                String valueOf = String.valueOf(dataType);
                Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 46), "DataType error: DataType ", valueOf, " is not supported yet"));
                return null;
        }
    }
}
