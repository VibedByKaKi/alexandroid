package com.google.android.gms.tflite.dynamite;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.tflite.zzy;
import com.google.android.gms.internal.tflite.zzz;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.dynamite.internal.zzh;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class TfLiteDynamite {
    private TfLiteDynamite() {
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static Executor createDefaultExecutor() {
        com.google.android.gms.internal.tflite.zzf.zza();
        zzy zzyVar = new zzy();
        zzyVar.zza("TFLiteClient-%d");
        ThreadFactory zzb = zzyVar.zzb();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzb);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static TfLiteClient getClient(@NonNull Context context, int i, @NonNull Executor executor) {
        zzz zzzVar;
        switch (i) {
            case 0:
                zzzVar = zzz.CUSTOMER_UNKNOWN;
                break;
            case 1:
                zzzVar = zzz.CUSTOMER_3P_JAVA_API;
                break;
            case 2:
                zzzVar = zzz.CUSTOMER_3P_TASKS_JAVA_API;
                break;
            case 3:
                zzzVar = zzz.CUSTOMER_BLUESKY;
                break;
            case 4:
                zzzVar = zzz.CUSTOMER_HULK;
                break;
            case 5:
                zzzVar = zzz.CUSTOMER_LEIBNIZ;
                break;
            case 6:
                zzzVar = zzz.CUSTOMER_BARHOPPER;
                break;
            case 7:
                zzzVar = zzz.CUSTOMER_MLKIT_CUSTOM_ICA;
                break;
            case 8:
                zzzVar = zzz.CUSTOMER_MLKIT_NLCLASSIFIER;
                break;
            case 9:
                zzzVar = zzz.CUSTOMER_USERPROFILE;
                break;
            case 10:
                zzzVar = zzz.CUSTOMER_TEST;
                break;
            case 11:
                zzzVar = zzz.CUSTOMER_TASKS_AUDIO;
                break;
            case 12:
                zzzVar = zzz.CUSTOMER_TASKS_TEXT;
                break;
            case 13:
                zzzVar = zzz.CUSTOMER_TASKS_VISION;
                break;
            case 14:
                zzzVar = zzz.CUSTOMER_MLKIT_SMARTREPLY;
                break;
            case 15:
                zzzVar = zzz.CUSTOMER_MLKIT_OCR;
                break;
            case 16:
                zzzVar = zzz.CUSTOMER_MLKIT_IMAGE_CAPTION;
                break;
            case 17:
                zzzVar = zzz.CUSTOMER_MLBENCHMARK;
                break;
            case 18:
                zzzVar = zzz.CUSTOMER_MLKIT_DOCUMENT_DETECTION;
                break;
            case 19:
                zzzVar = zzz.CUSTOMER_TFLITE_DELEGATE_DYNAMITE;
                break;
            case 20:
                zzzVar = zzz.CUSTOMER_ACCELERATION_SERVICE;
                break;
            case 21:
                zzzVar = zzz.CUSTOMER_3P_NATIVE_API;
                break;
            case 22:
                zzzVar = zzz.CUSTOMER_MLKIT_DOCUMENT_STAIN_REMOVER;
                break;
            case 23:
                zzzVar = zzz.CUSTOMER_PHOTOS;
                break;
            case 24:
                zzzVar = zzz.CUSTOMER_MAPS;
                break;
            case 25:
                zzzVar = zzz.CUSTOMER_TENSORGPS;
                break;
            default:
                zzzVar = null;
                break;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("Invalid customer ID ");
        sb.append(i);
        zzh zzhVar = new zzh(context, executor, (zzz) Preconditions.checkNotNull(zzzVar, sb.toString()));
        zzhVar.zza();
        return zzhVar;
    }
}
