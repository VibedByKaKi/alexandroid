package com.amazon.photos.autosave.internal.dagger.module;

import android.content.SharedPreferences;
import androidx.room.Room;
import com.amazon.photos.autosave.AutosaveFrameworkContext;
import com.amazon.photos.autosave.internal.dagger.PerAccount;
import com.amazon.photos.autosave.internal.dao.AutosaveBucketDao;
import com.amazon.photos.autosave.internal.dao.AutosaveItemDao;
import com.amazon.photos.autosave.internal.db.AutosaveDatabase;
import com.amazon.photos.autosave.internal.db.AutosaveTransactionRunner;
import com.amazon.photos.autosave.internal.db.DestroyableDatabaseWrapper;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/photos/autosave/internal/dagger/module/DatabaseModule;", "", "autosaveFrameworkContext", "Lcom/amazon/photos/autosave/AutosaveFrameworkContext;", "(Lcom/amazon/photos/autosave/AutosaveFrameworkContext;)V", "database", "Lcom/amazon/photos/autosave/internal/db/AutosaveDatabase;", "dbName", "", "provideAutosaveBucketDao", "Lcom/amazon/photos/autosave/internal/dao/AutosaveBucketDao;", "provideAutosaveBucketDao$AndroidPhotosAutosave_release", "provideAutosaveItemDao", "Lcom/amazon/photos/autosave/internal/dao/AutosaveItemDao;", "provideAutosaveItemDao$AndroidPhotosAutosave_release", "provideDestroyableDatabaseWrapper", "Lcom/amazon/photos/autosave/internal/db/DestroyableDatabaseWrapper;", "frameworkContext", "provideDestroyableDatabaseWrapper$AndroidPhotosAutosave_release", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreferences$AndroidPhotosAutosave_release", "provideTransactionRunner", "Lcom/amazon/photos/autosave/internal/db/AutosaveTransactionRunner;", "provideTransactionRunner$AndroidPhotosAutosave_release", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class DatabaseModule {

    @NotNull
    private final AutosaveFrameworkContext autosaveFrameworkContext;

    @NotNull
    private final AutosaveDatabase database;

    @NotNull
    private final String dbName;

    public DatabaseModule(@NotNull AutosaveFrameworkContext autosaveFrameworkContext) {
        autosaveFrameworkContext.getClass();
        this.autosaveFrameworkContext = autosaveFrameworkContext;
        String str = "autosave_database_" + autosaveFrameworkContext.getHashedDirectedId();
        this.dbName = str;
        this.database = (AutosaveDatabase) Room.databaseBuilder(autosaveFrameworkContext.getApplicationContext(), AutosaveDatabase.class, str).fallbackToDestructiveMigrationOnDowngrade().build();
    }

    @PerAccount
    @Provides
    @NotNull
    public final AutosaveBucketDao provideAutosaveBucketDao$AndroidPhotosAutosave_release() {
        return this.database.bucketDao();
    }

    @PerAccount
    @Provides
    @NotNull
    public final AutosaveItemDao provideAutosaveItemDao$AndroidPhotosAutosave_release() {
        return this.database.itemDao();
    }

    @PerAccount
    @Provides
    @NotNull
    public final DestroyableDatabaseWrapper provideDestroyableDatabaseWrapper$AndroidPhotosAutosave_release(@NotNull AutosaveFrameworkContext frameworkContext) {
        frameworkContext.getClass();
        return new DestroyableDatabaseWrapper(this.dbName, this.database, frameworkContext.getApplicationContext());
    }

    @PerAccount
    @Provides
    @NotNull
    public final SharedPreferences provideSharedPreferences$AndroidPhotosAutosave_release() {
        SharedPreferences sharedPreferences = this.autosaveFrameworkContext.getApplicationContext().getSharedPreferences("AutosavePreferences_" + this.autosaveFrameworkContext.getHashedDirectedId(), 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    @PerAccount
    @Provides
    @NotNull
    public final AutosaveTransactionRunner provideTransactionRunner$AndroidPhotosAutosave_release() {
        return new AutosaveTransactionRunner(this.database);
    }
}
