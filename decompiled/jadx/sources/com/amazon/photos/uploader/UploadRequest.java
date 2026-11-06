package com.amazon.photos.uploader;

import android.net.Uri;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.photos.uploader.blockers.Blocker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(unique = true, value = {"file_path"})}, tableName = "upload_request")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bL\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\"\u001a\u00020#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010&J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u000fHÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010V\u001a\u00020\u0019HÆ\u0003J\t\u0010W\u001a\u00020\u0019HÆ\u0003J\t\u0010X\u001a\u00020\u000bHÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0019HÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010`\u001a\u00020#HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010g\u001a\u00020\u000bHÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J·\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010k\u001a\u00020\u000b2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020\u0019HÖ\u0001J\t\u0010n\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u001e\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0016\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0018\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0018\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0016\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010(R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010,R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010*R\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010*¨\u0006o"}, d2 = {"Lcom/amazon/photos/uploader/UploadRequest;", "", "id", "", "filePath", "", "uploadPath", "contentDate", SierraContentProviderContract.MD5_VALUE, "visualDigest", "suppressDeduplication", "", "renameOnNameConflict", "uploadCategory", "state", "Lcom/amazon/photos/uploader/UploadState;", "queue", "currentProgress", "maxProgress", "errorCode", "errorCategory", "Lcom/amazon/photos/uploader/UploadErrorCategory;", "blocker", "Lcom/amazon/photos/uploader/blockers/Blocker;", "totalAttemptCount", "", "attemptCount", "maxAttemptsExceeded", "creationTimeMillis", MetricsConstants.Type.FILE_SIZE, "priority", "addToFamilyVault", "appData", Message.SERIALIZED_NAME_PARENT_ID, "contentUri", "Landroid/net/Uri;", "visualCollectionParentId", "metadata", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/amazon/photos/uploader/UploadState;Ljava/lang/String;JJLjava/lang/String;Lcom/amazon/photos/uploader/UploadErrorCategory;Lcom/amazon/photos/uploader/blockers/Blocker;IIZJJIZLjava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "getAddToFamilyVault", "()Z", "getAppData", "()Ljava/lang/String;", "getAttemptCount", "()I", "getBlocker", "()Lcom/amazon/photos/uploader/blockers/Blocker;", "getContentDate", "getContentUri", "()Landroid/net/Uri;", "getCreationTimeMillis", "()J", "setCreationTimeMillis", "(J)V", "getCurrentProgress", "getErrorCategory", "()Lcom/amazon/photos/uploader/UploadErrorCategory;", "getErrorCode", "getFilePath", "getFileSize", "setFileSize", "getId", "getMaxAttemptsExceeded", "getMaxProgress", "getMd5", "getMetadata", "getParentId", "getPriority", "getQueue", "getRenameOnNameConflict", "getState", "()Lcom/amazon/photos/uploader/UploadState;", "getSuppressDeduplication", "getTotalAttemptCount", "getUploadCategory", "getUploadPath", "getVisualCollectionParentId", "getVisualDigest", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadRequest {

    @ColumnInfo(name = "add_to_family_vault")
    private final boolean addToFamilyVault;

    @ColumnInfo(name = "app_data")
    @Nullable
    private final String appData;

    @ColumnInfo(name = "attempt_count")
    private final int attemptCount;

    @ColumnInfo(name = "blocker")
    @Nullable
    private final Blocker blocker;

    @ColumnInfo(name = "content_date")
    @Nullable
    private final String contentDate;

    @ColumnInfo(name = "content_uri")
    @NotNull
    private final Uri contentUri;

    @ColumnInfo(name = "creation_time_millis")
    private long creationTimeMillis;

    @ColumnInfo(name = "current_progress")
    private final long currentProgress;

    @ColumnInfo(name = "error_category")
    @Nullable
    private final UploadErrorCategory errorCategory;

    @ColumnInfo(name = "error_code")
    @Nullable
    private final String errorCode;

    @ColumnInfo(name = "file_path")
    @NotNull
    private final String filePath;

    @ColumnInfo(name = "file_size")
    private long fileSize;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private final long id;

    @ColumnInfo(name = "max_attempts_exceeded")
    private final boolean maxAttemptsExceeded;

    @ColumnInfo(name = "max_progress")
    private final long maxProgress;

    @ColumnInfo(name = SierraContentProviderContract.MD5_VALUE)
    @Nullable
    private final String md5;

    @ColumnInfo(name = "metadata")
    @Nullable
    private final String metadata;

    @ColumnInfo(name = "parent_id")
    @Nullable
    private final String parentId;

    @ColumnInfo(name = "priority")
    private final int priority;

    @ColumnInfo(name = "queue")
    @NotNull
    private final String queue;

    @ColumnInfo(name = "rename_on_name_conflict")
    private final boolean renameOnNameConflict;

    @ColumnInfo(name = "state")
    @NotNull
    private final UploadState state;

    @ColumnInfo(name = "suppress_duplication")
    private final boolean suppressDeduplication;

    @ColumnInfo(name = "total_attempt_count")
    private final int totalAttemptCount;

    @ColumnInfo(name = "upload_category")
    @NotNull
    private final String uploadCategory;

    @ColumnInfo(name = "upload_path")
    @Nullable
    private final String uploadPath;

    @ColumnInfo(name = "visual_collection_parent_id")
    @Nullable
    private final String visualCollectionParentId;

    @ColumnInfo(name = "visual_digest")
    @Nullable
    private final String visualDigest;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ UploadRequest(long r39, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, boolean r46, boolean r47, java.lang.String r48, com.amazon.photos.uploader.UploadState r49, java.lang.String r50, long r51, long r53, java.lang.String r55, com.amazon.photos.uploader.UploadErrorCategory r56, com.amazon.photos.uploader.blockers.Blocker r57, int r58, int r59, boolean r60, long r61, long r63, int r65, boolean r66, java.lang.String r67, java.lang.String r68, android.net.Uri r69, java.lang.String r70, java.lang.String r71, int r72, kotlin.jvm.internal.DefaultConstructorMarker r73) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.photos.uploader.UploadRequest.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.amazon.photos.uploader.UploadState, java.lang.String, long, long, java.lang.String, com.amazon.photos.uploader.UploadErrorCategory, com.amazon.photos.uploader.blockers.Blocker, int, int, boolean, long, long, int, boolean, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ UploadRequest copy$default(UploadRequest uploadRequest, long j, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, UploadState uploadState, String str7, long j2, long j3, String str8, UploadErrorCategory uploadErrorCategory, Blocker blocker, int i, int i2, boolean z3, long j4, long j5, int i3, boolean z4, String str9, String str10, Uri uri, String str11, String str12, int i4, Object obj) {
        String str13;
        String str14;
        long j6;
        Blocker blocker2;
        int i5;
        int i6;
        String str15;
        boolean z5;
        long j7;
        long j8;
        int i7;
        String str16;
        String str17;
        Uri uri2;
        UploadRequest uploadRequest2;
        boolean z6;
        UploadErrorCategory uploadErrorCategory2;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        boolean z7;
        boolean z8;
        String str23;
        UploadState uploadState2;
        String str24;
        long j9;
        long j10 = (i4 & 1) != 0 ? uploadRequest.id : j;
        String str25 = (i4 & 2) != 0 ? uploadRequest.filePath : str;
        String str26 = (i4 & 4) != 0 ? uploadRequest.uploadPath : str2;
        String str27 = (i4 & 8) != 0 ? uploadRequest.contentDate : str3;
        String str28 = (i4 & 16) != 0 ? uploadRequest.md5 : str4;
        String str29 = (i4 & 32) != 0 ? uploadRequest.visualDigest : str5;
        boolean z9 = (i4 & 64) != 0 ? uploadRequest.suppressDeduplication : z;
        boolean z10 = (i4 & 128) != 0 ? uploadRequest.renameOnNameConflict : z2;
        String str30 = (i4 & 256) != 0 ? uploadRequest.uploadCategory : str6;
        UploadState uploadState3 = (i4 & 512) != 0 ? uploadRequest.state : uploadState;
        String str31 = (i4 & 1024) != 0 ? uploadRequest.queue : str7;
        long j11 = (i4 & 2048) != 0 ? uploadRequest.currentProgress : j2;
        long j12 = j10;
        long j13 = (i4 & 4096) != 0 ? uploadRequest.maxProgress : j3;
        String str32 = (i4 & 8192) != 0 ? uploadRequest.errorCode : str8;
        UploadErrorCategory uploadErrorCategory3 = (i4 & 16384) != 0 ? uploadRequest.errorCategory : uploadErrorCategory;
        Blocker blocker3 = (i4 & 32768) != 0 ? uploadRequest.blocker : blocker;
        int i8 = (i4 & 65536) != 0 ? uploadRequest.totalAttemptCount : i;
        int i9 = (i4 & 131072) != 0 ? uploadRequest.attemptCount : i2;
        boolean z11 = (i4 & 262144) != 0 ? uploadRequest.maxAttemptsExceeded : z3;
        String str33 = str32;
        long j14 = (i4 & 524288) != 0 ? uploadRequest.creationTimeMillis : j4;
        long j15 = (i4 & 1048576) != 0 ? uploadRequest.fileSize : j5;
        int i10 = (i4 & 2097152) != 0 ? uploadRequest.priority : i3;
        boolean z12 = (i4 & 4194304) != 0 ? uploadRequest.addToFamilyVault : z4;
        int i11 = i10;
        String str34 = (i4 & 8388608) != 0 ? uploadRequest.appData : str9;
        String str35 = (i4 & 16777216) != 0 ? uploadRequest.parentId : str10;
        Uri uri3 = (i4 & 33554432) != 0 ? uploadRequest.contentUri : uri;
        String str36 = (i4 & 67108864) != 0 ? uploadRequest.visualCollectionParentId : str11;
        if ((i4 & 134217728) != 0) {
            str14 = str36;
            str13 = uploadRequest.metadata;
            blocker2 = blocker3;
            i5 = i8;
            i6 = i9;
            str15 = str33;
            z5 = z11;
            j7 = j14;
            j8 = j15;
            i7 = i11;
            str16 = str34;
            str17 = str35;
            uri2 = uri3;
            z6 = z12;
            uploadErrorCategory2 = uploadErrorCategory3;
            str18 = str25;
            str19 = str26;
            str20 = str27;
            str21 = str28;
            str22 = str29;
            z7 = z9;
            z8 = z10;
            str23 = str30;
            uploadState2 = uploadState3;
            str24 = str31;
            j9 = j11;
            j6 = j13;
            uploadRequest2 = uploadRequest;
        } else {
            str13 = str12;
            str14 = str36;
            j6 = j13;
            blocker2 = blocker3;
            i5 = i8;
            i6 = i9;
            str15 = str33;
            z5 = z11;
            j7 = j14;
            j8 = j15;
            i7 = i11;
            str16 = str34;
            str17 = str35;
            uri2 = uri3;
            uploadRequest2 = uploadRequest;
            z6 = z12;
            uploadErrorCategory2 = uploadErrorCategory3;
            str18 = str25;
            str19 = str26;
            str20 = str27;
            str21 = str28;
            str22 = str29;
            z7 = z9;
            z8 = z10;
            str23 = str30;
            uploadState2 = uploadState3;
            str24 = str31;
            j9 = j11;
        }
        return uploadRequest2.copy(j12, str18, str19, str20, str21, str22, z7, z8, str23, uploadState2, str24, j9, j6, str15, uploadErrorCategory2, blocker2, i5, i6, z5, j7, j8, i7, z6, str16, str17, uri2, str14, str13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final UploadState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getQueue() {
        return this.queue;
    }

    /* renamed from: component12, reason: from getter */
    public final long getCurrentProgress() {
        return this.currentProgress;
    }

    /* renamed from: component13, reason: from getter */
    public final long getMaxProgress() {
        return this.maxProgress;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final UploadErrorCategory getErrorCategory() {
        return this.errorCategory;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Blocker getBlocker() {
        return this.blocker;
    }

    /* renamed from: component17, reason: from getter */
    public final int getTotalAttemptCount() {
        return this.totalAttemptCount;
    }

    /* renamed from: component18, reason: from getter */
    public final int getAttemptCount() {
        return this.attemptCount;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getMaxAttemptsExceeded() {
        return this.maxAttemptsExceeded;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component20, reason: from getter */
    public final long getCreationTimeMillis() {
        return this.creationTimeMillis;
    }

    /* renamed from: component21, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component22, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getAddToFamilyVault() {
        return this.addToFamilyVault;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getAppData() {
        return this.appData;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    @NotNull
    /* renamed from: component26, reason: from getter */
    public final Uri getContentUri() {
        return this.contentUri;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final String getVisualCollectionParentId() {
        return this.visualCollectionParentId;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUploadPath() {
        return this.uploadPath;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getContentDate() {
        return this.contentDate;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSuppressDeduplication() {
        return this.suppressDeduplication;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getRenameOnNameConflict() {
        return this.renameOnNameConflict;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getUploadCategory() {
        return this.uploadCategory;
    }

    @NotNull
    public final UploadRequest copy(long id, @NotNull String filePath, @Nullable String uploadPath, @Nullable String contentDate, @Nullable String md5, @Nullable String visualDigest, boolean suppressDeduplication, boolean renameOnNameConflict, @NotNull String uploadCategory, @NotNull UploadState state, @NotNull String queue, long currentProgress, long maxProgress, @Nullable String errorCode, @Nullable UploadErrorCategory errorCategory, @Nullable Blocker blocker, int totalAttemptCount, int attemptCount, boolean maxAttemptsExceeded, long creationTimeMillis, long fileSize, int priority, boolean addToFamilyVault, @Nullable String appData, @Nullable String parentId, @NotNull Uri contentUri, @Nullable String visualCollectionParentId, @Nullable String metadata) {
        filePath.getClass();
        uploadCategory.getClass();
        state.getClass();
        queue.getClass();
        contentUri.getClass();
        return new UploadRequest(id, filePath, uploadPath, contentDate, md5, visualDigest, suppressDeduplication, renameOnNameConflict, uploadCategory, state, queue, currentProgress, maxProgress, errorCode, errorCategory, blocker, totalAttemptCount, attemptCount, maxAttemptsExceeded, creationTimeMillis, fileSize, priority, addToFamilyVault, appData, parentId, contentUri, visualCollectionParentId, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadRequest)) {
            return false;
        }
        UploadRequest uploadRequest = (UploadRequest) other;
        return this.id == uploadRequest.id && Intrinsics.areEqual(this.filePath, uploadRequest.filePath) && Intrinsics.areEqual(this.uploadPath, uploadRequest.uploadPath) && Intrinsics.areEqual(this.contentDate, uploadRequest.contentDate) && Intrinsics.areEqual(this.md5, uploadRequest.md5) && Intrinsics.areEqual(this.visualDigest, uploadRequest.visualDigest) && this.suppressDeduplication == uploadRequest.suppressDeduplication && this.renameOnNameConflict == uploadRequest.renameOnNameConflict && Intrinsics.areEqual(this.uploadCategory, uploadRequest.uploadCategory) && this.state == uploadRequest.state && Intrinsics.areEqual(this.queue, uploadRequest.queue) && this.currentProgress == uploadRequest.currentProgress && this.maxProgress == uploadRequest.maxProgress && Intrinsics.areEqual(this.errorCode, uploadRequest.errorCode) && this.errorCategory == uploadRequest.errorCategory && Intrinsics.areEqual(this.blocker, uploadRequest.blocker) && this.totalAttemptCount == uploadRequest.totalAttemptCount && this.attemptCount == uploadRequest.attemptCount && this.maxAttemptsExceeded == uploadRequest.maxAttemptsExceeded && this.creationTimeMillis == uploadRequest.creationTimeMillis && this.fileSize == uploadRequest.fileSize && this.priority == uploadRequest.priority && this.addToFamilyVault == uploadRequest.addToFamilyVault && Intrinsics.areEqual(this.appData, uploadRequest.appData) && Intrinsics.areEqual(this.parentId, uploadRequest.parentId) && Intrinsics.areEqual(this.contentUri, uploadRequest.contentUri) && Intrinsics.areEqual(this.visualCollectionParentId, uploadRequest.visualCollectionParentId) && Intrinsics.areEqual(this.metadata, uploadRequest.metadata);
    }

    public final boolean getAddToFamilyVault() {
        return this.addToFamilyVault;
    }

    @Nullable
    public final String getAppData() {
        return this.appData;
    }

    public final int getAttemptCount() {
        return this.attemptCount;
    }

    @Nullable
    public final Blocker getBlocker() {
        return this.blocker;
    }

    @Nullable
    public final String getContentDate() {
        return this.contentDate;
    }

    @NotNull
    public final Uri getContentUri() {
        return this.contentUri;
    }

    public final long getCreationTimeMillis() {
        return this.creationTimeMillis;
    }

    public final long getCurrentProgress() {
        return this.currentProgress;
    }

    @Nullable
    public final UploadErrorCategory getErrorCategory() {
        return this.errorCategory;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getMaxAttemptsExceeded() {
        return this.maxAttemptsExceeded;
    }

    public final long getMaxProgress() {
        return this.maxProgress;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getParentId() {
        return this.parentId;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getQueue() {
        return this.queue;
    }

    public final boolean getRenameOnNameConflict() {
        return this.renameOnNameConflict;
    }

    @NotNull
    public final UploadState getState() {
        return this.state;
    }

    public final boolean getSuppressDeduplication() {
        return this.suppressDeduplication;
    }

    public final int getTotalAttemptCount() {
        return this.totalAttemptCount;
    }

    @NotNull
    public final String getUploadCategory() {
        return this.uploadCategory;
    }

    @Nullable
    public final String getUploadPath() {
        return this.uploadPath;
    }

    @Nullable
    public final String getVisualCollectionParentId() {
        return this.visualCollectionParentId;
    }

    @Nullable
    public final String getVisualDigest() {
        return this.visualDigest;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.filePath);
        String str = this.uploadPath;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.md5;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.visualDigest;
        int m2 = BitVector$$ExternalSyntheticOutline0.m(this.maxProgress, BitVector$$ExternalSyntheticOutline0.m(this.currentProgress, ArcMode$$ExternalSyntheticOutline0.m((this.state.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.renameOnNameConflict, DoubleList$$ExternalSyntheticOutline0.m(this.suppressDeduplication, (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31, this.uploadCategory)) * 31, 31, this.queue), 31), 31);
        String str5 = this.errorCode;
        int hashCode4 = (m2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UploadErrorCategory uploadErrorCategory = this.errorCategory;
        int hashCode5 = (hashCode4 + (uploadErrorCategory == null ? 0 : uploadErrorCategory.hashCode())) * 31;
        Blocker blocker = this.blocker;
        int m3 = DoubleList$$ExternalSyntheticOutline0.m(this.addToFamilyVault, ArcMode$$ExternalSyntheticOutline0.m(this.priority, BitVector$$ExternalSyntheticOutline0.m(this.fileSize, BitVector$$ExternalSyntheticOutline0.m(this.creationTimeMillis, DoubleList$$ExternalSyntheticOutline0.m(this.maxAttemptsExceeded, ArcMode$$ExternalSyntheticOutline0.m(this.attemptCount, ArcMode$$ExternalSyntheticOutline0.m(this.totalAttemptCount, (hashCode5 + (blocker == null ? 0 : blocker.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        String str6 = this.appData;
        int hashCode6 = (m3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.parentId;
        int hashCode7 = (this.contentUri.hashCode() + ((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        String str8 = this.visualCollectionParentId;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.metadata;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setCreationTimeMillis(long j) {
        this.creationTimeMillis = j;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UploadRequest(id=");
        sb.append(this.id);
        sb.append(", filePath=");
        sb.append(this.filePath);
        sb.append(", uploadPath=");
        sb.append(this.uploadPath);
        sb.append(", contentDate=");
        sb.append(this.contentDate);
        sb.append(", md5=");
        sb.append(this.md5);
        sb.append(", visualDigest=");
        sb.append(this.visualDigest);
        sb.append(", suppressDeduplication=");
        sb.append(this.suppressDeduplication);
        sb.append(", renameOnNameConflict=");
        sb.append(this.renameOnNameConflict);
        sb.append(", uploadCategory=");
        sb.append(this.uploadCategory);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", queue=");
        sb.append(this.queue);
        sb.append(", currentProgress=");
        sb.append(this.currentProgress);
        sb.append(", maxProgress=");
        sb.append(this.maxProgress);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorCategory=");
        sb.append(this.errorCategory);
        sb.append(", blocker=");
        sb.append(this.blocker);
        sb.append(", totalAttemptCount=");
        sb.append(this.totalAttemptCount);
        sb.append(", attemptCount=");
        sb.append(this.attemptCount);
        sb.append(", maxAttemptsExceeded=");
        sb.append(this.maxAttemptsExceeded);
        sb.append(", creationTimeMillis=");
        sb.append(this.creationTimeMillis);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", addToFamilyVault=");
        sb.append(this.addToFamilyVault);
        sb.append(", appData=");
        sb.append(this.appData);
        sb.append(", parentId=");
        sb.append(this.parentId);
        sb.append(", contentUri=");
        sb.append(this.contentUri);
        sb.append(", visualCollectionParentId=");
        sb.append(this.visualCollectionParentId);
        sb.append(", metadata=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.metadata, sb);
    }

    public UploadRequest(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, boolean z2, @NotNull String str6, @NotNull UploadState uploadState, @NotNull String str7, long j2, long j3, @Nullable String str8, @Nullable UploadErrorCategory uploadErrorCategory, @Nullable Blocker blocker, int i, int i2, boolean z3, long j4, long j5, int i3, boolean z4, @Nullable String str9, @Nullable String str10, @NotNull Uri uri, @Nullable String str11, @Nullable String str12) {
        str.getClass();
        str6.getClass();
        uploadState.getClass();
        str7.getClass();
        uri.getClass();
        this.id = j;
        this.filePath = str;
        this.uploadPath = str2;
        this.contentDate = str3;
        this.md5 = str4;
        this.visualDigest = str5;
        this.suppressDeduplication = z;
        this.renameOnNameConflict = z2;
        this.uploadCategory = str6;
        this.state = uploadState;
        this.queue = str7;
        this.currentProgress = j2;
        this.maxProgress = j3;
        this.errorCode = str8;
        this.errorCategory = uploadErrorCategory;
        this.blocker = blocker;
        this.totalAttemptCount = i;
        this.attemptCount = i2;
        this.maxAttemptsExceeded = z3;
        this.creationTimeMillis = j4;
        this.fileSize = j5;
        this.priority = i3;
        this.addToFamilyVault = z4;
        this.appData = str9;
        this.parentId = str10;
        this.contentUri = uri;
        this.visualCollectionParentId = str11;
        this.metadata = str12;
    }
}
