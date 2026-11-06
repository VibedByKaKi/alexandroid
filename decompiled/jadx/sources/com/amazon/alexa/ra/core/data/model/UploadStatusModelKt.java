package com.amazon.alexa.ra.core.data.model;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"processUploadStatus", "Lcom/amazon/alexa/ra/core/data/model/UploadStatus;", "", "Lcom/amazon/alexa/ra/core/data/model/UploadStatusMessage;", "id", "", "givenUploadStatus", "ui-ingress_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUploadStatusModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadStatusModel.kt\ncom/amazon/alexa/ra/core/data/model/UploadStatusModelKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
/* loaded from: classes18.dex */
public final class UploadStatusModelKt {
    @NotNull
    public static final UploadStatus processUploadStatus(@NotNull List<UploadStatusMessage> list, @NotNull String str, @NotNull UploadStatus uploadStatus) {
        Object obj;
        list.getClass();
        str.getClass();
        uploadStatus.getClass();
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.areEqual(((UploadStatusMessage) obj).getId(), str)) {
                break;
            }
        }
        UploadStatusMessage uploadStatusMessage = (UploadStatusMessage) obj;
        if (uploadStatusMessage != null) {
            if (uploadStatusMessage.isUploadFinalized()) {
                return uploadStatusMessage.getUploadStatus();
            }
            if (uploadStatusMessage.isUploading()) {
                uploadStatusMessage.setUploadStatus(uploadStatus);
                return uploadStatus;
            }
        } else if (uploadStatus == UploadStatus.UPLOADING) {
            list.add(new UploadStatusMessage(str, uploadStatus));
        }
        return uploadStatus;
    }
}
