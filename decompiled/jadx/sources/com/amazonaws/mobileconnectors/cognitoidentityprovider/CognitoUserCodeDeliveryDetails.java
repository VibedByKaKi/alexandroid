package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import com.amazonaws.services.cognitoidentityprovider.model.CodeDeliveryDetailsType;
import com.amazonaws.services.cognitoidentityprovider.model.MFAOptionType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CognitoUserCodeDeliveryDetails {
    private final String attributeName;
    private final String deliveryMedium;
    private final String destination;

    public CognitoUserCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetailsType) {
        if (codeDeliveryDetailsType != null) {
            this.destination = codeDeliveryDetailsType.getDestination();
            this.deliveryMedium = codeDeliveryDetailsType.getDeliveryMedium();
            this.attributeName = codeDeliveryDetailsType.getAttributeName();
        } else {
            this.destination = null;
            this.deliveryMedium = null;
            this.attributeName = null;
        }
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    public String getDestination() {
        return this.destination;
    }

    public CognitoUserCodeDeliveryDetails(MFAOptionType mFAOptionType) {
        if (mFAOptionType != null) {
            this.destination = null;
            this.deliveryMedium = mFAOptionType.getDeliveryMedium();
            this.attributeName = mFAOptionType.getAttributeName();
        } else {
            this.destination = null;
            this.deliveryMedium = null;
            this.attributeName = null;
        }
    }

    public CognitoUserCodeDeliveryDetails(String str, String str2, String str3) {
        this.destination = str;
        this.deliveryMedium = str2;
        this.attributeName = str3;
    }
}
