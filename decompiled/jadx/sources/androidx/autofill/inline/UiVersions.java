package androidx.autofill.inline;

import android.app.slice.Slice;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 30)
/* loaded from: classes.dex */
public final class UiVersions {
    public static final String INLINE_UI_VERSION_1 = "androidx.autofill.inline.ui.version:v1";
    private static final Set<String> UI_VERSIONS = new HashSet(Arrays.asList(INLINE_UI_VERSION_1));

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Content {
        @NonNull
        Slice getSlice();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface InlineUiVersion {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Style {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        Bundle getBundle();

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        String getVersion();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StylesBuilder {
        private final List<Style> mStyles = new ArrayList();

        @NonNull
        public StylesBuilder addStyle(@NonNull Style style) {
            if (VersionUtils.isVersionSupported(style.getVersion())) {
                this.mStyles.add(style);
                return this;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$3(style.getVersion(), "Unsupported style version: ");
            return null;
        }

        @NonNull
        public Bundle build() {
            if (this.mStyles.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$2("Please put at least one style in the builder");
                return null;
            }
            Bundle bundle = new Bundle();
            VersionUtils.writeStylesToBundle(this.mStyles, bundle);
            return bundle;
        }
    }

    private UiVersions() {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Set<String> getUiVersions() {
        return UI_VERSIONS;
    }

    @NonNull
    public static List<String> getVersions(@NonNull Bundle bundle) {
        return VersionUtils.getSupportedVersions(bundle);
    }

    @NonNull
    public static StylesBuilder newStylesBuilder() {
        return new StylesBuilder();
    }
}
