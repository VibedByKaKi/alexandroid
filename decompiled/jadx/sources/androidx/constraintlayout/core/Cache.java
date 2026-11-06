package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class Cache {
    Pools.Pool<ArrayRow> mOptimizedArrayRowPool = new Pools.SimplePool(256);
    Pools.Pool<ArrayRow> mArrayRowPool = new Pools.SimplePool(256);
    Pools.Pool<SolverVariable> mSolverVariablePool = new Pools.SimplePool(256);
    SolverVariable[] mIndexedVariables = new SolverVariable[32];
}
