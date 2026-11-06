package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;

    @Nullable
    private byte[] data;
    private boolean opened;
    private int readPosition;

    @Nullable
    private Uri uri;
    private final UriResolver uriResolver;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UriResolver {
        byte[] resolve(Uri uri) throws IOException;
    }

    public ByteArrayDataSource(final byte[] bArr) {
        this(new UriResolver() { // from class: androidx.media3.datasource.ByteArrayDataSource$$ExternalSyntheticLambda0
            @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
            public final byte[] resolve(Uri uri) {
                byte[] lambda$new$0;
                lambda$new$0 = ByteArrayDataSource.lambda$new$0(bArr, uri);
                return lambda$new$0;
            }
        });
        Assertions.checkArgument(bArr.length > 0);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
        this.data = null;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        Uri uri = dataSpec.uri;
        this.uri = uri;
        byte[] resolve = this.uriResolver.resolve(uri);
        this.data = resolve;
        long j = dataSpec.position;
        if (j > resolve.length) {
            throw new DataSourceException(2008);
        }
        int i = (int) j;
        this.readPosition = i;
        int length = resolve.length - i;
        this.bytesRemaining = length;
        long j2 = dataSpec.length;
        if (j2 != -1) {
            this.bytesRemaining = (int) Math.min(length, j2);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j3 = dataSpec.length;
        return j3 != -1 ? j3 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(Assertions.checkStateNotNull(this.data), this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    public ByteArrayDataSource(UriResolver uriResolver) {
        super(false);
        this.uriResolver = (UriResolver) Assertions.checkNotNull(uriResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$new$0(byte[] bArr, Uri uri) throws IOException {
        return bArr;
    }
}
