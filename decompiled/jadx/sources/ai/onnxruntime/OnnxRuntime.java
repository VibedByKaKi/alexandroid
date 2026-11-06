package ai.onnxruntime;

import com.facebook.soloader.MinElf;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.SystemProperties;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class OnnxRuntime {
    static final String ONNXRUNTIME_JNI_LIBRARY_NAME = "onnxruntime4j_jni";
    static final String ONNXRUNTIME_LIBRARY_CUDA_NAME = "onnxruntime_providers_cuda";
    static final String ONNXRUNTIME_LIBRARY_DNNL_NAME = "onnxruntime_providers_dnnl";
    static final String ONNXRUNTIME_LIBRARY_NAME = "onnxruntime";
    static final String ONNXRUNTIME_LIBRARY_OPENVINO_NAME = "onnxruntime_providers_openvino";
    static final String ONNXRUNTIME_LIBRARY_QNN_NAME = "onnxruntime_providers_qnn";
    static final String ONNXRUNTIME_LIBRARY_ROCM_NAME = "onnxruntime_providers_rocm";
    static final String ONNXRUNTIME_LIBRARY_SHARED_NAME = "onnxruntime_providers_shared";
    static final String ONNXRUNTIME_LIBRARY_TENSORRT_NAME = "onnxruntime_providers_tensorrt";
    static final String ONNXRUNTIME_LIBRARY_WEBGPU_DAWN_NAME = "webgpu_dawn";
    static final String ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXCOMPILER_NAME = "dxcompiler";
    static final String ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXIL_NAME = "dxil";
    static final String ONNXRUNTIME_NATIVE_PATH = "onnxruntime.native.path";
    private static final int ORT_API_VERSION_1 = 1;
    private static final int ORT_API_VERSION_11 = 11;
    private static final int ORT_API_VERSION_13 = 13;
    private static final int ORT_API_VERSION_14 = 14;
    private static final int ORT_API_VERSION_2 = 2;
    private static final int ORT_API_VERSION_23 = 23;
    private static final int ORT_API_VERSION_3 = 3;
    private static final int ORT_API_VERSION_7 = 7;
    private static final int ORT_API_VERSION_8 = 8;
    private static final int ORT_TRAINING_API_VERSION_1 = 1;
    private static String libraryDirPathProperty;
    static long ortApiHandle;
    static long ortCompileApiHandle;
    static long ortTrainingApiHandle;
    static EnumSet<OrtProvider> providers;
    private static Path tempDirectory;
    static boolean trainingEnabled;
    private static String version;
    private static final Logger logger = Logger.getLogger(OnnxRuntime.class.getName());
    private static final String OS_ARCH_STR = initOsArch();
    private static boolean loaded = false;
    private static final Set<String> extractedSharedProviders = new HashSet();

    private OnnxRuntime() {
    }

    private static void cleanUp(File file) {
        if (file.exists()) {
            logger.log(Level.FINE, "Deleting " + file + " on exit");
            file.deleteOnExit();
        }
    }

    public static boolean extractCUDA() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_CUDA_NAME);
    }

    public static boolean extractDNNL() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_DNNL_NAME);
    }

    private static Optional<File> extractFromResources(String str) {
        String mapLibraryName = mapLibraryName(str);
        String m = a$$ExternalSyntheticOutline0.m(new StringBuilder("/ai/onnxruntime/native/"), OS_ARCH_STR, '/', mapLibraryName);
        File file = tempDirectory.resolve(mapLibraryName).toFile();
        try {
            InputStream resourceAsStream = OnnxRuntime.class.getResourceAsStream(m);
            try {
                if (resourceAsStream == null) {
                    Optional<File> empty = Optional.empty();
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    return empty;
                }
                logger.log(Level.FINE, "Attempting to load native library '" + str + "' from resource path " + m + " copying to " + file);
                byte[] bArr = new byte[4096];
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = resourceAsStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.close();
                            logger.log(Level.FINE, "Extracted native library '" + str + "' from resource path");
                            Optional<File> of = Optional.of(file);
                            resourceAsStream.close();
                            return of;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, "Failed to extract library '" + str + "' from the resources", (Throwable) e);
            return Optional.empty();
        } finally {
            cleanUp(file);
        }
    }

    public static boolean extractOpenVINO() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_OPENVINO_NAME);
    }

    public static synchronized boolean extractProviderLibrary(String str) {
        synchronized (OnnxRuntime.class) {
            if (isAndroid()) {
                return false;
            }
            Set<String> set = extractedSharedProviders;
            if (set.contains(str)) {
                return true;
            }
            if (libraryDirPathProperty != null) {
                if (Paths.get(libraryDirPathProperty, mapLibraryName(str)).toFile().exists()) {
                    set.add(str);
                    return true;
                }
            }
            if (!extractFromResources(str).isPresent()) {
                return false;
            }
            set.add(str);
            return true;
        }
    }

    public static boolean extractQNN() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_QNN_NAME);
    }

    public static boolean extractROCM() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_ROCM_NAME);
    }

    public static boolean extractTensorRT() {
        return extractProviderLibrary(ONNXRUNTIME_LIBRARY_TENSORRT_NAME);
    }

    private static native String[] getAvailableProviders(long j);

    public static synchronized void init() throws IOException {
        synchronized (OnnxRuntime.class) {
            if (loaded) {
                return;
            }
            tempDirectory = isAndroid() ? null : Files.createTempDirectory("onnxruntime-java", new FileAttribute[0]);
            try {
                libraryDirPathProperty = System.getProperty(ONNXRUNTIME_NATIVE_PATH);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_SHARED_NAME);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_WEBGPU_DAWN_NAME);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXIL_NAME);
                extractProviderLibrary(ONNXRUNTIME_LIBRARY_WEBGPU_DXC_DXCOMPILER_NAME);
                if (!isAndroid()) {
                    load(ONNXRUNTIME_LIBRARY_NAME);
                }
                load(ONNXRUNTIME_JNI_LIBRARY_NAME);
                long initialiseAPIBase = initialiseAPIBase(23);
                ortApiHandle = initialiseAPIBase;
                if (initialiseAPIBase == 0) {
                    throw new IllegalStateException("There is a mismatch between the ORT class files and the ORT native library, and the native library could not be loaded");
                }
                ortTrainingApiHandle = initialiseTrainingAPIBase(initialiseAPIBase, 23);
                ortCompileApiHandle = initialiseCompileAPIBase(ortApiHandle);
                trainingEnabled = ortTrainingApiHandle != 0;
                providers = initialiseProviders(ortApiHandle);
                version = initialiseVersion();
                loaded = true;
                Path path = tempDirectory;
                if (path != null) {
                    cleanUp(path.toFile());
                }
            } catch (Throwable th) {
                Path path2 = tempDirectory;
                if (path2 != null) {
                    cleanUp(path2.toFile());
                }
                throw th;
            }
        }
    }

    private static String initOsArch() {
        String str;
        String property = System.getProperty(SystemProperties.OS_NAME, "generic");
        Locale locale = Locale.ENGLISH;
        String lowerCase = property.toLowerCase(locale);
        if (lowerCase.contains("mac") || lowerCase.contains("darwin")) {
            str = "osx";
        } else {
            str = "win";
            if (!lowerCase.contains("win")) {
                if (lowerCase.contains("nux")) {
                    str = "linux";
                } else {
                    if (!isAndroid()) {
                        Single$$ExternalSyntheticBUOutline0.m$2("Unsupported os:".concat(lowerCase));
                        return null;
                    }
                    str = "android";
                }
            }
        }
        String lowerCase2 = System.getProperty(SystemProperties.OS_ARCH, "generic").toLowerCase(locale);
        if (lowerCase2.startsWith("amd64") || lowerCase2.startsWith(MinElf.ISA.X86_64)) {
            lowerCase2 = "x64";
        } else {
            String str2 = MinElf.ISA.X86;
            if (!lowerCase2.startsWith(MinElf.ISA.X86)) {
                str2 = "aarch64";
                if (!lowerCase2.startsWith("aarch64")) {
                    str2 = "ppc64";
                    if (!lowerCase2.startsWith("ppc64")) {
                        str2 = "loongarch64";
                        if (!lowerCase2.startsWith("loongarch64")) {
                            if (!isAndroid()) {
                                Single$$ExternalSyntheticBUOutline0.m$2("Unsupported arch:".concat(lowerCase2));
                                return null;
                            }
                        }
                    }
                }
            }
            lowerCase2 = str2;
        }
        return a$$ExternalSyntheticOutline0.m('-', str, lowerCase2);
    }

    private static native long initialiseAPIBase(int i);

    private static native long initialiseCompileAPIBase(long j);

    private static EnumSet<OrtProvider> initialiseProviders(long j) {
        String[] availableProviders = getAvailableProviders(j);
        EnumSet<OrtProvider> noneOf = EnumSet.noneOf(OrtProvider.class);
        for (String str : availableProviders) {
            noneOf.add(OrtProvider.mapFromName(str));
        }
        return noneOf;
    }

    private static native long initialiseTrainingAPIBase(long j, int i);

    private static native String initialiseVersion();

    public static boolean isAndroid() {
        return System.getProperty(SystemProperties.JAVA_VENDOR, "generic").equals("The Android Project");
    }

    private static void load(String str) throws IOException {
        if (isAndroid()) {
            System.loadLibrary(str);
            return;
        }
        if (Boolean.TRUE.toString().equalsIgnoreCase(System.getProperty("onnxruntime.native." + str + ".skip"))) {
            logger.log(Level.FINE, "Skipping load of native library '" + str + "'");
            return;
        }
        String mapLibraryName = mapLibraryName(str);
        if (libraryDirPathProperty != null) {
            Logger logger2 = logger;
            Level level = Level.FINE;
            StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Attempting to load native library '", str, "' from specified path: ");
            m2m.append(libraryDirPathProperty);
            logger2.log(level, m2m.toString());
            File file = Paths.get(libraryDirPathProperty, mapLibraryName).toFile();
            String absolutePath = file.getAbsolutePath();
            if (!file.exists()) {
                Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Native library '", str, "' not found at ", absolutePath));
                return;
            }
            System.load(absolutePath);
            logger2.log(level, "Loaded native library '" + str + "' from specified path");
            return;
        }
        String property = System.getProperty("onnxruntime.native." + str + ".path");
        if (property != null) {
            Logger logger3 = logger;
            Level level2 = Level.FINE;
            logger3.log(level2, a$$ExternalSyntheticOutline0.m("Attempting to load native library '", str, "' from specified path: ", property));
            File file2 = new File(property);
            String absolutePath2 = file2.getAbsolutePath();
            if (!file2.exists()) {
                Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Native library '", str, "' not found at ", absolutePath2));
                return;
            }
            System.load(absolutePath2);
            logger3.log(level2, "Loaded native library '" + str + "' from specified path");
            return;
        }
        Optional<File> extractFromResources = extractFromResources(str);
        if (extractFromResources.isPresent()) {
            System.load(extractFromResources.get().getAbsolutePath());
            logger.log(Level.FINE, "Loaded native library '" + str + "' from resource path");
            return;
        }
        Logger logger4 = logger;
        Level level3 = Level.FINE;
        logger4.log(level3, "Attempting to load native library '" + str + "' from library path");
        System.loadLibrary(str);
        logger4.log(level3, "Loaded native library '" + str + "' from library path");
    }

    private static String mapLibraryName(String str) {
        return System.mapLibraryName(str).replace("jnilib", "dylib");
    }

    public static String version() {
        return version;
    }
}
