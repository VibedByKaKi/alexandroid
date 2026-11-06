package com.amazon.alexa.matter.utils.os;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.common.SimpleBasePlayer$$ExternalSyntheticLambda2;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.alexa.matter.utils.logging.PrefixLogger;
import com.amazon.matter.identity.GetCustomerTimezoneClient;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public class TimezoneBasedCountryCodeSupplier implements CountryCodeSupplier {

    @VisibleForTesting
    static final String DEFAULT_COUNTRY_CODE = "XX";

    @NonNull
    private final Supplier<String> mCountryCodeSupplier;

    @Inject
    public TimezoneBasedCountryCodeSupplier(@NonNull GetCustomerTimezoneClient getCustomerTimezoneClient, @NonNull MatterLogger matterLogger) {
        this.mCountryCodeSupplier = Suppliers.memoize(new SimpleBasePlayer$$ExternalSyntheticLambda2(getCustomerTimezoneClient, matterLogger, 9));
    }

    @NonNull
    @WorkerThread
    private static String getCountryCode(@NonNull GetCustomerTimezoneClient getCustomerTimezoneClient, @NonNull MatterLogger matterLogger) {
        try {
            String countryCode = getCustomerTimezoneClient.getCustomerTimezone().getCountryCode();
            if (countryCode == null) {
                matterLogger.error("The CustomerTimezoneOutput has a null country code; using XX");
                return DEFAULT_COUNTRY_CODE;
            }
            if (!countryCode.isEmpty()) {
                return countryCode;
            }
            matterLogger.error("The CustomerTimezoneOutput has an empty country code; using XX");
            return DEFAULT_COUNTRY_CODE;
        } catch (GetCustomerTimezoneClient.GetCustomerTimezoneException e) {
            matterLogger.error("Failed to resolve the customer's timezone; using country code XX", e);
            return DEFAULT_COUNTRY_CODE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(GetCustomerTimezoneClient getCustomerTimezoneClient, MatterLogger matterLogger) {
        return getCountryCode(getCustomerTimezoneClient, PrefixLogger.scopedTo(TimezoneBasedCountryCodeSupplier.class, matterLogger));
    }

    @Override // com.amazon.alexa.matter.utils.os.CountryCodeSupplier
    @NonNull
    @WorkerThread
    public String getCountryCode() {
        return this.mCountryCodeSupplier.get();
    }
}
