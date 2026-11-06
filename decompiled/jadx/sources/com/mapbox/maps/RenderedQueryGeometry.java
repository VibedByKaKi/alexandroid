package com.mapbox.maps;

import androidx.annotation.NonNull;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class RenderedQueryGeometry {
    private Type type;
    private Object value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        SCREEN_BOX,
        SCREEN_COORDINATE,
        LIST
    }

    public RenderedQueryGeometry(@NonNull ScreenBox screenBox) {
        this.type = Type.SCREEN_BOX;
        this.value = screenBox;
    }

    public static RenderedQueryGeometry valueOf(@NonNull ScreenBox screenBox) {
        return new RenderedQueryGeometry(screenBox);
    }

    @NonNull
    public List<ScreenCoordinate> getList() {
        if (isList()) {
            return (List) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (List<ScreenCoordinate>)");
        return null;
    }

    @NonNull
    public ScreenBox getScreenBox() {
        if (isScreenBox()) {
            return (ScreenBox) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (ScreenBox)");
        return null;
    }

    @NonNull
    public ScreenCoordinate getScreenCoordinate() {
        if (isScreenCoordinate()) {
            return (ScreenCoordinate) this.value;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The content of the variant does not have type (ScreenCoordinate)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isList() {
        return this.type == Type.LIST;
    }

    public boolean isScreenBox() {
        return this.type == Type.SCREEN_BOX;
    }

    public boolean isScreenCoordinate() {
        return this.type == Type.SCREEN_COORDINATE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static RenderedQueryGeometry valueOf(@NonNull ScreenCoordinate screenCoordinate) {
        return new RenderedQueryGeometry(screenCoordinate);
    }

    public static RenderedQueryGeometry valueOf(@NonNull List<ScreenCoordinate> list) {
        return new RenderedQueryGeometry(list);
    }

    public RenderedQueryGeometry(@NonNull ScreenCoordinate screenCoordinate) {
        this.type = Type.SCREEN_COORDINATE;
        this.value = screenCoordinate;
    }

    public RenderedQueryGeometry(@NonNull List<ScreenCoordinate> list) {
        this.type = Type.LIST;
        this.value = list;
    }
}
