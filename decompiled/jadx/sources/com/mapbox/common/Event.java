package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class Event implements Serializable {

    @NonNull
    private final Value attributes;

    @Nullable
    private final DeferredDeliveryRequestOptions deferredOptions;

    @NonNull
    private EventPriority priority;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Event(@NonNull Value value, @Nullable DeferredDeliveryRequestOptions deferredDeliveryRequestOptions) {
        this.attributes = value;
        this.deferredOptions = deferredDeliveryRequestOptions;
        this.priority = EventPriority.QUEUED;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event event = (Event) obj;
        return Objects.equals(this.priority, event.priority) && Objects.equals(this.attributes, event.attributes) && Objects.equals(this.deferredOptions, event.deferredOptions);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Value getAttributes() {
        return this.attributes;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DeferredDeliveryRequestOptions getDeferredOptions() {
        return this.deferredOptions;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public EventPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Objects.hash(this.priority, this.attributes, this.deferredOptions);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setPriority(@NonNull EventPriority eventPriority) {
        this.priority = eventPriority;
    }

    public String toString() {
        return "[priority: " + RecordUtils.fieldToString(this.priority) + ", attributes: " + RecordUtils.fieldToString(this.attributes) + ", deferredOptions: " + RecordUtils.fieldToString(this.deferredOptions) + MarkdownConstants.RIGHT_BRACKET;
    }

    public Event(@NonNull EventPriority eventPriority, @NonNull Value value, @Nullable DeferredDeliveryRequestOptions deferredDeliveryRequestOptions) {
        this.priority = eventPriority;
        this.attributes = value;
        this.deferredOptions = deferredDeliveryRequestOptions;
    }
}
