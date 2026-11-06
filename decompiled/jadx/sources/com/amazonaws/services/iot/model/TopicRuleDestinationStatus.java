package com.amazonaws.services.iot.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum TopicRuleDestinationStatus {
    ENABLED("ENABLED"),
    IN_PROGRESS("IN_PROGRESS"),
    DISABLED("DISABLED"),
    ERROR("ERROR"),
    DELETING("DELETING");

    private static final Map<String, TopicRuleDestinationStatus> enumMap;
    private String value;

    static {
        TopicRuleDestinationStatus topicRuleDestinationStatus = ENABLED;
        TopicRuleDestinationStatus topicRuleDestinationStatus2 = IN_PROGRESS;
        TopicRuleDestinationStatus topicRuleDestinationStatus3 = DISABLED;
        TopicRuleDestinationStatus topicRuleDestinationStatus4 = ERROR;
        TopicRuleDestinationStatus topicRuleDestinationStatus5 = DELETING;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ENABLED", topicRuleDestinationStatus);
        hashMap.put("IN_PROGRESS", topicRuleDestinationStatus2);
        hashMap.put("DISABLED", topicRuleDestinationStatus3);
        hashMap.put("ERROR", topicRuleDestinationStatus4);
        hashMap.put("DELETING", topicRuleDestinationStatus5);
    }

    TopicRuleDestinationStatus(String str) {
        this.value = str;
    }

    public static TopicRuleDestinationStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, TopicRuleDestinationStatus> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Cannot create enum from ", str, " value!"));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
