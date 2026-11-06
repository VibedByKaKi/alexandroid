package com.amazon.photos.uploader.cds.multipart;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/LocalValidationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "errorCodeString", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCodeString", "()Ljava/lang/String;", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalValidationException extends Exception {

    @Nullable
    private final String errorCodeString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalValidationException(@NotNull String str, @Nullable String str2) {
        super(str);
        str.getClass();
        this.errorCodeString = str2;
    }

    @Nullable
    public final String getErrorCodeString() {
        return this.errorCodeString;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalValidationException(@NotNull String str) {
        this(str, null);
        str.getClass();
    }
}
