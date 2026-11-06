package com.amazon.photos.discovery.dao;

import androidx.annotation.WorkerThread;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.photos.discovery.internal.model.MutableCloudItem;
import com.amazon.photos.discovery.internal.model.MutableLocalItem;
import com.amazon.photos.discovery.internal.model.MutableUnifiedEntry;
import com.amazon.photos.discovery.internal.model.MutableUnifiedItem;
import com.amazon.photos.discovery.internal.util.UnifiedEntryUtils;
import com.amazon.photos.discovery.model.ItemType;
import com.amazon.photos.discovery.model.UnifiedItem;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H'J\u0016\u0010\n\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H'J+\u0010\u000b\u001a\u00020\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\rH\u0017J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H!¢\u0006\u0002\b\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H'J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H'J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H'J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H'J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H'J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H'J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H'J*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H'J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H'J*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H'J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006H'J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H'J\u0016\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0012H'J\u001b\u0010(\u001a\u00020%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0012H!¢\u0006\u0002\b+J\u001e\u0010,\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010-\u001a\u00020\u0004H'J)\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u001e2\b\u00101\u001a\u0004\u0018\u00010\u001eH!¢\u0006\u0002\b2J\u001f\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u001eH!¢\u0006\u0002\b4J#\u00105\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010-\u001a\u00020\u0004H!¢\u0006\u0002\b6J\u001f\u00107\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u001eH!¢\u0006\u0002\b8J\u0010\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020'H'J\u0016\u0010;\u001a\u00020\b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020'0\u0006H'J\u001b\u0010=\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020*0\u0012H!¢\u0006\u0002\b?J\u0015\u0010@\u001a\u00020\b2\u0006\u0010>\u001a\u00020*H!¢\u0006\u0002\bA¨\u0006B"}, d2 = {"Lcom/amazon/photos/discovery/dao/EditDao;", "", "()V", "combineByUnifiedIds", "", "unifiedIds", "", "deleteCloudByCloudIds", "", "cloudIds", "deleteUnifiedByUnifiedIds", "executeTransaction", "transaction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "editDao", "getMutableUnifiedByUnifiedIds", "", "Lcom/amazon/photos/discovery/internal/model/MutableUnifiedItem;", "getMutableUnifiedByUnifiedIds$AndroidPhotosDiscovery_release", "getUnifiedByCloudIds", "Lcom/amazon/photos/discovery/model/UnifiedItem;", "dedupeStages", "", "", "getUnifiedByLocalIds", "localIds", "getUnifiedByMd5s", "md5s", "", "getUnifiedByNodeIds", "nodeIds", "getUnifiedByUnifiedIds", "getUnifiedByVisualDigests", "visualDigests", "insertCloudOrIgnore", "", "mutableCloudItems", "Lcom/amazon/photos/discovery/internal/model/MutableCloudItem;", "insertUnified", "mutableUnifiedEntries", "Lcom/amazon/photos/discovery/internal/model/MutableUnifiedEntry;", "insertUnified$AndroidPhotosDiscovery_release", "updateCloudUnifiedId", "unifiedId", "updateLocalDigest", "localId", SierraContentProviderContract.MD5_VALUE, "visualDigest", "updateLocalDigest$AndroidPhotosDiscovery_release", "updateLocalMd5", "updateLocalMd5$AndroidPhotosDiscovery_release", "updateLocalUnifiedId", "updateLocalUnifiedId$AndroidPhotosDiscovery_release", "updateLocalVisualDigest", "updateLocalVisualDigest$AndroidPhotosDiscovery_release", "updateMutableCloudItem", "cloudItem", "updateMutableCloudItems", "cloudItems", "updateMutableUnifiedEntries", "unifiedEntry", "updateMutableUnifiedEntries$AndroidPhotosDiscovery_release", "updateMutableUnifiedEntry", "updateMutableUnifiedEntry$AndroidPhotosDiscovery_release", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WorkerThread
@SourceDebugExtension({"SMAP\nEditDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditDao.kt\ncom/amazon/photos/discovery/dao/EditDao\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,411:1\n1#2:412\n*E\n"})
/* loaded from: classes5.dex */
public abstract class EditDao {
    public final long combineByUnifiedIds(@NotNull Collection<Long> unifiedIds) {
        unifiedIds.getClass();
        if (unifiedIds.size() < 2) {
            Long l = (Long) CollectionsKt.firstOrNull(unifiedIds);
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        }
        List<MutableUnifiedItem> mutableUnifiedByUnifiedIds$AndroidPhotosDiscovery_release = getMutableUnifiedByUnifiedIds$AndroidPhotosDiscovery_release(unifiedIds);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        ItemType itemType = null;
        for (MutableUnifiedItem mutableUnifiedItem : mutableUnifiedByUnifiedIds$AndroidPhotosDiscovery_release) {
            MutableUnifiedEntry unifiedEntry = mutableUnifiedItem.getUnifiedEntry();
            List<MutableLocalItem> component2 = mutableUnifiedItem.component2();
            List<MutableCloudItem> component3 = mutableUnifiedItem.component3();
            if (itemType == null) {
                itemType = unifiedEntry.getItemType();
            }
            if (itemType != unifiedEntry.getItemType()) {
                Single$$ExternalSyntheticBUOutline0.m$3("You cannot combine items of different types.");
                return 0L;
            }
            for (MutableLocalItem mutableLocalItem : component2) {
                linkedList.add(Long.valueOf(mutableLocalItem.getId()));
                linkedList3.add(mutableLocalItem);
            }
            for (MutableCloudItem mutableCloudItem : component3) {
                linkedList2.add(Long.valueOf(mutableCloudItem.getId()));
                linkedList4.add(mutableCloudItem);
            }
        }
        MutableUnifiedEntry create = UnifiedEntryUtils.INSTANCE.create(linkedList3, linkedList4);
        create.setItemType(itemType);
        Collection<Long> minus = CollectionsKt.minus(unifiedIds, Long.valueOf(create.getId()));
        updateMutableUnifiedEntry$AndroidPhotosDiscovery_release(create);
        updateLocalUnifiedId$AndroidPhotosDiscovery_release(linkedList, create.getId());
        updateCloudUnifiedId(linkedList2, create.getId());
        deleteUnifiedByUnifiedIds(minus);
        return create.getId();
    }

    @Query("DELETE FROM cloud_item WHERE id IN (:cloudIds)")
    public abstract void deleteCloudByCloudIds(@NotNull Collection<Long> cloudIds);

    @Query("DELETE FROM unified_item WHERE id IN (:unifiedIds)")
    public abstract void deleteUnifiedByUnifiedIds(@NotNull Collection<Long> unifiedIds);

    @Transaction
    public void executeTransaction(@NotNull Function1<? super EditDao, Unit> transaction) {
        transaction.getClass();
        transaction.invoke(this);
    }

    @Query("SELECT u.* FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE u.id IN (:unifiedIds) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<MutableUnifiedItem> getMutableUnifiedByUnifiedIds$AndroidPhotosDiscovery_release(@NotNull Collection<Long> unifiedIds);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE c.id IN (:cloudIds) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByCloudIds(@NotNull Collection<Long> cloudIds);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE c.id IN (:cloudIds) AND u.dedupe_stage IN (:dedupeStages) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByCloudIds(@NotNull Collection<Long> cloudIds, @NotNull Set<Integer> dedupeStages);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE l.id IN (:localIds) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByLocalIds(@NotNull Collection<Long> localIds);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE l.id IN (:localIds) AND u.dedupe_stage IN (:dedupeStages) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByLocalIds(@NotNull Collection<Long> localIds, @NotNull Set<Integer> dedupeStages);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE c.md5 IN (:md5s) OR l.md5 IN (:md5s) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByMd5s(@NotNull Collection<String> md5s);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE u.dedupe_stage IN (:dedupeStages) AND (c.md5 IN (:md5s) OR l.md5 IN (:md5s)) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByMd5s(@NotNull Collection<String> md5s, @NotNull Set<Integer> dedupeStages);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE c.node_id IN (:nodeIds) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByNodeIds(@NotNull Collection<String> nodeIds);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE c.node_id IN (:nodeIds) AND u.dedupe_stage IN (:dedupeStages) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByNodeIds(@NotNull Collection<String> nodeIds, @NotNull Set<Integer> dedupeStages);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE u.id IN (:unifiedIds) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByUnifiedIds(@NotNull Collection<Long> unifiedIds);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE u.id IN (:unifiedIds) AND u.dedupe_stage IN (:dedupeStages) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByUnifiedIds(@NotNull Collection<Long> unifiedIds, @NotNull Set<Integer> dedupeStages);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE c.visual_digest IN (:visualDigests) OR l.visual_digest IN (:visualDigests) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByVisualDigests(@NotNull Collection<String> visualDigests);

    @Query("SELECT u.id, u.date_taken, u.date_uploaded, u.type, u.dedupe_stage FROM unified_item u LEFT JOIN (SELECT * FROM local_item) l ON l.unified_id = u.id LEFT JOIN (SELECT * FROM cloud_item) c ON c.unified_id = u.id WHERE u.dedupe_stage IN (:dedupeStages) AND (c.visual_digest IN (:visualDigests) OR l.visual_digest IN (:visualDigests)) ORDER BY u.id ASC")
    @Transaction
    @NotNull
    public abstract List<UnifiedItem> getUnifiedByVisualDigests(@NotNull Collection<String> visualDigests, @NotNull Set<Integer> dedupeStages);

    @Insert(onConflict = 5)
    @NotNull
    public abstract long[] insertCloudOrIgnore(@NotNull List<MutableCloudItem> mutableCloudItems);

    @Insert
    @NotNull
    public abstract long[] insertUnified$AndroidPhotosDiscovery_release(@NotNull List<MutableUnifiedEntry> mutableUnifiedEntries);

    @Query("UPDATE cloud_item SET unified_id = :unifiedId WHERE id IN (:cloudIds)")
    public abstract void updateCloudUnifiedId(@NotNull Collection<Long> cloudIds, long unifiedId);

    @Query("UPDATE local_item SET md5 = :md5, visual_digest = :visualDigest WHERE id IS :localId")
    public abstract void updateLocalDigest$AndroidPhotosDiscovery_release(long localId, @Nullable String md5, @Nullable String visualDigest);

    @Query("UPDATE local_item SET md5 = :md5 WHERE id IS :localId")
    public abstract void updateLocalMd5$AndroidPhotosDiscovery_release(long localId, @Nullable String md5);

    @Query("UPDATE local_item SET unified_id = :unifiedId WHERE id IN (:localIds)")
    public abstract void updateLocalUnifiedId$AndroidPhotosDiscovery_release(@NotNull Collection<Long> localIds, long unifiedId);

    @Query("UPDATE local_item SET visual_digest = :visualDigest WHERE id IS :localId")
    public abstract void updateLocalVisualDigest$AndroidPhotosDiscovery_release(long localId, @Nullable String visualDigest);

    @Update
    public abstract void updateMutableCloudItem(@NotNull MutableCloudItem cloudItem);

    @Update
    public abstract void updateMutableCloudItems(@NotNull Collection<MutableCloudItem> cloudItems);

    @Update
    public abstract void updateMutableUnifiedEntries$AndroidPhotosDiscovery_release(@NotNull List<MutableUnifiedEntry> unifiedEntry);

    @Update
    public abstract void updateMutableUnifiedEntry$AndroidPhotosDiscovery_release(@NotNull MutableUnifiedEntry unifiedEntry);
}
