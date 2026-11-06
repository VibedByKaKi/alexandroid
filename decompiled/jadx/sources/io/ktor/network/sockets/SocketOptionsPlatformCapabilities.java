package io.ktor.network.sockets;

import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000fJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/ktor/network/sockets/SocketOptionsPlatformCapabilities;", "", "()V", "channelSetOption", "Ljava/lang/reflect/Method;", "datagramSetOption", "serverChannelSetOption", "standardSocketOptions", "", "", "Ljava/lang/reflect/Field;", "setReusePort", "", "channel", "Ljava/nio/channels/DatagramChannel;", "Ljava/nio/channels/ServerSocketChannel;", "Ljava/nio/channels/SocketChannel;", "socketOption", "name", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class SocketOptionsPlatformCapabilities {
    public static final SocketOptionsPlatformCapabilities INSTANCE = new SocketOptionsPlatformCapabilities();
    private static final Method channelSetOption;
    private static final Method datagramSetOption;
    private static final Method serverChannelSetOption;
    private static final Map<String, Field> standardSocketOptions;

    static {
        Map emptyMap;
        Method method;
        Method method2;
        try {
            Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
            if (fields != null) {
                ArrayList arrayList = new ArrayList();
                for (Field field : fields) {
                    field.getClass();
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                        arrayList.add(field);
                    }
                }
                emptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Field field2 = (Field) next;
                    field2.getClass();
                    emptyMap.put(field2.getName(), next);
                }
            } else {
                emptyMap = MapsKt.emptyMap();
            }
        } catch (Throwable unused) {
            emptyMap = MapsKt.emptyMap();
        }
        standardSocketOptions = emptyMap;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("java.nio.channels.SocketChannel");
            Method[] methods = cls.getMethods();
            methods.getClass();
            int length = methods.length;
            for (int i = 0; i < length; i++) {
                method = methods[i];
                method.getClass();
                int modifiers2 = method.getModifiers();
                if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2) && Intrinsics.areEqual(method.getName(), "setOption") && method.getParameterTypes().length == 2 && Intrinsics.areEqual(method.getReturnType(), cls) && Intrinsics.areEqual(method.getParameterTypes()[0], SocketOption.class) && Intrinsics.areEqual(method.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused2) {
        }
        method = null;
        channelSetOption = method;
        try {
            Class<?> cls2 = Class.forName("java.nio.channels.ServerSocketChannel");
            Method[] methods2 = cls2.getMethods();
            methods2.getClass();
            int length2 = methods2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                method2 = methods2[i2];
                method2.getClass();
                int modifiers3 = method2.getModifiers();
                if (Modifier.isPublic(modifiers3) && !Modifier.isStatic(modifiers3) && Intrinsics.areEqual(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && Intrinsics.areEqual(method2.getReturnType(), cls2) && Intrinsics.areEqual(method2.getParameterTypes()[0], SocketOption.class) && Intrinsics.areEqual(method2.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused3) {
        }
        method2 = null;
        serverChannelSetOption = method2;
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            methods3.getClass();
            int length3 = methods3.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    break;
                }
                Method method4 = methods3[i3];
                method4.getClass();
                int modifiers4 = method4.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && Intrinsics.areEqual(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && Intrinsics.areEqual(method4.getReturnType(), cls3) && Intrinsics.areEqual(method4.getParameterTypes()[0], SocketOption.class) && Intrinsics.areEqual(method4.getParameterTypes()[1], Object.class)) {
                    method3 = method4;
                    break;
                }
                i3++;
            }
        } catch (Throwable unused4) {
        }
        datagramSetOption = method3;
    }

    private SocketOptionsPlatformCapabilities() {
    }

    private final Object socketOption(String name) {
        Object obj;
        Field field = standardSocketOptions.get(name);
        if (field != null && (obj = field.get(null)) != null) {
            return obj;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Socket option ", name, " is not supported"));
        return null;
    }

    public final void setReusePort(@NotNull SocketChannel channel) {
        channel.getClass();
        Object socketOption = socketOption("SO_REUSEPORT");
        Method method = channelSetOption;
        if (method == null) {
            Intrinsics.throwNpe();
        }
        method.invoke(channel, socketOption, Boolean.TRUE);
    }

    public final void setReusePort(@NotNull ServerSocketChannel channel) {
        channel.getClass();
        Object socketOption = socketOption("SO_REUSEPORT");
        Method method = serverChannelSetOption;
        if (method == null) {
            Intrinsics.throwNpe();
        }
        method.invoke(channel, socketOption, Boolean.TRUE);
    }

    public final void setReusePort(@NotNull DatagramChannel channel) {
        channel.getClass();
        Object socketOption = socketOption("SO_REUSEPORT");
        Method method = datagramSetOption;
        if (method == null) {
            Intrinsics.throwNpe();
        }
        method.invoke(channel, socketOption, Boolean.TRUE);
    }
}
