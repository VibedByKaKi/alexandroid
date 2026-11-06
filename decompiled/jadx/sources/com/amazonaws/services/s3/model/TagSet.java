package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TagSet {
    private Map<String, String> tags;

    public TagSet(Map<String, String> map) {
        HashMap hashMap = new HashMap(1);
        this.tags = hashMap;
        hashMap.putAll(map);
    }

    public Map<String, String> getAllTags() {
        return this.tags;
    }

    public String getTag(String str) {
        return this.tags.get(str);
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append("Tags: " + getAllTags());
        stringBuffer.append(StringSubstitutor.DEFAULT_VAR_END);
        return stringBuffer.toString();
    }

    public TagSet() {
        this.tags = new HashMap(1);
    }
}
