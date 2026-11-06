package com.amazon.photos.uploader;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/photos/uploader/Queue;", "", "name", "", "priority", "Lcom/amazon/photos/uploader/Priority;", "constraints", "", "Lcom/amazon/photos/uploader/QueueConstraint;", "(Ljava/lang/String;Lcom/amazon/photos/uploader/Priority;Ljava/util/Set;)V", "getConstraints", "()Ljava/util/Set;", "getName", "()Ljava/lang/String;", "getPriority", "()Lcom/amazon/photos/uploader/Priority;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Queue {

    @NotNull
    private final Set<QueueConstraint> constraints;

    @NotNull
    private final String name;

    @NotNull
    private final Priority priority;

    /* JADX WARN: Multi-variable type inference failed */
    public Queue(@NotNull String str, @NotNull Priority priority, @NotNull Set<? extends QueueConstraint> set) {
        str.getClass();
        priority.getClass();
        set.getClass();
        this.name = str;
        this.priority = priority;
        this.constraints = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Queue copy$default(Queue queue, String str, Priority priority, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queue.name;
        }
        if ((i & 2) != 0) {
            priority = queue.priority;
        }
        if ((i & 4) != 0) {
            set = queue.constraints;
        }
        return queue.copy(str, priority, set);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Priority getPriority() {
        return this.priority;
    }

    @NotNull
    public final Set<QueueConstraint> component3() {
        return this.constraints;
    }

    @NotNull
    public final Queue copy(@NotNull String name, @NotNull Priority priority, @NotNull Set<? extends QueueConstraint> constraints) {
        name.getClass();
        priority.getClass();
        constraints.getClass();
        return new Queue(name, priority, constraints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Queue)) {
            return false;
        }
        Queue queue = (Queue) other;
        return Intrinsics.areEqual(this.name, queue.name) && this.priority == queue.priority && Intrinsics.areEqual(this.constraints, queue.constraints);
    }

    @NotNull
    public final Set<QueueConstraint> getConstraints() {
        return this.constraints;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return this.constraints.hashCode() + ((this.priority.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Queue(name=" + this.name + ", priority=" + this.priority + ", constraints=" + this.constraints + ')';
    }
}
