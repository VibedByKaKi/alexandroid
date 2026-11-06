package org.openjdk.source.tree;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface MethodInvocationTree extends ExpressionTree {
    List<? extends ExpressionTree> getArguments();

    ExpressionTree getMethodSelect();

    List<? extends Tree> getTypeArguments();
}
