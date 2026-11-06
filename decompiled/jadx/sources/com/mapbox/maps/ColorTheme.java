package com.mapbox.maps;

import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class ColorTheme {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        IMAGE,
        STYLE_PROPERTY_VALUE
    }

    public ColorTheme(@NonNull Image image) {
        this.type = Type.IMAGE;
        this.value = image;
    }

    public static ColorTheme valueOf(@NonNull Image image) {
        return new ColorTheme(image);
    }

    @NonNull
    public Image getImage() {
        if (isImage()) {
            return (Image) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (Image)");
        return null;
    }

    @NonNull
    public StylePropertyValue getStylePropertyValue() {
        if (isStylePropertyValue()) {
            return (StylePropertyValue) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (StylePropertyValue)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isImage() {
        return this.type == Type.IMAGE;
    }

    public boolean isStylePropertyValue() {
        return this.type == Type.STYLE_PROPERTY_VALUE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static ColorTheme valueOf(@NonNull StylePropertyValue stylePropertyValue) {
        return new ColorTheme(stylePropertyValue);
    }

    public ColorTheme(@NonNull StylePropertyValue stylePropertyValue) {
        this.type = Type.STYLE_PROPERTY_VALUE;
        this.value = stylePropertyValue;
    }
}
