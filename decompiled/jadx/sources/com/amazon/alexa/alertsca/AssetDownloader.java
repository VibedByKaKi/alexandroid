package com.amazon.alexa.alertsca;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.utils.concurrent.ExecutorFactory;
import com.amazon.alexa.utils.validation.Preconditions;
import dagger.Lazy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class AssetDownloader {
    private static final String DOWNLOAD_THREAD_NAME = "download_thread";
    private static final String FILE_SUFFIX = ".mp3";
    private static final String TAG = "AssetDownloader";
    private final Map<AlertsToken, Set<FutureTask>> assetDownloadStatus;
    private final ExecutorService executorService;
    private final Lazy<File> lazyCacheDirectory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DownloadCallable implements Callable<Boolean> {
        private final File assetFile;
        private final List<Uri> assetUrls;
        private InputStream inputStream;
        private OutputStream outputStream;

        public DownloadCallable(List<Uri> list, File file) {
            Preconditions.notNull(list, "AssetUrls is null");
            Preconditions.notNull(file, "AssetFile is null");
            this.assetUrls = list;
            this.assetFile = file;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            try {
                try {
                    this.outputStream = new FileOutputStream(this.assetFile);
                    Iterator<Uri> it2 = this.assetUrls.iterator();
                    while (it2.hasNext()) {
                        URLConnection openConnection = new URL(it2.next().toString()).openConnection();
                        openConnection.setConnectTimeout(5000);
                        openConnection.setReadTimeout(5000);
                        InputStream inputStream = openConnection.getInputStream();
                        this.inputStream = inputStream;
                        IOUtils.copy(inputStream, this.outputStream);
                    }
                    this.outputStream.flush();
                    Boolean bool = Boolean.TRUE;
                    IOUtils.closeQuietly(this.inputStream);
                    IOUtils.closeQuietly(this.outputStream);
                    return bool;
                } catch (IOException e) {
                    Log.e(AssetDownloader.TAG, e.toString());
                    IOUtils.closeQuietly(this.inputStream);
                    IOUtils.closeQuietly(this.outputStream);
                    return Boolean.FALSE;
                }
            } catch (Throwable th) {
                IOUtils.closeQuietly(this.inputStream);
                IOUtils.closeQuietly(this.outputStream);
                throw th;
            }
        }
    }

    @VisibleForTesting
    public AssetDownloader(Lazy<File> lazy, ExecutorService executorService) {
        this.lazyCacheDirectory = lazy;
        this.assetDownloadStatus = new HashMap();
        this.executorService = executorService;
    }

    public Uri download(List<Uri> list, AlertsToken alertsToken) {
        Objects.toString(alertsToken);
        Uri uri = Uri.EMPTY;
        try {
            File createTempFile = File.createTempFile(alertsToken.toString(), FILE_SUFFIX, this.lazyCacheDirectory.get());
            uri = Uri.fromFile(createTempFile);
            FutureTask futureTask = new FutureTask(new DownloadCallable(list, createTempFile));
            this.executorService.submit(futureTask);
            HashSet hashSet = new HashSet();
            if (this.assetDownloadStatus.containsKey(alertsToken)) {
                hashSet.addAll(this.assetDownloadStatus.get(alertsToken));
            }
            hashSet.add(futureTask);
            this.assetDownloadStatus.put(alertsToken, hashSet);
            return uri;
        } catch (IOException e) {
            Log.e(TAG, "Unable to download asset for alert token: " + alertsToken, e);
            return uri;
        }
    }

    public boolean isAssetsDownloadComplete(AlertsToken alertsToken) {
        if (!this.assetDownloadStatus.containsKey(alertsToken)) {
            return false;
        }
        for (FutureTask futureTask : this.assetDownloadStatus.get(alertsToken)) {
            if (futureTask.isCancelled() || !futureTask.isDone()) {
                return false;
            }
        }
        return true;
    }

    @Inject
    public AssetDownloader(@Named("CACHE_DIRECTORY") Lazy<File> lazy) {
        this(lazy, ExecutorFactory.newSingleThreadCachedThreadPool(DOWNLOAD_THREAD_NAME));
    }
}
