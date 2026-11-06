package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy;", "", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "Builtins", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public interface JsonNamingStrategy {

    /* renamed from: Builtins, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    String serialNameForJson(@NotNull SerialDescriptor descriptor, int elementIndex, @NotNull String serialName);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy$Builtins;", "", "<init>", "()V", "SnakeCase", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase$annotations", "getSnakeCase", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "KebabCase", "getKebabCase$annotations", "getKebabCase", "convertCamelCase", "", "serialName", "delimiter", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @ExperimentalSerializationApi
    @SourceDebugExtension({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1179#2:179\n1180#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    /* renamed from: kotlinx.serialization.json.JsonNamingStrategy$Builtins, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final JsonNamingStrategy SnakeCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
                String convertCamelCase;
                descriptor.getClass();
                serialName.getClass();
                convertCamelCase = JsonNamingStrategy.Companion.$$INSTANCE.convertCamelCase(serialName, '_');
                return convertCamelCase;
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };

        @NotNull
        private static final JsonNamingStrategy KebabCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
                String convertCamelCase;
                descriptor.getClass();
                serialName.getClass();
                convertCamelCase = JsonNamingStrategy.Companion.$$INSTANCE.convertCamelCase(serialName, '-');
                return convertCamelCase;
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String convertCamelCase(String serialName, char delimiter) {
            StringBuilder sb = new StringBuilder(serialName.length() * 2);
            Character ch = null;
            int i = 0;
            for (int i2 = 0; i2 < serialName.length(); i2++) {
                char charAt = serialName.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    if (i == 0 && sb.length() > 0 && StringsKt.last(sb) != delimiter) {
                        sb.append(delimiter);
                    }
                    if (ch != null) {
                        sb.append(ch.charValue());
                    }
                    i++;
                    ch = Character.valueOf(Character.toLowerCase(charAt));
                } else {
                    if (ch != null) {
                        if (i > 1 && Character.isLetter(charAt)) {
                            sb.append(delimiter);
                        }
                        sb.append(ch.charValue());
                        ch = null;
                        i = 0;
                    }
                    sb.append(charAt);
                }
            }
            if (ch != null) {
                sb.append(ch.charValue());
            }
            return sb.toString();
        }

        @NotNull
        public final JsonNamingStrategy getKebabCase() {
            return KebabCase;
        }

        @NotNull
        public final JsonNamingStrategy getSnakeCase() {
            return SnakeCase;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSnakeCase$annotations() {
        }
    }
}
