package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class PlatformEventInfo implements Serializable {

    @NonNull
    private final ScreenCoordinate screenCoordinate;

    @NonNull
    private final PlatformEventType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public PlatformEventInfo(@NonNull PlatformEventType platformEventType, @NonNull ScreenCoordinate screenCoordinate) {
        this.type = platformEventType;
        this.screenCoordinate = screenCoordinate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlatformEventInfo platformEventInfo = (PlatformEventInfo) obj;
        return Objects.equals(this.type, platformEventInfo.type) && Objects.equals(this.screenCoordinate, platformEventInfo.screenCoordinate);
    }

    @NonNull
    public ScreenCoordinate getScreenCoordinate() {
        return this.screenCoordinate;
    }

    @NonNull
    public PlatformEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.screenCoordinate);
    }

    public String toString() {
        return "[type: " + RecordUtils.fieldToString(this.type) + ", screenCoordinate: " + RecordUtils.fieldToString(this.screenCoordinate) + MarkdownConstants.RIGHT_BRACKET;
    }
}
