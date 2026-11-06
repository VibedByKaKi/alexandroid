package com.dee.app.contacts.common.utils;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RequestQueryParam {
    private static final String REQUEST_QUERY_ARRAY_JOINER = ",";
    private static final String REQUEST_QUERY_KEY_VALUES_JOINER = "&";
    private static final String REQUEST_QUERY_KEY_VALUE_FORMAT = "%s=%s";
    private List<String> keyValues = new ArrayList();

    public void addKeyValue(String str, List<String> list) {
        this.keyValues.add(str + "=" + StringUtils.join(list, ","));
    }

    public String constructRequestQuery() {
        return StringUtils.join(this.keyValues, "&");
    }

    public void addKeyValue(String str, boolean z) {
        this.keyValues.add(str + "=" + z);
    }

    public void addKeyValue(String str, String str2) {
        this.keyValues.add(str + "=" + str2);
    }
}
