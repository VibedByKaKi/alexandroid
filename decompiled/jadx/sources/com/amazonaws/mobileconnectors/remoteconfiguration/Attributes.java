package com.amazonaws.mobileconnectors.remoteconfiguration;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface Attributes extends Cloneable {
    public static final String PREDEFINED_ATTRIBUTE_PREFIX = "_";

    void addAttribute(String str, Boolean bool);

    void addAttribute(String str, Double d);

    void addAttribute(String str, Integer num);

    void addAttribute(String str, Long l);

    void addAttribute(String str, String str2);

    Attributes clone();

    Map<String, Object> getAllAttributes();

    Boolean getBoolean(String str);

    Double getDouble(String str);

    Integer getInt(String str);

    Long getLong(String str);

    String getString(String str);

    Object remove(String str);
}
