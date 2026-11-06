package com.amazon.alexa.digitalcommerce.validator;

import com.amazon.alexa.digitalcommerce.api.CustomerAlreadyOwnedException;
import com.amazon.alexa.digitalcommerce.api.CustomerIneligibleException;
import com.amazon.alexa.digitalcommerce.api.GetProductDetailsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"validateProductDetails", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse;", "amazonProductDetails", "checkEligibility", "", "eligibilityStatus", "", "AlexaMobileAndroidDigitalCommerce_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProductDetailsValidatorKt {
    public static final void checkEligibility(@NotNull String str) {
        str.getClass();
        if (Intrinsics.areEqual(str, "CUSTOMER_ALREADY_OWNED")) {
            throw new CustomerAlreadyOwnedException();
        }
        if (Intrinsics.areEqual(str, "INELIGIBLE")) {
            throw new CustomerIneligibleException();
        }
    }

    @NotNull
    public static final GetProductDetailsResponse validateProductDetails(@NotNull GetProductDetailsResponse getProductDetailsResponse) {
        getProductDetailsResponse.getClass();
        checkEligibility(getProductDetailsResponse.getEligibilityStatus());
        return getProductDetailsResponse;
    }
}
