package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@DoNotMock("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
    @CheckForNull
    <T extends B> T getInstance(Class<T> cls);

    @CheckForNull
    @CanIgnoreReturnValue
    <T extends B> T putInstance(Class<T> cls, T t);
}
