package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class DataSourceException extends IOException {

    @UnstableApi
    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    @UnstableApi
    public DataSourceException(int i) {
        this.reason = i;
    }

    @UnstableApi
    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof DataSourceException) && ((DataSourceException) iOException2).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public DataSourceException(@Nullable Throwable th, int i) {
        super(th);
        this.reason = i;
    }

    @UnstableApi
    public DataSourceException(@Nullable String str, int i) {
        super(str);
        this.reason = i;
    }

    @UnstableApi
    public DataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }
}
