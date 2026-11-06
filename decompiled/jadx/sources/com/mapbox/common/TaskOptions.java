package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class TaskOptions implements Serializable {
    private final long delay;

    @NonNull
    private final TaskPriority priority;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TaskOptions(long j) {
        this.delay = j;
        this.priority = TaskPriority.DEFAULT;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOptions taskOptions = (TaskOptions) obj;
        return this.delay == taskOptions.delay && Objects.equals(this.priority, taskOptions.priority);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getDelay() {
        return this.delay;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public TaskPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.delay), this.priority);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[delay: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.delay, ", priority: ", sb);
        sb.append(RecordUtils.fieldToString(this.priority));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    public TaskOptions(long j, @NonNull TaskPriority taskPriority) {
        this.delay = j;
        this.priority = taskPriority;
    }
}
