package com.mapbox.maps;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum RequestResourceType {
    UNKNOWN("Unknown"),
    STYLE("Style"),
    SOURCE(AlexaMetricsConstants.EventConstants.SOURCE),
    TILE("Tile"),
    GLYPHS("Glyphs"),
    SPRITE_IMAGE("SpriteImage"),
    SPRITE_JSON("SpriteJSON"),
    IMAGE("Image"),
    MODEL(ExifInterface.TAG_MODEL);

    private String str;

    RequestResourceType(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
