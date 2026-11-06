package com.amazon.photos.uploader.internal.dagger.module;

import com.amazon.photos.uploader.dao.EventDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.photos.uploader.internal.dagger.PerAccount")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DatabaseModule_ProvideEventDao$AndroidPhotosUploader_releaseFactory implements Factory<EventDao> {
    private final DatabaseModule module;

    public DatabaseModule_ProvideEventDao$AndroidPhotosUploader_releaseFactory(DatabaseModule databaseModule) {
        this.module = databaseModule;
    }

    public static DatabaseModule_ProvideEventDao$AndroidPhotosUploader_releaseFactory create(DatabaseModule databaseModule) {
        return new DatabaseModule_ProvideEventDao$AndroidPhotosUploader_releaseFactory(databaseModule);
    }

    public static EventDao provideEventDao$AndroidPhotosUploader_release(DatabaseModule databaseModule) {
        return (EventDao) Preconditions.checkNotNullFromProvides(databaseModule.provideEventDao$AndroidPhotosUploader_release());
    }

    @Override // javax.inject.Provider
    public EventDao get() {
        return provideEventDao$AndroidPhotosUploader_release(this.module);
    }
}
