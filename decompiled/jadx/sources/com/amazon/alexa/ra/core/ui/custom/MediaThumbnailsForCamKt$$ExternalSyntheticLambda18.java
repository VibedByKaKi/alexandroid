package com.amazon.alexa.ra.core.ui.custom;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class MediaThumbnailsForCamKt$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Uri f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Function4 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ MediaThumbnailsForCamKt$$ExternalSyntheticLambda18(Uri uri, String str, Function1 function1, Function4 function4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = uri;
        this.f$1 = str;
        this.f$2 = function1;
        this.f$3 = function4;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit FileThumbnailImageContainer$lambda$28;
        Unit NewDesignFileAttachmentIconTile$lambda$9;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                FileThumbnailImageContainer$lambda$28 = MediaThumbnailsForCamKt.FileThumbnailImageContainer$lambda$28(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue);
                return FileThumbnailImageContainer$lambda$28;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                NewDesignFileAttachmentIconTile$lambda$9 = NewDesignFileAttachmentChipKt.NewDesignFileAttachmentIconTile$lambda$9(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue2);
                return NewDesignFileAttachmentIconTile$lambda$9;
        }
    }
}
