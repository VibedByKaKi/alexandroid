package com.amazon.alexa.voice.ui.player;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.annotation.DrawableRes;
import com.amazon.alexa.voice.ui.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum AudioProviderIcon {
    AMAZON_MUSIC,
    DHITS,
    UTA_PASS,
    SAAVN,
    AUDIBLE,
    KINDLE,
    DEEZER;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.ui.player.AudioProviderIcon$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon;

        static {
            int[] iArr = new int[AudioProviderIcon.values().length];
            $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon = iArr;
            try {
                iArr[AudioProviderIcon.AMAZON_MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon[AudioProviderIcon.DHITS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon[AudioProviderIcon.UTA_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon[AudioProviderIcon.SAAVN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon[AudioProviderIcon.AUDIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon[AudioProviderIcon.KINDLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon[AudioProviderIcon.DEEZER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static AudioProviderIcon fromString(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @DrawableRes
    public int getDrawableResourceId() {
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$voice$ui$player$AudioProviderIcon[ordinal()]) {
            case 1:
                return R.drawable.ic_logo_amazonmusic;
            case 2:
                return R.drawable.ic_logo_dhits;
            case 3:
                return R.drawable.ic_logo_utapass;
            case 4:
                return R.drawable.ic_logo_saavn;
            case 5:
                return R.drawable.ic_logo_audible;
            case 6:
                return R.drawable.ic_logo_kindle;
            case 7:
                return R.drawable.ic_logo_deezer;
            default:
                OnnxMap$$ExternalSyntheticBUOutline0.m(this, "Unknown drawable resource id: ");
                return 0;
        }
    }
}
