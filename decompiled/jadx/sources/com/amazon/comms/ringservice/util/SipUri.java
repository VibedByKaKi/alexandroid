package com.amazon.comms.ringservice.util;

import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.log.CommsLogger;
import com.google.common.base.Strings;
import defpackage.a$$ExternalSyntheticOutline0;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SipUri {
    public static final String PARAM_GR = "gr";
    private String domain;
    private Map<String, String> headers;
    private Map<String, String> params;
    private String password;
    private int port;
    private String scheme;
    private String user;
    private static final CommsLogger log = CommsLogger.getLogger(SipUri.class);
    private static final Pattern SIP_URI_FORMAT = Pattern.compile("<?([^:]*):([^@:]*):?([^@]*)@([^:;>\\?]*):?([0-9]*);?([^>\\?]*)\\??([^>]*)");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SipUriBuilder {
        private String domain;
        private ArrayList<String> headers$key;
        private ArrayList<String> headers$value;
        private ArrayList<String> params$key;
        private ArrayList<String> params$value;
        private String password;
        private int port;
        private String scheme;
        private String user;

        public SipUri build() {
            Map map;
            Map map2;
            ArrayList<String> arrayList = this.params$key;
            int size = arrayList == null ? 0 : arrayList.size();
            if (size == 0) {
                map = Collections.EMPTY_MAP;
            } else if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(this.params$key.size() < 1073741824 ? ((this.params$key.size() - 3) / 3) + this.params$key.size() + 1 : Integer.MAX_VALUE);
                for (int i = 0; i < this.params$key.size(); i++) {
                    linkedHashMap.put(this.params$key.get(i), this.params$value.get(i));
                }
                map = Collections.unmodifiableMap(linkedHashMap);
            } else {
                map = Collections.singletonMap(this.params$key.get(0), this.params$value.get(0));
            }
            Map map3 = map;
            ArrayList<String> arrayList2 = this.headers$key;
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            if (size2 == 0) {
                map2 = Collections.EMPTY_MAP;
            } else if (size2 != 1) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.headers$key.size() < 1073741824 ? this.headers$key.size() + 1 + ((this.headers$key.size() - 3) / 3) : Integer.MAX_VALUE);
                for (int i2 = 0; i2 < this.headers$key.size(); i2++) {
                    linkedHashMap2.put(this.headers$key.get(i2), this.headers$value.get(i2));
                }
                map2 = Collections.unmodifiableMap(linkedHashMap2);
            } else {
                map2 = Collections.singletonMap(this.headers$key.get(0), this.headers$value.get(0));
            }
            return new SipUri(this.scheme, this.user, this.password, this.domain, this.port, map3, map2);
        }

        public SipUriBuilder clearHeaders() {
            ArrayList<String> arrayList = this.headers$key;
            if (arrayList != null) {
                arrayList.clear();
                this.headers$value.clear();
            }
            return this;
        }

        public SipUriBuilder clearParams() {
            ArrayList<String> arrayList = this.params$key;
            if (arrayList != null) {
                arrayList.clear();
                this.params$value.clear();
            }
            return this;
        }

        public SipUriBuilder domain(String str) {
            this.domain = str;
            return this;
        }

        public SipUriBuilder header(String str, String str2) {
            if (this.headers$key == null) {
                this.headers$key = new ArrayList<>();
                this.headers$value = new ArrayList<>();
            }
            this.headers$key.add(str);
            this.headers$value.add(str2);
            return this;
        }

        public SipUriBuilder headers(Map<? extends String, ? extends String> map) {
            if (map == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("headers cannot be null");
                return null;
            }
            if (this.headers$key == null) {
                this.headers$key = new ArrayList<>();
                this.headers$value = new ArrayList<>();
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                this.headers$key.add(entry.getKey());
                this.headers$value.add(entry.getValue());
            }
            return this;
        }

        public SipUriBuilder param(String str, String str2) {
            if (this.params$key == null) {
                this.params$key = new ArrayList<>();
                this.params$value = new ArrayList<>();
            }
            this.params$key.add(str);
            this.params$value.add(str2);
            return this;
        }

        public SipUriBuilder params(Map<? extends String, ? extends String> map) {
            if (map == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("params cannot be null");
                return null;
            }
            if (this.params$key == null) {
                this.params$key = new ArrayList<>();
                this.params$value = new ArrayList<>();
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                this.params$key.add(entry.getKey());
                this.params$value.add(entry.getValue());
            }
            return this;
        }

        public SipUriBuilder password(String str) {
            this.password = str;
            return this;
        }

        public SipUriBuilder port(int i) {
            this.port = i;
            return this;
        }

        public SipUriBuilder scheme(String str) {
            this.scheme = str;
            return this;
        }

        public String toString() {
            return "SipUri.SipUriBuilder(scheme=" + this.scheme + ", user=" + this.user + ", password=" + this.password + ", domain=" + this.domain + ", port=" + this.port + ", params$key=" + this.params$key + ", params$value=" + this.params$value + ", headers$key=" + this.headers$key + ", headers$value=" + this.headers$value + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public SipUriBuilder user(String str) {
            this.user = str;
            return this;
        }
    }

    public SipUri(String str) throws URISyntaxException {
        Matcher matcher = SIP_URI_FORMAT.matcher(str);
        if (!matcher.find()) {
            throw new URISyntaxException(str, "Cannot parse");
        }
        this.scheme = matcher.group(1);
        this.user = matcher.group(2);
        this.password = matcher.group(3);
        this.domain = matcher.group(4);
        String group = matcher.group(5);
        if (Strings.isNullOrEmpty(group)) {
            this.port = 0;
        } else {
            this.port = Integer.parseInt(group);
        }
        String group2 = matcher.group(6);
        String group3 = matcher.group(7);
        this.params = new LinkedHashMap();
        if (!Strings.isNullOrEmpty(group2)) {
            for (String str2 : group2.split(";")) {
                String[] split = str2.split("=");
                int length = split.length;
                Map<String, String> map = this.params;
                if (length > 1) {
                    map.put(split[0], split[1]);
                } else {
                    map.put(split[0], "");
                }
            }
        }
        this.headers = new LinkedHashMap();
        if (Strings.isNullOrEmpty(group3)) {
            return;
        }
        for (String str3 : group3.split(WebConstants.UriConstants.AMPERSAND_KEY)) {
            String[] split2 = str3.split("=");
            if (split2.length <= 1) {
                throw new URISyntaxException(str, "Cannot parse");
            }
            this.headers.put(split2[0], split2[1]);
        }
    }

    public static SipUriBuilder builder() {
        return new SipUriBuilder();
    }

    public String getAOR() {
        Locale locale = Locale.US;
        String m$1 = a$$ExternalSyntheticOutline0.m$1(this.scheme, ":", this.user);
        if (!Strings.isNullOrEmpty(this.password)) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(m$1, ":");
            m1m.append(this.password);
            m$1 = m1m.toString();
        }
        StringBuilder m1m2 = a$$ExternalSyntheticOutline0.m1m(m$1, "@");
        m1m2.append(this.domain);
        String sb = m1m2.toString();
        if (this.port == 0) {
            return sb;
        }
        StringBuilder m1m3 = a$$ExternalSyntheticOutline0.m1m(sb, ":");
        m1m3.append(this.port);
        return m1m3.toString();
    }

    public String getDomain() {
        return this.domain;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPort() {
        return this.port;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getUser() {
        return this.user;
    }

    public SipUriBuilder toBuilder() {
        SipUriBuilder port = new SipUriBuilder().scheme(this.scheme).user(this.user).password(this.password).domain(this.domain).port(this.port);
        Map<String, String> map = this.params;
        if (map != null) {
            port.params(map);
        }
        Map<String, String> map2 = this.headers;
        if (map2 != null) {
            port.headers(map2);
        }
        return port;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAOR());
        for (Map.Entry<String, String> entry : this.params.entrySet()) {
            sb.append(";" + entry.getKey());
            if (!Strings.isNullOrEmpty(entry.getValue())) {
                sb.append("=" + entry.getValue());
            }
        }
        boolean z = true;
        for (Map.Entry<String, String> entry2 : this.headers.entrySet()) {
            if (z) {
                sb.append("?");
            } else {
                sb.append(WebConstants.UriConstants.AMPERSAND_KEY);
            }
            sb.append(entry2.getKey() + "=" + entry2.getValue());
            z = false;
        }
        return sb.toString();
    }

    public SipUri(String str, String str2, String str3, String str4, int i, Map<String, String> map, Map<String, String> map2) {
        this.scheme = str;
        this.user = str2;
        this.password = str3;
        this.domain = str4;
        this.port = i;
        this.params = map;
        this.headers = map2;
    }
}
