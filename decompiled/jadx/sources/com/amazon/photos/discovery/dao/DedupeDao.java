package com.amazon.photos.discovery.dao;

import androidx.annotation.WorkerThread;
import com.amazon.alexa.handsfree.protocols.sierracontentprovider.SierraContentProviderContract;
import com.amazon.photos.discovery.internal.model.MutableCloudItem;
import com.amazon.photos.discovery.internal.model.MutableUnifiedEntry;
import com.amazon.photos.discovery.model.UnifiedItem;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\u0014\u0010\u000f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ)\u0010\u0010\u001a\u00020\r2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\r0\u0012J\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0017J\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0017J\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017J\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017J\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0017J\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017J\u0014\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0017J\u0014\u0010'\u001a\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0017J\u001c\u0010*\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010+\u001a\u00020\tJ\"\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u001d2\b\u0010/\u001a\u0004\u0018\u00010\u001dJ\u0018\u00100\u001a\u00020\r2\u0006\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u001dJ\u001c\u00101\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010+\u001a\u00020\tJ\u0018\u00102\u001a\u00020\r2\u0006\u0010-\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u001dJ\u000e\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020&J\u0014\u00105\u001a\u00020\r2\f\u00106\u001a\b\u0012\u0004\u0012\u00020&0\u000bJ\u0014\u00107\u001a\u00020\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00020)0\u0017J\u000e\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020)R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/amazon/photos/discovery/dao/DedupeDao;", "", "editDao", "Lcom/amazon/photos/discovery/dao/EditDao;", "dedupeStages", "", "", "(Lcom/amazon/photos/discovery/dao/EditDao;Ljava/util/Set;)V", "combineByUnifiedIds", "", "unifiedIds", "", "deleteCloudByCloudIds", "", "cloudIds", "deleteUnifiedByUnifiedIds", "executeTransaction", "transaction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dedupeDao", "getUnifiedByCloudIds", "", "Lcom/amazon/photos/discovery/model/UnifiedItem;", "getUnifiedByLocalIds", "localIds", "getUnifiedByMd5s", "md5s", "", "getUnifiedByNodeIds", "nodeIds", "getUnifiedByUnifiedIds", "getUnifiedByVisualDigests", "visualDigests", "insertCloudOrIgnore", "", "mutableCloudItems", "Lcom/amazon/photos/discovery/internal/model/MutableCloudItem;", "insertUnified", "mutableUnifiedEntries", "Lcom/amazon/photos/discovery/internal/model/MutableUnifiedEntry;", "updateCloudUnifiedId", "unifiedId", "updateLocalDigest", "localId", SierraContentProviderContract.MD5_VALUE, "visualDigest", "updateLocalMd5", "updateLocalUnifiedId", "updateLocalVisualDigest", "updateMutableCloudItem", "cloudItem", "updateMutableCloudItems", "cloudItems", "updateMutableUnifiedEntries", "unifiedEntry", "updateMutableUnifiedEntry", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WorkerThread
/* loaded from: classes5.dex */
public final class DedupeDao {

    @NotNull
    private final Set<Integer> dedupeStages;

    @NotNull
    private final EditDao editDao;

    public DedupeDao(@NotNull EditDao editDao, @NotNull Set<Integer> set) {
        editDao.getClass();
        set.getClass();
        this.editDao = editDao;
        this.dedupeStages = set;
    }

    public final long combineByUnifiedIds(@NotNull Collection<Long> unifiedIds) {
        unifiedIds.getClass();
        return this.editDao.combineByUnifiedIds(unifiedIds);
    }

    public final void deleteCloudByCloudIds(@NotNull Collection<Long> cloudIds) {
        cloudIds.getClass();
        this.editDao.deleteCloudByCloudIds(cloudIds);
    }

    public final void deleteUnifiedByUnifiedIds(@NotNull Collection<Long> unifiedIds) {
        unifiedIds.getClass();
        this.editDao.deleteUnifiedByUnifiedIds(unifiedIds);
    }

    public final void executeTransaction(@NotNull final Function1<? super DedupeDao, Unit> transaction) {
        transaction.getClass();
        this.editDao.executeTransaction(new Function1<EditDao, Unit>() { // from class: com.amazon.photos.discovery.dao.DedupeDao$executeTransaction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull EditDao editDao) {
                editDao.getClass();
                transaction.invoke(this);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(EditDao editDao) {
                invoke2(editDao);
                return Unit.INSTANCE;
            }
        });
    }

    @NotNull
    public final List<UnifiedItem> getUnifiedByCloudIds(@NotNull List<Long> cloudIds) {
        cloudIds.getClass();
        return this.editDao.getUnifiedByCloudIds(cloudIds, this.dedupeStages);
    }

    @NotNull
    public final List<UnifiedItem> getUnifiedByLocalIds(@NotNull List<Long> localIds) {
        localIds.getClass();
        return this.editDao.getUnifiedByLocalIds(localIds, this.dedupeStages);
    }

    @NotNull
    public final List<UnifiedItem> getUnifiedByMd5s(@NotNull List<String> md5s) {
        md5s.getClass();
        return this.editDao.getUnifiedByMd5s(md5s, this.dedupeStages);
    }

    @NotNull
    public final List<UnifiedItem> getUnifiedByNodeIds(@NotNull List<String> nodeIds) {
        nodeIds.getClass();
        return this.editDao.getUnifiedByNodeIds(nodeIds, this.dedupeStages);
    }

    @NotNull
    public final List<UnifiedItem> getUnifiedByUnifiedIds(@NotNull List<Long> unifiedIds) {
        unifiedIds.getClass();
        return this.editDao.getUnifiedByUnifiedIds(unifiedIds, this.dedupeStages);
    }

    @NotNull
    public final List<UnifiedItem> getUnifiedByVisualDigests(@NotNull List<String> visualDigests) {
        visualDigests.getClass();
        return this.editDao.getUnifiedByVisualDigests(visualDigests, this.dedupeStages);
    }

    @NotNull
    public final long[] insertCloudOrIgnore(@NotNull List<MutableCloudItem> mutableCloudItems) {
        mutableCloudItems.getClass();
        return this.editDao.insertCloudOrIgnore(mutableCloudItems);
    }

    @NotNull
    public final long[] insertUnified(@NotNull List<MutableUnifiedEntry> mutableUnifiedEntries) {
        mutableUnifiedEntries.getClass();
        return this.editDao.insertUnified$AndroidPhotosDiscovery_release(mutableUnifiedEntries);
    }

    public final void updateCloudUnifiedId(@NotNull Collection<Long> cloudIds, long unifiedId) {
        cloudIds.getClass();
        this.editDao.updateCloudUnifiedId(cloudIds, unifiedId);
    }

    public final void updateLocalDigest(long localId, @Nullable String md5, @Nullable String visualDigest) {
        this.editDao.updateLocalDigest$AndroidPhotosDiscovery_release(localId, md5, visualDigest);
    }

    public final void updateLocalMd5(long localId, @Nullable String md5) {
        this.editDao.updateLocalMd5$AndroidPhotosDiscovery_release(localId, md5);
    }

    public final void updateLocalUnifiedId(@NotNull Collection<Long> localIds, long unifiedId) {
        localIds.getClass();
        this.editDao.updateLocalUnifiedId$AndroidPhotosDiscovery_release(localIds, unifiedId);
    }

    public final void updateLocalVisualDigest(long localId, @Nullable String visualDigest) {
        this.editDao.updateLocalVisualDigest$AndroidPhotosDiscovery_release(localId, visualDigest);
    }

    public final void updateMutableCloudItem(@NotNull MutableCloudItem cloudItem) {
        cloudItem.getClass();
        this.editDao.updateMutableCloudItem(cloudItem);
    }

    public final void updateMutableCloudItems(@NotNull Collection<MutableCloudItem> cloudItems) {
        cloudItems.getClass();
        this.editDao.updateMutableCloudItems(cloudItems);
    }

    public final void updateMutableUnifiedEntries(@NotNull List<MutableUnifiedEntry> unifiedEntry) {
        unifiedEntry.getClass();
        this.editDao.updateMutableUnifiedEntries$AndroidPhotosDiscovery_release(unifiedEntry);
    }

    public final void updateMutableUnifiedEntry(@NotNull MutableUnifiedEntry unifiedEntry) {
        unifiedEntry.getClass();
        this.editDao.updateMutableUnifiedEntry$AndroidPhotosDiscovery_release(unifiedEntry);
    }
}
