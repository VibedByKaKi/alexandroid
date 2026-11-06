package com.amazon.apl.android.component;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.apl.android.RenderingContext;
import com.amazon.apl.android.RootContext;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ComponentDependencies {
    private final long nativeHandle;

    @NonNull
    private final String parentUniqueId;

    @NonNull
    private final RenderingContext renderingContext;

    @NonNull
    @Deprecated
    private final RootContext rootContext;

    @NonNull
    private final String uniqueId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ComponentDependenciesBuilder {
        private long nativeHandle;
        private String parentUniqueId;
        private RenderingContext renderingContext;
        private RootContext rootContext;
        private String uniqueId;

        public ComponentDependencies build() {
            return new ComponentDependencies(this.nativeHandle, this.uniqueId, this.parentUniqueId, this.renderingContext, this.rootContext);
        }

        public ComponentDependenciesBuilder nativeHandle(long j) {
            this.nativeHandle = j;
            return this;
        }

        public ComponentDependenciesBuilder parentUniqueId(@NonNull String str) {
            if (str != null) {
                this.parentUniqueId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("parentUniqueId is marked non-null but is null");
            return null;
        }

        public ComponentDependenciesBuilder renderingContext(@NonNull RenderingContext renderingContext) {
            if (renderingContext != null) {
                this.renderingContext = renderingContext;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("renderingContext is marked non-null but is null");
            return null;
        }

        @Deprecated
        public ComponentDependenciesBuilder rootContext(@NonNull RootContext rootContext) {
            if (rootContext != null) {
                this.rootContext = rootContext;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("rootContext is marked non-null but is null");
            return null;
        }

        public String toString() {
            return "ComponentDependencies.ComponentDependenciesBuilder(nativeHandle=" + this.nativeHandle + ", uniqueId=" + this.uniqueId + ", parentUniqueId=" + this.parentUniqueId + ", renderingContext=" + this.renderingContext + ", rootContext=" + this.rootContext + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public ComponentDependenciesBuilder uniqueId(@NonNull String str) {
            if (str != null) {
                this.uniqueId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("uniqueId is marked non-null but is null");
            return null;
        }
    }

    public ComponentDependencies(long j, @NonNull String str, @NonNull String str2, @NonNull RenderingContext renderingContext, @NonNull RootContext rootContext) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("uniqueId is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("parentUniqueId is marked non-null but is null");
            throw null;
        }
        if (renderingContext == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("renderingContext is marked non-null but is null");
            throw null;
        }
        if (rootContext == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("rootContext is marked non-null but is null");
            throw null;
        }
        this.nativeHandle = j;
        this.uniqueId = str;
        this.parentUniqueId = str2;
        this.renderingContext = renderingContext;
        this.rootContext = rootContext;
    }

    public static ComponentDependenciesBuilder builder() {
        return new ComponentDependenciesBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ComponentDependencies;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComponentDependencies)) {
            return false;
        }
        ComponentDependencies componentDependencies = (ComponentDependencies) obj;
        if (!componentDependencies.canEqual(this) || getNativeHandle() != componentDependencies.getNativeHandle()) {
            return false;
        }
        String uniqueId = getUniqueId();
        String uniqueId2 = componentDependencies.getUniqueId();
        if (uniqueId != null ? !uniqueId.equals(uniqueId2) : uniqueId2 != null) {
            return false;
        }
        String parentUniqueId = getParentUniqueId();
        String parentUniqueId2 = componentDependencies.getParentUniqueId();
        return parentUniqueId != null ? parentUniqueId.equals(parentUniqueId2) : parentUniqueId2 == null;
    }

    public long getNativeHandle() {
        return this.nativeHandle;
    }

    @NonNull
    public String getParentUniqueId() {
        return this.parentUniqueId;
    }

    @NonNull
    public RenderingContext getRenderingContext() {
        return this.renderingContext;
    }

    @NonNull
    @Deprecated
    public RootContext getRootContext() {
        return this.rootContext;
    }

    @NonNull
    public String getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        long nativeHandle = getNativeHandle();
        String uniqueId = getUniqueId();
        int i = (((int) (nativeHandle ^ (nativeHandle >>> 32))) + 59) * 59;
        int hashCode = uniqueId == null ? 43 : uniqueId.hashCode();
        String parentUniqueId = getParentUniqueId();
        return ((i + hashCode) * 59) + (parentUniqueId != null ? parentUniqueId.hashCode() : 43);
    }

    public String toString() {
        return "ComponentDependencies(nativeHandle=" + getNativeHandle() + ", uniqueId=" + getUniqueId() + ", parentUniqueId=" + getParentUniqueId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
