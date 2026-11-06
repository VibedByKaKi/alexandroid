package com.amazon.dee.app.services.alexadevicebackground;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0004H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/alexadevicebackground/BackgroundImageService;", "", "pollForUpdatedBackgroundImage", "Lrx/Observable;", "Lcom/amazon/dee/app/services/alexadevicebackground/BackgroundImage;", "update", "backgroundImage", "monitorDownload", "bgImage", "Companion", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BackgroundImageService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int MAX_GET_DEVICE_BACKGROUND_RETRIES = 10;
    public static final int MAX_GET_DOWNLOAD_RETRIES = 40;
    public static final int POLL_DELAY_MS = 500;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/services/alexadevicebackground/BackgroundImageService$Companion;", "", "<init>", "()V", "MAX_GET_DEVICE_BACKGROUND_RETRIES", "", "MAX_GET_DOWNLOAD_RETRIES", "POLL_DELAY_MS", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int MAX_GET_DEVICE_BACKGROUND_RETRIES = 10;
        public static final int MAX_GET_DOWNLOAD_RETRIES = 40;
        public static final int POLL_DELAY_MS = 500;

        private Companion() {
        }
    }

    @NotNull
    Observable<BackgroundImage> monitorDownload(@NotNull BackgroundImage bgImage);

    @NotNull
    Observable<BackgroundImage> pollForUpdatedBackgroundImage();

    @NotNull
    Observable<BackgroundImage> update(@NotNull BackgroundImage backgroundImage);
}
