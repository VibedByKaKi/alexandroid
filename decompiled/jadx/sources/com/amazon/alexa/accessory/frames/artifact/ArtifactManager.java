package com.amazon.alexa.accessory.frames.artifact;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.ArtifactDownloader;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.ArtifactMetadata;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.utils.CustomTypeAdapterFactory;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.utils.FileHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.internal.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class ArtifactManager {
    private static final String ARTIFACT_METADATA_FOLDER = "artifactdownloadrequests";
    private static final Long PERIODIC_INTERVAL_24_HOURS = 86400000L;
    public static final String PIPE_SEPARATOR = "|";
    final Context context;
    final Gson gson;
    final String logTag;

    public ArtifactManager(@NonNull Context context, @NonNull String str) {
        Preconditions.checkNotNull(context, "context is null.");
        Preconditions.checkNotNull(str, "logTag is null.");
        this.context = context;
        this.logTag = str;
        this.gson = createGson();
    }

    private static Gson createGson() {
        return new GsonBuilder().registerTypeAdapterFactory(CustomTypeAdapterFactory.create()).create();
    }

    private String getRequestJsonFilePath(String str) {
        Log.d(this.logTag, "getRequestJsonFilePath for artifact");
        Locale userLocale = getUserLocale();
        StringBuilder sb = new StringBuilder("artifactdownloadrequests");
        String str2 = File.separator;
        sb.append(str2);
        sb.append(userLocale.toString());
        String sb2 = sb.toString();
        try {
            if (!Arrays.asList(this.context.getResources().getAssets().list(sb2)).contains(str)) {
                Log.d(this.logTag, "getRequestJsonFilePath returned: null");
                return null;
            }
            String str3 = sb2 + str2 + str;
            Log.d(this.logTag, "getRequestJsonFilePath returned: %s", str3);
            return str3;
        } catch (IOException e) {
            Log.e(this.logTag, "getRequestJsonFilePath: exception occurred as: %s", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$getLastUpdatedTimeForArtifact$0(String str, ArtifactDownloader artifactDownloader) throws Exception {
        ArtifactMetadata artifactMetadata = getArtifactMetadata(str);
        if (artifactMetadata != null) {
            return artifactDownloader.getLastUpdatedTimeForArtifact(artifactMetadata);
        }
        Log.e(this.logTag, "ArtifactMetadata is null.");
        throw new Exception("ArtifactMetadata is null.");
    }

    public abstract void downloadArtifact();

    public ArtifactMetadata getArtifactMetadata(String str) {
        return (ArtifactMetadata) this.gson.fromJson(FileHelper.loadJSONStringFromFile(this.context, getRequestJsonFilePath(str)).trim(), ArtifactMetadata.class);
    }

    public abstract String getAssetFilePath(String str);

    public String getFilePath(String str, String str2) {
        Log.d(this.logTag, "getFilePath");
        String str3 = File.separator;
        if (str2.contains(str3)) {
            str2 = str2.substring(str2.lastIndexOf(str3));
        }
        File file = new File(a$$ExternalSyntheticOutline0.m$1(str, str3, str2));
        if (file.exists()) {
            return file.getPath();
        }
        return null;
    }

    public Single<Long> getLastUpdatedTimeForArtifact(ArtifactDownloader artifactDownloader, String str) {
        Log.d(this.logTag, "getLastUpdatedTimeForArtifact for artifact");
        return Single.fromCallable(new Processor$$ExternalSyntheticLambda1(this, str, artifactDownloader, 2));
    }

    public Locale getUserLocale() {
        return this.context.getResources().getConfiguration().getLocales().get(0);
    }

    public abstract void releaseResources();

    public Single<Boolean> shouldDownloadBasedUponTimeStamp(Long l, Long l2) {
        Preconditions.checkNotNull(l, "lastUpdatedTimeStamp is null.");
        return Single.just(Boolean.valueOf(System.currentTimeMillis() - l.longValue() >= l2.longValue()));
    }

    public Single<Boolean> shouldDownloadBasedUponTimeStamp(Long l) {
        return shouldDownloadBasedUponTimeStamp(l, PERIODIC_INTERVAL_24_HOURS);
    }
}
