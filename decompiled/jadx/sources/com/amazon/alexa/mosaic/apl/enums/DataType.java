package com.amazon.alexa.mosaic.apl.enums;

import com.amazon.alexa.apl.utils.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum DataType {
    DYNAMIC_INDEX_LIST(Constants.DYNAMIC_INDEX_LIST),
    DYNAMIC_TOKEN_LIST(Constants.DYNAMIC_TOKEN_LIST);

    private final String type;

    DataType(String str) {
        this.type = str;
    }

    public String type() {
        return this.type;
    }
}
