package com.google.android.gms.tflite;

import org.tensorflow.lite.DataType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final /* synthetic */ class zza {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[DataType.values().length];
        zza = iArr;
        try {
            iArr[DataType.FLOAT32.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[DataType.INT32.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[DataType.INT16.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[DataType.INT8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zza[DataType.UINT8.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zza[DataType.INT64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zza[DataType.BOOL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zza[DataType.STRING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
