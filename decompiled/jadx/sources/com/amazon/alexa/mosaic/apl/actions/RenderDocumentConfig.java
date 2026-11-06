package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.mosaic.apl.actions.AutoValue_RenderDocumentConfig;
import com.amazon.alexa.mosaic.apl.dependencies.PackageLoader;
import com.amazon.apl.android.BuildConfig;
import com.amazon.apl.android.providers.IExtension;
import com.amazon.apl.enums.RootProperty;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class RenderDocumentConfig {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract RenderDocumentConfig build();

        public abstract Builder environment(Map<String, Object> map);

        public abstract Builder extensions(List<IExtension> list);

        public abstract Builder getAuthHeader(AuthHeader authHeader);

        public abstract Builder lists(boolean z);

        public abstract Builder mode(PackageLoader.Mode mode);

        public abstract Builder name(String str);

        public abstract Builder properties(Map<Properties, Object> map);

        public abstract Builder startRenderingTime(long j);

        public abstract Builder version(String str);

        public abstract Builder viewport(RenderDocumentViewport renderDocumentViewport);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Properties {
        DISALLOW_VIDEO(RootProperty.kDisallowVideo),
        DISALLOW_DIALOG(RootProperty.kDisallowDialog),
        ALLOW_OPEN_URL(RootProperty.kAllowOpenUrl),
        DISALLOW_EDIT_TEXT(RootProperty.kDisallowEditText),
        SEQUENCE_CHILD_CACHE(RootProperty.kSequenceChildCache),
        PAGER_CHILD_CACHE(RootProperty.kPagerChildCache),
        POINTER_SLOP_THRESHOLD(RootProperty.kPointerSlopThreshold),
        MAXIMUM_FLING_VELOCITY(RootProperty.kMaximumFlingVelocity),
        TAP_OR_SCROLL_TIMEOUT(RootProperty.kTapOrScrollTimeout);

        private final RootProperty key;

        Properties(RootProperty rootProperty) {
            this.key = rootProperty;
        }

        public RootProperty key() {
            return this.key;
        }
    }

    public static Builder builder() {
        String[] split = BuildConfig.VERSION_NAME.split("-");
        Builder extensions = new AutoValue_RenderDocumentConfig.Builder().extensions(Collections.EMPTY_LIST);
        Map<String, Object> map = Collections.EMPTY_MAP;
        return extensions.properties(map).environment(map).lists(false).name(split[0]).version(split[1]).mode(PackageLoader.Mode.DEFAULT).startRenderingTime(-1L);
    }

    public abstract Map<String, Object> environment();

    public abstract List<IExtension> extensions();

    @Nullable
    public abstract AuthHeader getAuthHeader();

    public abstract boolean lists();

    public abstract PackageLoader.Mode mode();

    public abstract String name();

    public abstract Map<Properties, Object> properties();

    public abstract long startRenderingTime();

    public abstract String version();

    @Nullable
    public abstract RenderDocumentViewport viewport();
}
