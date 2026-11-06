package com.amazon.alexa.featureservice.implementation;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.databinding.BaseObservable;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.marketplace.api.Marketplace;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Realm extends BaseObservable {
    private static final String TAG = "FeatService_Realm";
    private String countryOfResidence = null;
    private Marketplace preferredMarketplace = null;

    @Nullable
    public String getCountryOfResidence() {
        return this.countryOfResidence;
    }

    @Nullable
    public Marketplace getPreferredMarketplace() {
        return this.preferredMarketplace;
    }

    @VisibleForTesting
    public String printAttributes() {
        String str = this.countryOfResidence;
        if (str == null) {
            str = "unknown";
        }
        Marketplace marketplace = this.preferredMarketplace;
        return a$$ExternalSyntheticOutline0.m("{ CoR = ", str, ", PFM = ", marketplace != null ? marketplace.getMarketplaceName().getMarketplaceName() : "unknown", " }");
    }

    public void updateWithUserIdentity(@Nullable UserIdentity userIdentity) {
        new StringBuilder("Updating realm from ").append(printAttributes());
        String countryOfResidence = userIdentity != null ? userIdentity.getCountryOfResidence() : null;
        Marketplace effectiveMarketplace = userIdentity != null ? userIdentity.getEffectiveMarketplace() : null;
        boolean z = (Objects.equals(this.countryOfResidence, countryOfResidence) && Objects.equals(this.preferredMarketplace, effectiveMarketplace)) ? false : true;
        this.countryOfResidence = countryOfResidence;
        this.preferredMarketplace = effectiveMarketplace;
        new StringBuilder("Updating realm to ").append(printAttributes());
        if (z) {
            notifyChange();
        }
    }
}
