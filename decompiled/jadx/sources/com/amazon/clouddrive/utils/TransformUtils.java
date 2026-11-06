package com.amazon.clouddrive.utils;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TransformUtils {
    private static final Map<String, String> TRANSFORM_TO_OPERATION_MAP = new HashMap<String, String>() { // from class: com.amazon.clouddrive.utils.TransformUtils.1
        {
            put("DOCUMENT_CONVERSION", "/alt/pdf");
            put("PDF", "/alt/pdf");
            put("IMAGE_THUMBNAIL", "/alt/thumb");
            put("VIDEO_TRANSCODE", "/alt/video_transcode");
        }
    };

    private TransformUtils() {
        throw new UnsupportedOperationException("Do not instantiate.");
    }

    public static Optional<String> getTransformPathSuffix(String str) {
        return Optional.fromNullable(TRANSFORM_TO_OPERATION_MAP.get(str));
    }
}
