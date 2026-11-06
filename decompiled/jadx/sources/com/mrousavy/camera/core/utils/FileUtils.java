package com.mrousavy.camera.core.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import com.amazon.alexa.hho.imagepicker.ImageCropActivity;
import com.mrousavy.camera.core.InvalidPathError;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/mrousavy/camera/core/utils/FileUtils;", "", "<init>", "()V", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FileUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007¨\u0006\u0012"}, d2 = {"Lcom/mrousavy/camera/core/utils/FileUtils$Companion;", "", "<init>", "()V", "getDirectory", "Ljava/io/File;", "path", "", "writeBitmapTofile", "", "bitmap", "Landroid/graphics/Bitmap;", "file", ImageCropActivity.EXTRA_QUALITY, "", "getImageSize", "Landroid/util/Size;", "imagePath", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final File getDirectory(@Nullable String path) {
            if (path == null) {
                throw new InvalidPathError("null");
            }
            File file = new File(path);
            if (file.isDirectory()) {
                return file;
            }
            throw new InvalidPathError(path);
        }

        @NotNull
        public final Size getImageSize(@NotNull String imagePath) {
            imagePath.getClass();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(imagePath, options);
            return new Size(options.outWidth, options.outHeight);
        }

        public final void writeBitmapTofile(@NotNull Bitmap bitmap, @NotNull File file, int quality) {
            bitmap.getClass();
            file.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, quality, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        }

        private Companion() {
        }
    }
}
