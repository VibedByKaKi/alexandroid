package com.amazon.alexa.identity;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.identity.api.Mapper;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.marketplace.api.Marketplace;
import com.amazon.alexa.protocols.features.FeatureConstraints;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class UserIdentityMapper implements Mapper<UserIdentityDTO, UserIdentity> {
    private static final String TAG = Utils.tag(UserIdentityMapper.class);
    private final FeatureConstraints constraints;

    public UserIdentityMapper(@NonNull FeatureConstraints featureConstraints) {
        this.constraints = featureConstraints;
    }

    @Override // com.amazon.alexa.identity.api.Mapper
    public UserIdentity map(@NonNull UserIdentityDTO userIdentityDTO) {
        UserIdentity.Builder withOriginalMarketplace = UserIdentity.builder().withId(userIdentityDTO.id).withName(userIdentityDTO.fullName).withEmail(userIdentityDTO.email).withOriginalMarketplace(Marketplace.findMarketplaceById(userIdentityDTO.marketPlaceId, null));
        String str = userIdentityDTO.marketPlaceId;
        Marketplace marketplace = Marketplace.USA;
        UserIdentity build = withOriginalMarketplace.withMarketplace(Marketplace.findMarketplaceById(str, marketplace)).withCountryOfResidence(userIdentityDTO.countryOfResidence).withEffectiveMarketplace(TextUtils.isEmpty(userIdentityDTO.effectiveMarketPlaceId) ? null : Marketplace.findMarketplaceById(userIdentityDTO.effectiveMarketPlaceId, marketplace)).hasActiveDevices(userIdentityDTO.hasActiveDopplers.booleanValue()).hasAcceptedEula(userIdentityDTO.eulaAcceptance.booleanValue()).build();
        String[] strArr = userIdentityDTO.features;
        int length = strArr != null ? strArr.length : 0;
        Log.i(TAG, "IdentityV2 : Updated user with " + length + " features");
        return UserIdentity.from(build).withFeatures(this.constraints.apply(build, userIdentityDTO.features)).build();
    }
}
