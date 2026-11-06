package com.amazon.photos.uploader.internal.dao;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/amazon/photos/uploader/internal/dao/UploadStateQueries;", "", "()V", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadStateQueries {

    @NotNull
    public static final String GET_REQUESTS_FOR_STATES_QUERY = "SELECT * FROM upload_request WHERE state IN(:states) ORDER BY id DESC";

    @NotNull
    public static final String GET_REQUESTS_FOR_STATES_WITH_QUEUE = "SELECT * FROM upload_request WHERE state IN(:states) AND queue IN(:queues) ORDER BY id DESC";

    @NotNull
    public static final String GET_REQUESTS_FOR_STATE_QUERY = "SELECT * FROM upload_request WHERE state = :state ORDER BY id DESC";

    @NotNull
    public static final String GET_REQUESTS_FOR_STATE_WITH_QUEUE = "SELECT * FROM upload_request WHERE state = :state AND queue IN(:queues) ORDER BY id DESC";

    @NotNull
    public static final String PENDING_STATES = "('RUNNING', 'BLOCKED', 'ENQUEUED')";
}
