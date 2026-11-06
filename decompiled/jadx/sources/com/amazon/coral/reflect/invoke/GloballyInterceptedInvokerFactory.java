package com.amazon.coral.reflect.invoke;

import com.amazon.coral.reflect.DependencyInjector;
import com.amazon.coral.reflect.InvocationInterceptor;
import com.amazon.coral.reflect.Invoker;
import com.amazon.coral.reflect.InvokerFactory;
import com.amazon.coral.reflect.SystemInstantiatorFactory;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class GloballyInterceptedInvokerFactory extends InterceptedInvokerFactory {
    private final List<Class<? extends InvocationInterceptor>> interceptors;

    public GloballyInterceptedInvokerFactory(DependencyInjector dependencyInjector, InvokerFactory invokerFactory, List<Class<? extends InvocationInterceptor>> list) {
        super(dependencyInjector, invokerFactory);
        if (list == null) {
            this.interceptors = Collections.EMPTY_LIST;
        } else {
            this.interceptors = Collections.unmodifiableList(list);
        }
    }

    @Override // com.amazon.coral.reflect.invoke.InterceptedInvokerFactory, com.amazon.coral.reflect.InvokerFactory
    public <T> Invoker newInvoker(Class<T> cls, String str, Class<?>... clsArr) {
        Invoker createInvokerChain = createInvokerChain(this.invokerFactory.newInvoker(cls, str, clsArr), cls, str, clsArr);
        for (int size = this.interceptors.size() - 1; size >= 0; size--) {
            createInvokerChain = newInterceptedInvoker(this.interceptors.get(size), createInvokerChain);
        }
        return createInvokerChain;
    }

    public GloballyInterceptedInvokerFactory(InvokerFactory invokerFactory, List<Class<? extends InvocationInterceptor>> list) {
        this(SystemInstantiatorFactory.newInstance(), invokerFactory, list);
    }
}
