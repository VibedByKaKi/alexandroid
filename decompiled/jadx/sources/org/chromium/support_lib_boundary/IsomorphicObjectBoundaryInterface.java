package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;
import org.jspecify.annotations.NullMarked;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NullMarked
/* loaded from: classes11.dex */
public interface IsomorphicObjectBoundaryInterface {
    Object getOrCreatePeer(Callable<Object> callable);
}
