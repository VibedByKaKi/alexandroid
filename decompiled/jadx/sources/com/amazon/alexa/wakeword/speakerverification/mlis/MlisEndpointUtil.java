package com.amazon.alexa.wakeword.speakerverification.mlis;

import androidx.annotation.VisibleForTesting;
import com.amazon.credentiallocker.CustomerRegion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class MlisEndpointUtil {
    static final String EU_MLIS_ENDPOINT = "https://mlis.amazon.eu/v1";
    static final String FE_MLIS_ENDPOINT = "https://mlis.amazon.co.jp/v1";

    @VisibleForTesting
    static final String NA_MLIS_ENDPOINT = "https://mlis.amazon.com/v1";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RegionEndpoint {
        EU(CustomerRegion.EU, MlisEndpointUtil.EU_MLIS_ENDPOINT),
        FE("FE", MlisEndpointUtil.FE_MLIS_ENDPOINT),
        NA(CustomerRegion.NA, MlisEndpointUtil.NA_MLIS_ENDPOINT);

        private final String endPoint;
        private final String region;

        RegionEndpoint(String str, String str2) {
            this.region = str;
            this.endPoint = str2;
        }

        public static RegionEndpoint fromRegion(String str) {
            str.getClass();
            switch (str) {
            }
            return NA;
        }

        public String getEndPoint() {
            return this.endPoint;
        }

        public String getRegion() {
            return this.region;
        }
    }

    private MlisEndpointUtil() {
    }
}
