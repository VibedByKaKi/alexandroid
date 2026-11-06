package com.mapbox.maps;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class EventTimeInterval implements Serializable {

    @NonNull
    private final Date begin;

    @NonNull
    private final Date end;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public EventTimeInterval(@NonNull Date date, @NonNull Date date2) {
        this.begin = date;
        this.end = date2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventTimeInterval eventTimeInterval = (EventTimeInterval) obj;
        return Objects.equals(this.begin, eventTimeInterval.begin) && Objects.equals(this.end, eventTimeInterval.end);
    }

    @NonNull
    public Date getBegin() {
        return this.begin;
    }

    @NonNull
    public Date getEnd() {
        return this.end;
    }

    public int hashCode() {
        return Objects.hash(this.begin, this.end);
    }

    public String toString() {
        return "[begin: " + RecordUtils.fieldToString(this.begin) + ", end: " + RecordUtils.fieldToString(this.end) + MarkdownConstants.RIGHT_BRACKET;
    }
}
