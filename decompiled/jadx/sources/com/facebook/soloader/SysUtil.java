package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.Room$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.facebook.soloader.MinElf;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;
import javax.annotation.Nullable;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class SysUtil {
    private static final long APK_DEP_BLOCK_METADATA_LENGTH = 20;
    private static final byte APK_SIGNATURE_VERSION = 1;
    private static final String TAG = "SysUtil";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotOptimize
    @TargetApi(21)
    public static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @DoNotOptimize
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @DoNotOptimize
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(MinElf.ISA.AARCH64);
                    treeSet.add(MinElf.ISA.X86_64);
                } else {
                    treeSet.add(MinElf.ISA.ARM);
                    treeSet.add(MinElf.ISA.X86);
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                LogUtil.e(SysUtil.TAG, String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @DoNotOptimize
        public static boolean is64Bit() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotOptimize
    @TargetApi(23)
    public static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        @DoNotOptimize
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add(MinElf.ISA.AARCH64);
                treeSet.add(MinElf.ISA.X86_64);
            } else {
                treeSet.add(MinElf.ISA.ARM);
                treeSet.add(MinElf.ISA.X86);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @DoNotOptimize
        public static boolean is64Bit() {
            return Process.is64Bit();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        
            if (r1.getMethod() != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean isApkUncompressedDso(android.content.Context r5) throws java.io.IOException {
            /*
                java.io.File r0 = new java.io.File
                android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
                java.lang.String r5 = r5.sourceDir
                r0.<init>(r5)
                java.util.zip.ZipFile r5 = new java.util.zip.ZipFile
                r5.<init>(r0)
                java.util.Enumeration r0 = r5.entries()     // Catch: java.lang.Throwable -> L52
            L14:
                boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L52
                r2 = 0
                if (r1 == 0) goto L54
                java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L52
                java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: java.lang.Throwable -> L52
                if (r1 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L52
                java.lang.String r4 = ".so"
                boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L52
                if (r3 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L52
                java.lang.String r4 = "/lib"
                boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L52
                if (r3 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L52
                java.lang.String r4 = "assets/"
                boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L52
                if (r3 != 0) goto L14
                int r0 = r1.getMethod()     // Catch: java.lang.Throwable -> L52
                if (r0 != 0) goto L4e
                r2 = 1
            L4e:
                r5.close()
                return r2
            L52:
                r0 = move-exception
                goto L58
            L54:
                r5.close()
                return r2
            L58:
                r5.close()     // Catch: java.lang.Throwable -> L5c
                goto L60
            L5c:
                r5 = move-exception
                r0.addSuppressed(r5)
            L60:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.MarshmallowSysdeps.isApkUncompressedDso(android.content.Context):boolean");
        }

        public static boolean isDisabledExtractNativeLibs(@Nullable Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        public static boolean isSupportedDirectLoad(@Nullable Context context, int i) {
            if (i == 2) {
                return true;
            }
            return isDisabledExtractNativeLibs(context);
        }
    }

    public static int copyBytes(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    public static void deleteOrThrow(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            LogUtil.e(TAG, "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(ParcelCompat$$ExternalSyntheticOutline0.m(file, "Could not delete file "));
    }

    public static void dumbDelete(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                deleteOrThrow(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            deleteOrThrow((File) arrayList.get(size));
        }
    }

    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
    }

    public static int findAbiScore(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str2 != null && str.equals(str2)) {
                return i;
            }
        }
        return -1;
    }

    public static void fsyncAll(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles == null) {
                    Buffer$$ExternalSyntheticBUOutline0.m$2(ParcelCompat$$ExternalSyntheticOutline0.m(file2, "cannot list directory "));
                    return;
                }
                for (File file3 : listFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    LogUtil.e(TAG, "Syncing failed for " + file2 + ": " + e.getMessage());
                }
            }
        }
    }

    public static long getApkDepBlockLength(File file) throws IOException {
        return getParcelPadSize((file.getCanonicalFile().getPath().length() + 1) * 2) + 20;
    }

    public static int getAppVersionCode(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static String getBaseName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf > 0 ? str.substring(0, lastIndexOf) : str;
    }

    @DoNotOptimize
    @Nullable
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
            Room$$ExternalSyntheticBUOutline0.m$2("ClassLoader ", classLoader.getClass().getName(), " should be of type BaseDexClassLoader");
            return null;
        }
        try {
            return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
        } catch (Exception e) {
            LogUtil.e(TAG, "Cannot call getLdLibraryPath", e);
            return null;
        }
    }

    public static FileLocker getFileLocker(File file) throws IOException {
        return FileLocker.lock(file);
    }

    @DoNotOptimize
    @Nullable
    public static Method getNativeLoadRuntimeMethod() {
        return null;
    }

    @Nullable
    public static FileLocker getOrCreateLockOnDir(File file, File file2) throws IOException {
        boolean z;
        try {
            return getFileLocker(file2);
        } catch (FileNotFoundException e) {
            z = true;
            try {
                if (!file.setWritable(true)) {
                    throw e;
                }
                FileLocker fileLocker = getFileLocker(file2);
                if (!file.setWritable(false)) {
                    LogUtil.w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
                }
                return fileLocker;
            } catch (Throwable th) {
                th = th;
                if (z && !file.setWritable(false)) {
                    LogUtil.w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (z) {
                LogUtil.w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    private static long getParcelPadSize(long j) {
        return ((4 - (j % 4)) % 4) + j;
    }

    public static String[] getSupportedAbis() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean is64Bit() {
        return MarshmallowSysdeps.is64Bit();
    }

    public static boolean isDisabledExtractNativeLibs(Context context) {
        return MarshmallowSysdeps.isDisabledExtractNativeLibs(context);
    }

    public static boolean isSupportedDirectLoad(@Nullable Context context, int i) {
        return MarshmallowSysdeps.isSupportedDirectLoad(context, i);
    }

    public static byte[] makeApkDepBlock(File file, Context context) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 1);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(getAppVersionCode(context));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Nullable
    public static String makeNonZipPath(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains(MarkdownConstants.EXCLAMATION_MARK)) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    public static void mkdirOrThrow(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(ParcelCompat$$ExternalSyntheticOutline0.m(file, "cannot mkdir: "));
    }
}
