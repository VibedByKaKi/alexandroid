package com.facebook.imagepipeline.transcoder;

import android.graphics.ColorSpace;
import com.amazon.alexa.hho.imagepicker.ImageCropActivity;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JO\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH&R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/imagepipeline/transcoder/ImageTranscoder;", "", "transcode", "Lcom/facebook/imagepipeline/transcoder/ImageTranscodeResult;", "encodedImage", "Lcom/facebook/imagepipeline/image/EncodedImage;", "outputStream", "Ljava/io/OutputStream;", "rotationOptions", "Lcom/facebook/imagepipeline/common/RotationOptions;", "resizeOptions", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "outputFormat", "Lcom/facebook/imageformat/ImageFormat;", ImageCropActivity.EXTRA_QUALITY, "", "colorSpace", "Landroid/graphics/ColorSpace;", "(Lcom/facebook/imagepipeline/image/EncodedImage;Ljava/io/OutputStream;Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lcom/facebook/imageformat/ImageFormat;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Lcom/facebook/imagepipeline/transcoder/ImageTranscodeResult;", "canResize", "", "canTranscode", "imageFormat", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ImageTranscoder {
    boolean canResize(@NotNull EncodedImage encodedImage, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions);

    boolean canTranscode(@NotNull ImageFormat imageFormat);

    @NotNull
    String getIdentifier();

    @NotNull
    ImageTranscodeResult transcode(@NotNull EncodedImage encodedImage, @NotNull OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @Nullable ImageFormat outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws IOException;
}
