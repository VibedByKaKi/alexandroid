package com.amazon.alexa.accessorykit.accessories.session.supplier;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessorykit.ContainerProvider;
import com.amazon.alexa.accessorykit.accessories.MapModelTransformer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.NotSerializableException;
import java.text.ParseException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class SessionFailedEvent {
    final Accessory accessory;
    final Throwable throwable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Transformer implements MapModelTransformer<SessionFailedEvent> {
        private static final String ACCESSORY_KEY = "accessory";
        private static final String ERROR_KEY = "error";
        private final MapModelTransformer<Accessory> accessoryTransformer;
        private final ContainerProvider containerProvider;

        public Transformer(ContainerProvider containerProvider, MapModelTransformer<Accessory> mapModelTransformer) {
            this.containerProvider = containerProvider;
            this.accessoryTransformer = mapModelTransformer;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessorykit.accessories.MapModelTransformer
        public SessionFailedEvent transform(ReadableMap readableMap) throws ParseException {
            throw new ParseException("Not Implemented!", 0);
        }

        @Override // com.amazon.alexa.accessorykit.accessories.MapModelTransformer
        public WritableMap transformToMap(SessionFailedEvent sessionFailedEvent) throws NotSerializableException {
            WritableMap map = this.containerProvider.getMap();
            map.putMap("accessory", this.accessoryTransformer.transformToMap(sessionFailedEvent.accessory));
            map.putString("error", sessionFailedEvent.throwable.getMessage());
            return map;
        }
    }

    public SessionFailedEvent(Accessory accessory, Throwable th) {
        this.accessory = accessory;
        this.throwable = th;
    }
}
