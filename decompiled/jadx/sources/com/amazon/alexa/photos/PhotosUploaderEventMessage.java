package com.amazon.alexa.photos;

import androidx.annotation.NonNull;
import com.amazon.alexa.photos.events.PhotosUploaderEvent;
import com.amazon.alexa.photos.events.PhotosUploaderEventType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
class PhotosUploaderEventMessage {

    @NonNull
    final PhotosUploaderEvent event;

    @NonNull
    final PhotosUploaderEventType eventType;

    public PhotosUploaderEventMessage(@NonNull PhotosUploaderEventType photosUploaderEventType, @NonNull PhotosUploaderEvent photosUploaderEvent) {
        this.eventType = photosUploaderEventType;
        this.event = photosUploaderEvent;
    }
}
