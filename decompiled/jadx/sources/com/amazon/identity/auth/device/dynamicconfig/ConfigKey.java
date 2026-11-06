package com.amazon.identity.auth.device.dynamicconfig;

import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum ConfigKey {
    PLACEHOLDER_BOOLEAN("placeholder_boolean", Type.BOOLEAN, Boolean.FALSE),
    PLACEHOLDER_INT("placeholder_int", Type.INT, 0),
    PLACEHOLDER_STRING("placeholder_string", Type.STRING, ""),
    PLACEHOLDER_STRING_LIST("placeholder_string_list", Type.STRING_LIST, Collections.EMPTY_LIST);

    private final Object mDefaultValue;
    private final String mKey;
    private final Type mType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        BOOLEAN,
        INT,
        STRING,
        STRING_LIST
    }

    ConfigKey(String str, Type type, Object obj) {
        this.mKey = str;
        this.mType = type;
        this.mDefaultValue = obj;
    }

    public <T> T defaultValue() {
        return (T) this.mDefaultValue;
    }

    public String key() {
        return this.mKey;
    }

    public Type type() {
        return this.mType;
    }
}
