package com.amazon.alexa.photos;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum PhotosSource {
    Camera,
    AccessoryAlbum;

    public static PhotosSource fromString(String str) {
        if (str == null) {
            return null;
        }
        for (PhotosSource photosSource : values()) {
            if (photosSource.name().equalsIgnoreCase(str)) {
                return photosSource;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid PhotoSource Type");
        return null;
    }
}
