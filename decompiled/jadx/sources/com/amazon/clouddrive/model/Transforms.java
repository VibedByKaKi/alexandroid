package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Transforms {
    public static final String DOCUMENT_CONVERSION = "DOCUMENT_CONVERSION";
    public static final String IMAGE_ANIMATION = "IMAGE_ANIMATION";
    public static final String IMAGE_THUMBNAIL = "IMAGE_THUMBNAIL";
    public static final String PDF = "PDF";
    public static final String PHOTO = "PHOTO";
    public static final String VIDEO = "VIDEO";
    public static final String VIDEO_TRANSCODE = "VIDEO_TRANSCODE";
    private static final String[] values = {"VIDEO_TRANSCODE", "DOCUMENT_CONVERSION", "IMAGE_THUMBNAIL", "IMAGE_ANIMATION", "PHOTO", "VIDEO", "PDF"};

    private Transforms() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
