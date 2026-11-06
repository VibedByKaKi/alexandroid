package com.google.common.io;

import com.amazon.alexa.mobilytics.event.LogLevel;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.io.TempFileCreator;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
abstract class TempFileCreator {
    static final TempFileCreator INSTANCE = pickSecureCreator();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JavaIoCreator extends TempFileCreator {
        private static final int TEMP_DIR_ATTEMPTS = 10000;

        private JavaIoCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        public File createTempDir() {
            File file = new File(StandardSystemProperty.JAVA_IO_TMPDIR.value());
            String str = System.currentTimeMillis() + "-";
            for (int i = 0; i < 10000; i++) {
                File file2 = new File(file, str + i);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Failed to create directory within 10000 attempts (tried ", str, "0 to ", str, "9999)"));
            return null;
        }

        @Override // com.google.common.io.TempFileCreator
        public File createTempFile(String str) throws IOException {
            return File.createTempFile(str, null, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ThrowingCreator extends TempFileCreator {
        private static final String MESSAGE = "Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().";

        private ThrowingCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        public File createTempDir() {
            throw new IllegalStateException(MESSAGE);
        }

        @Override // com.google.common.io.TempFileCreator
        public File createTempFile(String str) throws IOException {
            throw new IOException(MESSAGE);
        }
    }

    private static TempFileCreator pickSecureCreator() {
        try {
            try {
                return new JavaNioCreator();
            } catch (ClassNotFoundException unused) {
                return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new ThrowingCreator() : new JavaIoCreator();
            }
        } catch (ClassNotFoundException unused2) {
            return new ThrowingCreator();
        } catch (IllegalAccessException unused3) {
            return new ThrowingCreator();
        } catch (NoSuchFieldException unused4) {
            return new ThrowingCreator();
        }
    }

    @VisibleForTesting
    @IgnoreJRERequirement
    public static void testMakingUserPermissionsFromScratch() throws IOException {
        JavaNioCreator.userPermissions().get();
    }

    public abstract File createTempDir();

    public abstract File createTempFile(String str) throws IOException;

    private TempFileCreator() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @IgnoreJRERequirement
    public static final class JavaNioCreator extends TempFileCreator {
        private static final PermissionSupplier directoryPermissions;
        private static final PermissionSupplier filePermissions;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @IgnoreJRERequirement
        public interface PermissionSupplier {
            FileAttribute<?> get() throws IOException;
        }

        static {
            Set<String> supportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (supportedFileAttributeViews.contains("posix")) {
                filePermissions = new MoreFiles$$ExternalSyntheticBUOutline0(1);
                directoryPermissions = new MoreFiles$$ExternalSyntheticBUOutline0(2);
            } else if (supportedFileAttributeViews.contains("acl")) {
                PermissionSupplier userPermissions = userPermissions();
                directoryPermissions = userPermissions;
                filePermissions = userPermissions;
            } else {
                MoreFiles$$ExternalSyntheticBUOutline0 moreFiles$$ExternalSyntheticBUOutline0 = new MoreFiles$$ExternalSyntheticBUOutline0(3);
                directoryPermissions = moreFiles$$ExternalSyntheticBUOutline0;
                filePermissions = moreFiles$$ExternalSyntheticBUOutline0;
            }
        }

        private JavaNioCreator() {
            super();
        }

        private static String getUsername() {
            String value = StandardSystemProperty.USER_NAME.value();
            Objects.requireNonNull(value);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", null);
                Method method2 = cls.getMethod(LogLevel.INFO, null);
                Object invoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), value);
                Objects.requireNonNull(invoke);
                return (String) invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return value;
            } catch (InvocationTargetException e) {
                Throwables.throwIfUnchecked(e.getCause());
                return value;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$static$0() throws IOException {
            return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$static$1() throws IOException {
            return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$static$2() throws IOException {
            throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$userPermissions$1(IOException iOException) throws IOException {
            throw new IOException("Could not find user", iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static PermissionSupplier userPermissions() {
            try {
                final ImmutableList of = ImmutableList.of(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(getUsername())).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build());
                final FileAttribute<ImmutableList<AclEntry>> fileAttribute = new FileAttribute<ImmutableList<AclEntry>>() { // from class: com.google.common.io.TempFileCreator.JavaNioCreator.1
                    @Override // java.nio.file.attribute.FileAttribute
                    public String name() {
                        return "acl:acl";
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.nio.file.attribute.FileAttribute
                    public ImmutableList<AclEntry> value() {
                        return ImmutableList.this;
                    }
                };
                final int i = 0;
                return new PermissionSupplier() { // from class: com.google.common.io.TempFileCreator$JavaNioCreator$$ExternalSyntheticLambda3
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        FileAttribute lambda$userPermissions$0;
                        FileAttribute lambda$userPermissions$1;
                        int i2 = i;
                        Object obj = fileAttribute;
                        switch (i2) {
                            case 0:
                                lambda$userPermissions$0 = TempFileCreator.JavaNioCreator.lambda$userPermissions$0((FileAttribute) obj);
                                return lambda$userPermissions$0;
                            default:
                                lambda$userPermissions$1 = TempFileCreator.JavaNioCreator.lambda$userPermissions$1((IOException) obj);
                                return lambda$userPermissions$1;
                        }
                    }
                };
            } catch (IOException e) {
                final int i2 = 1;
                return new PermissionSupplier() { // from class: com.google.common.io.TempFileCreator$JavaNioCreator$$ExternalSyntheticLambda3
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() {
                        FileAttribute lambda$userPermissions$0;
                        FileAttribute lambda$userPermissions$1;
                        int i22 = i2;
                        Object obj = e;
                        switch (i22) {
                            case 0:
                                lambda$userPermissions$0 = TempFileCreator.JavaNioCreator.lambda$userPermissions$0((FileAttribute) obj);
                                return lambda$userPermissions$0;
                            default:
                                lambda$userPermissions$1 = TempFileCreator.JavaNioCreator.lambda$userPermissions$1((IOException) obj);
                                return lambda$userPermissions$1;
                        }
                    }
                };
            }
        }

        @Override // com.google.common.io.TempFileCreator
        public File createTempDir() {
            try {
                return java.nio.file.Files.createTempDirectory(Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), null, directoryPermissions.get()).toFile();
            } catch (IOException e) {
                Single$$ExternalSyntheticBUOutline0.m$1("Failed to create directory", e);
                return null;
            }
        }

        @Override // com.google.common.io.TempFileCreator
        public File createTempFile(String str) throws IOException {
            return java.nio.file.Files.createTempFile(Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]), str, null, filePermissions.get()).toFile();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ FileAttribute lambda$userPermissions$0(FileAttribute fileAttribute) throws IOException {
            return fileAttribute;
        }
    }
}
