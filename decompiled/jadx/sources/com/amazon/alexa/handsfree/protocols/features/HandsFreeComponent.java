package com.amazon.alexa.handsfree.protocols.features;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.data.registry.NativeFeatureRegistry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum HandsFreeComponent {
    EDGESV_DECOUPLING("ALEXA_HANDS_FREE_1PSV_DECOUPLING"),
    ALEXA_VOX_TTA(NativeFeatureRegistry.ALEXA_VOX_ANDROID_TTA_I18N_LAUNCH),
    ALEXA_HANDS_FREE_BARGE_IN_SETTING("ALEXA_HANDS_FREE_BARGE_IN_SETTING"),
    EDGESV_VISUAL_FOCUS(NativeFeatureRegistry.EDGESV_VISUAL_FOCUS),
    ALEXA_HANDS_FREE_ENROLLMENT_UTTERANCES_SYNC("ALEXA_HANDS_FREE_ENROLLMENT_UTTERANCES_SYNC"),
    ENABLE_SYNCED_AHF_AND_IN_APP_WW(NativeFeatureRegistry.ALEXA_HANDS_FREE_FEATURE_ENABLE_SYNCED_AHF_AND_IN_APP_WW),
    AHF_NATIVE_CALLING_API_31(NativeFeatureRegistry.ALEXA_HANDS_FREE_FEATURE_GATING_AHF_NATIVE_CALLING_API_31),
    REMOVE_AHF_FOR_ALL_CUSTOMERS(NativeFeatureRegistry.ALEXA_HANDS_FREE_FEATURE_DISABLE_AHF_FOR_ALL_CUSTOMER);


    @VisibleForTesting
    static final Map<String, String> EDGE_SV_DEVICE_TYPE_TO_WEBLAB_NAME_MAP;
    private final List<String> mWeblabList;

    static {
        HashMap m = Automotive$$ExternalSyntheticOutline0.m("A1A8D9TH2JLMY7", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_OCTO9_TMO", "A2U9HK24KBBJ6I", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_LG_V60");
        m.put("A3QTUFK1IX60UG", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_XIAOMI_J19C_IN");
        m.put("A397JMI912TLOB", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_XIAOMI_J19C_EU");
        m.put("A313JHO9IQ6CSD", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_MOTO_KIEV_PREPAID_VZW");
        m.put("A3I2H4248NTYG1", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_MOTO_KIEV_POSTPAID_VZW");
        m.put("A22R8RTCOP5HPU", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_XIAOMI_K3S_EU");
        m.put("A1DSRHFJ0NJSFI", "ALEXA_HANDS_FREE_1PSV_FEATURE_GATING_MOTO_BERLIN_VZW");
        m.put("A274K08XZ7WEP7", "ALEXA_HANDS_FREE_FEATURE_GATING_MOTO_EDGE_PLUS");
        m.put("A385N2NS941X66", "ALEXA_HANDS_FREE_FEATURE_GATING_OPPO_OVALTINE_IN");
        m.put("AF9Q77337XUC", "ALEXA_HANDS_FREE_FEATURE_GATING_OPPO_OVALTINE_EU");
        m.put("AJ95PTHORTDQC", "ALEXA_HANDS_FREE_FEATURE_GATING_OPPO_OVALTINE_TMO");
        m.put("A1AW53XL0YA9HG", "ALEXA_HANDS_FREE_FEATURE_GATING_MOTO_MILAN_5G_NA");
        EDGE_SV_DEVICE_TYPE_TO_WEBLAB_NAME_MAP = Collections.unmodifiableMap(m);
    }

    HandsFreeComponent(@NonNull String... strArr) {
        this.mWeblabList = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    @Nullable
    public static String getEdgeSVWeblabNameFromDeviceType(@NonNull String str) {
        return EDGE_SV_DEVICE_TYPE_TO_WEBLAB_NAME_MAP.get(str);
    }

    @NonNull
    public List<String> getAlexaWeblabListByComponent() {
        return this.mWeblabList;
    }
}
