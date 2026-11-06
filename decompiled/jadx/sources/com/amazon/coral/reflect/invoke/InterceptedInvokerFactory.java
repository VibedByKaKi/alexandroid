package com.amazon.coral.reflect.invoke;

import com.amazon.coral.reflect.DependencyInjector;
import com.amazon.coral.reflect.Interceptor;
import com.amazon.coral.reflect.InterceptorOrder;
import com.amazon.coral.reflect.Interceptors;
import com.amazon.coral.reflect.InvocationInterceptor;
import com.amazon.coral.reflect.Invoker;
import com.amazon.coral.reflect.InvokerFactory;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class InterceptedInvokerFactory implements InvokerFactory {
    protected final DependencyInjector dependencyInjector;
    protected final InvokerFactory invokerFactory;

    public InterceptedInvokerFactory(DependencyInjector dependencyInjector, InvokerFactory invokerFactory) {
        Objects.requireNonNull(invokerFactory);
        this.invokerFactory = invokerFactory;
        Objects.requireNonNull(dependencyInjector);
        this.dependencyInjector = dependencyInjector;
    }

    private List<Interceptor> getCustomInterceptorsInReverseOrder(Method method) {
        InterceptorOrder interceptorOrder = (InterceptorOrder) method.getAnnotation(InterceptorOrder.class);
        Interceptors interceptors = (Interceptors) method.getAnnotation(Interceptors.class);
        List asList = interceptorOrder == null ? null : Arrays.asList(interceptorOrder.value());
        List asList2 = interceptors == null ? Collections.EMPTY_LIST : Arrays.asList(interceptors.value());
        ArrayList arrayList = new ArrayList(asList2.size() + (asList == null ? 10 : asList.size()));
        if (asList != null) {
            int size = asList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(null);
            }
        }
        Interceptor interceptor = (Interceptor) method.getAnnotation(Interceptor.class);
        if (interceptor != null) {
            if (asList == null) {
                arrayList.add(interceptor);
            } else {
                try {
                    arrayList.set(asList.indexOf(Interceptor.class), interceptor);
                } catch (IndexOutOfBoundsException e) {
                    Single$$ExternalSyntheticBUOutline0.m("Interceptor.class missing from @InterceptorOrder.", e);
                    return null;
                }
            }
        }
        for (Annotation annotation : method.getAnnotations()) {
            Interceptor interceptor2 = (Interceptor) annotation.annotationType().getAnnotation(Interceptor.class);
            if (interceptor2 != null) {
                if (asList == null) {
                    arrayList.add(interceptor2);
                } else {
                    try {
                        arrayList.set(asList.indexOf(annotation.annotationType()), interceptor2);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new IllegalArgumentException(annotation.annotationType() + " missing from @InterceptorOrder.", e2);
                    }
                }
            }
        }
        if (asList != null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (arrayList.get(i2) == null) {
                    Duration$$ExternalSyntheticBUOutline0.m(asList.get(i2), " is specified in @InterceptorOrder but was not found.");
                    return null;
                }
            }
            Collections.reverse(arrayList);
        }
        if (!asList2.isEmpty()) {
            Collections.reverse(asList2);
            arrayList.addAll(asList2);
        }
        return arrayList;
    }

    public <T> Invoker createInvokerChain(Invoker invoker, Class<T> cls, String str, Class<?>... clsArr) {
        try {
            Iterator<Interceptor> it2 = getCustomInterceptorsInReverseOrder(cls.getDeclaredMethod(str, clsArr)).iterator();
            while (it2.hasNext()) {
                invoker = newInterceptedInvoker(it2.next().value(), invoker);
            }
            return invoker;
        } catch (Throwable th) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Could not obtain a Method for ", str, " with the given signature"), th);
            return null;
        }
    }

    public <T extends InvocationInterceptor> Invoker newInterceptedInvoker(Class<T> cls, Invoker invoker) {
        try {
            return new InterceptedInvoker((InvocationInterceptor) this.dependencyInjector.getSupplier(cls).get(), invoker);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Failed to instantiate an InvocationInterceptor " + cls + " for " + invoker, th);
        }
    }

    @Override // com.amazon.coral.reflect.InvokerFactory
    public <T> Invoker newInvoker(Class<T> cls, String str, Class<?>... clsArr) {
        return createInvokerChain(this.invokerFactory.newInvoker(cls, str, clsArr), cls, str, clsArr);
    }
}
