package com.google.android.gms.internal.mlkit_vision_barcode;

import org.eclipse.paho.client.mqttv3.MqttException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzxd extends zzxl {
    private int zza;
    private int zzb;
    private float zzc;
    private float zzd;
    private boolean zze;
    private float zzf;
    private float zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private float zzk;
    private float zzl;
    private short zzm;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zza(boolean z) {
        this.zzj = true;
        this.zzm = (short) (this.zzm | 512);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzb(float f) {
        this.zzg = 0.8f;
        this.zzm = (short) (this.zzm | 64);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzc(float f) {
        this.zzf = 0.5f;
        this.zzm = (short) (this.zzm | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzd(float f) {
        this.zzd = 0.8f;
        this.zzm = (short) (this.zzm | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zze(int i) {
        this.zzb = 5;
        this.zzm = (short) (this.zzm | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzf(float f) {
        this.zzc = 0.25f;
        this.zzm = (short) (this.zzm | 4);
        return this;
    }

    public final zzxl zzg(int i) {
        this.zza = 10;
        this.zzm = (short) (this.zzm | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzh(long j) {
        this.zzi = 3000L;
        this.zzm = (short) (this.zzm | 256);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzi(boolean z) {
        this.zze = z;
        this.zzm = (short) (this.zzm | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzj(float f) {
        this.zzk = 0.1f;
        this.zzm = (short) (this.zzm | 1024);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzk(long j) {
        this.zzh = 1500L;
        this.zzm = (short) (this.zzm | MqttException.REASON_CODE_SUBSCRIBE_FAILED);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxl zzl(float f) {
        this.zzl = 0.05f;
        this.zzm = (short) (this.zzm | 2048);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final zzxm zzm() {
        if (this.zzm == 4095) {
            return new zzxf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzm & 1) == 0) {
            sb.append(" recentFramesToCheck");
        }
        if ((this.zzm & 2) == 0) {
            sb.append(" recentFramesContainingPredictedArea");
        }
        if ((this.zzm & 4) == 0) {
            sb.append(" recentFramesIou");
        }
        if ((this.zzm & 8) == 0) {
            sb.append(" maxCoverage");
        }
        if ((this.zzm & 16) == 0) {
            sb.append(" useConfidenceScore");
        }
        if ((this.zzm & 32) == 0) {
            sb.append(" lowerConfidenceScore");
        }
        if ((this.zzm & 64) == 0) {
            sb.append(" higherConfidenceScore");
        }
        if ((this.zzm & MqttException.REASON_CODE_SUBSCRIBE_FAILED) == 0) {
            sb.append(" zoomIntervalInMillis");
        }
        if ((this.zzm & 256) == 0) {
            sb.append(" resetIntervalInMillis");
        }
        if ((this.zzm & 512) == 0) {
            sb.append(" enableZoomThreshold");
        }
        if ((this.zzm & 1024) == 0) {
            sb.append(" zoomInThreshold");
        }
        if ((this.zzm & 2048) == 0) {
            sb.append(" zoomOutThreshold");
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
