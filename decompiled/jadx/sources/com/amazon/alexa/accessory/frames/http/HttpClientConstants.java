package com.amazon.alexa.accessory.frames.http;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class HttpClientConstants {
    private static final String BASE_TYPE_IMAGE = "image";
    private static final String BASE_TYPE_VIDEO = "video";
    public static final String IMAGES_URI_STRING = "images";
    public static final String IMAGE_HEIC = "image/heic";
    public static final String IMAGE_JPEG = "image/jpeg";
    public static final String IMAGE_JPG = "image/jpg";
    public static final String IMAGE_PNG = "image/png";
    public static final Set<String> MEDIA_SET;
    public static final String SESSION_TOKEN = "amazonanseltoken2025";
    public static final String SOFTAP_IP_ADDRESS = "10.201.126.241";
    public static final String SOFTAP_PORT = "8080";
    public static final String VIDEOS_URI_STRING = "videos";
    public static final String VIDEO_EXTENSION = ".mp4";
    public static final String VIDEO_MIME_PREFIX = "video/";
    public static final String VIDEO_MP4 = "video/mp4";

    static {
        Object[] objArr = {"video/mp4", "image/heic", "image/jpeg", IMAGE_JPG, "image/png"};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(obj, "duplicate element: "));
                return;
            }
        }
        MEDIA_SET = Collections.unmodifiableSet(hashSet);
    }

    private HttpClientConstants() {
    }
}
