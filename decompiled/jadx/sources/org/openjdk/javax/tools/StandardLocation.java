package org.openjdk.javax.tools;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.openjdk.javax.tools.JavaFileManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public enum StandardLocation implements JavaFileManager.Location {
    CLASS_OUTPUT,
    SOURCE_OUTPUT,
    CLASS_PATH,
    SOURCE_PATH,
    ANNOTATION_PROCESSOR_PATH,
    ANNOTATION_PROCESSOR_MODULE_PATH,
    PLATFORM_CLASS_PATH,
    NATIVE_HEADER_OUTPUT,
    MODULE_SOURCE_PATH,
    UPGRADE_MODULE_PATH,
    SYSTEM_MODULES,
    MODULE_PATH,
    PATCH_MODULE_PATH;

    private static final ConcurrentMap<String, JavaFileManager.Location> locations = new ConcurrentHashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.javax.tools.StandardLocation$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$javax$tools$StandardLocation;

        static {
            int[] iArr = new int[StandardLocation.values().length];
            $SwitchMap$javax$tools$StandardLocation = iArr;
            try {
                iArr[StandardLocation.CLASS_OUTPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.SOURCE_OUTPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.NATIVE_HEADER_OUTPUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.MODULE_SOURCE_PATH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.ANNOTATION_PROCESSOR_MODULE_PATH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.UPGRADE_MODULE_PATH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.SYSTEM_MODULES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.MODULE_PATH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$javax$tools$StandardLocation[StandardLocation.PATCH_MODULE_PATH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static JavaFileManager.Location locationFor(final String str) {
        if (locations.isEmpty()) {
            for (StandardLocation standardLocation : values()) {
                locations.putIfAbsent(standardLocation.getName(), standardLocation);
            }
        }
        str.getClass();
        ConcurrentMap<String, JavaFileManager.Location> concurrentMap = locations;
        concurrentMap.putIfAbsent(str, new JavaFileManager.Location() { // from class: org.openjdk.javax.tools.StandardLocation.1
            @Override // org.openjdk.javax.tools.JavaFileManager.Location
            public String getName() {
                return str;
            }

            @Override // org.openjdk.javax.tools.JavaFileManager.Location
            public boolean isOutputLocation() {
                return str.endsWith("_OUTPUT");
            }
        });
        return concurrentMap.get(str);
    }

    @Override // org.openjdk.javax.tools.JavaFileManager.Location
    public String getName() {
        return name();
    }

    @Override // org.openjdk.javax.tools.JavaFileManager.Location
    public boolean isModuleOrientedLocation() {
        switch (AnonymousClass2.$SwitchMap$javax$tools$StandardLocation[ordinal()]) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    @Override // org.openjdk.javax.tools.JavaFileManager.Location
    public boolean isOutputLocation() {
        int i = AnonymousClass2.$SwitchMap$javax$tools$StandardLocation[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
