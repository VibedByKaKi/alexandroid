package com.amazon.alexa.featureservice.database.dao;

import com.amazon.alexa.featureservice.database.entity.ExperimentTrigger;
import com.amazon.alexa.location.phase3.LocationDataStore$$ExternalSyntheticLambda3;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RxTriggerDao {
    private TriggerDao triggerDao;

    @Inject
    public RxTriggerDao(TriggerDao triggerDao) {
        this.triggerDao = triggerDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$delete$11(ExperimentTrigger experimentTrigger) throws Exception {
        return Integer.valueOf(this.triggerDao.delete(experimentTrigger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$delete$12(List list) throws Exception {
        return Integer.valueOf(this.triggerDao.delete((List<ExperimentTrigger>) list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$deleteAll$15() throws Exception {
        return Integer.valueOf(this.triggerDao.deleteAll());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$deleteAllUploaded$14() throws Exception {
        return Integer.valueOf(this.triggerDao.deleteAllUploaded());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$deleteByKey$13(String str, String str2) throws Exception {
        return Integer.valueOf(this.triggerDao.deleteByKey(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAll$4() throws Exception {
        return this.triggerDao.getAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAndMarkPendingExperimentTriggers$17() throws Exception {
        return this.triggerDao.getAndMarkPendingExperimentTriggers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ExperimentTrigger lambda$getByKey$5(String str, String str2) throws Exception {
        return this.triggerDao.getByKey(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getPendingTriggerCount$16() throws Exception {
        return Integer.valueOf(this.triggerDao.getPendingTriggerCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getPendingTriggers$6() throws Exception {
        return this.triggerDao.getPendingTriggers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getUploadedTriggers$7() throws Exception {
        return this.triggerDao.getUploadedTriggers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insert$0(ExperimentTrigger experimentTrigger) throws Exception {
        return Long.valueOf(this.triggerDao.insert(experimentTrigger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insert$1(List list) throws Throwable {
        this.triggerDao.insert((List<ExperimentTrigger>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$markAllPendingAsUploaded$9() throws Exception {
        return Integer.valueOf(this.triggerDao.markAllPendingAsUploaded());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$markAllUploadedAsPending$10() throws Exception {
        return Integer.valueOf(this.triggerDao.markAllUploadedAsPending());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$markAsUploaded$8(String str, String str2) throws Exception {
        return Integer.valueOf(this.triggerDao.markAsUploaded(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$update$2(ExperimentTrigger experimentTrigger) throws Exception {
        return Integer.valueOf(this.triggerDao.update(experimentTrigger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$update$3(List list) throws Exception {
        return Integer.valueOf(this.triggerDao.update((List<ExperimentTrigger>) list));
    }

    public Single<Integer> delete(ExperimentTrigger experimentTrigger) {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda0(this, experimentTrigger, 1));
    }

    public Single<Integer> deleteAll() {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 7));
    }

    public Single<Integer> deleteAllUploaded() {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 4));
    }

    public Single<Integer> deleteByKey(String str, String str2) {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda4(this, str, str2, 2));
    }

    public Flowable<List<ExperimentTrigger>> getAll() {
        return Flowable.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 0));
    }

    public Single<List<ExperimentTrigger>> getAndMarkPendingExperimentTriggers() {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 5));
    }

    public Maybe<ExperimentTrigger> getByKey(String str, String str2) {
        return Maybe.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda4(this, str, str2, 0));
    }

    public Single<Integer> getPendingTriggerCount() {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 1));
    }

    public Flowable<List<ExperimentTrigger>> getPendingTriggers() {
        return Flowable.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 3));
    }

    public Flowable<List<ExperimentTrigger>> getUploadedTriggers() {
        return Flowable.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 8));
    }

    public Completable insert(List<ExperimentTrigger> list) {
        return Completable.fromAction(new LocationDataStore$$ExternalSyntheticLambda3(this, list, 18));
    }

    public Single<Integer> markAllPendingAsUploaded() {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 2));
    }

    public Single<Integer> markAllUploadedAsPending() {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda1(this, 6));
    }

    public Single<Integer> markAsUploaded(String str, String str2) {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda4(this, str, str2, 1));
    }

    public Single<Integer> update(ExperimentTrigger experimentTrigger) {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda0(this, experimentTrigger, 2));
    }

    public Single<Integer> delete(List<ExperimentTrigger> list) {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda3(this, list, 1));
    }

    public Single<Integer> update(List<ExperimentTrigger> list) {
        return Single.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda3(this, list, 0));
    }

    public Completable insert(ExperimentTrigger experimentTrigger) {
        return Completable.fromCallable(new RxTriggerDao$$ExternalSyntheticLambda0(this, experimentTrigger, 0));
    }
}
