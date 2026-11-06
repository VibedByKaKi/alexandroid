package com.dee.app.contacts.interfaces.models.data.enums;

import com.amazon.clouddrive.cdasdk.aps.account.FeatureState;
import com.amazon.deecomms.common.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
/* loaded from: classes6.dex */
public enum DropInState {
    ON("enabled"),
    OFF(FeatureState.DISABLED);


    @JsonProperty(Constants.CONTACT_PREF_DROP_IN)
    private final String value;

    DropInState(String str) {
        this.value = str;
    }

    public static DropInState fromValue(String str) {
        for (DropInState dropInState : values()) {
            if (dropInState.value.equals(str)) {
                return dropInState;
            }
        }
        return OFF;
    }
}
