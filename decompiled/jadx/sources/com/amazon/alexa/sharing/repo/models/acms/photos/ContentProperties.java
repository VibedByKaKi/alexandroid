package com.amazon.alexa.sharing.repo.models.acms.photos;

import androidx.annotation.Nullable;
import com.amazon.alexa.sharing.repo.models.acms.photos.enums.AttachmentMediaType;
import com.amazon.alexa.sharing.repo.models.acms.photos.enums.FileExtension;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ContentProperties {

    @Nullable
    private Date creationDate;

    @Nullable
    private String data;
    private FileExtension fileExtension;
    private String filename;
    private int height;

    @Nullable
    private String localIdentifier;
    private AttachmentMediaType mediaType;

    @Nullable
    private String mime;

    @Nullable
    private Date modificationDate;

    @Nullable
    private int orientation;

    @Nullable
    private String path;

    @Nullable
    private int size;

    @Nullable
    private String sourceURL;
    private String thumbnailUri;
    private int width;
}
