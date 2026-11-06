package androidx.media3.exoplayer.offline;

import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public interface FilterableManifest<T> {
    T copy(List<StreamKey> list);
}
