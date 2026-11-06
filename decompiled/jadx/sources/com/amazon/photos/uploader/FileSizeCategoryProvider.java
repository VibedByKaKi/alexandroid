package com.amazon.photos.uploader;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.dee.app.elements.bridges.LeapfrogSceneAssetsDownloader;
import java.io.File;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.openjdk.tools.javac.code.Flags;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\nJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000f"}, d2 = {"Lcom/amazon/photos/uploader/FileSizeCategoryProvider;", "", "()V", "getFileSize", "", "filePath", "", "getFileSizeCategory", "Lcom/amazon/photos/uploader/FileSizeCategoryProvider$FileSizeCategory;", MetricsConstants.Type.FILE_SIZE, "getFileSizeCategory$AndroidPhotosUploader_release", "getFileSizeSafe", "Companion", "FileSizeCategory", "FileSizeGroupCategory", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileSizeCategoryProvider {
    private static final long ONE_GIG_BYTE = 1073741824;
    private static final long ONE_MEGA_BYTE = 1048576;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/amazon/photos/uploader/FileSizeCategoryProvider$FileSizeCategory;", "", "sizeGroupCategory", "Lcom/amazon/photos/uploader/FileSizeCategoryProvider$FileSizeGroupCategory;", "maxBytesForCategory", "", "(Ljava/lang/String;ILcom/amazon/photos/uploader/FileSizeCategoryProvider$FileSizeGroupCategory;J)V", "getMaxBytesForCategory$AndroidPhotosUploader_release", "()J", "getSizeGroupCategory$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/FileSizeCategoryProvider$FileSizeGroupCategory;", "UNKNOWN_SIZE", "LESS_THAN_2MB", "BETWEEN_2MB_5MB", "BETWEEN_5MB_10MB", "BETWEEN_10MB_16MB", "BETWEEN_16MB_32MB", "BETWEEN_32MB_64MB", "BETWEEN_64MB_128MB", "BETWEEN_128MB_264MB", "BETWEEN_264MB_512MB", "BETWEEN_512MB_1024MB", "BETWEEN_1GB_2GB", "BETWEEN_2GB_4GB", "BETWEEN_4GB_8GB", "BETWEEN_8GB_16GB", "MORE_THAN_16GB", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FileSizeCategory {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FileSizeCategory[] $VALUES;
        public static final FileSizeCategory BETWEEN_10MB_16MB;
        public static final FileSizeCategory BETWEEN_128MB_264MB;
        public static final FileSizeCategory BETWEEN_16MB_32MB;
        public static final FileSizeCategory BETWEEN_1GB_2GB;
        public static final FileSizeCategory BETWEEN_264MB_512MB;
        public static final FileSizeCategory BETWEEN_2GB_4GB;
        public static final FileSizeCategory BETWEEN_2MB_5MB;
        public static final FileSizeCategory BETWEEN_32MB_64MB;
        public static final FileSizeCategory BETWEEN_4GB_8GB;
        public static final FileSizeCategory BETWEEN_512MB_1024MB;
        public static final FileSizeCategory BETWEEN_5MB_10MB;
        public static final FileSizeCategory BETWEEN_64MB_128MB;
        public static final FileSizeCategory BETWEEN_8GB_16GB;
        public static final FileSizeCategory LESS_THAN_2MB;
        public static final FileSizeCategory MORE_THAN_16GB;
        public static final FileSizeCategory UNKNOWN_SIZE = new FileSizeCategory("UNKNOWN_SIZE", 0, FileSizeGroupCategory.UNKNOWN_FILE, 0);
        private final long maxBytesForCategory;

        @NotNull
        private final FileSizeGroupCategory sizeGroupCategory;

        private static final /* synthetic */ FileSizeCategory[] $values() {
            return new FileSizeCategory[]{UNKNOWN_SIZE, LESS_THAN_2MB, BETWEEN_2MB_5MB, BETWEEN_5MB_10MB, BETWEEN_10MB_16MB, BETWEEN_16MB_32MB, BETWEEN_32MB_64MB, BETWEEN_64MB_128MB, BETWEEN_128MB_264MB, BETWEEN_264MB_512MB, BETWEEN_512MB_1024MB, BETWEEN_1GB_2GB, BETWEEN_2GB_4GB, BETWEEN_4GB_8GB, BETWEEN_8GB_16GB, MORE_THAN_16GB};
        }

        static {
            FileSizeGroupCategory fileSizeGroupCategory = FileSizeGroupCategory.SMALL_FILE;
            LESS_THAN_2MB = new FileSizeCategory("LESS_THAN_2MB", 1, fileSizeGroupCategory, 2097152L);
            BETWEEN_2MB_5MB = new FileSizeCategory("BETWEEN_2MB_5MB", 2, fileSizeGroupCategory, 5242880L);
            BETWEEN_5MB_10MB = new FileSizeCategory("BETWEEN_5MB_10MB", 3, fileSizeGroupCategory, 10485760L);
            BETWEEN_10MB_16MB = new FileSizeCategory("BETWEEN_10MB_16MB", 4, fileSizeGroupCategory, 16777216L);
            FileSizeGroupCategory fileSizeGroupCategory2 = FileSizeGroupCategory.BIG_FILE;
            BETWEEN_16MB_32MB = new FileSizeCategory("BETWEEN_16MB_32MB", 5, fileSizeGroupCategory2, LeapfrogSceneAssetsDownloader.MAX_ARTIFACT_BYTES);
            BETWEEN_32MB_64MB = new FileSizeCategory("BETWEEN_32MB_64MB", 6, fileSizeGroupCategory2, 67108864L);
            BETWEEN_64MB_128MB = new FileSizeCategory("BETWEEN_64MB_128MB", 7, fileSizeGroupCategory2, 134217728L);
            BETWEEN_128MB_264MB = new FileSizeCategory("BETWEEN_128MB_264MB", 8, fileSizeGroupCategory2, 276824064L);
            BETWEEN_264MB_512MB = new FileSizeCategory("BETWEEN_264MB_512MB", 9, fileSizeGroupCategory2, 536870912L);
            BETWEEN_512MB_1024MB = new FileSizeCategory("BETWEEN_512MB_1024MB", 10, fileSizeGroupCategory2, 1073741824L);
            BETWEEN_1GB_2GB = new FileSizeCategory("BETWEEN_1GB_2GB", 11, fileSizeGroupCategory2, Flags.BRIDGE);
            BETWEEN_2GB_4GB = new FileSizeCategory("BETWEEN_2GB_4GB", 12, fileSizeGroupCategory2, 4294967296L);
            BETWEEN_4GB_8GB = new FileSizeCategory("BETWEEN_4GB_8GB", 13, fileSizeGroupCategory2, 8589934592L);
            BETWEEN_8GB_16GB = new FileSizeCategory("BETWEEN_8GB_16GB", 14, fileSizeGroupCategory2, Flags.VARARGS);
            MORE_THAN_16GB = new FileSizeCategory("MORE_THAN_16GB", 15, fileSizeGroupCategory2, Long.MAX_VALUE);
            FileSizeCategory[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private FileSizeCategory(String str, int i, FileSizeGroupCategory fileSizeGroupCategory, long j) {
            this.sizeGroupCategory = fileSizeGroupCategory;
            this.maxBytesForCategory = j;
        }

        @NotNull
        public static EnumEntries<FileSizeCategory> getEntries() {
            return $ENTRIES;
        }

        public static FileSizeCategory valueOf(String str) {
            return (FileSizeCategory) Enum.valueOf(FileSizeCategory.class, str);
        }

        public static FileSizeCategory[] values() {
            return (FileSizeCategory[]) $VALUES.clone();
        }

        /* renamed from: getMaxBytesForCategory$AndroidPhotosUploader_release, reason: from getter */
        public final long getMaxBytesForCategory() {
            return this.maxBytesForCategory;
        }

        @NotNull
        /* renamed from: getSizeGroupCategory$AndroidPhotosUploader_release, reason: from getter */
        public final FileSizeGroupCategory getSizeGroupCategory() {
            return this.sizeGroupCategory;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/photos/uploader/FileSizeCategoryProvider$FileSizeGroupCategory;", "", "(Ljava/lang/String;I)V", "UNKNOWN_FILE", "SMALL_FILE", "BIG_FILE", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FileSizeGroupCategory {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FileSizeGroupCategory[] $VALUES;
        public static final FileSizeGroupCategory UNKNOWN_FILE = new FileSizeGroupCategory("UNKNOWN_FILE", 0);
        public static final FileSizeGroupCategory SMALL_FILE = new FileSizeGroupCategory("SMALL_FILE", 1);
        public static final FileSizeGroupCategory BIG_FILE = new FileSizeGroupCategory("BIG_FILE", 2);

        private static final /* synthetic */ FileSizeGroupCategory[] $values() {
            return new FileSizeGroupCategory[]{UNKNOWN_FILE, SMALL_FILE, BIG_FILE};
        }

        static {
            FileSizeGroupCategory[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private FileSizeGroupCategory(String str, int i) {
        }

        @NotNull
        public static EnumEntries<FileSizeGroupCategory> getEntries() {
            return $ENTRIES;
        }

        public static FileSizeGroupCategory valueOf(String str) {
            return (FileSizeGroupCategory) Enum.valueOf(FileSizeGroupCategory.class, str);
        }

        public static FileSizeGroupCategory[] values() {
            return (FileSizeGroupCategory[]) $VALUES.clone();
        }
    }

    private final FileSizeCategory getFileSizeCategory(long fileSize) {
        FileSizeCategory fileSizeCategory;
        FileSizeCategory[] values = FileSizeCategory.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fileSizeCategory = null;
                break;
            }
            fileSizeCategory = values[i];
            if (fileSize < fileSizeCategory.getMaxBytesForCategory()) {
                break;
            }
            i++;
        }
        return fileSizeCategory == null ? FileSizeCategory.MORE_THAN_16GB : fileSizeCategory;
    }

    private final long getFileSizeSafe(String filePath) {
        try {
            return getFileSize(filePath);
        } catch (Exception unused) {
            return -1L;
        }
    }

    @VisibleForTesting
    public final long getFileSize(@NotNull String filePath) {
        filePath.getClass();
        return new File(filePath).length();
    }

    @NotNull
    public final FileSizeCategory getFileSizeCategory$AndroidPhotosUploader_release(@NotNull String filePath) {
        filePath.getClass();
        return getFileSizeCategory(getFileSizeSafe(filePath));
    }
}
