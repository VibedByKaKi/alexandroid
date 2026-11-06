package org.openjdk.source.tree;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface TryTree extends StatementTree {
    BlockTree getBlock();

    List<? extends CatchTree> getCatches();

    BlockTree getFinallyBlock();

    List<? extends Tree> getResources();
}
