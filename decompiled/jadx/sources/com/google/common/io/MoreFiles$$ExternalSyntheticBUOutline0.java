package com.google.common.io;

import com.google.common.io.BaseEncoding;
import com.google.common.io.TempFileCreator;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MoreFiles$$ExternalSyntheticBUOutline0 implements TempFileCreator.JavaNioCreator.PermissionSupplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoreFiles$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new BaseEncoding.DecodingException(str + i);
    }

    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
    public FileAttribute get() {
        FileAttribute lambda$static$0;
        FileAttribute lambda$static$1;
        FileAttribute lambda$static$2;
        switch (this.$r8$classId) {
            case 1:
                lambda$static$0 = TempFileCreator.JavaNioCreator.lambda$static$0();
                return lambda$static$0;
            case 2:
                lambda$static$1 = TempFileCreator.JavaNioCreator.lambda$static$1();
                return lambda$static$1;
            default:
                lambda$static$2 = TempFileCreator.JavaNioCreator.lambda$static$2();
                return lambda$static$2;
        }
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IOException(str + obj);
    }
}
