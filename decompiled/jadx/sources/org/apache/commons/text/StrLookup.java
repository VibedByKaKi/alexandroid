package org.apache.commons.text;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import org.apache.commons.text.lookup.StringLookup;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public abstract class StrLookup<V> implements StringLookup {
    private static final StrLookup<String> NONE_LOOKUP = new MapStrLookup(null);
    private static final StrLookup<String> SYSTEM_PROPERTIES_LOOKUP = new SystemPropertiesStrLookup();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MapStrLookup<V> extends StrLookup<V> {
        private final Map<String, V> map;

        private MapStrLookup(Map<String, V> map) {
            this.map = map == null ? Collections.EMPTY_MAP : map;
        }

        @Override // org.apache.commons.text.lookup.StringLookup
        public String lookup(String str) {
            return Objects.toString(this.map.get(str), null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" [map=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.map, MarkdownConstants.RIGHT_BRACKET);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ResourceBundleLookup extends StrLookup<String> {
        private final ResourceBundle resourceBundle;

        private ResourceBundleLookup(ResourceBundle resourceBundle) {
            this.resourceBundle = resourceBundle;
        }

        @Override // org.apache.commons.text.lookup.StringLookup
        public String lookup(String str) {
            ResourceBundle resourceBundle = this.resourceBundle;
            if (resourceBundle == null || str == null || !resourceBundle.containsKey(str)) {
                return null;
            }
            return this.resourceBundle.getString(str);
        }

        public String toString() {
            return super.toString() + " [resourceBundle=" + this.resourceBundle + MarkdownConstants.RIGHT_BRACKET;
        }
    }

    public static <V> StrLookup<V> mapLookup(Map<String, V> map) {
        return new MapStrLookup(map);
    }

    public static StrLookup<?> noneLookup() {
        return NONE_LOOKUP;
    }

    public static StrLookup<String> resourceBundleLookup(ResourceBundle resourceBundle) {
        return new ResourceBundleLookup(resourceBundle);
    }

    public static StrLookup<String> systemPropertiesLookup() {
        return SYSTEM_PROPERTIES_LOOKUP;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SystemPropertiesStrLookup extends StrLookup<String> {
        @Override // org.apache.commons.text.lookup.StringLookup
        public String lookup(String str) {
            if (str.isEmpty()) {
                return null;
            }
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }

        private SystemPropertiesStrLookup() {
        }
    }
}
