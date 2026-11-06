package com.amazon.alexa.ra.core.ui.custom;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.core.ui.custom.MediaThumbnailsForCamKt$FileThumbnailImageContainer$1$1$1", f = "MediaThumbnailsForCam.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes18.dex */
public final class MediaThumbnailsForCamKt$FileThumbnailImageContainer$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fileExtension;
    final /* synthetic */ float $height;
    final /* synthetic */ Function4<Uri, String, Integer, Integer, Unit> $loadDocumentThumbnail;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ float $width;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaThumbnailsForCamKt$FileThumbnailImageContainer$1$1$1(Function4<? super Uri, ? super String, ? super Integer, ? super Integer, Unit> function4, Uri uri, String str, float f, float f2, Continuation<? super MediaThumbnailsForCamKt$FileThumbnailImageContainer$1$1$1> continuation) {
        super(2, continuation);
        this.$loadDocumentThumbnail = function4;
        this.$uri = uri;
        this.$fileExtension = str;
        this.$width = f;
        this.$height = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaThumbnailsForCamKt$FileThumbnailImageContainer$1$1$1(this.$loadDocumentThumbnail, this.$uri, this.$fileExtension, this.$width, this.$height, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaThumbnailsForCamKt$FileThumbnailImageContainer$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        this.$loadDocumentThumbnail.invoke(this.$uri, this.$fileExtension, Boxing.boxInt((int) this.$width), Boxing.boxInt((int) this.$height));
        return Unit.INSTANCE;
    }
}
