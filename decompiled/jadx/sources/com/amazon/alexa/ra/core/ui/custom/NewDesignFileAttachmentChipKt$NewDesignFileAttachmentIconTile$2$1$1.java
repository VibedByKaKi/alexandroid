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
@DebugMetadata(c = "com.amazon.alexa.ra.core.ui.custom.NewDesignFileAttachmentChipKt$NewDesignFileAttachmentIconTile$2$1$1", f = "NewDesignFileAttachmentChip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes18.dex */
public final class NewDesignFileAttachmentChipKt$NewDesignFileAttachmentIconTile$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fileExtension;
    final /* synthetic */ Function4<Uri, String, Integer, Integer, Unit> $loadDocumentThumbnail;
    final /* synthetic */ float $previewHeight;
    final /* synthetic */ float $previewWidth;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewDesignFileAttachmentChipKt$NewDesignFileAttachmentIconTile$2$1$1(Function4<? super Uri, ? super String, ? super Integer, ? super Integer, Unit> function4, Uri uri, String str, float f, float f2, Continuation<? super NewDesignFileAttachmentChipKt$NewDesignFileAttachmentIconTile$2$1$1> continuation) {
        super(2, continuation);
        this.$loadDocumentThumbnail = function4;
        this.$uri = uri;
        this.$fileExtension = str;
        this.$previewWidth = f;
        this.$previewHeight = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewDesignFileAttachmentChipKt$NewDesignFileAttachmentIconTile$2$1$1(this.$loadDocumentThumbnail, this.$uri, this.$fileExtension, this.$previewWidth, this.$previewHeight, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewDesignFileAttachmentChipKt$NewDesignFileAttachmentIconTile$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        this.$loadDocumentThumbnail.invoke(this.$uri, this.$fileExtension, Boxing.boxInt((int) this.$previewWidth), Boxing.boxInt((int) this.$previewHeight));
        return Unit.INSTANCE;
    }
}
