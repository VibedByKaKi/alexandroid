package com.amazon.alexa.digitalcommerce.iap;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/iap/IAPConstants;", "", "<init>", "()V", "PROD_EMP_PRODUCT_ID", "", "PROD_EMP_SKU", "PREVIEW_EMP_PRODUCT_ID", "PREVIEW_EMP_SKU", "PREVIEW_FLAVOR", "ALEXA_PLUS_MARKETPLACE_ASINS", "", "getALEXA_PLUS_MARKETPLACE_ASINS", "()Ljava/util/Set;", "HOME_NAMESPACE", "NOTIFICATION_LENGTH", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IAPConstants {

    @NotNull
    public static final String HOME_NAMESPACE = "ALEXA_MOBILE_HOME_FRONTEND";

    @NotNull
    public static final String NOTIFICATION_LENGTH = "ALEXA_MOBILE_IAP_NOTIFICATION_LENGTH";

    @NotNull
    public static final String PREVIEW_EMP_PRODUCT_ID = "com.amazon.alexa.subscription.test";

    @NotNull
    public static final String PREVIEW_EMP_SKU = "amzn1.emp.provider.google-in-app:com.amazon.alexa.subscription.test";

    @NotNull
    public static final String PREVIEW_FLAVOR = "preview";

    @NotNull
    public static final String PROD_EMP_PRODUCT_ID = "com.amazon.alexa.android.subscription";

    @NotNull
    public static final String PROD_EMP_SKU = "amzn1.emp.provider.google-in-app:com.amazon.alexa.android.subscription";

    @NotNull
    public static final IAPConstants INSTANCE = new IAPConstants();

    @NotNull
    private static final Set<String> ALEXA_PLUS_MARKETPLACE_ASINS = SetsKt.setOf((Object[]) new String[]{"B0CX1MMRQ1", "B0F2MGFBDB", "B0F9XGVBX5", "B0F9XDKZ1B", "B0FL88H942", "B0F9XHKT64", "B0F9XH16P5", "B0F9XHFH3T"});

    private IAPConstants() {
    }

    @NotNull
    public final Set<String> getALEXA_PLUS_MARKETPLACE_ASINS() {
        return ALEXA_PLUS_MARKETPLACE_ASINS;
    }
}
