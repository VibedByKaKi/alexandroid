package com.amazonaws.services.s3;

import com.amazonaws.ResponseMetadata;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class S3ResponseMetadata extends ResponseMetadata {
    public static final String CLOUD_FRONT_ID = "CLOUD_FRONT_ID";
    public static final String HOST_ID = "HOST_ID";

    public S3ResponseMetadata(Map<String, String> map) {
        super(map);
    }

    public String getCloudFrontId() {
        return this.metadata.get(CLOUD_FRONT_ID);
    }

    public String getHostId() {
        return this.metadata.get(HOST_ID);
    }

    public S3ResponseMetadata(ResponseMetadata responseMetadata) {
        super(responseMetadata);
    }
}
