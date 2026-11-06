package com.amazon.photos.discovery.metrics;

import com.amazon.clouddrive.android.core.interfaces.MetricName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bu\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\by¨\u0006z"}, d2 = {"Lcom/amazon/photos/discovery/metrics/DiscoveryMetrics;", "", "Lcom/amazon/clouddrive/android/core/interfaces/MetricName;", "(Ljava/lang/String;I)V", "getEventName", "", "ScanAddedWorkerStarted", "MediaStoreScanError", "MediaStoreFolderCreationError", "MediaStoreParentFileMissingError", "MediaStoreGetBucketIdError", "MediaStoreGetBucketNameError", "MediaStoreGetBucketPathError", "ScanAddedWorkerDiscoveredItems", "ScanAddedWorkerProcessedItems", "ScanAddedWorkerStopped", "FetchExtScanPathsFailed", "DeletedScanStarted", "DeletedScanStopped", "DeletedScanTotalDeleted", "DeletedScanTotalProcessed", "DeletedScanTransactionFailed", "AddedScanFillBatchTime", "AddedScanBatchGetLocalTime", "AddedScanBatchProcessTime", "ScanAddProcessBatchError", "ScanAddFetchBatchError", "ScanAddFetchFolderError", "ScanAddPersistItemsError", "ScanAddGetLocalByPathsDbError", "ScanAddGetLocalByPathsDbRetried", "DeletedScanFetchOneBatchTime", "DeletedScanCheckDeletedTime", "DeletedScanCheckDeletedError", "DeletedScanDeleteTransactionTime", "DeletedScanGetLocalAfterIdError", "DeletedScanGetLocalAfterIdRetried", "QueryExistedPathFailed", "QueryExistedPathSucceedAfterRetry", "GetCursorItemFailed", "GetCursorItemSucceedWithException", "DedupeWorkerStarted", "DedupeNoStagesProvided", "DedupeStageNotFound", "DedupeRetryError", "DedupeNoRetryError", "DiscoveryAbortError", "DedupeNoNextStage", "DedupeStageItemsModified", "DedupeStageItemsProcessed", "DedupeWorkerEmptyBatch", "DiscoveryItemDoneAcrossReboot", "MddCloudDriveError", "MddQueryBatchSize", "MddMissingUnifiedIdError", "MddResponseNodes", "MddLocalImageResolutionMissing", "MddCloudImageResolutionMissing", "MddLocalVideoResolutionMissing", "MddCloudVideoResolutionMissing", "DigestCalculationError", "DigestCalculationFilePathMissingError", "DigestCalculationFileDoesNotExist", "DigestCalculationIOException", "DigestCalculationIllegalState", "DigestLocalItemsSkipped", "DigestPersistenceFailure", "MismatchedGroupMD5s", "CloudNodeInsertionFailure", "DigestBulkGetNodesFailure", "DigestListNodesFailure", "OphaningCloudOnlyGroup", "BreakupNullMd5Items", "MonitorWorkerStarted", "MonitorConsistentDevice", "MonitorInconsistentDevice", "MonitorMoreItemsInDbEvent", "MonitorMoreItemsInDbCount", "MonitorLocalItemDiscrepancy", "MonitorDiscoveryLocalItems", "MonitorMediaStoreItems", "MonitorDedupeIncomplete", "MonitorDedupeComplete", "MonitorUnifiedWithCloud", "MonitorUnifiedWithoutCloud", "MonitorWorkRetryAfterDiscovery", "MonitorWorkRetryAfterScanned", "MonitorMediaStoreCountInvalid", "MonitorLocalCameraItems", "MonitorMediaStoreCameraItems", "MonitorCameraItemsDiscrepancy", "MonitorCameraDirectoryMissing", "MonitorWorkInfoStatusTagUnset", "MonitorLocalInvalidDateTaken", "MonitorMediaStoreImages", "MonitorMediaStoreVideos", "MonitorLocalItemsMissingMd5", "MonitorLocalVideosZeroDuration", "MonitorLocalItemsInvalidSize", "MonitorMissItemEvent", "MonitorMissItemError", "MonitorMissItemCount", "MonitorNoMissItem", "MonitorDupItemsInDbEvent", "MonitorDupItemsInDbCount", "MonitorNoDupItemsInDb", "DedupeCameraBypassedItems", "DedupeCloudBypassedItems", "WorkerRetryOnError", "InjectFailHappened", "InjectSucceed", "DiscoveryItemCompletion", "ScanAddedWorkerComplete", "ScanAddedBatchComplete", "DeletedScanComplete", "DedupeWorkerComplete", "DigestPhotoMd5Calculation", "DigestVideoMd5Calculation", "DigestCalculation", "DedupeStageCompletion", "MonitorWorkerComplete", "WorkerLifetimeComplete", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscoveryMetrics implements MetricName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiscoveryMetrics[] $VALUES;
    public static final DiscoveryMetrics ScanAddedWorkerStarted = new DiscoveryMetrics("ScanAddedWorkerStarted", 0);
    public static final DiscoveryMetrics MediaStoreScanError = new DiscoveryMetrics("MediaStoreScanError", 1);
    public static final DiscoveryMetrics MediaStoreFolderCreationError = new DiscoveryMetrics("MediaStoreFolderCreationError", 2);
    public static final DiscoveryMetrics MediaStoreParentFileMissingError = new DiscoveryMetrics("MediaStoreParentFileMissingError", 3);
    public static final DiscoveryMetrics MediaStoreGetBucketIdError = new DiscoveryMetrics("MediaStoreGetBucketIdError", 4);
    public static final DiscoveryMetrics MediaStoreGetBucketNameError = new DiscoveryMetrics("MediaStoreGetBucketNameError", 5);
    public static final DiscoveryMetrics MediaStoreGetBucketPathError = new DiscoveryMetrics("MediaStoreGetBucketPathError", 6);
    public static final DiscoveryMetrics ScanAddedWorkerDiscoveredItems = new DiscoveryMetrics("ScanAddedWorkerDiscoveredItems", 7);
    public static final DiscoveryMetrics ScanAddedWorkerProcessedItems = new DiscoveryMetrics("ScanAddedWorkerProcessedItems", 8);
    public static final DiscoveryMetrics ScanAddedWorkerStopped = new DiscoveryMetrics("ScanAddedWorkerStopped", 9);
    public static final DiscoveryMetrics FetchExtScanPathsFailed = new DiscoveryMetrics("FetchExtScanPathsFailed", 10);
    public static final DiscoveryMetrics DeletedScanStarted = new DiscoveryMetrics("DeletedScanStarted", 11);
    public static final DiscoveryMetrics DeletedScanStopped = new DiscoveryMetrics("DeletedScanStopped", 12);
    public static final DiscoveryMetrics DeletedScanTotalDeleted = new DiscoveryMetrics("DeletedScanTotalDeleted", 13);
    public static final DiscoveryMetrics DeletedScanTotalProcessed = new DiscoveryMetrics("DeletedScanTotalProcessed", 14);
    public static final DiscoveryMetrics DeletedScanTransactionFailed = new DiscoveryMetrics("DeletedScanTransactionFailed", 15);
    public static final DiscoveryMetrics AddedScanFillBatchTime = new DiscoveryMetrics("AddedScanFillBatchTime", 16);
    public static final DiscoveryMetrics AddedScanBatchGetLocalTime = new DiscoveryMetrics("AddedScanBatchGetLocalTime", 17);
    public static final DiscoveryMetrics AddedScanBatchProcessTime = new DiscoveryMetrics("AddedScanBatchProcessTime", 18);
    public static final DiscoveryMetrics ScanAddProcessBatchError = new DiscoveryMetrics("ScanAddProcessBatchError", 19);
    public static final DiscoveryMetrics ScanAddFetchBatchError = new DiscoveryMetrics("ScanAddFetchBatchError", 20);
    public static final DiscoveryMetrics ScanAddFetchFolderError = new DiscoveryMetrics("ScanAddFetchFolderError", 21);
    public static final DiscoveryMetrics ScanAddPersistItemsError = new DiscoveryMetrics("ScanAddPersistItemsError", 22);
    public static final DiscoveryMetrics ScanAddGetLocalByPathsDbError = new DiscoveryMetrics("ScanAddGetLocalByPathsDbError", 23);
    public static final DiscoveryMetrics ScanAddGetLocalByPathsDbRetried = new DiscoveryMetrics("ScanAddGetLocalByPathsDbRetried", 24);
    public static final DiscoveryMetrics DeletedScanFetchOneBatchTime = new DiscoveryMetrics("DeletedScanFetchOneBatchTime", 25);
    public static final DiscoveryMetrics DeletedScanCheckDeletedTime = new DiscoveryMetrics("DeletedScanCheckDeletedTime", 26);
    public static final DiscoveryMetrics DeletedScanCheckDeletedError = new DiscoveryMetrics("DeletedScanCheckDeletedError", 27);
    public static final DiscoveryMetrics DeletedScanDeleteTransactionTime = new DiscoveryMetrics("DeletedScanDeleteTransactionTime", 28);
    public static final DiscoveryMetrics DeletedScanGetLocalAfterIdError = new DiscoveryMetrics("DeletedScanGetLocalAfterIdError", 29);
    public static final DiscoveryMetrics DeletedScanGetLocalAfterIdRetried = new DiscoveryMetrics("DeletedScanGetLocalAfterIdRetried", 30);
    public static final DiscoveryMetrics QueryExistedPathFailed = new DiscoveryMetrics("QueryExistedPathFailed", 31);
    public static final DiscoveryMetrics QueryExistedPathSucceedAfterRetry = new DiscoveryMetrics("QueryExistedPathSucceedAfterRetry", 32);
    public static final DiscoveryMetrics GetCursorItemFailed = new DiscoveryMetrics("GetCursorItemFailed", 33);
    public static final DiscoveryMetrics GetCursorItemSucceedWithException = new DiscoveryMetrics("GetCursorItemSucceedWithException", 34);
    public static final DiscoveryMetrics DedupeWorkerStarted = new DiscoveryMetrics("DedupeWorkerStarted", 35);
    public static final DiscoveryMetrics DedupeNoStagesProvided = new DiscoveryMetrics("DedupeNoStagesProvided", 36);
    public static final DiscoveryMetrics DedupeStageNotFound = new DiscoveryMetrics("DedupeStageNotFound", 37);
    public static final DiscoveryMetrics DedupeRetryError = new DiscoveryMetrics("DedupeRetryError", 38);
    public static final DiscoveryMetrics DedupeNoRetryError = new DiscoveryMetrics("DedupeNoRetryError", 39);
    public static final DiscoveryMetrics DiscoveryAbortError = new DiscoveryMetrics("DiscoveryAbortError", 40);
    public static final DiscoveryMetrics DedupeNoNextStage = new DiscoveryMetrics("DedupeNoNextStage", 41);
    public static final DiscoveryMetrics DedupeStageItemsModified = new DiscoveryMetrics("DedupeStageItemsModified", 42);
    public static final DiscoveryMetrics DedupeStageItemsProcessed = new DiscoveryMetrics("DedupeStageItemsProcessed", 43);
    public static final DiscoveryMetrics DedupeWorkerEmptyBatch = new DiscoveryMetrics("DedupeWorkerEmptyBatch", 44);
    public static final DiscoveryMetrics DiscoveryItemDoneAcrossReboot = new DiscoveryMetrics("DiscoveryItemDoneAcrossReboot", 45);
    public static final DiscoveryMetrics MddCloudDriveError = new DiscoveryMetrics("MddCloudDriveError", 46);
    public static final DiscoveryMetrics MddQueryBatchSize = new DiscoveryMetrics("MddQueryBatchSize", 47);
    public static final DiscoveryMetrics MddMissingUnifiedIdError = new DiscoveryMetrics("MddMissingUnifiedIdError", 48);
    public static final DiscoveryMetrics MddResponseNodes = new DiscoveryMetrics("MddResponseNodes", 49);
    public static final DiscoveryMetrics MddLocalImageResolutionMissing = new DiscoveryMetrics("MddLocalImageResolutionMissing", 50);
    public static final DiscoveryMetrics MddCloudImageResolutionMissing = new DiscoveryMetrics("MddCloudImageResolutionMissing", 51);
    public static final DiscoveryMetrics MddLocalVideoResolutionMissing = new DiscoveryMetrics("MddLocalVideoResolutionMissing", 52);
    public static final DiscoveryMetrics MddCloudVideoResolutionMissing = new DiscoveryMetrics("MddCloudVideoResolutionMissing", 53);
    public static final DiscoveryMetrics DigestCalculationError = new DiscoveryMetrics("DigestCalculationError", 54);
    public static final DiscoveryMetrics DigestCalculationFilePathMissingError = new DiscoveryMetrics("DigestCalculationFilePathMissingError", 55);
    public static final DiscoveryMetrics DigestCalculationFileDoesNotExist = new DiscoveryMetrics("DigestCalculationFileDoesNotExist", 56);
    public static final DiscoveryMetrics DigestCalculationIOException = new DiscoveryMetrics("DigestCalculationIOException", 57);
    public static final DiscoveryMetrics DigestCalculationIllegalState = new DiscoveryMetrics("DigestCalculationIllegalState", 58);
    public static final DiscoveryMetrics DigestLocalItemsSkipped = new DiscoveryMetrics("DigestLocalItemsSkipped", 59);
    public static final DiscoveryMetrics DigestPersistenceFailure = new DiscoveryMetrics("DigestPersistenceFailure", 60);
    public static final DiscoveryMetrics MismatchedGroupMD5s = new DiscoveryMetrics("MismatchedGroupMD5s", 61);
    public static final DiscoveryMetrics CloudNodeInsertionFailure = new DiscoveryMetrics("CloudNodeInsertionFailure", 62);
    public static final DiscoveryMetrics DigestBulkGetNodesFailure = new DiscoveryMetrics("DigestBulkGetNodesFailure", 63);
    public static final DiscoveryMetrics DigestListNodesFailure = new DiscoveryMetrics("DigestListNodesFailure", 64);
    public static final DiscoveryMetrics OphaningCloudOnlyGroup = new DiscoveryMetrics("OphaningCloudOnlyGroup", 65);
    public static final DiscoveryMetrics BreakupNullMd5Items = new DiscoveryMetrics("BreakupNullMd5Items", 66);
    public static final DiscoveryMetrics MonitorWorkerStarted = new DiscoveryMetrics("MonitorWorkerStarted", 67);
    public static final DiscoveryMetrics MonitorConsistentDevice = new DiscoveryMetrics("MonitorConsistentDevice", 68);
    public static final DiscoveryMetrics MonitorInconsistentDevice = new DiscoveryMetrics("MonitorInconsistentDevice", 69);
    public static final DiscoveryMetrics MonitorMoreItemsInDbEvent = new DiscoveryMetrics("MonitorMoreItemsInDbEvent", 70);
    public static final DiscoveryMetrics MonitorMoreItemsInDbCount = new DiscoveryMetrics("MonitorMoreItemsInDbCount", 71);
    public static final DiscoveryMetrics MonitorLocalItemDiscrepancy = new DiscoveryMetrics("MonitorLocalItemDiscrepancy", 72);
    public static final DiscoveryMetrics MonitorDiscoveryLocalItems = new DiscoveryMetrics("MonitorDiscoveryLocalItems", 73);
    public static final DiscoveryMetrics MonitorMediaStoreItems = new DiscoveryMetrics("MonitorMediaStoreItems", 74);
    public static final DiscoveryMetrics MonitorDedupeIncomplete = new DiscoveryMetrics("MonitorDedupeIncomplete", 75);
    public static final DiscoveryMetrics MonitorDedupeComplete = new DiscoveryMetrics("MonitorDedupeComplete", 76);
    public static final DiscoveryMetrics MonitorUnifiedWithCloud = new DiscoveryMetrics("MonitorUnifiedWithCloud", 77);
    public static final DiscoveryMetrics MonitorUnifiedWithoutCloud = new DiscoveryMetrics("MonitorUnifiedWithoutCloud", 78);
    public static final DiscoveryMetrics MonitorWorkRetryAfterDiscovery = new DiscoveryMetrics("MonitorWorkRetryAfterDiscovery", 79);
    public static final DiscoveryMetrics MonitorWorkRetryAfterScanned = new DiscoveryMetrics("MonitorWorkRetryAfterScanned", 80);
    public static final DiscoveryMetrics MonitorMediaStoreCountInvalid = new DiscoveryMetrics("MonitorMediaStoreCountInvalid", 81);
    public static final DiscoveryMetrics MonitorLocalCameraItems = new DiscoveryMetrics("MonitorLocalCameraItems", 82);
    public static final DiscoveryMetrics MonitorMediaStoreCameraItems = new DiscoveryMetrics("MonitorMediaStoreCameraItems", 83);
    public static final DiscoveryMetrics MonitorCameraItemsDiscrepancy = new DiscoveryMetrics("MonitorCameraItemsDiscrepancy", 84);
    public static final DiscoveryMetrics MonitorCameraDirectoryMissing = new DiscoveryMetrics("MonitorCameraDirectoryMissing", 85);
    public static final DiscoveryMetrics MonitorWorkInfoStatusTagUnset = new DiscoveryMetrics("MonitorWorkInfoStatusTagUnset", 86);
    public static final DiscoveryMetrics MonitorLocalInvalidDateTaken = new DiscoveryMetrics("MonitorLocalInvalidDateTaken", 87);
    public static final DiscoveryMetrics MonitorMediaStoreImages = new DiscoveryMetrics("MonitorMediaStoreImages", 88);
    public static final DiscoveryMetrics MonitorMediaStoreVideos = new DiscoveryMetrics("MonitorMediaStoreVideos", 89);
    public static final DiscoveryMetrics MonitorLocalItemsMissingMd5 = new DiscoveryMetrics("MonitorLocalItemsMissingMd5", 90);
    public static final DiscoveryMetrics MonitorLocalVideosZeroDuration = new DiscoveryMetrics("MonitorLocalVideosZeroDuration", 91);
    public static final DiscoveryMetrics MonitorLocalItemsInvalidSize = new DiscoveryMetrics("MonitorLocalItemsInvalidSize", 92);
    public static final DiscoveryMetrics MonitorMissItemEvent = new DiscoveryMetrics("MonitorMissItemEvent", 93);
    public static final DiscoveryMetrics MonitorMissItemError = new DiscoveryMetrics("MonitorMissItemError", 94);
    public static final DiscoveryMetrics MonitorMissItemCount = new DiscoveryMetrics("MonitorMissItemCount", 95);
    public static final DiscoveryMetrics MonitorNoMissItem = new DiscoveryMetrics("MonitorNoMissItem", 96);
    public static final DiscoveryMetrics MonitorDupItemsInDbEvent = new DiscoveryMetrics("MonitorDupItemsInDbEvent", 97);
    public static final DiscoveryMetrics MonitorDupItemsInDbCount = new DiscoveryMetrics("MonitorDupItemsInDbCount", 98);
    public static final DiscoveryMetrics MonitorNoDupItemsInDb = new DiscoveryMetrics("MonitorNoDupItemsInDb", 99);
    public static final DiscoveryMetrics DedupeCameraBypassedItems = new DiscoveryMetrics("DedupeCameraBypassedItems", 100);
    public static final DiscoveryMetrics DedupeCloudBypassedItems = new DiscoveryMetrics("DedupeCloudBypassedItems", 101);
    public static final DiscoveryMetrics WorkerRetryOnError = new DiscoveryMetrics("WorkerRetryOnError", 102);
    public static final DiscoveryMetrics InjectFailHappened = new DiscoveryMetrics("InjectFailHappened", 103);
    public static final DiscoveryMetrics InjectSucceed = new DiscoveryMetrics("InjectSucceed", 104);
    public static final DiscoveryMetrics DiscoveryItemCompletion = new DiscoveryMetrics("DiscoveryItemCompletion", 105);
    public static final DiscoveryMetrics ScanAddedWorkerComplete = new DiscoveryMetrics("ScanAddedWorkerComplete", 106);
    public static final DiscoveryMetrics ScanAddedBatchComplete = new DiscoveryMetrics("ScanAddedBatchComplete", 107);
    public static final DiscoveryMetrics DeletedScanComplete = new DiscoveryMetrics("DeletedScanComplete", 108);
    public static final DiscoveryMetrics DedupeWorkerComplete = new DiscoveryMetrics("DedupeWorkerComplete", 109);
    public static final DiscoveryMetrics DigestPhotoMd5Calculation = new DiscoveryMetrics("DigestPhotoMd5Calculation", 110);
    public static final DiscoveryMetrics DigestVideoMd5Calculation = new DiscoveryMetrics("DigestVideoMd5Calculation", 111);
    public static final DiscoveryMetrics DigestCalculation = new DiscoveryMetrics("DigestCalculation", 112);
    public static final DiscoveryMetrics DedupeStageCompletion = new DiscoveryMetrics("DedupeStageCompletion", 113);
    public static final DiscoveryMetrics MonitorWorkerComplete = new DiscoveryMetrics("MonitorWorkerComplete", 114);
    public static final DiscoveryMetrics WorkerLifetimeComplete = new DiscoveryMetrics("WorkerLifetimeComplete", 115);

    private static final /* synthetic */ DiscoveryMetrics[] $values() {
        return new DiscoveryMetrics[]{ScanAddedWorkerStarted, MediaStoreScanError, MediaStoreFolderCreationError, MediaStoreParentFileMissingError, MediaStoreGetBucketIdError, MediaStoreGetBucketNameError, MediaStoreGetBucketPathError, ScanAddedWorkerDiscoveredItems, ScanAddedWorkerProcessedItems, ScanAddedWorkerStopped, FetchExtScanPathsFailed, DeletedScanStarted, DeletedScanStopped, DeletedScanTotalDeleted, DeletedScanTotalProcessed, DeletedScanTransactionFailed, AddedScanFillBatchTime, AddedScanBatchGetLocalTime, AddedScanBatchProcessTime, ScanAddProcessBatchError, ScanAddFetchBatchError, ScanAddFetchFolderError, ScanAddPersistItemsError, ScanAddGetLocalByPathsDbError, ScanAddGetLocalByPathsDbRetried, DeletedScanFetchOneBatchTime, DeletedScanCheckDeletedTime, DeletedScanCheckDeletedError, DeletedScanDeleteTransactionTime, DeletedScanGetLocalAfterIdError, DeletedScanGetLocalAfterIdRetried, QueryExistedPathFailed, QueryExistedPathSucceedAfterRetry, GetCursorItemFailed, GetCursorItemSucceedWithException, DedupeWorkerStarted, DedupeNoStagesProvided, DedupeStageNotFound, DedupeRetryError, DedupeNoRetryError, DiscoveryAbortError, DedupeNoNextStage, DedupeStageItemsModified, DedupeStageItemsProcessed, DedupeWorkerEmptyBatch, DiscoveryItemDoneAcrossReboot, MddCloudDriveError, MddQueryBatchSize, MddMissingUnifiedIdError, MddResponseNodes, MddLocalImageResolutionMissing, MddCloudImageResolutionMissing, MddLocalVideoResolutionMissing, MddCloudVideoResolutionMissing, DigestCalculationError, DigestCalculationFilePathMissingError, DigestCalculationFileDoesNotExist, DigestCalculationIOException, DigestCalculationIllegalState, DigestLocalItemsSkipped, DigestPersistenceFailure, MismatchedGroupMD5s, CloudNodeInsertionFailure, DigestBulkGetNodesFailure, DigestListNodesFailure, OphaningCloudOnlyGroup, BreakupNullMd5Items, MonitorWorkerStarted, MonitorConsistentDevice, MonitorInconsistentDevice, MonitorMoreItemsInDbEvent, MonitorMoreItemsInDbCount, MonitorLocalItemDiscrepancy, MonitorDiscoveryLocalItems, MonitorMediaStoreItems, MonitorDedupeIncomplete, MonitorDedupeComplete, MonitorUnifiedWithCloud, MonitorUnifiedWithoutCloud, MonitorWorkRetryAfterDiscovery, MonitorWorkRetryAfterScanned, MonitorMediaStoreCountInvalid, MonitorLocalCameraItems, MonitorMediaStoreCameraItems, MonitorCameraItemsDiscrepancy, MonitorCameraDirectoryMissing, MonitorWorkInfoStatusTagUnset, MonitorLocalInvalidDateTaken, MonitorMediaStoreImages, MonitorMediaStoreVideos, MonitorLocalItemsMissingMd5, MonitorLocalVideosZeroDuration, MonitorLocalItemsInvalidSize, MonitorMissItemEvent, MonitorMissItemError, MonitorMissItemCount, MonitorNoMissItem, MonitorDupItemsInDbEvent, MonitorDupItemsInDbCount, MonitorNoDupItemsInDb, DedupeCameraBypassedItems, DedupeCloudBypassedItems, WorkerRetryOnError, InjectFailHappened, InjectSucceed, DiscoveryItemCompletion, ScanAddedWorkerComplete, ScanAddedBatchComplete, DeletedScanComplete, DedupeWorkerComplete, DigestPhotoMd5Calculation, DigestVideoMd5Calculation, DigestCalculation, DedupeStageCompletion, MonitorWorkerComplete, WorkerLifetimeComplete};
    }

    static {
        DiscoveryMetrics[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DiscoveryMetrics(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DiscoveryMetrics> getEntries() {
        return $ENTRIES;
    }

    public static DiscoveryMetrics valueOf(String str) {
        return (DiscoveryMetrics) Enum.valueOf(DiscoveryMetrics.class, str);
    }

    public static DiscoveryMetrics[] values() {
        return (DiscoveryMetrics[]) $VALUES.clone();
    }

    @Override // com.amazon.clouddrive.android.core.interfaces.MetricName
    @NotNull
    public String getEventName() {
        return name();
    }
}
