package com.amazon.alexa.hho.dependency;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.hho.cache.MediaFileCacheManager;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import com.amazon.alexa.hho.stickynotes.KalamFontDownloader;
import com.amazon.alexa.hho.stickynotes.StickyNotesMediaDownloader;
import com.amazon.alexa.hho.stickynotes.StickyNotesMediaProvider;
import com.amazon.alexa.hho.utils.FileManager;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.dee.app.http.CoralService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes13.dex */
public class HHOModule {
    private static final String CACHE_DIRECTORY_NAME = "sticky_notes_media";
    private static final String TEMP_FILES_DIRECTORY_NAME = "temp_files";
    private final Context context;

    public HHOModule(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    @Provides
    public KalamFontDownloader provideKalamFontDownloader() {
        return new KalamFontDownloader(this.context, new Handler(Looper.getMainLooper()));
    }

    @NonNull
    @Provides
    @Singleton
    public HHOMetricsService provideMetrics(LazyComponent<Mobilytics> lazyComponent) {
        return new HHOMetricsService(lazyComponent);
    }

    @NonNull
    @Provides
    public StickyNotesMediaDownloader provideStickyNotesMediaDownloader(CoralService coralService, HHOMetricsService hHOMetricsService) {
        return new StickyNotesMediaDownloader(coralService, this.context.getFilesDir() + "/temp_files", new FileManager(), hHOMetricsService);
    }

    @NonNull
    @Provides
    @Singleton
    public StickyNotesMediaProvider provideStickyNotesMediaProvider(StickyNotesMediaDownloader stickyNotesMediaDownloader, EventBus eventBus, IdentityService identityService, HHOMetricsService hHOMetricsService) {
        return new StickyNotesMediaProvider(stickyNotesMediaDownloader, new MediaFileCacheManager(this.context.getCacheDir().getAbsolutePath() + "/sticky_notes_media", new FileManager()), eventBus, identityService, hHOMetricsService);
    }
}
