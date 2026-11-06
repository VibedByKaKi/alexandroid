package com.amazon.alexa.redesign.repository;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.entity.agentforward.domain.BasicCardDrawerItem;
import com.amazon.alexa.redesign.entity.agentforward.domain.CardDrawerItem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rJ\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0011J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/redesign/repository/LocalCardsRepository;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "<init>", "(Landroid/content/SharedPreferences;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/ReadWriteLock;", "localCards", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerItem;", "getLocalCards", "()Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "loadCachedDynamicCards", "", "addOrUpdateLocalCard", "cardModel", "emitLocalCards", "removeLocalCard", "id", "", "clearLocalCards", "persistDynamicCards", "clearCachedDynamicCards", "indexWithSameCardId", "", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalCardsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalCardsRepository.kt\ncom/amazon/alexa/redesign/repository/LocalCardsRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n2632#2,3:161\n1872#2,3:164\n*S KotlinDebug\n*F\n+ 1 LocalCardsRepository.kt\ncom/amazon/alexa/redesign/repository/LocalCardsRepository\n*L\n41#1:161,3\n152#1:164,3\n*E\n"})
/* loaded from: classes19.dex */
public final class LocalCardsRepository {

    @NotNull
    private static final String CACHED_DYNAMIC_CARDS_KEY = "cached_dynamic_cards";

    @NotNull
    public static final String DYNAMIC_CARDS_CACHE_PREFS = "dynamic_cards_cache_prefs";

    @NotNull
    private static final String TAG = "LocalCardsRepository";

    @NotNull
    private final BehaviorSubject<List<CardDrawerItem>> localCards;

    @NotNull
    private final ReadWriteLock lock;

    @Nullable
    private final ObjectMapper objectMapper;

    @Nullable
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public LocalCardsRepository(@Nullable SharedPreferences sharedPreferences, @Nullable ObjectMapper objectMapper) {
        this.sharedPreferences = sharedPreferences;
        this.objectMapper = objectMapper;
        this.lock = new ReentrantReadWriteLock();
        BehaviorSubject<List<CardDrawerItem>> createDefault = BehaviorSubject.createDefault(new ArrayList());
        createDefault.getClass();
        this.localCards = createDefault;
    }

    private final void clearCachedDynamicCards() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (remove = edit.remove(CACHED_DYNAMIC_CARDS_KEY)) == null) {
            return;
        }
        remove.apply();
    }

    private final void emitLocalCards() {
        BehaviorSubject<List<CardDrawerItem>> behaviorSubject = this.localCards;
        List<CardDrawerItem> value = behaviorSubject.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        behaviorSubject.onNext(value);
    }

    private final int indexWithSameCardId(String id) {
        List<CardDrawerItem> value = this.localCards.getValue();
        if (value == null) {
            return -1;
        }
        int i = 0;
        for (Object obj : value) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BasicCardDrawerItem basicCardDrawerItem = ((CardDrawerItem) obj).getBasicCardDrawerItem();
            if (Intrinsics.areEqual(id, basicCardDrawerItem != null ? basicCardDrawerItem.getId() : null)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    private final void persistDynamicCards() {
        if (this.sharedPreferences == null || this.objectMapper == null) {
            return;
        }
        this.lock.readLock().lock();
        try {
            try {
                List<CardDrawerItem> value = this.localCards.getValue();
                if (value != null) {
                    this.sharedPreferences.edit().putString(CACHED_DYNAMIC_CARDS_KEY, this.objectMapper.writeValueAsString(value)).apply();
                }
            } catch (Exception e) {
                Log.e(TAG, "Failed to persist dynamic cards", e);
            }
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public final void addOrUpdateLocalCard(@NotNull CardDrawerItem cardModel) {
        cardModel.getClass();
        this.lock.writeLock().lock();
        try {
            int indexWithSameCardId = indexWithSameCardId(cardModel);
            BehaviorSubject<List<CardDrawerItem>> behaviorSubject = this.localCards;
            if (indexWithSameCardId != -1) {
                List<CardDrawerItem> value = behaviorSubject.getValue();
                if (!Intrinsics.areEqual(value != null ? value.get(indexWithSameCardId) : null, cardModel)) {
                    List<CardDrawerItem> value2 = this.localCards.getValue();
                    if (value2 != null) {
                        value2.set(indexWithSameCardId, cardModel);
                    }
                }
                this.lock.writeLock().unlock();
            }
            List<CardDrawerItem> value3 = behaviorSubject.getValue();
            if (value3 != null) {
                value3.add(0, cardModel);
            }
            emitLocalCards();
            persistDynamicCards();
            this.lock.writeLock().unlock();
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    public final void clearLocalCards() {
        this.lock.writeLock().lock();
        try {
            List<CardDrawerItem> value = this.localCards.getValue();
            if (value != null) {
                value.clear();
            }
            emitLocalCards();
            clearCachedDynamicCards();
            this.lock.writeLock().unlock();
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    @NotNull
    public final BehaviorSubject<List<CardDrawerItem>> getLocalCards() {
        return this.localCards;
    }

    public final void loadCachedDynamicCards() {
        if (this.sharedPreferences == null || this.objectMapper == null) {
            return;
        }
        this.lock.writeLock().lock();
        try {
            try {
                String string = this.sharedPreferences.getString(CACHED_DYNAMIC_CARDS_KEY, null);
                if (string != null) {
                    Object readValue = this.objectMapper.readValue(string, new TypeReference<List<? extends CardDrawerItem>>() { // from class: com.amazon.alexa.redesign.repository.LocalCardsRepository$loadCachedDynamicCards$cached$1
                    });
                    readValue.getClass();
                    List<CardDrawerItem> list = (List) readValue;
                    List<CardDrawerItem> value = this.localCards.getValue();
                    if (value == null) {
                        value = new ArrayList<>();
                    }
                    for (CardDrawerItem cardDrawerItem : list) {
                        List<CardDrawerItem> list2 = value;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                BasicCardDrawerItem basicCardDrawerItem = ((CardDrawerItem) it2.next()).getBasicCardDrawerItem();
                                String id = basicCardDrawerItem != null ? basicCardDrawerItem.getId() : null;
                                BasicCardDrawerItem basicCardDrawerItem2 = cardDrawerItem.getBasicCardDrawerItem();
                                if (Intrinsics.areEqual(id, basicCardDrawerItem2 != null ? basicCardDrawerItem2.getId() : null)) {
                                    break;
                                }
                            }
                        }
                        value.add(cardDrawerItem);
                    }
                    emitLocalCards();
                }
            } catch (Exception e) {
                Log.e(TAG, "Failed to load cached dynamic cards", e);
            }
            this.lock.writeLock().unlock();
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    public final void removeLocalCard(@NotNull String id) {
        id.getClass();
        this.lock.writeLock().lock();
        try {
            int indexWithSameCardId = indexWithSameCardId(id);
            if (indexWithSameCardId != -1) {
                List<CardDrawerItem> value = this.localCards.getValue();
                if (value != null) {
                    value.remove(indexWithSameCardId);
                }
                emitLocalCards();
                persistDynamicCards();
            }
            this.lock.writeLock().unlock();
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalCardsRepository() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LocalCardsRepository(SharedPreferences sharedPreferences, ObjectMapper objectMapper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sharedPreferences, (i & 2) != 0 ? null : objectMapper);
    }

    private final int indexWithSameCardId(CardDrawerItem cardModel) {
        BasicCardDrawerItem basicCardDrawerItem = cardModel.getBasicCardDrawerItem();
        return indexWithSameCardId(basicCardDrawerItem != null ? basicCardDrawerItem.getId() : null);
    }
}
