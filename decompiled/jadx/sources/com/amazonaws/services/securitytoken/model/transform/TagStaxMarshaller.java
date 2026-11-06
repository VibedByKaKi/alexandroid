package com.amazonaws.services.securitytoken.model.transform;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.Tag;
import com.amazonaws.util.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TagStaxMarshaller {
    private static TagStaxMarshaller instance;

    public static TagStaxMarshaller getInstance() {
        if (instance == null) {
            instance = new TagStaxMarshaller();
        }
        return instance;
    }

    public void marshall(Tag tag, Request<?> request, String str) {
        if (tag.getKey() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "Key"), StringUtils.fromString(tag.getKey()));
        }
        if (tag.getValue() != null) {
            request.addParameter(BitVector$$ExternalSyntheticOutline0.m(str, "Value"), StringUtils.fromString(tag.getValue()));
        }
    }
}
