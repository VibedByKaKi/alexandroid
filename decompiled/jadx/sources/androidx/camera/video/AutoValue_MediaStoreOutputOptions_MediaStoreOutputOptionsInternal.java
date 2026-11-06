package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.MediaStoreOutputOptions;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal {
    private final Uri collectionUri;
    private final ContentResolver contentResolver;
    private final ContentValues contentValues;
    private final long durationLimitMillis;
    private final long fileSizeLimit;
    private final Location location;

    private AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(long j, long j2, @Nullable Location location, ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        this.fileSizeLimit = j;
        this.durationLimitMillis = j2;
        this.location = location;
        this.contentResolver = contentResolver;
        this.collectionUri = uri;
        this.contentValues = contentValues;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) {
            MediaStoreOutputOptions.MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal = (MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) obj;
            if (this.fileSizeLimit == mediaStoreOutputOptionsInternal.getFileSizeLimit() && this.durationLimitMillis == mediaStoreOutputOptionsInternal.getDurationLimitMillis() && ((location = this.location) != null ? location.equals(mediaStoreOutputOptionsInternal.getLocation()) : mediaStoreOutputOptionsInternal.getLocation() == null) && this.contentResolver.equals(mediaStoreOutputOptionsInternal.getContentResolver()) && this.collectionUri.equals(mediaStoreOutputOptionsInternal.getCollectionUri()) && this.contentValues.equals(mediaStoreOutputOptionsInternal.getContentValues())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    @NonNull
    public Uri getCollectionUri() {
        return this.collectionUri;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    @NonNull
    public ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    @NonNull
    public ContentValues getContentValues() {
        return this.contentValues;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @IntRange(from = 0)
    public long getDurationLimitMillis() {
        return this.durationLimitMillis;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @IntRange(from = 0)
    public long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @Nullable
    public Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        long j = this.fileSizeLimit;
        long j2 = this.durationLimitMillis;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.location;
        return this.contentValues.hashCode() ^ ((((((i ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.contentResolver.hashCode()) * 1000003) ^ this.collectionUri.hashCode()) * 1000003);
    }

    public String toString() {
        return "MediaStoreOutputOptionsInternal{fileSizeLimit=" + this.fileSizeLimit + ", durationLimitMillis=" + this.durationLimitMillis + ", location=" + this.location + ", contentResolver=" + this.contentResolver + ", collectionUri=" + this.collectionUri + ", contentValues=" + this.contentValues + StringSubstitutor.DEFAULT_VAR_END;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder {
        private Uri collectionUri;
        private ContentResolver contentResolver;
        private ContentValues contentValues;
        private Long durationLimitMillis;
        private Long fileSizeLimit;
        private Location location;

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal build() {
            String str = this.fileSizeLimit == null ? " fileSizeLimit" : "";
            if (this.durationLimitMillis == null) {
                str = str.concat(" durationLimitMillis");
            }
            if (this.contentResolver == null) {
                str = str.concat(" contentResolver");
            }
            if (this.collectionUri == null) {
                str = str.concat(" collectionUri");
            }
            if (this.contentValues == null) {
                str = str.concat(" contentValues");
            }
            if (str.isEmpty()) {
                return new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(this.fileSizeLimit.longValue(), this.durationLimitMillis.longValue(), this.location, this.contentResolver, this.collectionUri, this.contentValues);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setCollectionUri(Uri uri) {
            if (uri != null) {
                this.collectionUri = uri;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null collectionUri");
            return null;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentResolver(ContentResolver contentResolver) {
            if (contentResolver != null) {
                this.contentResolver = contentResolver;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null contentResolver");
            return null;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentValues(ContentValues contentValues) {
            if (contentValues != null) {
                this.contentValues = contentValues;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null contentValues");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setDurationLimitMillis(long j) {
            this.durationLimitMillis = Long.valueOf(j);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setLocation(@Nullable Location location) {
            this.location = location;
            return this;
        }
    }
}
