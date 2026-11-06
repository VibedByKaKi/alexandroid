package androidx.camera.video.internal;

import android.net.Uri;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.MediaStoreOutputOptions;
import androidx.camera.video.OutputOptions;
import androidx.camera.video.internal.utils.StorageUtil;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/camera/video/internal/OutputStorageImpl;", "Landroidx/camera/video/internal/OutputStorage;", "outputOptions", "Landroidx/camera/video/OutputOptions;", "(Landroidx/camera/video/OutputOptions;)V", "getAvailableBytes", "", "getOutputOptions", "Companion", "camera-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutputStorageImpl implements OutputStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "OutputStorageImpl";

    @NotNull
    private final OutputOptions outputOptions;

    public OutputStorageImpl(@NotNull OutputOptions outputOptions) {
        outputOptions.getClass();
        this.outputOptions = outputOptions;
    }

    @Override // androidx.camera.video.internal.OutputStorage
    public long getAvailableBytes() {
        OutputOptions outputOptions = this.outputOptions;
        if (outputOptions instanceof FileOutputOptions) {
            String path = ((FileOutputOptions) outputOptions).getFile().getPath();
            path.getClass();
            return StorageUtil.getAvailableBytes(path);
        }
        if (outputOptions instanceof MediaStoreOutputOptions) {
            Uri collectionUri = ((MediaStoreOutputOptions) outputOptions).getCollectionUri();
            collectionUri.getClass();
            return StorageUtil.getAvailableBytesForMediaStoreUri(collectionUri);
        }
        if (outputOptions instanceof FileDescriptorOutputOptions) {
            return Long.MAX_VALUE;
        }
        Buffer$$ExternalSyntheticBUOutline0.m(this.outputOptions, "Unknown OutputOptions: ");
        return 0L;
    }

    @Override // androidx.camera.video.internal.OutputStorage
    @NotNull
    public OutputOptions getOutputOptions() {
        return this.outputOptions;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/camera/video/internal/OutputStorageImpl$Companion;", "", "()V", Constants.LOG_TAG, "", "camera-video_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
