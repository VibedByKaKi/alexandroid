package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class HostRegexToRegionMapping {
    private final String hostNameRegex;
    private final String regionName;

    public HostRegexToRegionMapping(String str, String str2) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty");
            throw null;
        }
        try {
            Pattern.compile(str);
            if (str2 == null || str2.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("Invalid HostRegexToRegionMapping configuration: regionName must be non-empty");
                throw null;
            }
            this.hostNameRegex = str;
            this.regionName = str2;
        } catch (PatternSyntaxException e) {
            Single$$ExternalSyntheticBUOutline0.m("Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex", e);
            throw null;
        }
    }

    public String getHostNameRegex() {
        return this.hostNameRegex;
    }

    public String getRegionName() {
        return this.regionName;
    }
}
