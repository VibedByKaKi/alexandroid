package androidx.datastore.preferences.protobuf;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    public static final int MINOR = 28;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 28;
    public static final int OSS_PATCH = 2;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        VERSION_STRING = versionString(4, 28, 2, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(runtimeDomain, i, i2, i3, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        String versionString = versionString(i, i2, i3, str);
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw new ProtobufRuntimeVersionException(a$$ExternalSyntheticOutline0.m("Invalid gencode version: ", versionString));
        }
        RuntimeDomain runtimeDomain2 = DOMAIN;
        if (runtimeDomain != runtimeDomain2) {
            throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str2 + ": gencode " + runtimeDomain + ", runtime " + runtimeDomain2 + ". Cross-domain usage of Protobuf is not supported.");
        }
        if (i != 4) {
            if (i != 3) {
                throw new ProtobufRuntimeVersionException(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Detected mismatched Protobuf Gencode/Runtime major versions when loading ", str2, ": gencode ", versionString, ", runtime "), VERSION_STRING, ". Same major version is required."));
            }
            Logger logger2 = logger;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m(" Protobuf gencode version ", versionString, " is exactly one major version older than the runtime version ", VERSION_STRING, " at ");
            m.append(str2);
            m.append(". Please update the gencode to avoid compatibility violations in the next runtime release.");
            logger2.warning(m.toString());
        }
        if (28 < i2 || (i2 == 28 && 2 < i3)) {
            throw new ProtobufRuntimeVersionException(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Detected incompatible Protobuf Gencode/Runtime versions when loading ", str2, ": gencode ", versionString, ", runtime "), VERSION_STRING, ". Runtime version cannot be older than the linked gencode version."));
        }
        if (28 > i2 || 2 > i3) {
            Logger logger3 = logger;
            StringBuilder m2 = ErrorUtils$$ExternalSyntheticOutline0.m(" Protobuf gencode version ", versionString, " is older than the runtime version ", VERSION_STRING, " at ");
            m2.append(str2);
            m2.append(". Please avoid checked-in Protobuf gencode that can be obsolete.");
            logger3.warning(m2.toString());
        }
        if (str.equals("")) {
            return;
        }
        throw new ProtobufRuntimeVersionException(a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading ", str2, ": gencode ", versionString, ", runtime "), VERSION_STRING, ". Version suffixes must be the same."));
    }

    private static String versionString(int i, int i2, int i3, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
    }
}
