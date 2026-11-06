package com.amazon.deecomms.calling.enums;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.biloba.utils.CommsHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CallType {
    NONE("unknown", false, false, false, false),
    AUDIO("audio", true, false, false, false),
    AUDIO_DROP_IN(CommsHelper.COMMS_DROPIN, true, false, true, false),
    AUDIO_DEVICE_TARGETED_DROP_IN("deviceTargetedDropIn", true, false, true, true),
    VIDEO("video", true, true, false, false),
    VIDEO_DROP_IN(CommsHelper.COMMS_DROPIN, true, true, true, false),
    VIDEO_DEVICE_TARGETED_DROP_IN("deviceTargetedDropIn", true, true, true, true),
    PSTN("cobo", false, false, false, false),
    VOX_AUDIO(AUDIO, true),
    VOX_AUDIO_DROP_IN(AUDIO_DROP_IN, true),
    VOX_AUDIO_DEVICE_TARGETED_DROP_IN(AUDIO_DEVICE_TARGETED_DROP_IN, true),
    VOX_VIDEO(VIDEO, true),
    VOX_VIDEO_DROP_IN(VIDEO_DROP_IN, true),
    VOX_VIDEO_DEVICE_TARGETED_DROP_IN(VIDEO_DEVICE_TARGETED_DROP_IN, true),
    VOX_PSTN(PSTN, true);

    private final boolean fromVox;
    private final boolean isA2A;
    private final boolean isDeviceTargeted;
    private final boolean isDropIn;
    private final boolean isVideo;
    private final String metricValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.calling.enums.CallType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$deecomms$calling$enums$CallType;

        static {
            int[] iArr = new int[CallType.values().length];
            $SwitchMap$com$amazon$deecomms$calling$enums$CallType = iArr;
            try {
                iArr[CallType.PSTN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallType[CallType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallType[CallType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallType[CallType.AUDIO_DROP_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallType[CallType.AUDIO_DEVICE_TARGETED_DROP_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallType[CallType.VIDEO_DROP_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallType[CallType.VIDEO_DEVICE_TARGETED_DROP_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    CallType(com.amazon.deecomms.calling.enums.CallType r13, boolean r14) {
        /*
            r10 = this;
            if (r14 == 0) goto L19
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r13.getMetricValue()
            r0.append(r1)
            java.lang.String r1 = "_VOX"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            r4 = r0
            goto L1e
        L19:
            java.lang.String r0 = r13.getMetricValue()
            goto L17
        L1e:
            boolean r5 = r13.isA2A()
            boolean r6 = r13.isVideo()
            boolean r7 = r13.isDropIn()
            boolean r8 = r13.isDeviceTargeted()
            r1 = r10
            r2 = r11
            r3 = r12
            r9 = r14
            r1.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.calling.enums.CallType.<init>(java.lang.String, int, com.amazon.deecomms.calling.enums.CallType, boolean):void");
    }

    @NonNull
    public static CallType compute(boolean z, boolean z2, boolean z3, boolean z4) {
        return !z4 ? PSTN : (z && z2) ? z3 ? VIDEO_DEVICE_TARGETED_DROP_IN : VIDEO_DROP_IN : z2 ? VIDEO : z ? z3 ? AUDIO_DEVICE_TARGETED_DROP_IN : AUDIO_DROP_IN : AUDIO;
    }

    @NonNull
    public static CallType fromBundle(@Nullable Bundle bundle, @NonNull String str) {
        String string;
        if (bundle == null || (string = bundle.getString(str)) == null) {
            return NONE;
        }
        try {
            return valueOf(string);
        } catch (IllegalArgumentException unused) {
            return NONE;
        }
    }

    private static CallType getVoxEquivalent(@NonNull CallType callType) {
        switch (AnonymousClass1.$SwitchMap$com$amazon$deecomms$calling$enums$CallType[callType.ordinal()]) {
            case 1:
                return VOX_PSTN;
            case 2:
                return VOX_VIDEO;
            case 3:
                return VOX_AUDIO;
            case 4:
                return VOX_AUDIO_DROP_IN;
            case 5:
                return VOX_AUDIO_DEVICE_TARGETED_DROP_IN;
            case 6:
                return VOX_VIDEO_DROP_IN;
            case 7:
                return VOX_VIDEO_DEVICE_TARGETED_DROP_IN;
            default:
                return callType;
        }
    }

    @NonNull
    public String getMetricValue() {
        return this.metricValue;
    }

    public boolean isA2A() {
        return this.isA2A;
    }

    public boolean isAudio() {
        return !this.isVideo;
    }

    public boolean isDeviceTargeted() {
        return this.isDeviceTargeted;
    }

    public boolean isDropIn() {
        return this.isDropIn;
    }

    public boolean isFromVox() {
        return this.fromVox;
    }

    public boolean isVideo() {
        return this.isVideo;
    }

    @NonNull
    public static CallType compute(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        CallType compute = compute(z, z2, z3, z4);
        return z5 ? getVoxEquivalent(compute) : compute;
    }

    CallType(@NonNull String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.metricValue = str;
        this.isA2A = z;
        this.isVideo = z2;
        this.isDropIn = z3;
        this.isDeviceTargeted = z4;
        this.fromVox = z5;
    }

    CallType(@NonNull String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this(str, z, z2, z3, z4, false);
    }
}
