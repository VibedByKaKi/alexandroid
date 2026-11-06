package com.amazon.photos.uploader.cds.multipart;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.google.common.collect.Lists;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\ba\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\t\u001a\u00020\u0003H'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H'J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0011\u001a\u00020\u0005H'J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H'J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH'J \u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H'J&\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u001e"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/PartInfoDao;", "", "deleteBulkParts", "", "requestId", "", "missingParts", "", "deleteByRequestId", "deleteCompletedRequest", "deletePartInfo", "partInfo", "Lcom/amazon/photos/uploader/cds/multipart/PartInfo;", "deletePartsByRequestId", "getAllByStateForRequestId", "state", "Lcom/amazon/photos/uploader/cds/multipart/PartUploadState;", "uploadRequestId", "getAllCountByRequestId", "getAllCountByStateRequestId", "getAllPendingRequestId", "getCompletedPartsBytesCount", "insert", "updatePartInfo", "updatePartInfoState", "partId", "updatePartInfoStateByRequestAndPartId", "partIds", "updatePartInfoStateByRequestId", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PartInfoDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/PartInfoDao$Companion;", "", "()V", "MISSING_PARTS_SEGMENT_SIZE", "", "PENDING_STATES", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int MISSING_PARTS_SEGMENT_SIZE = 500;

        @NotNull
        private static final String PENDING_STATES = "('RUNNING', 'FAILED', 'ENQUEUED')";

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void deleteBulkParts(@NotNull PartInfoDao partInfoDao, long j, @NotNull List<Long> list) {
            list.getClass();
            for (List<Long> list2 : Lists.partition(list, 500)) {
                list2.getClass();
                partInfoDao.updatePartInfoStateByRequestAndPartId(j, list2, PartUploadState.ENQUEUED);
            }
        }
    }

    void deleteBulkParts(long requestId, @NotNull List<Long> missingParts);

    @Query("DELETE FROM part_info WHERE upload_request_id = :requestId")
    void deleteByRequestId(long requestId);

    @Query("DELETE FROM part_info WHERE part_upload_state = 'FAILED' OR part_upload_state = 'SUCCEEDED'")
    void deleteCompletedRequest();

    @Delete
    void deletePartInfo(@NotNull PartInfo partInfo);

    @Query("DELETE FROM part_info WHERE upload_request_id = :requestId")
    @Transaction
    void deletePartsByRequestId(long requestId);

    @Query("SELECT * from part_info WHERE upload_request_id=:uploadRequestId and part_upload_state = :state")
    @NotNull
    List<PartInfo> getAllByStateForRequestId(@NotNull PartUploadState state, long uploadRequestId);

    @Query("SELECT COUNT(*) from part_info WHERE upload_request_id=:requestId ")
    long getAllCountByRequestId(long requestId);

    @Query("SELECT COUNT(*) from part_info WHERE upload_request_id=:requestId and part_upload_state = :state")
    long getAllCountByStateRequestId(long requestId, @NotNull PartUploadState state);

    @Query("SELECT * from part_info WHERE upload_request_id=:uploadRequestId and part_upload_state in  ('RUNNING', 'FAILED', 'ENQUEUED')")
    @NotNull
    List<PartInfo> getAllPendingRequestId(long uploadRequestId);

    @Query("SELECT IFNULL(SUM(part_size),0) as BytesCompleted from part_info WHERE upload_request_id=:uploadRequestId and part_upload_state = 'SUCCEEDED'")
    long getCompletedPartsBytesCount(long uploadRequestId);

    @Insert(onConflict = 5)
    long insert(@NotNull PartInfo partInfo);

    @Update
    void updatePartInfo(@NotNull PartInfo partInfo);

    @Query("UPDATE part_info SET part_upload_state = :state  WHERE part_id = :partId AND upload_request_id =:uploadRequestId")
    void updatePartInfoState(long partId, long uploadRequestId, @NotNull PartUploadState state);

    @Query("UPDATE part_info SET part_upload_state = :state  WHERE upload_request_id =:uploadRequestId and part_id in (:partIds)")
    void updatePartInfoStateByRequestAndPartId(long uploadRequestId, @NotNull List<Long> partIds, @NotNull PartUploadState state);

    @Query("UPDATE part_info SET part_upload_state = :state  WHERE upload_request_id =:uploadRequestId")
    void updatePartInfoStateByRequestId(long uploadRequestId, @NotNull PartUploadState state);
}
