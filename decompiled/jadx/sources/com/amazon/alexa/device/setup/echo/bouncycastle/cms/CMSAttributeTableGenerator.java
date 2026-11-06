package com.amazon.alexa.device.setup.echo.bouncycastle.cms;

import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.cms.AttributeTable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CMSAttributeTableGenerator {
    public static final String CONTENT_TYPE = "contentType";
    public static final String DIGEST = "digest";
    public static final String DIGEST_ALGORITHM_IDENTIFIER = "digestAlgID";
    public static final String SIGNATURE = "encryptedDigest";

    AttributeTable getAttributes(Map map) throws CMSAttributeTableGenerationException;
}
