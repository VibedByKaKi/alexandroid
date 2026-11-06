package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import android.util.Base64;
import com.amazon.devicesetupservice.reporting.ProvisioningMethod;
import com.amazon.devicesetupservice.reporting.TrustMethod;
import com.amazon.devicesetupservice.v1.ProvisionerInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class RequestInputValidator {
    private static final int ADVERTISEMENT_NONCE_LENGTH = 4;
    private static final int AUTH_MATERIAL_INDEX_LENGTH = 12;
    private static final int PRODUCT_INDEX_LENGTH = 4;
    private static final int SOFTWARE_VERSION_INDEX_MIN_LENGTH = 2;
    private static final Set<String> VALID_PROVISIONING_METHODS = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProvisioningMethod.values())));
    private static final Set<String> VALID_TRUST_METHODS = Collections.unmodifiableSet(new HashSet(Arrays.asList(TrustMethod.values())));

    private RequestInputValidator() {
    }

    private static boolean isBase64Encoded(String str) {
        try {
            Base64.decode(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean isStringAllNumericCharacters(String str) {
        return str.matches("[0-9]+");
    }

    public static void validateAdvertisedSdkVersionIndex(int i) {
        if (i >= 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("AdvertisedSdkVersionIndex cannot be negative");
    }

    public static void validateAdvertisementNonce(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Advertisement Nonce can not be null");
            return;
        }
        if (str.length() != 4) {
            Locale locale = Locale.ENGLISH;
            Single$$ExternalSyntheticBUOutline0.m$3("Advertisement Nonce has to be exactly 4 characters");
        } else {
            if (isBase64Encoded(str)) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Advertisement Nonce must be base64 encoded");
        }
    }

    public static void validateAuthMaterialIndex(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Auth Material Index can not be null");
            return;
        }
        if (!isBase64Encoded(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Auth Material Index has to be Base64 encoded");
        } else {
            if (str.length() == 12) {
                return;
            }
            Locale locale = Locale.ENGLISH;
            Single$$ExternalSyntheticBUOutline0.m$3("Auth Material Index has to be exactly 12 characters");
        }
    }

    public static void validateBarcodeData(String str) {
        if (str != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Barcode data can not be null");
    }

    public static void validateDeviceName(String str) {
        if (str != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Device Name can not be null");
    }

    public static void validateProductIndex(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Product Index can not be null");
        } else {
            if (str.length() == 4) {
                return;
            }
            Locale locale = Locale.ENGLISH;
            Single$$ExternalSyntheticBUOutline0.m$3("Product Index is required to be exactly 4 characters");
        }
    }

    public static void validateProvisionerApplicationName(String str) {
        if (str != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Provisioner Application Name can not be null");
    }

    public static void validateProvisionerApplicationVersion(String str) {
        if (str != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Provisioner Application Version can not be null");
    }

    public static void validateProvisionerInfo(ProvisionerInfo provisionerInfo) {
        if (provisionerInfo != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("ProvisionerInfo can not be null");
    }

    public static void validateProvisioningMethod(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("provisioningMethod can not be null");
        } else {
            if (VALID_PROVISIONING_METHODS.contains(str)) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("invalid provisioningMethod");
        }
    }

    public static void validateRSSI(int i) {
        if (i >= 0 || i < -255) {
            Locale locale = Locale.ENGLISH;
            Single$$ExternalSyntheticBUOutline0.m$3("RSSI is not within the valid range of 0 to -255");
        }
    }

    public static void validateSoftwareVersionIndex(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Software Version Index can not be null");
            return;
        }
        if (str.length() < 2) {
            Locale locale = Locale.ENGLISH;
            Single$$ExternalSyntheticBUOutline0.m$3("Software Version Index has to be 2 or more characters");
        } else {
            if (isStringAllNumericCharacters(str)) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Software Version Index must be all numeric characters");
        }
    }

    public static void validateTrustMethod(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("trustMethod can not be null");
        } else {
            if (VALID_TRUST_METHODS.contains(str)) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("invalid trustMethod");
        }
    }
}
