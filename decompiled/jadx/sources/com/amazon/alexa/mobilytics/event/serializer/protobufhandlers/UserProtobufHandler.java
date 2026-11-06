package com.amazon.alexa.mobilytics.event.serializer.protobufhandlers;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider;
import com.amazon.alexa.mobilytics.protobuf.CustomerProto;
import com.amazon.alexa.mobilytics.protobuf.MobilyticsMessageProto;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class UserProtobufHandler implements ProtobufHandler {
    private final MobilyticsUserProvider userProvider;

    @Inject
    public UserProtobufHandler(@NonNull MobilyticsUserProvider mobilyticsUserProvider) {
        this.userProvider = (MobilyticsUserProvider) Preconditions.checkNotNull(mobilyticsUserProvider);
    }

    @Override // com.amazon.alexa.mobilytics.event.serializer.protobufhandlers.ProtobufHandler
    @Nullable
    public MobilyticsMessageProto serialize(@NonNull MobilyticsEvent mobilyticsEvent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        CustomerProto.Builder newBuilder = CustomerProto.newBuilder();
        MobilyticsUser user = this.userProvider.user();
        if (user != null) {
            str = user.directedId();
            str2 = user.marketplaceId();
            str3 = user.personId();
            str4 = user.countryOfResidence();
            str5 = user.personIdv2();
            Iterator it2 = EnumSet.allOf(MobilyticsUser.Attribute.class).iterator();
            while (it2.hasNext()) {
                MobilyticsUser.Attribute attribute = (MobilyticsUser.Attribute) it2.next();
                String attribute2 = user.attribute(attribute);
                if (!TextUtils.isEmpty(attribute2)) {
                    String id = attribute.id();
                    id.getClass();
                    if (id.equals(MetricKeys.META_HASHED_COMMS_ID)) {
                        newBuilder.setHashedCommsId(attribute2);
                    } else if (id.equals("householdId")) {
                        newBuilder.setHouseholdId(attribute2);
                    }
                }
            }
        } else {
            str = "Unknown";
            str2 = "Unknown";
            str3 = str2;
            str4 = str3;
            str5 = str4;
        }
        newBuilder.setDirectedId(str).setMarketplaceId(str2).setPersonId(str3).setCountryOfResidence(str4).setPersonIdv2(str5);
        return MobilyticsMessageProto.newBuilder().setCustomer(newBuilder).build();
    }
}
