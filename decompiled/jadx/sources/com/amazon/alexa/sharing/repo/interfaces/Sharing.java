package com.amazon.alexa.sharing.repo.interfaces;

import com.amazon.alexa.sharing.repo.models.Result;
import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.LocalMediaMetadata;
import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.ReactionType;
import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.SharingMessageSchema;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface Sharing {
    ReactionType[] getReactionsForPhoto(String str);

    void openPhotoDetailView(String str, String str2, String str3);

    Result removeReactionInPhoto(String str, ReactionType reactionType);

    Result sendPhotosMediaMessage(LocalMediaMetadata[] localMediaMetadataArr, String str);

    Result sendReactionToPhoto(String str, ReactionType reactionType);

    Result sendSharedMediaMessage(SharingMessageSchema sharingMessageSchema, String str);

    void sharePhotoWith(String str, LocalMediaMetadata[] localMediaMetadataArr);
}
