package com.amazon.alexa.featureservice.database.dao;

import com.amazon.alexa.featureservice.database.entity.Feature;
import com.amazon.alexa.location.phase3.LocationDataStore$$ExternalSyntheticLambda3;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RxFeatureDao {
    private FeatureFlagDao featureDao;

    @Inject
    public RxFeatureDao(FeatureFlagDao featureFlagDao) {
        this.featureDao = featureFlagDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$delete$4(Feature feature) throws Exception {
        return Integer.valueOf(this.featureDao.delete(feature));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$deleteAll$5() throws Exception {
        return Integer.valueOf(this.featureDao.deleteAll());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Feature lambda$get$3(String str) throws Exception {
        return this.featureDao.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getActiveFeatures$7() throws Exception {
        return this.featureDao.getActiveFeatures();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAll$2() throws Exception {
        return this.featureDao.getAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Feature lambda$getAsMaybe$6(String str) throws Exception {
        return this.featureDao.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insert$0(Feature feature) throws Exception {
        return Long.valueOf(this.featureDao.insert(feature));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insert$1(List list) throws Throwable {
        this.featureDao.insert((List<Feature>) list);
    }

    public Single<Integer> delete(Feature feature) {
        return Single.fromCallable(new RxFeatureDao$$ExternalSyntheticLambda1(this, feature, 1));
    }

    public Single<Integer> deleteAll() {
        return Single.fromCallable(new RxFeatureDao$$ExternalSyntheticLambda2(this, 0));
    }

    public Flowable<Feature> get(String str) {
        return Flowable.fromCallable(new RxFeatureDao$$ExternalSyntheticLambda0(this, str, 1));
    }

    public Flowable<List<Feature>> getActiveFeatures() {
        return Flowable.fromCallable(new RxFeatureDao$$ExternalSyntheticLambda2(this, 1));
    }

    public Flowable<List<Feature>> getAll() {
        return Flowable.fromCallable(new RxFeatureDao$$ExternalSyntheticLambda2(this, 2));
    }

    public Maybe<Feature> getAsMaybe(String str) {
        return Maybe.fromCallable(new RxFeatureDao$$ExternalSyntheticLambda0(this, str, 0));
    }

    public Completable insert(List<Feature> list) {
        return Completable.fromAction(new LocationDataStore$$ExternalSyntheticLambda3(this, list, 17));
    }

    public Completable insert(Feature feature) {
        return Completable.fromCallable(new RxFeatureDao$$ExternalSyntheticLambda1(this, feature, 0));
    }
}
