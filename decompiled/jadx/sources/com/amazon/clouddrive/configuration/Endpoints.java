package com.amazon.clouddrive.configuration;

import com.amazon.clouddrive.utils.Optional;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Endpoints implements Serializable {
    private static final long serialVersionUID = 1;
    private final String mContentEndpoint;
    private final String mGroupEndpoint;
    private final Optional<String> mMarketplace;
    private final String mMetaDataEndpoint;

    public Endpoints(String str, String str2, String str3, String str4) {
        this.mMetaDataEndpoint = str;
        this.mContentEndpoint = str2;
        this.mGroupEndpoint = str3;
        this.mMarketplace = Optional.fromNullable(str4);
    }

    public String getContentEndpoint() {
        return this.mContentEndpoint;
    }

    public String getGroupEndpoint() {
        return this.mGroupEndpoint;
    }

    public Optional<String> getMarketplace() {
        return this.mMarketplace;
    }

    public String getMetaDataEndpoint() {
        return this.mMetaDataEndpoint;
    }

    public Endpoints(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }
}
