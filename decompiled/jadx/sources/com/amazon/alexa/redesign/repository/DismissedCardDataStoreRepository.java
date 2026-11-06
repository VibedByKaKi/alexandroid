package com.amazon.alexa.redesign.repository;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.DismissedCardDataStore;
import com.amazon.alexa.redesign.entity.DismissIdentifier;
import com.amazon.alexa.redesign.utils.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u001e\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/repository/DismissedCardDataStoreRepository;", "Lcom/amazon/alexa/redesign/DismissedCardDataStore;", "context", "Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "putDismissedCardIds", "", "dismissIdentifier", "Lcom/amazon/alexa/redesign/entity/DismissIdentifier;", "key", "", "getDismissedCardIds", "", "deleteDismissedCardIds", "clearDismissedCardDataStore", "applyStringSetChangesToDisk", "values", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDismissedCardDataStoreRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DismissedCardDataStoreRepository.kt\ncom/amazon/alexa/redesign/repository/DismissedCardDataStoreRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1557#2:74\n1628#2,3:75\n*S KotlinDebug\n*F\n+ 1 DismissedCardDataStoreRepository.kt\ncom/amazon/alexa/redesign/repository/DismissedCardDataStoreRepository\n*L\n42#1:74\n42#1:75,3\n*E\n"})
/* loaded from: classes19.dex */
public final class DismissedCardDataStoreRepository implements DismissedCardDataStore {
    public static final int $stable = 8;

    @NotNull
    private final SharedPreferences preferences;

    public /* synthetic */ DismissedCardDataStoreRepository(Context context, SharedPreferences sharedPreferences, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? context.getSharedPreferences(Constants.HOME_SHARED_PREFERENCES, 0) : sharedPreferences);
    }

    private final void applyStringSetChangesToDisk(String key, Set<String> values) {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putStringSet(key, values);
        edit.apply();
    }

    @Override // com.amazon.alexa.redesign.DismissedCardDataStore
    public void clearDismissedCardDataStore() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.clear();
        edit.apply();
    }

    @Override // com.amazon.alexa.redesign.DismissedCardDataStore
    public void deleteDismissedCardIds(@NotNull DismissIdentifier dismissIdentifier, @NotNull String key) {
        dismissIdentifier.getClass();
        key.getClass();
        String dismissDataStoreId = dismissIdentifier.getDismissDataStoreId();
        Set<String> stringSet = this.preferences.getStringSet(key, SetsKt.emptySet());
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        HashSet hashSet = new HashSet(stringSet);
        hashSet.remove(dismissDataStoreId);
        applyStringSetChangesToDisk(key, hashSet);
    }

    @Override // com.amazon.alexa.redesign.DismissedCardDataStore
    @NotNull
    public List<DismissIdentifier> getDismissedCardIds(@NotNull String key) {
        key.getClass();
        Set<String> stringSet = this.preferences.getStringSet(key, SetsKt.emptySet());
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (String str : set) {
            DismissIdentifier.Companion companion = DismissIdentifier.INSTANCE;
            str.getClass();
            arrayList.add(companion.fromDataStoreId(str));
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.redesign.DismissedCardDataStore
    public void putDismissedCardIds(@NotNull DismissIdentifier dismissIdentifier, @NotNull String key) {
        dismissIdentifier.getClass();
        key.getClass();
        String dismissDataStoreId = dismissIdentifier.getDismissDataStoreId();
        Set<String> stringSet = this.preferences.getStringSet(key, SetsKt.emptySet());
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        HashSet hashSet = new HashSet(stringSet);
        hashSet.add(dismissDataStoreId);
        applyStringSetChangesToDisk(key, hashSet);
    }

    public DismissedCardDataStoreRepository(@NotNull Context context, @NotNull SharedPreferences sharedPreferences) {
        context.getClass();
        sharedPreferences.getClass();
        this.preferences = sharedPreferences;
    }
}
